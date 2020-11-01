package cn.kgc.tangcco.servlet;

import cn.kgc.tangcco.pojo.Clazz;
import cn.kgc.tangcco.service.ServiceClazzImpl;
import cn.kgc.tangcco.util.character.Character;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 李庆华
 * @Description
 * @date 2020/10/30 16:14
 */
public class add_ClazzServlet extends HttpServlet {
    private static final long serialVersionUID = -5074014956215770213L;
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Character.characterEncoding(req,resp,"text/html");
        String name = req.getParameter("name");
        if (name != null) {
            if(new ServiceClazzImpl().addOneClazz(new Clazz(name))>0){
                System.out.println("储存教室信息成功");
                resp.getWriter().println("储存教室信息成功");
                req.getRequestDispatcher("/clazzLogin").forward(req,resp);
            }else {
                System.out.println("储存教室信息失败");
                resp.sendError(404,"服务器端储存教室数据异常");
            }
        }else {
            System.out.println("前端name数据为空");
            resp.sendError(404,"前端name数据为空");
        }

    }
}
