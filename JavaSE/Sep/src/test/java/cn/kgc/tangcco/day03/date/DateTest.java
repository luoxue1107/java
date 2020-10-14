package cn.kgc.tangcco.day03.date;

import cn.kgc.tangcco.utils.date.BaseDateUtil;
import org.junit.Test;
import org.w3c.dom.html.HTMLImageElement;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * @author 李庆华
 * @Description
 * @date 2020/9/3 21:35
 */
public class DateTest {
    @Test
    public void test01() {
    /*
    标准时间UTC GMT
    1900-01-01 00:00:00
    1970-01-01 00:00:00
     */
        Date date = new Date();
        //January 1,1970, 00:00:00 GMT
        //1970-01-01 00:00:00

        long time = date.getTime();
        // January 1,1900, 00:00:00 UTC
        // 1900-01-01 00:00:00
        long millis = System.currentTimeMillis();
        System.out.println(time);
        System.out.println(millis);
    }

    @Test

    public void test02() {
//日期字符串
        StringBuilder dateText = new StringBuilder();
        //获取日期对象
        Date date = new Date();
        //年 月 日 时 分 秒 星期
        int year = date.getYear() + 1900;
        dateText.append(year + "年");
        int month = date.getMonth() + 1;
        dateText.append(BaseDateUtil.zeroCompensation(month) + "月");
        int dayOfMonth = date.getDate();
        dateText.append(BaseDateUtil.zeroCompensation(dayOfMonth) + "日");


        int hours = date.getHours();
        dateText.append(BaseDateUtil.zeroCompensation(hours) + "时");
        int minutes = date.getMinutes();
        dateText.append(BaseDateUtil.zeroCompensation(minutes) + "分");
        int seconds = date.getSeconds();
        dateText.append(BaseDateUtil.zeroCompensation(seconds) + "秒");

        int dayOfWeek = date.getDay();
        String weekDay = "星期";
        switch (dayOfWeek) {
            case 1: {
                weekDay += "一";
                break;
            }
            case 2: {
                weekDay += "二";
                break;
            }
            case 3: {
                weekDay += "三";
                break;
            }
            case 4: {
                weekDay += "四";
                break;
            }
            case 5: {
                weekDay += "五";
                break;
            }
            case 6: {
                weekDay += "六";
                break;
            }
            default: {
                weekDay += "日";
            }
        }
        dateText.append(weekDay);
        System.out.println(dateText);
    }

    @Test
    public void test03() {
        Date date = new Date();
        System.out.println(date);

        //实例化一个时间字符串格式对象 并传入时间字符串模板
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //将日期对象根据之前的时间字符串模板格式化为时间字符串
        String format = dateFormat.format(date);
        System.out.println(format);

        String source = "1983-11-22 20:30:00";
        try {
            Date date1 = dateFormat.parse(source);
            System.out.println(date1);

            dateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Tokyo"));
            Date date2 = dateFormat.parse(source);
            System.out.println(date2);
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }

    @Test
    public void test04() {
        //实例化一个时间字符串格式对象 并传入时间字符串模板
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String text01 = "1983-11-22 20:30:00";
        String text02 = "1988-08-11 20:30:00";
        try {
            Date date01 = dateFormat.parse((text01));
            Date date02 = dateFormat.parse((text02));
            System.out.println(date01.before(date02));
            System.out.println(date02.after(date01));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test05() {
        Date date = new Date();
        System.out.println(date);
        String gmString = date.toGMTString();
        System.out.println(gmString);
    }

    @Test
    public void test06() {
        // 输出当前系统默认时区

        // 1000
        // 1000 * 60
        // 1000 * 60 * 60
        // 1000 * 60 * 60 * 8
        // sun.util.calendar.ZoneInfo[id="Asia/Shanghai",offset=28800000,dstSavings=0,useDaylight=false,transitions=31,lastRule=null]
        System.out.println(TimeZone.getDefault());
        //定义时间字符串格式化模板
        SimpleDateFormat tokyoSdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //格式化的时候设置时区
        tokyoSdf.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
        //将当前时间对象定义好的时间字符串模板格式化
        String tokyoDateText = tokyoSdf.format(tokyoSdf);
        System.out.println(tokyoDateText);

        SimpleDateFormat NewYorkSdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        NewYorkSdf.setTimeZone(TimeZone.getTimeZone("American/New York"));
        Date NewYorkDate = new Date();
        String newYorDateText = NewYorkSdf.format(NewYorkDate);
        System.out.println(newYorDateText);
    }

    @Test
    public void test07() {
        long time = 1599101572757L;
        time -= 1000 * 60 * 60 * 24;
        Date date = new Date(time);
        System.out.println(date);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dateFormat.setTimeZone(TimeZone.getTimeZone("Asia/shanghai"));
        String format = dateFormat.format(date);
        System.out.println(format);
        Date date1 = new Date();
    }


}

