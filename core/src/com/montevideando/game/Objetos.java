package com.montevideando.game;

import com.badlogic.ashley.core.Entity;
import com.badlogic.gdx.physics.box2d.World;
import com.uwsoft.editor.renderer.components.DimensionsComponent;
import com.uwsoft.editor.renderer.components.TransformComponent;
import com.uwsoft.editor.renderer.scripts.IScript;
import com.uwsoft.editor.renderer.utils.ComponentRetriever;

public class Objetos implements IScript {

	private Entity object;
	private TransformComponent transformComponent;
	private DimensionsComponent dimensionsComponent;
	private World world;
	
	public Objetos(World world){
		this.world = world;
	}
	
	@Override
	public void init(Entity entity) {
		object = entity;
		transformComponent = ComponentRetriever.get(entity, TransformComponent.class);
		dimensionsComponent = ComponentRetriever.get(entity, DimensionsComponent.class);
		
	}

	@Override
	public void act(float delta) {
	
		
	}

	@Override
	public void dispose() {
		
		
	}

}
