package cn.kgc.tangcco.servlet;

import cn.kgc.tangcco.service.impl.ServiceRelationImpl;
import cn.kgc.tangcco.util.character.Character;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SetRelation extends HttpServlet {

    private static final long serialVersionUID = 2991308986681370951L;
    private ServiceRelationImpl  serviceRelation= new ServiceRelationImpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Character.characterEncoding(req,resp ,"text/html");

        Integer[] cids = null;

        String id = req.getParameter("id");
        String course[] = req.getParameterValues("course"); //复选框checkbox的接收

        if (course != null && course.length > 0) {
            cids = new Integer[course.length];

            for (int i = 0; i < cids.length; i++) {
                cids[i] = Integer.parseInt(course[i]);
            }
        }

        //删除学生所有的课程
        serviceRelation.delRelationBySid(Integer.parseInt(id));

        if (cids == null) {
            req.setAttribute("message", "清空成功");
        }
        else if (serviceRelation.addRelation(Integer.parseInt(id), cids) > 0) {
            req.setAttribute("message", "选课成功");
        }
        else {
            req.setAttribute("message", "选课失败");
        }

        req.getRequestDispatcher("get_message.jsp").forward(req, resp);
    }
}
