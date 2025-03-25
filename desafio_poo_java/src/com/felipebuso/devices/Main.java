package com.felipebuso.devices;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		var iphone = new Iphone();
		var scanner = new Scanner(System.in);
		var option = -1;

		while (option != 0) {
			System.out.println("Digite a opção desejada:");
			System.out.println("1 - Ligar");
			System.out.println("2 - Atender ligação");
			System.out.println("3 - Ouvir recados");
			System.out.println("4 - Selecionar música");
			System.out.println("5 - Tocar música");
			System.out.println("6 - Pausar música");
			System.out.println("7 - Navegar na internet");
			System.out.println("8 - Abri nova aba");
			System.out.println("9 - Atualizar aba");
			System.out.println("0 - Desligar aparelho");
			option = scanner.nextInt();

			switch (option) {
				case 1 -> {
					System.out.println("Digite o numero:");
					String number = scanner.next();
					iphone.call(number);
				}
				case 2 -> {
					iphone.answer();
				}
				case 3 -> {
					iphone.startVoicemail();
				}
				case 4 -> {
					System.out.println("Digite o nome da música:");
					String music = scanner.next();
					iphone.selectMusic(music);
				}
				case 5 -> {
					iphone.play();
				}
				case 6 -> {
					iphone.pause();
				}
				case 7 -> {
					System.out.println("Digite o endereço da página:");
					String url = scanner.next();
					iphone.showPage(url);
				}
				case 8 -> {
					iphone.openNewTab();
				}
				case 9 -> {
					iphone.refreshTab();
				}
				case 0 -> {
					System.out.println("Desligando...");
					option = 0;
				}
			}
		}
	}
}
