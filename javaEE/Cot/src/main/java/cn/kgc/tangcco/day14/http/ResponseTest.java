package cn.kgc.tangcco.day14.http;

import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.CircleCaptcha;
import cn.hutool.captcha.LineCaptcha;
import cn.hutool.core.lang.Console;
import cn.hutool.extra.qrcode.QrCodeUtil;
import cn.hutool.extra.qrcode.QrConfig;
import cn.kgc.tangcco.utils.servlet.BaseServlet;

import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author 李庆华
 * @Description
 * @date 2020/10/14 15:36
 */
@WebServlet(urlPatterns = "/response.do")
public class ResponseTest extends BaseServlet {
    public void test01(HttpServletRequest request, HttpServletResponse response) throws IOException {

//        规定请求信息的字符集
        response.setCharacterEncoding("UTF-8");
//        规定响应信息的字符集
        request.setCharacterEncoding("UTF-8");
//        规定页面文本字符集
        response.setContentType("text/html;charset=UTF-8");
        //        服务器端响应客户端
        PrintWriter writer = response.getWriter();
        writer.println("OK!!!!!");
        writer.flush();
        writer.close();
    }

    public void test02(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ServletOutputStream outputStream = response.getOutputStream();
        //设置样式
        QrConfig config = new QrConfig(300, 300);
        // 设置边距，既二维码和背景之间的边距
        config.setMargin(3);
        // 设置前景色，
        config.setForeColor(Color.BLACK.getRGB());
        // 设置背景色
        config.setBackColor(Color.WHITE.getRGB());

//        logo路径
        String Path = this.getServletContext().getRealPath("/logo/12.png");
        config.setImg(Path);
        // 生成二维码到文件，也可以到流
        QrCodeUtil.generate("http://hutool.cn/", config, "png", outputStream);

        outputStream.flush();
        outputStream.close();

    }

    public void  test03(HttpServletRequest request,HttpServletResponse response) throws IOException {
//定义图形验证码的长和宽 codeCount字符数量 lineCount 遮挡范围
        LineCaptcha captcha = CaptchaUtil.createLineCaptcha(84, 40,5,50);
//图形验证码写出，可以写出到文件，也可以写出到流
        captcha.write("D:/Items/JavaEE/Cot/src/main/webapp/logo/line.png");
//输出code
        Console.log(captcha.getCode());
//验证图形验证码的有效性，返回boolean值
        captcha.verify("1234");
//重新生成验证码
        captcha.createCode();
//新的验证码
        Console.log(captcha.getCode());
//验证图形验证码的有效性，返回boolean值
        System.out.println(captcha.verify("1234"));
//        写出到浏览器（Servlet输出）
        captcha.write(response.getOutputStream());
//Servlet的OutputStream记得自行关闭哦！

    }
    public  void  test04(HttpServletRequest request , HttpServletResponse response) throws IOException {
        CircleCaptcha circleCaptcha = CaptchaUtil.createCircleCaptcha(84, 40, 5, 50);
        circleCaptcha.write(response.getOutputStream());
    }
}
