package cn.kgc.tangcco.test.飞机大战.Game;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class GameUtil {
    private GameUtil ( ) {
    }

    /**
     * 返回指定图片路径
     */
    public static Image getImage ( String path ) {
        BufferedImage bi = null;
        URL u = GameUtil.class.getClassLoader ().getResource ( path );
        try {
            bi = ImageIO.read ( u );
        } catch (IOException e) {
            e.printStackTrace ();
        }
        return bi;
    }
}
