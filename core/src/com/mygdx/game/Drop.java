package com.mygdx.game;


import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;


public class Drop extends Game {

	public SpriteBatch batch;
	public BitmapFont font;
	

	public void create () {
		batch = new SpriteBatch();
		font = new BitmapFont();
		this.setScreen(new MainMenuScreen(this));

	}

	public void createLost() {
		batch = new SpriteBatch();
		font = new BitmapFont();
		this.setScreen(new LostScreen(this));
	}

	public void createWin() {
		batch = new SpriteBatch();
		font = new BitmapFont();
		this.setScreen(new WinScreen(this));
	}


	public void render () {
		super.render();
	}

	public void dispose () {
		batch.dispose();
		font.dispose();
	}
}
