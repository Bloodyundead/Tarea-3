package com.juego.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Files.FileType;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Principal extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	Texture img2;
	Texture img4;
	Texture img5;
	Texture img11;
	Image mi_image;
	Stage stage;
	int x = 0;
	int y = 390;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("nube2.png");
		img2 = new Texture("Pared.png");
		img4 = new Texture("sol2.png");
		img5 = new Texture("P2.png");
		img11 = new Texture("P1.png");
		stage = new Stage();
		Gdx.input.setInputProcessor(stage);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 1, 2);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 29, 339);
		batch.draw(img, 390, 318);
		batch.draw(img2, 120, 0);
		batch.draw(img4, 250, 350);
		batch.draw(img5, y, 0);
		batch.draw(img11, x, 0);
		
		batch.end();
		
		if(x > 500)
			x = 0;
		else x++;
		
		if (y < 0)
			y = 390;
		else y--;
		
	}
}
