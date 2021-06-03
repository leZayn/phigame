package com.six.phigame.screen;

import com.badlogic.gdx.Screen;
import com.six.phigame.PhiGame;

public abstract class AbstractScreen implements Screen {

    private PhiGame phiGame;

    public AbstractScreen(PhiGame phiGame) {
        this.phiGame = phiGame;
    }

    @Override
    public abstract void show();

    @Override
    public abstract void render(float delta);

    @Override
    public abstract void resize(int width, int height);

    @Override
    public abstract void pause();

    @Override
    public abstract void resume();

    @Override
    public abstract void hide();

    @Override
    public abstract void dispose();
}
