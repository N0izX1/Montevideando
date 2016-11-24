package com.montevideando.game;

import com.badlogic.ashley.core.Entity;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.viewport.FillViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.uwsoft.editor.renderer.components.MainItemComponent;
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
		
		
		ScreenManager.getInstance().getSceneLoader().addComponentsByTagName("button", ButtonComponent.class);
		
		//Objetos rotos
		
		//Basura
		final Entity entityBasura1 = rootItem.getChild("basura1").getEntity();
		ButtonComponent buttonComponent = entityBasura1.getComponent(ButtonComponent.class);
		
		buttonComponent.addListener(new ButtonComponent.ButtonListener() {
	
			public void touchUp() {

			}

			public void touchDown() {
				
			}

			public void clicked() {
			
				MainItemComponent main = entityBasura1.getComponent(MainItemComponent.class);
				main.visible = false;
			}
		});
		
		//Auto roto 1 
		final Entity entityAutoroto = rootItem.getChild("autoroto").getEntity();
		ButtonComponent autoroto = entityAutoroto.getComponent(ButtonComponent.class);
		
		autoroto.addListener(new ButtonComponent.ButtonListener() {
	
			public void touchUp() {

			}

			public void touchDown() {
				
			}

			public void clicked() {
				//System.out.println("DESTROY");
				MainItemComponent main = entityAutoroto.getComponent(MainItemComponent.class);
				main.visible = false;
			}
		});
		
		//Pozo de agua
		final Entity entityPozodeagua = rootItem.getChild("pozodeagua").getEntity();
		ButtonComponent pozodeagua = entityPozodeagua.getComponent(ButtonComponent.class);
		
		pozodeagua.addListener(new ButtonComponent.ButtonListener() {
	
			public void touchUp() {

			}

			public void touchDown() {
				
			}

			public void clicked() {
				//System.out.println("DESTROY");
				MainItemComponent main = entityPozodeagua.getComponent(MainItemComponent.class);
				main.visible = false;
			}
		});
		
		
		//Baldosa Rota
		final Entity entityBaldosarota = rootItem.getChild("baldosa1").getEntity();
		ButtonComponent baldosarota = entityBaldosarota.getComponent(ButtonComponent.class);
		
		baldosarota.addListener(new ButtonComponent.ButtonListener() {
	
			public void touchUp() {

			}

			public void touchDown() {
				
			}

			public void clicked() {
				//System.out.println("DESTROY");
				MainItemComponent main = entityBaldosarota.getComponent(MainItemComponent.class);
				main.visible = false;
			}
		});		
		
		
		//Baldosa Rota 2 
		final Entity entityBaldosarota2 = rootItem.getChild("baldosa2").getEntity();
		ButtonComponent baldosarota2 = entityBaldosarota2.getComponent(ButtonComponent.class);
		
		baldosarota2.addListener(new ButtonComponent.ButtonListener() {
	
			public void touchUp() {

			}

			public void touchDown() {
				
			}

			public void clicked() {
				//System.out.println("DESTROY");
				MainItemComponent main = entityBaldosarota2.getComponent(MainItemComponent.class);
				main.visible = false;
			}
		});

		//Baldosa Rota 3
		final Entity entityBaldosarota3 = rootItem.getChild("baldosa3").getEntity();
		ButtonComponent baldosarota3 = entityBaldosarota3.getComponent(ButtonComponent.class);
		
		baldosarota3.addListener(new ButtonComponent.ButtonListener() {
	
			public void touchUp() {

			}

			public void touchDown() {
				
			}

			public void clicked() {
				//System.out.println("DESTROY");
				MainItemComponent main = entityBaldosarota3.getComponent(MainItemComponent.class);
				main.visible = false;
			}
		});

		//Baldosa Rota 4
		final Entity entityBaldosarota4 = rootItem.getChild("baldosa4").getEntity();
		ButtonComponent baldosarota4 = entityBaldosarota4.getComponent(ButtonComponent.class);
		
		baldosarota4.addListener(new ButtonComponent.ButtonListener() {
	
			public void touchUp() {

			}

			public void touchDown() {
				
			}

			public void clicked() {
				//System.out.println("DESTROY");
				MainItemComponent main = entityBaldosarota4.getComponent(MainItemComponent.class);
				main.visible = false;
			}
		});

		//Baldosa Rota 5
		final Entity entityBaldosarota5 = rootItem.getChild("baldosa5").getEntity();
		ButtonComponent baldosarota5 = entityBaldosarota5.getComponent(ButtonComponent.class);
		
		baldosarota4.addListener(new ButtonComponent.ButtonListener() {
	
			public void touchUp() {

			}

			public void touchDown() {
				
			}

			public void clicked() {
				//System.out.println("DESTROY");
				MainItemComponent main = entityBaldosarota5.getComponent(MainItemComponent.class);
				main.visible = false;
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
