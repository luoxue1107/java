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
 * @date 2020/11/26 11:43
 */
@WebServlet(urlPatterns = "/delCart")
public class delCartServlet extends HttpServlet {

    private static final long serialVersionUID = -8428728018778043046L;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ProductServiceImpl productServiceImpl =new ProductServiceImpl();
        String[] items = req.getParameterValues("item");
        Integer[] integers =new Integer[items.length];
        for (int i = 0; i < items.length; i++) {
            integers[i]=Integer.parseInt(items[i]);
        }
        Integer integer = productServiceImpl.deleteProductAll(integers);
        if (integer>0){
            System.out.println("ok");
        }else {
            System.out.println("失败");
        }
        req.getRequestDispatcher("/cartLogin").forward(req,resp);
    }
}
