package servlet;

import pojo.Product;
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
 * @date 2020/11/26 12:10
 */
@WebServlet(urlPatterns = "/setNumberLogin")

public class SetNumberLoginServlet extends HttpServlet {

    private static final long serialVersionUID = 4449762274946780370L;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        System.out.println(id);
        ProductServiceImpl productService=new ProductServiceImpl();
        Product product = productService.getProductById(Integer.parseInt(id));
        System.out.println(product.getCid()+""+product.getId());
        if (product != null){
        req.setAttribute("product",product);
        }
        req.getRequestDispatcher("page.jsp").forward(req, resp);
    }
}
