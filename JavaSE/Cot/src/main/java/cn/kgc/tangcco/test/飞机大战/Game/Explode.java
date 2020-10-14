package cn.kgc.tangcco.test.飞机大战.Game;

import java.awt.*;

/**
 * 爆炸类
 */
public class Explode {
    double x, y;

    static Image[] images = new Image[28];

    static {
        for (int i = 0; i < 28; i++) {
            images[i] = GameUtil.getImage ( "images/b" + (i + 1) + ".gif" );
            images[i].getWidth ( null );
        }
    }

    int count;

    public void draw ( Graphics g ) {
        if (count <= 27) {
            g.drawImage ( images[count], (int) x, (int) y, null );
            count++;
        }
    }

    public Explode ( double x, double y ) {
        this.x = x;
        this.y = y;
    }

}
