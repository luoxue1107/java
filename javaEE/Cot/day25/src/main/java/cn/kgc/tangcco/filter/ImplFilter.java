package cn.kgc.tangcco.filter;

import cn.kgc.tangcco.utils.CharacterEncoding;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author 李庆华
 * @Description
 * @date 2020/10/25 17:15
 */
@WebFilter(urlPatterns = "*.do")//拦截指定url
public class ImplFilter implements Filter {
    private  int  count = 0;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("初始访问TestFilter");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("拦截.do域名:\t"+ ++count+"次");
//        规定字符编码集 处理中文乱码
        servletResponse.setCharacterEncoding("utf-8");
        servletResponse.setContentType("text/html;charset=utf-8");
        servletResponse.getWriter().println(
                "<!DOCTYPE html>\n"+
                "<html>\n" +
                        "<head><title>" + "TestFilter响应信息" + "</title></head>\n"+
                        "<body backcolor=\"#f0f0f0\">\n" +
                        "<h1 align=\"center\">" + "对不起TestFilter拦截了你的访问" +"</h1>\n"+
                        "<p>\n"+
                        "⠄⠄⠸⣿⣿⢣⢶⣟⣿⣖⣿⣷⣻⣮⡿⣽⣿⣻⣖⣶⣤⣭⡉⠄⠄⠄⠄⠄\n" +
                        "</p>\n" +
                        "<p>\n"+
                        "⠄⠄⠄⢹⠣⣛⣣⣭⣭⣭⣁⡛⠻⢽⣿⣿⣿⣿⢻⣿⣿⣿⣽⡧⡄⠄⠄⠄\n" +
                        "</p>\n" +
                        "<p>\n"+
                        "⠄⠄⠄⠄⣼⣿⣿⣿⣿⣿⣿⣿⣿⣶⣌⡛⢿⣽⢘⣿⣷⣿⡻⠏⣛⣀⠄⠄\n" +
                        "</p>\n" +
                        "<p>\n"+
                        "⠄⠄⠄⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⠙⡅⣿⠚⣡⣴⣿⣿⣿⡆⠄\n" +
                        "</p>\n" +
                        "<p>\n"+
                        "⠄⠄⣰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⠄⣱⣾⣿⣿⣿⣿⣿⣿⠄\n" +
                        "</p>\n" +
                        "<p>\n"+
                        "⠄⢀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢸⣿⣿⣿⣿⣿⣿⣿⣿⠄\n" +
                        "</p>\n" +
                        "<p>\n"+
                        "⠄⣸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠣⣿⣿⣿⣿⣿⣿⣿⣿⣿⠄\n" +
                        "</p>\n" +
                        "<p>\n"+
                        "⠄⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠛⠑⣿⣮⣝⣛⠿⠿⣿⣿⣿⣿⠄\n" +
                        "</p>\n" +
                        "<p>\n"+
                        "⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⠄⠄⠄⠄⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠄\n" +
                        "</p>\n" +
                        "<p>\n"+
                        "⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⠄⠄⠄⠄⢹⣿⣿⣿⣿⣿⣿⣿⣿⠁⠄\n" +
                        "</p>\n" +
                        "<p>\n"+
                        "⣸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠏⠄⠄⠄⠄⠄⠸⣿⣿⣿⣿⣿⡿⢟⣣⣀" +
                        "</p>\n" +
                        "<body>\n"+
                        "<html>\n"
        );
    }

    @Override
    public void destroy() {
        System.out.println("结束销毁TestFilter");
    }
}
