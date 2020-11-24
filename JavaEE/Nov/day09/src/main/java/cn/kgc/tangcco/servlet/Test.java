package cn.kgc.tangcco.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import java.util.GregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * @author 李庆华
 * @Description
 * @date 2020/11/17 13:52
 */
@WebServlet("/index")
public class Test extends HttpServlet {
    private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        response.setIntHeader("Refresh", 5);

        response.setContentType("text/html;charset=UTF-8");

        Calendar calendar = new GregorianCalendar();
        String am_pm;
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        if(calendar.get(Calendar.AM_PM) == 0)
            am_pm = "AM";
        else
            am_pm = "PM";
        String CT = hour+":"+ minute +":"+ second +" "+ am_pm;
        request.setAttribute("CT",CT);
        request.getRequestDispatcher("Test.jsp").forward(request,response);

    }
}