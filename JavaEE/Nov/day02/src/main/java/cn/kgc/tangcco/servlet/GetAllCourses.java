package cn.kgc.tangcco.servlet;

import cn.kgc.tangcco.pojo.Course;
import cn.kgc.tangcco.service.impl.ServiceCourseImpl;
import cn.kgc.tangcco.util.character.Character;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Tiler on 2020/11/2
 */
public class GetAllCourses extends HttpServlet {
    private static final long serialVersionUID = 722561188840174405L;
    private ServiceCourseImpl serviceCourse= new ServiceCourseImpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Character.characterEncoding(req,resp,"text/html");
        List<Course> courses = serviceCourse.getAllCourses();

        req.setAttribute("courses", courses);

        req.getRequestDispatcher("all_courses.jsp").forward(req, resp);
    }
}
