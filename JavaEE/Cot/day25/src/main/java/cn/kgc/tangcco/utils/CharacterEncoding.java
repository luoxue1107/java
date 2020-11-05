package cn.kgc.tangcco.utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;

/**
 * @author 李庆华
 * @Description
 * @date 2020/10/19 12:02
 */
public class CharacterEncoding  {
    public  static void  CharacterEncoding(HttpServletRequest req, HttpServletResponse resp) throws UnsupportedEncodingException {
        // 处理中文乱码
        // 处理post请求的中文乱码
        req.setCharacterEncoding("utf-8");
        // 处理响应的字符集中文乱码
        resp.setCharacterEncoding("utf-8");
        // 处理浏览器字符集中文乱码
        resp.setContentType("text/html;charset=utf-8");
    }
}
