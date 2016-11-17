package com.montevideando.game;

import com.badlogic.gdx.Gdx;

public class ButtonExit extends Button { // Botón que permitirá salir del juego

	public ButtonExit(int x, int y, String url) {
		super(x, y, url);
	}

	@Override
	protected void funcionamiento() {
		Gdx.app.exit(); // Cierra la aplicación
	}
}