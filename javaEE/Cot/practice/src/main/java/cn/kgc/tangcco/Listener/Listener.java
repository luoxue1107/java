package cn.kgc.tangcco.Listener;

import cn.hutool.core.date.DateUtil;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServletRequest;

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
        System.out.println(now);
        if (StringUtils.isBlank(queryString)) {
            System.out.println(now+":\t"+remoteAddr + "\t" + requestURL);
        } else {
            System.out.println(now+":\t"+remoteAddr + "\t" + requestURL + "?" + queryString);
        }
    }
}
