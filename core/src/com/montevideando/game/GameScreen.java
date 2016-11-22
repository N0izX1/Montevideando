package com.montevideando.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.uwsoft.editor.renderer.SceneLoader;

public class GameScreen extends AbstractScreen {
	
    
    	private SceneLoader sceneLoader; 
    	
    	@Override
    	public void show () {
    		//FitViewport viewPort = new FitViewport(200,300);
    		//sceneLoader = new SceneLoader();
    		//sceneLoader.loadScene("MainScene",viewPort);
    				
    	}

    	@Override
    	public void render(float delta) {

    		sceneLoader.getEngine().update(Gdx.graphics.getDeltaTime());
    		
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
    		// TODO Auto-generated method stub
    		
    	}

		@Override
		public void buildStage() {
			// TODO Auto-generated method stub
			
		}
    }
