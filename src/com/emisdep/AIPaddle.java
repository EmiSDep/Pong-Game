package com.emisdep;

import java.awt.*;
import java.awt.event.*;

public class AIPaddle extends Rectangle{

    int id;
    int yVelocity;
    int speed = 10;
    Ball b1;

    AIPaddle(int x, int y, int PADDLE_WIDTH, int PADDLE_HEIGHT, int id, Ball b){
        super(x,y,PADDLE_WIDTH,PADDLE_HEIGHT);
        this.id=id;
        b1 = b;
    }

    public void setYDirection(int yDirection) {
        yVelocity = yDirection;
    }
    public void move() {
        y= y + yVelocity;

    }

    public void draw(Graphics g) {
        if (id == 1)
            g.setColor(Color.white);
    }
}