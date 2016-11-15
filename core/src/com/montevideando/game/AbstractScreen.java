package com.montevideando.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.StretchViewport;

//Implementa la interfaz de Screen, es decir, se comportara con las caracteristicas de una pantalla
//sus funciones se llaman automaticamente cuando ocurre el evento al que estan asociadas (renderizar,
//reescalar, pausar, resumir...) menos con dispose, para liberar los recursos hay que llamar a dispose manualmente

public abstract class AbstractScreen extends Stage implements Screen { // Pantalla abstracta de la cual heredan las demas pantallas.
	
	protected AbstractScreen() {
		super(new StretchViewport(320.0f, 240.0f, new OrthographicCamera()));
    }
	
	 // Subclasses must load actors in this method
    public abstract void buildStage();

	@Override
	public void render(float delta) { // // Método que permite actualizar los valores del juego y dibujar el juego para que lo vea el usuario.
		// Clear screen
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        // Calling to Stage methods
        super.act(delta);
        super.draw();
		
	}

	@Override
	public void resize(int width, int height) { // Método que sirve para redimensionar la pantalla del juego.
		getViewport().update(width, height, true);
		
	}

	@Override
	public void show() { // Método que se llama cuando se establece esta pantalla como actual
		 Gdx.input.setInputProcessor(this);
		
	}

	@Override
	public void hide() { // Método que se llama cuando se deja de usar esta pantalla.
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() { // Método que se llama cuando en un dispositivo móvil perdemos el foco
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() { // M�todo que se llama cuando el juego vuelve a coger el foco en un dispositivo movil
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() { // Metodo que se encarga de destruir los valores del juego y liberar recursos.
		// TODO Auto-generated method stub
		
	}

}
