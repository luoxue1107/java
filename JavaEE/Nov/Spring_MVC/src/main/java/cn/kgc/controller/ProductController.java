package cn.kgc.controller;

import cn.kgc.entity.Product;
import cn.kgc.service.CartService;
import cn.kgc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/28 21:45
 */
@Controller
public class ProductController {
    @Autowired
    private ProductService productService;
    @Autowired
    private CartService cartService;

    @RequestMapping("index.action")
    public String index() {
        return "index";
    }

    @RequestMapping("productLogin.action")
    public String getAllProducts(Model model, Integer id) {
        id = id != null ? id : 0;
        List<Product> doctor = productService.getDoctor(id);
        Double sum = productService.getDoctorTotalPrice();
//        model.addAttribute("id",id);
//        model.addAttribute("doctor", doctor);
//        model.addAttribute("sum",sum);
        Map<String, Object> map = new HashMap<>();
        map.put("id", id);
        map.put("doctor", doctor);
        map.put("sum", sum);
        model.addAllAttributes(map);
        return "cart";
    }

    @RequestMapping("gotoProductNumber.action")
    public String setProductNumber(Model model, Integer id) {
        Product product = productService.getProductById(id);
        model.addAttribute("product", product);

        return "page";

    }

    @RequestMapping("setProductNumber.action")
    public String setProductNumber(String number, Integer id) {
        Integer integer = null;
        Integer[] integers = new Integer[2];
        integers[0] = id;
        try {
            integer = Integer.parseInt(number);
        } catch (Exception e) {
            return "FailedPage";
        }
        integers[1] = integer;
        if (cartService.setCartNumber(integers) > 0) {
            return "SuccessPage";
        } else {
            return "FailedPage";
        }
    }
}
