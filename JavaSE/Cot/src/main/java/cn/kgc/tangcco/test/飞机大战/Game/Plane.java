package cn.kgc.tangcco.test.飞机大战.Game;

import java.awt.*;
import java.awt.event.KeyEvent;

/*
 *飞机
 */
public class Plane extends GameObject {

    boolean left, up, right, down;
    boolean live=true;
    @Override
    public void drawSelf ( Graphics g ) {
        if (live){
            g.drawImage ( img, (int) x, (int) y, null );
            if (left){
                x-=speed;
            }
            if (right){
                x+=speed;
            }
            if (up){
                y-=speed;
            }
            if (down){
                y+=speed;
            }
        }else {
            System.out.println ();
        }

    }

    public Plane ( Image img, double x, double y, int speed, int width, int height ) {
        super ( img, x, y, speed, width, height );
    }

    public Plane ( int speed, int width, int height ) {
        super ( speed, width, height );
    }

    public Plane ( Image img, double x, double y ) {
        super ( img, x, y );
        this.speed=3;
        //获得图片的宽高
        this.width=35;
        this.height=35;
    }
    //按某键增加相应的方向
    public void addDirection ( KeyEvent e ) {
        switch (e.getKeyCode ()) {
            case KeyEvent.VK_LEFT:
                left = true;
                break;
            case KeyEvent.VK_UP:
                up=true;
                break;
            case KeyEvent.VK_RIGHT:
                right=true;
                break;
            case KeyEvent.VK_DOWN:
                down=true;
                break;
        }
    }
    //取消相应的方向
    public void minusDirection ( KeyEvent e ) {
        switch (e.getKeyCode ()) {
            case KeyEvent.VK_LEFT:
                left = false;
                break;
            case KeyEvent.VK_UP:
                up=false;
                break;
            case KeyEvent.VK_RIGHT:
                right=false;
                break;
            case KeyEvent.VK_DOWN:
                down=false;
                break;
        }
    }


}
