package com.six.phigame.screen;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.six.phigame.PhiGame;
import com.six.phigame.Settings;
import com.six.phigame.model.Player;

public class GameScreen extends AbstractScreen {
    private Player player;
    private SpriteBatch spriteBatch;
    private Texture redStandingSouth;

    public GameScreen(PhiGame phiGame) {
        super(phiGame);
        redStandingSouth = new Texture("player/Hero.png");
        spriteBatch = new SpriteBatch();
        player = new Player(0, 0);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        spriteBatch.begin();
        spriteBatch.draw(redStandingSouth,
                player.getX() * Settings.SCALED_TILE_SIZE,
                player.getY() * Settings.SCALED_TILE_SIZE,
                128,
                48);
        spriteBatch.end();
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
