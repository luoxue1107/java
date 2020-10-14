package cn.kgc.tangcco.test.飞机大战.Game;

import java.awt.*;

/**
 * 游戏物体的父类
 */
public class GameObject {
    Image img;
    double x, y;
    int speed;
    int width, height;

    public GameObject ( Image img, double x, double y, int speed, int width, int height ) {
        this.img = img;
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.width = width;
        this.height = height;
    }

    public GameObject ( int speed, int width, int height ) {
        this.speed = speed;
        this.width = width;
        this.height = height;
    }

    public GameObject ( Image img, double x, double y ) {
        this.img = img;
        this.x = x;
        this.y = y;
    }

    public void drawSelf ( Graphics g ) {
        g.drawImage ( img, (int) x, (int) y, null );
    }

    public GameObject ( ) {
    }

    /**
     * 返回物体所在的矩形，便于碰撞检测；
     */
    public Rectangle getRect ( ) {
        return new Rectangle ( (int) x, (int) y, width, height );
    }
}
