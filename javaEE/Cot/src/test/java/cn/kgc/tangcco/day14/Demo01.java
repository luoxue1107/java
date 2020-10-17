package cn.kgc.tangcco.day14;

import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.LineCaptcha;
import cn.hutool.core.io.FileUtil;
import cn.hutool.core.lang.Console;
import cn.hutool.extra.qrcode.QrCodeUtil;
import cn.hutool.extra.qrcode.QrConfig;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import org.junit.jupiter.api.Test;

/**
 * @author 李庆华
 * @Description
 * @date 2020/10/14 18:58
 */
public class Demo01 {
   public   static  String sd="D:/Items/JavaEE/Cot/src/test/resources";
    @Test
    public void testDemo() {
        String content="https://xmma7uz.com/3.0/index.html?channel=kuaimao";
        //创建二维码
        QrCodeUtil.generate(content, 300, 300, FileUtil.file(sd+ "/qrcode.png"));
//        //设置样式
//        QrConfig config = new QrConfig(300, 300);
//        // 设置边距，既二维码和背景之间的边距
//        config.setMargin(3);
//        // 设置前景色，既二维码颜色（青色）
//        config.setForeColor(Color.CYAN.getRGB());
//        // 设置背景色（灰色）
//        config.setBackColor(Color.GRAY.getRGB());
//        // 生成二维码到文件，也可以到流
//        QrCodeUtil.generate("http://hutool.cn/", config, FileUtil.file(sd+"/qrcode.png"));
//        //附带logo
//        QrCodeUtil.generate(//
//                "http://hutool.cn/", //二维码内容
//                QrConfig.create().setImg("D:/Items/HTML/img/xx/7.png"), //附带logo
//                FileUtil.file(sd+"/qrcode.png")//写出到的文件
//        );
//二维码无法识别，这时就要调整纠错级别。
// 纠错级别使用zxing的ErrorCorrectionLevel枚举封装，包括：L、M、Q、H几个参数，由低到高。低级别的像素块更大，可以远距离识别，但是遮挡就会造成无法识别。
// 高级别则相反，像素块小，允许遮挡一定范围，但是像素块更密集。
       QrConfig config = new QrConfig();
        // 高纠错级别
        config.setErrorCorrection(ErrorCorrectionLevel.H);
        QrCodeUtil.generate(content, config, FileUtil.file(sd+ "/qrcode.png"));
        System.out.println("OK");
    }
    @Test
    public void testDemo01(){
        try {
            String decode = QrCodeUtil.decode(FileUtil.file("D:\\Items\\JavaEE\\Cot\\src\\test\\resources\\qrcode.png"));
        System.out.println(decode);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Test
    public void  test03(){
//定义图形验证码的长和宽
        LineCaptcha lineCaptcha = CaptchaUtil.createLineCaptcha(200, 100);

//图形验证码写出，可以写出到文件，也可以写出到流
        lineCaptcha.write("D:/Items/JavaEE/Cot/src/main/webapp/logo/line.png");
//输出code
        Console.log(lineCaptcha.getCode());
//验证图形验证码的有效性，返回boolean值
        lineCaptcha.verify("1234");

//重新生成验证码
        lineCaptcha.createCode();
        lineCaptcha.write("D:/Items/JavaEE/Cot/src/main/webapp/logo/line.png");
//新的验证码
        Console.log(lineCaptcha.getCode());
//验证图形验证码的有效性，返回boolean值
        lineCaptcha.verify("1234");

    }
}
