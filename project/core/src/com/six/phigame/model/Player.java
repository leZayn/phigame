package com.six.phigame.model;

public class Player {
    private int x;
    private int y;

    public Player(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(int addX, int addY){
        x += addX;
        y += addY;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
