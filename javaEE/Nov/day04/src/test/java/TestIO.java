import com.alibaba.fastjson.JSON;
import org.junit.jupiter.api.Test;

import javax.imageio.stream.FileImageInputStream;
import javax.imageio.stream.FileImageOutputStream;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/5 10:06
 */
public class TestIO {
    @Test
    public void test01() {
        byte[] bytes = image2byte("D:\\Items\\JavaEE\\Nov\\day04\\src\\test\\resources\\banner1.jpg");
        String s = byte2string(bytes);
        System.out.println(s);
        byte2image(bytes,"D:\\Items\\JavaEE\\Nov\\day04\\src\\test\\resources\\nnn.png");


    }
    //图片到byte数组
    public byte[] image2byte(String path){
        byte[] data = null;
        FileImageInputStream input = null;
        try {
            input = new FileImageInputStream(new File(path));
            ByteArrayOutputStream output = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            int numBytesRead = 0;
            while ((numBytesRead = input.read(buf)) != -1) {
                output.write(buf, 0, numBytesRead);
            }
            data = output.toByteArray();
            output.close();
            input.close();
        }
        catch (FileNotFoundException ex1) {
            ex1.printStackTrace();
        }
        catch (IOException ex1) {
            ex1.printStackTrace();
        }
        return data;
    }
    //byte数组到图片
    public void byte2image(byte[] data,String path){
        if(data.length<3||path.equals("")) return;
        try{
            FileImageOutputStream imageOutput = new FileImageOutputStream(new File(path));
            imageOutput.write(data, 0, data.length);
            imageOutput.close();
            System.out.println("Make Picture success,Please find Image in " + path);
        } catch(Exception ex) {
            System.out.println("Exception: " + ex);
            ex.printStackTrace();
        }
    }
    //byte数组到16进制字符串
    public String byte2string(byte[] data){
        if(data==null||data.length<=1) return "0x";
        if(data.length>200000) return "0x";
        StringBuffer sb = new StringBuffer();
        int buf[] = new int[data.length];
        //byte数组转化成十进制
        for(int k=0;k<data.length;k++){
            buf[k] = data[k]<0?(data[k]+256):(data[k]);
        }
        //十进制转化成十六进制
        for(int k=0;k<buf.length;k++){
            if(buf[k]<16) sb.append("0"+Integer.toHexString(buf[k]));
            else sb.append(Integer.toHexString(buf[k]));
        }
        return "0x"+sb.toString().toUpperCase();
    }
}
