package com.juego.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Enemigo extends Image{

	Enemigo(Texture texture){
		super(texture);
	}
	public void act(float delta){
		super.act(delta);
		this.setX(this.getX()+1);
		addListener(new EnemigoInput());
	}
}
