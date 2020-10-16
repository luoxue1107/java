package cn.kgc.tangcco.day16.http;

import cn.kgc.tangcco.utils.servlet.BaseServlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 李庆华
 * @Description
 * @date 2020/10/16 13:28
 */
@WebServlet(urlPatterns = "/PersonAction.do")
public class ActionTest extends BaseServlet {
    private static final long serialVersionUID = 7520584318482617279L;

    public void loginWithFormByGet(HttpServletRequest request, HttpServletResponse response){
        String mobile = request.getParameter("mobile");
        String password = request.getParameter("password");
        System.out.println("mobile="+mobile + "\n" + "password"+password);
    }

    public void loginWithFormByPost(HttpServletRequest request, HttpServletResponse response){
        String mobile = request.getParameter("mobile");
        String password = request.getParameter("password");
        System.out.println("mobile="+mobile + "\n" + "password"+password);
    }

    public void addWithFormByPut(HttpServletRequest request, HttpServletResponse response){
        String mobile = request.getParameter("mobile");
        String password = request.getParameter("password");
        System.out.println("mobile="+mobile + "\n" + "password"+password);
    }
    public void delWithFormByDelete(HttpServletRequest request, HttpServletResponse response){
        String mobile = request.getParameter("mobile");
        System.out.println("mobile="+mobile);
    }
}
