package com.montevideando.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MainScreen extends AbstractScreen { // Pantalla del menú principal del juego.
	
	private SpriteBatch batch; // "Grupo de Sprites (imagenes)" nos permite dibujar rectagulos como referencias a texturas, es necesario para mostrar todo por pantalla.
	private Button exit;
	private Button play;
	
	public MainScreen(){
		super();
		
		batch = new SpriteBatch();
		Gdx.input.setCatchBackKey(true); // Bloquea el boton "Back" de android para que se tenga que salir del juego usando el boton "Exit"
		
		Texture texture = new Texture(Gdx.files.internal("BotonExit.png")); // Cogemos la textura del botón para usar su ancho y alto
		int centroY = Gdx.graphics.getHeight() / 2 - texture.getHeight() / 2; // Centro en el eje x de la pantalla centrando el botón
		int centroX = Gdx.graphics.getWidth() / 2 - texture.getWidth() / 2; // Centro en el eje y de la pantalla centrando el botón
		exit = new ButtonExit(centroX, centroY - 50);
		play = new ButtonPlay(centroX, centroY + 50);
	}


	@Override
	public void buildStage() {

		
	}
	



	@Override
	public void render(float delta) {
		super.render(delta);
		
		//Gdx es una clase con la que podemos acceder a variables que hacen referencia a todos los subsitemas, como son graficos, audio, ficheros, entrada y aplicaciones
		// gl es una variable de tipo GL, nos permite acceder a metodos de GL10, GL11 y GL20
		//En este caso glClearColor es un bucle (game loop) que establecera el fondo de la pantalla negro (0,0,0) con transparencia 1
				
		exit.update(); // Comprobamos que se pulsan los botones
		play.update();
		
		batch.begin();
		exit.draw(batch); // Dibujamos el botón exit
		play.draw(batch); // Dibujamos el botón play
		batch.end();
	}


	@Override
	public void dispose() {
		exit.dispose();
		play.dispose();
		super.dispose();
	}
	
	

}
