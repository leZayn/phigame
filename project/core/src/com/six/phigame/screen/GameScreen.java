package com.six.phigame.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.six.phigame.PhiGame;
import com.six.phigame.Settings;
import com.six.phigame.controller.PlayerController;
import com.six.phigame.model.Player;

public class GameScreen extends AbstractScreen {
    private TiledMap tiledMap;
    private OrthogonalTiledMapRenderer orthogonalTiledMapRenderer;
    private OrthographicCamera orthographicCamera;
    private PlayerController playerController;
    private Player player;
    private SpriteBatch spriteBatch;
    private Texture redStandingSouth;

    public GameScreen(PhiGame phiGame) {
        super(phiGame);
        tiledMap = new TmxMapLoader().load("map/MAP.tmx");
        orthogonalTiledMapRenderer = new OrthogonalTiledMapRenderer(tiledMap);
        orthographicCamera = new OrthographicCamera();
        player = new Player(0, 0);
        spriteBatch = new SpriteBatch();
        redStandingSouth = new Texture("player/Hero.png");
        playerController = new PlayerController(player);
    }

    @Override
    public void show() {
        Gdx.input.setInputProcessor(playerController);
    }

    @Override
    public void render(float delta) {
        orthogonalTiledMapRenderer.setView(orthographicCamera);
        orthogonalTiledMapRenderer.render();
        spriteBatch.begin();
        spriteBatch.draw();
        spriteBatch.draw(redStandingSouth,
                player.getX() * Settings.SCALED_TILE_SIZE,
                player.getY() * Settings.SCALED_TILE_SIZE,
                Settings.SCALED_TILE_SIZE,
                Settings.SCALED_TILE_SIZE);
        spriteBatch.end();
    }

    @Override
    public void resize(int width, int height) {
        orthographicCamera.viewportWidth = width;
        orthographicCamera.viewportHeight = height;
        orthographicCamera.update();
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
        tiledMap.dispose();
        orthogonalTiledMapRenderer.dispose();
    }
}
