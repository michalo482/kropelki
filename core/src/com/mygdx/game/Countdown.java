package com.mygdx.game;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.ScreenUtils;

public class Countdown implements Screen {

    final Drop game;

    OrthographicCamera camera;

    private int count = 300;

    public Countdown(final Drop game) {
        this.game = game;
        camera = new OrthographicCamera();
        camera.setToOrtho(false, 800, 480);
    }
    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(0, 0, 0.2f, 1);

        camera.update();
        game.batch.setProjectionMatrix(camera.combined);
        if(count != -1){
            if(count == 0 ){
                game.setScreen(new GameScreen(game));
                dispose();
            }
            count--;
            game.batch.begin();
            game.font.setColor(1.0f, 1.0f, 1.0f, 1.0f);
            if(count>=200&&count<=300)game.font.draw(game.batch, "3", 800/2, 480/2);
            if(count>=100&&count<=200)game.font.draw(game.batch, "2", 800/2, 480/2);
            if(count>=0&&count<=100)game.font.draw(game.batch, "1", 800/2, 480/2);
            game.batch.end();
        }
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
