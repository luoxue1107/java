package cn.kgc.tangcco.servlet;

import cn.kgc.tangcco.pojo.Course;
import cn.kgc.tangcco.service.impl.ServiceCourseImpl;
import cn.kgc.tangcco.service.impl.ServiceRelationImpl;
import cn.kgc.tangcco.util.character.Character;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


public class GotoRelation extends HttpServlet {

    private static final long serialVersionUID = 1622090183421539912L;
    private ServiceCourseImpl serviceCourse= new ServiceCourseImpl();

    private ServiceRelationImpl serviceRelation =new ServiceRelationImpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Character.characterEncoding(req,resp ,"text/html");

        String id = req.getParameter("id");

        List<Course> courses = serviceCourse.getAllCourses();
        List<Integer> cids = serviceRelation.getCidsBySid(Integer.parseInt(id));

        req.setAttribute("id", id);
        req.setAttribute("cids", cids);  //学生所选课程的id
        req.setAttribute("courses", courses);

        req.getRequestDispatcher("std_courses.jsp").forward(req, resp);
    }
}
