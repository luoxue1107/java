package cn.kgc.tangcco.servlet;

import cn.kgc.tangcco.service.ServiceClazzImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 李庆华
 * @Description
 * @date 2020/10/30 19:51
 */
public class del_ClazzServlet extends HttpServlet {
    private static final long serialVersionUID = 2208505725088824825L;
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String Path = req.getContextPath();
        System.out.println(id);
        if (id != null) {
            if ( new ServiceClazzImpl().delClazzById(Integer.valueOf(id)) >0) {
                resp.sendRedirect(Path+"/clazzLogin");
                System.out.println("删除成功");
            }else {
                resp.getWriter().println("后端数据删除失败");
                System.out.println("删除失败");
            }
        }else {
            resp.getWriter().println("前端空cid");
            System.out.println("前端空cid");
        }
    }
}
