package cn.kgc.tangcco.day14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.Locale;

/**
 * @author 李庆华
 * @Description
 * @date 2020/9/14 14:17
 */
public class Demo {
//    上机题：
//            1.判断输入的字符串是否是 .java 结束 
//    提示：public boolean endsWith(String suffix) （查帮助,查此方法的说明）
//            2.有一身份证号,判断此为男还是女,基于此方法,写一个算法,判断一个身份证号为男还是女。（身份证分15位和18位）
//            11.输入一个手机号，将中间四位使用星号替代
//13.4.通过键盘录入日期字符串，格式(2015-10-20)
//    如输入：2015-10-20，输出"2015年-10月-20日 是 星期二，是2015年的第 293 天"

    public boolean endsWith(String suffix) {
        if (suffix != null) {
            return suffix.endsWith(".java");
        }
        return false;
    }

    public String judge(String str) {
        if (str.length() == 18) {
            return str.charAt(16) % 2 == 0 ? "女·" : "男";

        } else if (str.length() == 15) {
            return str.charAt(13) % 2 == 0 ? "女·" : "男";
        }
        return "身份证号不是15位或17位";
    }
    public String  test11(String str) {
        if (str.length()==11){

            return str.replace(str.substring(3,7),"****");

        }
        return "错误";
    }


    public String  test13(String date) throws ParseException {

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = dateFormat.parse(date);
        LocalDate localDate = parse.toInstant().atOffset(ZoneOffset.of("+8")).toLocalDate();
        String str="";
        switch (parse.getDay()){
            case 0:{
                str="星期日";
                break;
            }
            case 1:{
                str="星期一";
                break;
            }
            case 2:{
                str="星期二";
                break;
            }
            case 3:{
                str="星期三";
                break;
            }
            case 4:{
                str="星期四";
                break;
            }
            case 5:{
                str="星期五";
                break;
            }
            case 6:{
                str="星期六";
                break;
            }
            default:{
                System.out.println("错误");
            }
        }

        return  (parse.getYear()+1900)+
                "年-"+(parse.getMonth()+1)+
                "月-"+parse.getDate()+
                "日\t是"+str+"，是"+(parse.getYear()+1900)+"年的第天"+localDate.getDayOfYear();

    }


}
