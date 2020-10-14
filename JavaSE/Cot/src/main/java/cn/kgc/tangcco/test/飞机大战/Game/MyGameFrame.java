package cn.kgc.tangcco.test.飞机大战.Game;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Date;

public class MyGameFrame extends Frame {
    //调用图片
    Image bg = GameUtil.getImage ( "im/bg.png" );
    Image bg2 = GameUtil.getImage ( "im/pg2.png" );

    //开始时间
    Date startTime = new Date ();
    Date endTime;
    int period;

    //炮弹集合
    ArrayList<Shell> shells = new ArrayList<Shell> ();

    Explode bao;

    Plane plane = new Plane ( bg2, 270, 700 );

    public void paint ( Graphics g ) {//自动被调用，g相当于一只画笔
        g.drawImage ( bg, 0, 0, null );
        Color color = g.getColor ();
        plane.drawSelf ( g );//画飞机
        //画炮弹
        for (Shell shell : shells) {
            shell.draw ( g );
            //炮弹矩形于飞机矩形相碰检测
            boolean peng = shell.getRect ().intersects ( plane.getRect () );
            if (peng) {
                plane.live = false;
                if (bao == null) {
                    bao = new Explode ( plane.x, plane.y );
                    //结束时间
                    endTime = new Date ();
                    period = (int) ((endTime.getTime () - startTime.getTime ()) / 1000);
                }

                bao.draw ( g );
            }
            //结束判断
            if (!plane.live) {
                g.setColor ( Color.red );
                Font font = new Font ( "宋体", Font.BOLD, 50 );
                g.setFont ( font );
                g.drawString ( "时间：" + period + "秒", 170, 400 );
            }
        }
        g.setColor ( color );

    }

    //帮助反复重画
    class PaintThread extends Thread {
        public void run ( ) {
            while (true) {
                repaint ();//重画
                try {
                    Thread.sleep ( 20 );//1s=1000ms
                } catch (InterruptedException e) {
                    e.printStackTrace ();
                }
            }
        }
    }

    //键盘监听内部类
    class KeyMonitor extends KeyAdapter {

        @Override
        public void keyPressed ( KeyEvent e ) {
            plane.addDirection ( e );
        }

        @Override
        public void keyReleased ( KeyEvent e ) {
            plane.minusDirection ( e );
        }
    }

    /**
     * 窗口
     */
    public void launchFrame ( ) {
        this.setTitle ( "飞机游戏" );
        this.setVisible ( true );
        this.setSize ( Constant.GAME_WIDTH, Constant.GAME_HEIGHT );
        this.setLocation ( 300, 300 );

        this.addWindowListener ( new WindowAdapter () {
            public void windowClosing ( WindowEvent e ) {
                System.exit ( 0 );
            }
        } );
        new PaintThread ().start ();//启动重画窗口的线程
        addKeyListener ( new KeyMonitor () );//增加键盘监听
        //生成炮弹
        for (int i = 0; i < 30; i++) {
            shells.add ( new Shell () );//炮弹 ;
        }

    }
    //main
    public static void main ( String[] args ) {
        MyGameFrame f = new MyGameFrame ();
        f.launchFrame ();
    }

    //双缓冲
    private Image offScreenImage = null;

    public void update ( Graphics g ) {
        if (offScreenImage == null)
            //窗口xy
            offScreenImage = this.createImage ( Constant.GAME_WIDTH, Constant.GAME_HEIGHT );

        Graphics gOff = offScreenImage.getGraphics ();
        paint ( gOff );
        g.drawImage ( offScreenImage, 0, 0, null );
    }


}
