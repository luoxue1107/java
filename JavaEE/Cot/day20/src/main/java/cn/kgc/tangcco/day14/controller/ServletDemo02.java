package cn.kgc.tangcco.day14.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 李庆华
 * @Description
 * @date 2020/10/13 11:49
 */

/**
 * 地址映射的简便学法  如果映射多个地址 需要 { , } 逗号隔开
 */
@WebServlet(urlPatterns = {"/demo02.do","/luoxue.action"})
public class ServletDemo02 extends HttpServlet {
/**
 *必须生成serialVersionUID
 */
    private static final long serialVersionUID = -2988478302100670148L;

    /**
     *
     * 接收客户端请求
     * @param request 接收请求
     * @param response 响应客户端
     */
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("访问到啦!!!");


    }
}
