package cn.kgc.tangcco.filter;


import javax.servlet.*;
import java.io.IOException;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/6 9:53
 */
public class Visits implements Filter {
    private Integer count;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        count = 0;
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
         count++;
        System.out.println("访问次数"+count);
        //请求返回给过滤链
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
