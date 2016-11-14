package com.montevideando.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

public class ButtonPlay extends Button { // Botón que permitira iniciar el Pong

	public ButtonPlay(int x, int y) {
		super(x, y);
		texture = new Texture(Gdx.files.internal("BotonPlay.png")); // Se asigna textura. Muy importante!!
	}

	@Override
	protected void funcionamiento() {
		ScreenManager.getInstance().showScreen( Screens.NIVEL1 );
	}
}