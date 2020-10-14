package cn.kgc.tangcco.day14.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 李庆华

 * @date 2020/10/13 11:49
 */
public class ServletDemo01 extends HttpServlet {
/**
 *必须生成serialVersionUID
 */
    private static final long serialVersionUID = -2988478302100670148L;

    /**
     *
     * 接收客户端请求
     * @param request 接收客户端请求
     * @param response 响应客户端
     */
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        super.service(req, resp);
        System.out.println("客户地址" + request.getRemoteAddr());
        System.out.println("客户地址" + request.getRemoteHost());


    }
}
