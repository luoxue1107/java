package cn.kgc.tangcco.servlet;

import cn.kgc.tangcco.util.character.Character;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/6 10:19
 */
@WebServlet(urlPatterns = "/Test03")
public class Test03 extends HttpServlet {

    private static final long serialVersionUID = 5454562693107354060L;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置刷新自动加载的事件间隔为 5 秒
        resp.setIntHeader("Refresh", 1);

        // 设置响应内容类型
        Character.characterEncoding(req, resp, "text/html");
        // 获取当前计算机时间
        Calendar calendar = new GregorianCalendar();
        String am_pm;
        int year = calendar.get(Calendar.YEAR);
        //月从0开始要加一
        int month = calendar.get(Calendar.MONTH) + 1;
        String week = weekToString(calendar.get(Calendar.DAY_OF_WEEK));
        int date = calendar.get(Calendar.DATE);
        int hour = calendar.get(Calendar.HOUR);
        String minute = AddZero(calendar.get(Calendar.MINUTE));
        String second = AddZero(calendar.get(Calendar.SECOND));
        if (calendar.get(Calendar.AM_PM) == 0)
            am_pm = "上午";
        else am_pm = "下午";

        String AD = year + "年" + month + "月" + date + "天" + "星期" + week;

        String CT = hour + ":" + minute + ":" + second + " " + am_pm;

        PrintWriter out = resp.getWriter();
        String title = "使用 Servlet 自动刷新页面";
        String docType = "<!DOCTYPE html> \n";
        out.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor=\"#f0f0f0\">\n" +
                "<h1 align=\"center\">" + title + "</h1>\n" +
                "<h2 align='center'>日期：" + AD  + "</h2>\n"+
                "<h2 align='center'> "+ CT + "</h2>\n"
        );
    }

    public String weekToString(int week) {
        switch (week) {
            case 1 -> {
                return "日";
            }
            case 2 -> {
                return "一";

            }
            case 3 -> {
                return "二";
            }
            case 4 -> {
                return "三";
            }
            case 5 -> {
                return "四";
            }
            case 6 -> {
                return "五";

            }
            case 7 -> {
                return "六";
            }
            default -> {
                return null;
            }
        }
    }
    public  String AddZero(int ins){
        if (ins<10){
            return "0"+ins;
        }else {
            return ""+ins;
        }

    }

}