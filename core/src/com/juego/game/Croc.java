package com.juego.game;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Croc extends Actor{

	ArrayList<Image>images;
	int dibujo_actual = 0;
	float tiempo_act = 0;
	
	public Croc(){
		super();
		images = new ArrayList<Image>();
		images.add(new Image(new Texture("Croc01.png")));
		images.add(new Image(new Texture("Croc02.png")));
		images.add(new Image(new Texture("Croc03.png")));
		images.add(new Image(new Texture("Croc04.png")));
		images.add(new Image(new Texture("Croc05.png")));
		images.add(new Image(new Texture("Croc06.png")));
	}

	@Override
	public void act(float delta) {
		System.out.println(delta);
		super.act(delta);
		tiempo_act+= delta;
		if(tiempo_act>0.1f){
		dibujo_actual++;
		tiempo_act = 0;
		}
		if(dibujo_actual >= images.size()){
			dibujo_actual = 0;
		}
		
	}
	@Override
	public void draw(Batch batch, float parentAlpha) {
		// TODO Auto-generated method stub
		super.draw(batch, parentAlpha);
		images.get(dibujo_actual).setX(230);
		images.get(dibujo_actual).setY(-15);
		images.get(dibujo_actual).draw(batch, parentAlpha);
		
	}
}

