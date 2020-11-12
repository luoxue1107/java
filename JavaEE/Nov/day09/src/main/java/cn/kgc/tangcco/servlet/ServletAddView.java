package cn.kgc.tangcco.servlet;

import cn.kgc.tangcco.service.Impl.ServiceAddViewImpl;
import cn.kgc.tangcco.service.ServiceAddView;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/12 12:51
 */
@WebServlet(urlPatterns = "/addView")
public class ServletAddView extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServiceAddViewImpl addView= new ServiceAddViewImpl();
        String jid = req.getParameter("jid");
        String view = req.getParameter("view");
        Integer integer = addView.addView(Integer.parseInt(jid), Integer.parseInt(view));
if (integer>0){
    System.out.println("view");
}
    }
}
