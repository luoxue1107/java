package servlet;

import com.alibaba.fastjson.JSON;
import pojo.Product;
import service.ProductServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/26 10:25
 */
@WebServlet(urlPatterns = "/cartLogin")
public class CartLoginServlet extends HttpServlet {

    private static final long serialVersionUID = 2659056200277490239L;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ProductServiceImpl product=new ProductServiceImpl();
        String id = req.getParameter("id");
        if (id == null){
            id="0";
        }
        List<Product> doctor = product.getDoctor(Integer.parseInt(id));
        String TotalPrice = String.valueOf(product.getDoctorTotalPrice());
        System.out.println(TotalPrice);
        doctor.forEach(doctor1 -> System.out.println(JSON.toJSONString(doctor1)));
        req.setAttribute("id",id);
        req.setAttribute("doctor",doctor);
        req.setAttribute("TotalPrice",TotalPrice);
        req.getRequestDispatcher("cart.jsp").forward(req,resp);
    }
}
