package cn.kgc.tangcco.servlet;

import cn.kgc.tangcco.pojo.Course;
import cn.kgc.tangcco.service.ServiceCourse;
import cn.kgc.tangcco.service.impl.ServiceCourseImpl;
import cn.kgc.tangcco.util.character.Character;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class SetOneCourse extends HttpServlet {

    private static final long serialVersionUID = 1924047917417499430L;
    private ServiceCourse serviceCourse= new ServiceCourseImpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Character.characterEncoding(req,resp ,"text/html");

        String id = req.getParameter("id");
        String name = req.getParameter("name");

        Course course = new Course();
        course.setId(Integer.parseInt(id));
        course.setName(name);

        if (serviceCourse.setOneCourse(course) > 0) {
            req.setAttribute("message", "修改成功");
        }
        else {
            req.setAttribute("message", "修改失败");
        }

        req.getRequestDispatcher("get_message.jsp").forward(req, resp);
    }
}
