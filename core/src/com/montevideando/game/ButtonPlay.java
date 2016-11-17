package com.montevideando.game;

public class ButtonPlay extends Button { // Botón que permitira iniciar el Pong

	public ButtonPlay(int x, int y,String url) {
		super(x, y, url);
	}

	@Override
	protected void funcionamiento() {
		ScreenManager.getInstance().showScreen(Screens.NIVEL1);
	}
}