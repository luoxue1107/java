package cn.kgc.tangcco.day14.controller;

import cn.hutool.core.date.DateUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;



/**
 * @author 李庆华
 * @Description
 * @date 2020/10/13 23:14
 */
@WebServlet(urlPatterns = {"/luo.do", "/Demo03.do"})
public class ServletDemo03 extends HttpServlet {

    private static final long serialVersionUID = 613359005005180036L;

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        super.service(req, resp);   192.168.100.34
//        远程机器 NetworkInfo
        System.out.println(
                "时间:" + DateUtil.now() + "\n" +
                        "客户端ip地址:\t" + request.getRemoteHost() + "\n" +
                        "客户端ip地址:\t" + request.getRemoteAddr() + "\n" +
                        "客户端端口号:\t" + request.getRemotePort() + "\n" +
                        "---------------------------------------------");
//        服务器
        System.out.println(
                "时间:" + DateUtil.now() + "\n" +
                        "服务器ip地址:\t" + request.getLocalAddr() + "\n" +
                        "服务器名字:\t" + request.getLocalName() + "\n" +
                        "服务器端口号:\t" + request.getLocalPort() + "\n" +
                        "请求的URL:\t" + request.getRequestURL() + "\n" +
                        request.getLocale() + "\n" +
                        "---------------------------------------------");
    }
}
