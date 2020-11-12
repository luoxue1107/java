package cn.kgc.tangcco.listener;

import cn.hutool.core.date.DateUtil;
import cn.hutool.http.useragent.UserAgent;
import cn.hutool.http.useragent.UserAgentUtil;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

/**
 * @author 李庆华
 * @Description
 * @date 2020/10/27 19:39
 */
public class Listener implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {

    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        HttpServletRequest request = (HttpServletRequest) sre.getServletRequest();
        String remoteAddr = request.getRemoteAddr();
        StringBuffer requestURL = request.getRequestURL();
        String queryString = request.getQueryString();
        String now = DateUtil.now();
        System.out.println("时间:\t"+now);
        if (StringUtils.isBlank(queryString)) {
            System.out.println(remoteAddr );
        } else {
            System.out.println(remoteAddr + "\t?" + queryString);
        }
        System.out.println(
//                请求方式
                "请求类型:\t" + request.getMethod() + "\n" +
                        "请求url:\t" + request.getRequestURL() + "\n" +
                        "请求uri:\t" + request.getRequestURI() + "\n" +
                        "获取使用协议:\t" + request.getProtocol() + "\n" +
                        "获取协议名称:\t" + request.getScheme() + "\n" +
                        "请求的上下文路径：\t" + request.getContextPath() + "\n" +
                        "请求的查询字符串：" + request.getQueryString());
        System.out.println("==========================");
        System.out.println("Header值:");
        //获取Header 里的指定值
        System.out.println(request.getHeader("User-Agent"));
        String header = request.getHeader("User-Agent");
        UserAgent parse = UserAgentUtil.parse(header);
        System.out.println(parse.toString());
        System.out.println("浏览器" + parse.getBrowser().toString());
        System.out.println("浏览器引擎" + parse.getEngine().toString());
        System.out.println("引擎版本" + parse.getEngineVersion());
        System.out.println("操作系统" + parse.getOs().toString());
        System.out.println("操作平台" + parse.getPlatform().toString());
        System.out.println("类" + parse.getClass());
        //判断方式的客户端是否是移动端
        if (parse.isMobile()) {
            System.out.println("移动端");
        } else {
            System.out.println("pc端");
        }
        System.out.println("==========================");
//        获取header里的所有值的名字
        System.out.println("Header名称:");
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String s = headerNames.nextElement();
            System.out.println(s);

        }
        //获取header 所有值
        Enumeration<String> headers = request.getHeaders("User-Agent");
        while (headers.hasMoreElements()) {
            System.out.println(headers.nextElement());
        } System.out.println("==========================");
    }
}
