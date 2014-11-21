package com.juego.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class Principal extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	Stage stage;
	Music musica;
	
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("Fondito.png");
		stage = new Stage();
		stage.addActor(new PersonajeAnimado());
		stage.addActor(new Stickman());
		stage.addActor(new Croc());
		stage.addActor(new Explosion());
		stage.addActor(new Titulo());
		musica = Gdx.audio.newMusic(Gdx.files.internal("musiquita.mp3"));
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 1, 2);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		batch.begin();
		batch.draw(img ,0 ,0);
		batch.end();
		stage.draw();
		stage.act();
		musica.play();
	
	}
}
