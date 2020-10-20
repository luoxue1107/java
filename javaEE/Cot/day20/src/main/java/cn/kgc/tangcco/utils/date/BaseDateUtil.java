package cn.kgc.tangcco.utils.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.TimeZone;

/**
 * @author 李昊哲
 * @Description 日期工具类
 * @create 2020/9/3 上午9:46
 */
public abstract class BaseDateUtil {
    /**
     * 默认时区
     */
    private final static String timeZone = "Asia/Shanghai";

    /**
     * 默认时区为东8区
     */
    private static final ZoneOffset zoneOffset = ZoneOffset.of("+8");

    /**
     * 默认时间字符串模板
     */
    private final static String pattern = "yyyy-MM-dd HH:mm:ss";

    /**
     * 将日期对象格式化为字符串
     *
     * @param date Date对象
     * @return Date对象格式化后的日期字符串
     */
    public static String format(Date date) {
        return format(date, timeZone, pattern);
    }


    /**
     * 将日期对象格式化为字符串
     *
     * @param date    Date对象
     * @param pattern 日期格式化字符串模板
     * @return Date对象格式化后的日期字符串
     */
    public static String format(Date date, String pattern) {
        return format(date, timeZone, pattern);
    }

    /**
     * 日期对象格式化为字符串
     *
     * @param date     Date对象
     * @param timeZone 时区
     * @param pattern  日期格式化字符串模板
     * @return Date对象格式化后的日期字符串
     */
    public static String format(Date date, String timeZone, String pattern) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        dateFormat.setTimeZone(TimeZone.getTimeZone(timeZone));
        return dateFormat.format(date);
    }

    /**
     * 将日期字符串解析为日期对象
     *
     * @param text 日期字符串
     * @return 日期字符串解析后日期对象
     * @throws ParseException
     */
    public static Date parse(String text) throws ParseException {
        return parse(text, timeZone, pattern);
    }

    /**
     * 将日期字符串解析为日期对象
     *
     * @param text    日期字符串
     * @param pattern 日期格式化字符串模板
     * @return 日期字符串解析后日期对象
     * @throws ParseException
     */
    public static Date parse(String text, String pattern) throws ParseException {
        return parse(text, timeZone, pattern);
    }

    /**
     * 将日期字符串解析为日期对象
     *
     * @param text     日期字符串
     * @param timeZone 时区
     * @param pattern  日期格式化字符串模板
     * @return 日期字符串解析后日期对象
     * @throws ParseException
     */
    public static Date parse(String text, String timeZone, String pattern) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        dateFormat.setTimeZone(TimeZone.getTimeZone(timeZone));
        return dateFormat.parse(text);
    }

    /**
     * LocalDateTime类型的时间转为Date类型的时间
     *
     * @param dateTime LocalDateTime
     * @return Date
     */
    public static Date fromDate(LocalDateTime dateTime) {
        return Date.from(dateTime.toInstant(zoneOffset));
    }

    /**
     * LocalDateTime类型的时间转为Date类型的时间
     *
     * @param dateTime   LocalDateTime
     * @param zoneOffset 时区
     * @return Date
     */
    public static Date fromDate(LocalDateTime dateTime, ZoneOffset zoneOffset) {
        return Date.from(dateTime.toInstant(zoneOffset));
    }

    /**
     * LocalDateTime类型的时间转为Date类型的时间
     *
     * @param localDate LocalDate
     * @return Date
     */
    public static Date fromDate(LocalDate localDate) {
        return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

    /**
     * LocalDateTime类型的时间转为Date类型的时间
     *
     * @param localDate  LocalDate
     * @param zoneOffset 时区
     * @return Date
     */
    public static Date fromDate(LocalDate localDate, ZoneOffset zoneOffset) {
        return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

    /**
     * 时间补零占位
     *
     * @param time 时间
     * @return 补零后的字符串
     */
    public static String zeroCompensation(int time) {
        if (time < 10) {
            return "0" + time;
        }
        return String.valueOf(time);
    }
}
