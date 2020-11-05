package cn.kgc.tangcco.servlet;


import cn.kgc.tangcco.pojo.Course;
import cn.kgc.tangcco.service.impl.ServiceCourseImpl;
import cn.kgc.tangcco.util.character.Character;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class AddOneCourse extends HttpServlet {
    private static final long serialVersionUID = 761527403674725202L;
    private ServiceCourseImpl serviceCourse = new ServiceCourseImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Character.characterEncoding(req,resp,"text/html");

        String name = req.getParameter("name");

        Course course = new Course();
        course.setName(name);

        if (serviceCourse.addOneCourse(course) > 0) {
            req.setAttribute("message", "新增成功");
        }
        else {
            req.setAttribute("message", "新增失败");
        }

        req.getRequestDispatcher("get_message.jsp").forward(req, resp);
    }
}
