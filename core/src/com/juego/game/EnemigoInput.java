package com.juego.game;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

public class EnemigoInput extends InputListener{

	Enemigo enemigo;
	
	EnemigoInput(Enemigo enemigo){
		super();
		this.enemigo = enemigo;
	}
	
	@Override
public boolean touchDown(InputEvent event, float x, float y, int pointer,
		int button) {

		enemigo.remove();
	
	return super.touchDown(event, x, y, pointer, button);
}
@Override
	public void touchUp(InputEvent event, float x, float y, int pointer,
			int button) {
		// TODO Auto-generated method stub
		super.touchUp(event, x, y, pointer, button);
	}


}
