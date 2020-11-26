package servlet;

import service.ProductServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/26 12:08
 */
@WebServlet(urlPatterns = "/setNumber")
public class SetNumberServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String number = req.getParameter("number");
        String id = req.getParameter("id");
        System.out.println("number"+number);
        System.out.println("id"+id);
        Integer[] integers= new Integer[2];
        integers[0]=Integer.parseInt(id);
        integers[1]=Integer.parseInt(number);

        ProductServiceImpl productService= new ProductServiceImpl();

        Integer integer = productService.setCartNumber(integers);
        if (integer > 0) {
            System.out.println("OK");
        }else {
            System.out.println("失败");
        }
        resp.sendRedirect(req.getContextPath()+"/cartLogin");


    }
}
