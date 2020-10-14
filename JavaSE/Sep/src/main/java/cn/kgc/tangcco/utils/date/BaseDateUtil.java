package cn.kgc.tangcco.utils.date;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * @author 李庆华
 * @Description
 * @date 2020/9/3 20:53
 */
public abstract class BaseDateUtil {
    /**
     * 默认时区
     */
    private final static String  timeZone = "Asia/Shanghai";
    /**
     * 默认时间字符串模板
     */
    private final static String pattern = "yyyy-MM-dd HH:mm:ss";

    /**
     * 将日期对象格式化为字符串
     * @param date Date对象
     * @return
     */
    public static String format(Date date){
        return format(date,timeZone,pattern);
    }
    public static String format(Date date,String pattern){
        return  format(date,timeZone,pattern);
    }
    /**
     * 将日期对象格式化为字符串
     * @param date Date对象
     * @param timeZone 时区
     * @param pattern 日期格式化字符串模板
     * @return Date对象格式后的日期字符串
     */
    public static String format(Date date,String timeZone,String pattern){
        SimpleDateFormat dateFormat =new SimpleDateFormat(pattern);
        dateFormat.setTimeZone(TimeZone.getTimeZone(timeZone));
        return dateFormat.format(date);
    }
    /**
     * 将日期字符串解析为日期
     *
     * @param s
     * @param text 日期字符
     * @return 日期字符串解析后日期对象
     * @throws ParseException
     */
    public static Date parse(String s, String text) throws ParseException {
        return parse(text,timeZone,pattern);
    }

    /**
     * 将日期字符串解析为日期
     * @param text 日期字符串
     * @param timeZone 时区
     * @param pattern 日期格式化字符串模板
     * @return 日期字符串解析后日期对象
     * @throws ParseException
     */
    public static Date parse(String text,String timeZone,String pattern) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        dateFormat.setTimeZone(TimeZone.getTimeZone(timeZone));
            return  dateFormat.parse(text);
    }

    /**
     * 时间补零站位
     * @param time 时间
     * @return 补零后的字符串
     */
    public static  String zeroCompensation(int time){
        if (time<0){
            return "0"+time;
        }
        return String.valueOf(time);
    }
}
