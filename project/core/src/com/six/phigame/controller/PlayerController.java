package com.six.phigame.controller;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputAdapter;
import com.six.phigame.model.Player;

public class PlayerController extends InputAdapter {
    private Player player;

    public PlayerController(Player player){
        this.player = player;
    }

    @Override
    public boolean keyDown(int keycode) {
        if(keycode == Input.Keys.RIGHT){
            player.move(0, 1);
        }
        if(keycode == Input.Keys.LEFT){
            player.move(0, -1);
        }
        if(keycode == Input.Keys.UP){
            player.move(-1, 0);
        }
        if(keycode == Input.Keys.DOWN){
            player.move(1, 0);
        }
        return false;
    }
}
