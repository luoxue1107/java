package cn.kgc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/28 21:45
 */
@Controller
public class ProductController {
@RequestMapping("index.action")
public String index(){
    return "index";
}
}
