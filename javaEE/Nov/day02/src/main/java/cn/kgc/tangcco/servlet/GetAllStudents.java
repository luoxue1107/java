package cn.kgc.tangcco.servlet;

import cn.kgc.tangcco.pojo.Student;
import cn.kgc.tangcco.service.impl.ServiceStudentImpl;
import cn.kgc.tangcco.util.character.Character;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


public class GetAllStudents extends HttpServlet {

    private static final long serialVersionUID = 3258439584322193857L;
    private ServiceStudentImpl serviceStudent= new ServiceStudentImpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Character.characterEncoding(req,resp ,"text/html");

        List<Student> students = serviceStudent.getAllStudent();

        req.setAttribute("students", students);

        req.getRequestDispatcher("all_students.jsp").forward(req, resp);
    }
}
