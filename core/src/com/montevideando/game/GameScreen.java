package com.montevideando.game;

import java.util.Iterator;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.TimeUtils;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.montevideando.game.MontevideandoGame;
import com.uwsoft.editor.renderer.SceneLoader;

public class GameScreen extends AbstractScreen {
	
    
	   public GameScreen(MontevideandoGame main) {
	    	super(main);
	   }
    	private SceneLoader sceneLoader; 
    	
    	@Override
    	public void show () {
    		FitViewport viewPort = new FitViewport(200,160);
    		sceneLoader = new SceneLoader();
    		sceneLoader.loadScene("MainScene",viewPort);
    				
    	}

    	@Override
    	public void render(float delta) {
    		Gdx.gl.glClearColor(1, 0, 0, 1);
    		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

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
    }
