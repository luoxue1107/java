package cn.kgc.tangcco.servlet;


import cn.kgc.tangcco.util.character.Character;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class GotoAddCourse extends HttpServlet {

    private static final long serialVersionUID = -5074360082821549043L;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Character.characterEncoding(req,resp ,"text/html");
        req.getRequestDispatcher("add_course.jsp").forward(req, resp);
    }
}
