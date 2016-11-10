package com.montevideando.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.uwsoft.editor.renderer.SceneLoader;
import com.uwsoft.editor.renderer.utils.ItemWrapper;

public class Nivel extends AbstractScreen {
	private SceneLoader sceneLoader; 
	
	 private Viewport viewport;
	 private Camera camera;
	
	ItemWrapper root;
	int y = 0;
	
	public Nivel(MontevideandoGame main) {
    	super(main);
   }
	
	@Override
	public void show () {
        camera = new OrthographicCamera();
        viewport = new FitViewport(270, 300, camera);
		sceneLoader = new SceneLoader();
		sceneLoader.loadScene("MainScene", viewport);
		Music music = Gdx.audio.newMusic(Gdx.files.internal("music.ogg")); 
		
		root = new ItemWrapper(sceneLoader.getRoot());
		music.setLooping(true);
		music.play();

		/*
		root.getChild("arbol");
		
		
		sceneLoader.addComponentsByTagName(arbol, );
		*/

				
	}

	@Override
	public void render(float delta) {
		
		y++;
		float x = viewport.getWorldWidth() / 2;
		float y2 = viewport.getWorldHeight() / 2 + y;
		
		
		if (y2 > 2000) {
			this.dispose();
		} else {
			Gdx.gl.glClearColor(1, 0, 0, 1);
			float speedCamera = Gdx.graphics.getDeltaTime()*5f; 

			Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
			
			
			sceneLoader.getEngine().update(speedCamera);
			
			
			((OrthographicCamera) viewport.getCamera()).position.set(x, y2, 0);

			try {
				Thread.sleep((long) speedCamera);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("x: " + x + " y: " + y2);
			
			
		}
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		
	}
}

