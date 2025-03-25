package com.felipebuso.devices;

public class Iphone implements MusicPlayer, Phone, Browser {

	private String music;
	private boolean playMusic = false;

	public void showPage(String url) {
		checkInternetConnection();
		System.out.println("Abrir página url " + url);
	}


	public void openNewTab() {
		System.out.println("Nova aba aberta");

	}


	public void refreshTab() {
		checkInternetConnection();
		System.out.println("Recarregando a página");

	}

	private void checkInternetConnection() {
		System.out.println("Checando a conexão com a internet");
	}


	public void call(String number) {
		connectTelephoneNetwork();
		System.out.println("Ligando para: " + number);
	}


	public void answer() {
		System.out.println("Atender ligação");
	}


	public void startVoicemail() {
		checkHasVoicemail();
		System.out.println("Reproduzindo mensagens");
	}




	private void connectTelephoneNetwork() {
		System.out.println("Conectado a rede de telefonia móvel");

	}

	private void checkHasVoicemail() {
		connectTelephoneNetwork();
		System.out.println("Checando a caixa de mensagens");
	}


	public void play() {
		if (this.music == null) {
			System.out.println("Nenhuma música selecionada");
		} else {
			System.out.println("Tocando a música: " + this.music);
			this.playMusic = true;
		}
	}


	public void pause() {
		if (this.music == null || this.playMusic == false ) {
			System.out.println("Nenhuma música em reprodução");
		}
		System.out.println("Pausando a música: " + this.music);
	}


	public void selectMusic(String music) {
		this.music = music;
	}

}
