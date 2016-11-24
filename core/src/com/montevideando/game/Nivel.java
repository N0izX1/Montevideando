package com.montevideando.game;

import com.badlogic.ashley.core.Entity;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
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
	int puntos = 0;
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
				puntos++;
				MainItemComponent main = entityBasura1.getComponent(MainItemComponent.class);
				main.visible = false;
			}
		});
		
		//Basura 2
		final Entity entityBasura2 = rootItem.getChild("basura2").getEntity();
		ButtonComponent basura2 = entityBasura2.getComponent(ButtonComponent.class);
		
		basura2.addListener(new ButtonComponent.ButtonListener() {
	
			public void touchUp() {

			}

			public void touchDown() {
				
			}

			public void clicked() {
				puntos++;
				MainItemComponent main = entityBasura2.getComponent(MainItemComponent.class);
				main.visible = false;
			}
		});
		
		//Basura 3
		final Entity entityBasura3 = rootItem.getChild("basura3").getEntity();
		ButtonComponent basura3 = entityBasura3.getComponent(ButtonComponent.class);
		
		basura3.addListener(new ButtonComponent.ButtonListener() {
	
			public void touchUp() {

			}

			public void touchDown() {
				
			}

			public void clicked() {
				puntos++;
				MainItemComponent main = entityBasura3.getComponent(MainItemComponent.class);
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
				puntos++;
				MainItemComponent main = entityAutoroto.getComponent(MainItemComponent.class);
				main.visible = false;
			}
		});
		
		//Auto roto 2
		final Entity entityAutoroto2 = rootItem.getChild("autoroto2").getEntity();
		ButtonComponent autoroto2 = entityAutoroto2.getComponent(ButtonComponent.class);
		
		autoroto2.addListener(new ButtonComponent.ButtonListener() {
	
			public void touchUp() {

			}

			public void touchDown() {
				
			}

			public void clicked() {
				puntos++;
				MainItemComponent main = entityAutoroto2.getComponent(MainItemComponent.class);
				main.visible = false;
			}
		});
		
		//Auto roto 3
				final Entity entityAutoroto3 = rootItem.getChild("autoroto3").getEntity();
				ButtonComponent autoroto3 = entityAutoroto3.getComponent(ButtonComponent.class);
				
				autoroto3.addListener(new ButtonComponent.ButtonListener() {
			
					public void touchUp() {

					}

					public void touchDown() {
						
					}

					public void clicked() {
						puntos++;
						MainItemComponent main = entityAutoroto3.getComponent(MainItemComponent.class);
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
				puntos++;
				MainItemComponent main = entityPozodeagua.getComponent(MainItemComponent.class);
				main.visible = false;
			}
		});
		
		//Pozo de agua 2
		final Entity entityPozodeagua2 = rootItem.getChild("pozodeagua2").getEntity();
		ButtonComponent pozodeagua2 = entityPozodeagua2.getComponent(ButtonComponent.class);
		
		pozodeagua2.addListener(new ButtonComponent.ButtonListener() {
	
			public void touchUp() {

			}

			public void touchDown() {
				
			}

			public void clicked() {
				puntos++;
				MainItemComponent main = entityPozodeagua2.getComponent(MainItemComponent.class);
				main.visible = false;
			}
		});
		
		//Pozo
		final Entity entityPozo = rootItem.getChild("pozo").getEntity();
		ButtonComponent pozo = entityPozo.getComponent(ButtonComponent.class);
		
		pozo.addListener(new ButtonComponent.ButtonListener() {
	
			public void touchUp() {

			}

			public void touchDown() {
				
			}

			public void clicked() {
				puntos++;
				MainItemComponent main = entityPozo.getComponent(MainItemComponent.class);
				main.visible = false;
			}
		});
		
		//Pozo 2
		final Entity entityPozo2 = rootItem.getChild("pozo2").getEntity();
		ButtonComponent pozo2 = entityPozo2.getComponent(ButtonComponent.class);
		
		pozo2.addListener(new ButtonComponent.ButtonListener() {
	
			public void touchUp() {

			}

			public void touchDown() {
				
			}

			public void clicked() {
				puntos++;
				MainItemComponent main = entityPozo2.getComponent(MainItemComponent.class);
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
				puntos++;
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
				puntos++;
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
				puntos++;
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
				puntos++;
				MainItemComponent main = entityBaldosarota4.getComponent(MainItemComponent.class);
				main.visible = false;
			}
		});

		//Baldosa Rota 5
		final Entity entityBaldosarota5 = rootItem.getChild("baldosa5").getEntity();
		ButtonComponent baldosarota5 = entityBaldosarota5.getComponent(ButtonComponent.class);
		
		baldosarota5.addListener(new ButtonComponent.ButtonListener() {
	
			public void touchUp() {

			}

			public void touchDown() {
				
			}

			public void clicked() {
				puntos++;
				MainItemComponent main = entityBaldosarota5.getComponent(MainItemComponent.class);
				main.visible = false;
			}
		});
		
		//Tronco
		final Entity entityTronco = rootItem.getChild("tronco").getEntity();
		ButtonComponent tronco = entityTronco.getComponent(ButtonComponent.class);
		
		tronco.addListener(new ButtonComponent.ButtonListener() {
	
			public void touchUp() {

			}

			public void touchDown() {
				
			}

			public void clicked() {
				puntos++;
				MainItemComponent main = entityTronco.getComponent(MainItemComponent.class);
				main.visible = false;
			}
		});
		
		//Arbol caido
		final Entity entityArbolcaido = rootItem.getChild("arbolcaido").getEntity();
		ButtonComponent arbolcaido = entityArbolcaido.getComponent(ButtonComponent.class);
		
		arbolcaido.addListener(new ButtonComponent.ButtonListener() {
	
			public void touchUp() {

			}

			public void touchDown() {
				
			}

			public void clicked() {
				puntos++;
				MainItemComponent main = entityArbolcaido.getComponent(MainItemComponent.class);
				main.visible = false;
			}
		});
	}

	
	@Override
	public void render(float delta) {

		y++;
		float x = viewport.getWorldWidth() / 2;
		float y2 = viewport.getWorldHeight() / 2 + y;

		if (y2 > 4450) {
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



	}
}
