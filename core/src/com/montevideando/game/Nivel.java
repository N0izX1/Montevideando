package com.montevideando.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.viewport.FillViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.uwsoft.editor.renderer.components.additional.ButtonComponent;
import com.uwsoft.editor.renderer.utils.ItemWrapper;

public class Nivel extends AbstractScreen {

	private Viewport viewport;
	private Camera camera;
	private ItemWrapper rootItem;
	ItemWrapper root;
	int y = 0;

	public Nivel() {
		camera = new OrthographicCamera();
		viewport = new FillViewport(200, 400, camera);
		ScreenManager.getInstance().getSceneLoader().loadScene("MainScene", viewport);
		Music music = Gdx.audio.newMusic(Gdx.files.internal("music.ogg"));

		root = new ItemWrapper(ScreenManager.getInstance().getSceneLoader().getRoot());
		music.setLooping(true);
		music.play();

		rootItem = new ItemWrapper(ScreenManager.getInstance().getSceneLoader().getRoot());
//
//		// all entities with button tag now have ButtonComponent
		ScreenManager.getInstance().getSceneLoader().addComponentsByTagName("button", ButtonComponent.class);
//
//		// retrieve particular button, and it's component, and add listener to it.
		ButtonComponent buttonComponent = rootItem.getChild("basura1").getEntity()
				.getComponent(ButtonComponent.class);
		buttonComponent.addListener(new ButtonComponent.ButtonListener() {
			public void touchUp() {
				System.out.println("UP");
			}

			public void touchDown() {
				System.out.println("DOWND");
			}

			public void clicked() {
				System.out.println("CLICK");
			}
		});
	}

	@Override
	public void render(float delta) {

		y++;
		float x = viewport.getWorldWidth() / 2;
		float y2 = viewport.getWorldHeight() / 2 + y;

		if (y2 > 4300) {
			this.dispose();
		} else {

			float speedCamera = Gdx.graphics.getDeltaTime() * 5f;

			ScreenManager.getInstance().getSceneLoader().getEngine().update(speedCamera);
			((OrthographicCamera) viewport.getCamera()).position.set(x, y2, 0);

//			System.out.println("x: " + x + " y: " + y2);

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

		/*
		 * root.getChild("arbol");
		 * 
		 * 
		 * sceneLoader.addComponentsByTagName(arbol, );
		 */

	}
}
