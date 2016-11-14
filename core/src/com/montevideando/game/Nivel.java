package com.montevideando.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.uwsoft.editor.renderer.utils.ItemWrapper;

public class Nivel extends AbstractScreen {
	
	 private Viewport viewport;
	 private Camera camera;
	
	ItemWrapper root;
	int y = 0;
	
	public Nivel(){
		super();
	}
	
	@Override
	public void render(float delta) {
		
		y++;
		float x = viewport.getWorldWidth() / 2;
		float y2 = viewport.getWorldHeight() / 2 + y;
		
		
		if (y2 > 2000) {
			this.dispose();
		} else {
			
			float speedCamera = Gdx.graphics.getDeltaTime()*5f; 
			
			ScreenManager.getInstance().getSceneLoader().getEngine().update(speedCamera);
			
			
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


	@Override
	public void buildStage() {
        camera = new OrthographicCamera();
        viewport = new FitViewport(270, 300, camera);
        ScreenManager.getInstance().getSceneLoader().loadScene("MainScene", viewport);
		Music music = Gdx.audio.newMusic(Gdx.files.internal("music.ogg")); 
		
		root = new ItemWrapper(ScreenManager.getInstance().getSceneLoader().getRoot());
		music.setLooping(true);
		music.play();

		/*
		root.getChild("arbol");
		
		
		sceneLoader.addComponentsByTagName(arbol, );
		*/

		
	}
}

