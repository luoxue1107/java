package cn.kgc.tangcco.util.character;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;

/**
 * @author 李庆华
 * @Description
 * @date 2020/10/19 12:02
 */
public class Character {

    public  static void characterEncoding(HttpServletRequest req, HttpServletResponse resp,String textType){
        try {
            // 处理中文乱码
            // 处理post请求的中文乱码
            req.setCharacterEncoding("utf-8");
            // 处理响应的字符集中文乱码
            resp.setCharacterEncoding("utf-8");
            // 处理浏览器字符集中文乱码
            resp.setContentType(textType+";charset=utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
