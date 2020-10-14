package cn.kgc.tangcco.utils.localdatetime;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author 李昊哲
 * @Description 日期工具类
 * @create 2020/9/4 上午10:35
 */
public abstract class BaseLocalDateTimeUtil {
    /**
     * 时间格式化模板字符串
     */
    private static final String formatter = "yyyy-MM-dd HH:mm:ss";
    /**
     * 默认时区为东8区
     */
    private static final ZoneOffset zoneOffset = ZoneOffset.of("+8");

    /**
     * 将LocalDateTime格式化为时间指定的时间格式字符串
     *
     * @param dateTime 欲被格式化的时间
     * @return 根据时间格式字符串模板格式化的时间字符串
     */
    public static String format(LocalDateTime dateTime) {
        return DateTimeFormatter.ofPattern(formatter).format(dateTime);
    }

    /**
     * 将LocalDateTime格式化为时间指定的时间格式字符串
     *
     * @param dateTime  欲被格式化的时间
     * @param formatter 时间字符串模板
     * @return 根据时间格式字符串模板格式化的时间字符串
     */
    public static String format(LocalDateTime dateTime, String formatter) {
        return DateTimeFormatter.ofPattern(formatter).format(dateTime);
    }

    /**
     * 根据时间字符串模板将时间格式字符串解析为LocalDateTime
     *
     * @param text 时间字符串
     * @return
     */
    public static LocalDateTime parse(String text) {
        return LocalDateTime.parse(text, DateTimeFormatter.ofPattern(formatter));
    }

    /**
     * 根据时间字符串模板将时间格式字符串解析为LocalDateTime
     *
     * @param text      时间字符串
     * @param formatter 时间字符串模板
     * @return
     */
    public static LocalDateTime parse(String text, String formatter) {
        return LocalDateTime.parse(text, DateTimeFormatter.ofPattern(formatter));
    }
    /**
     * LocalDateTime类型的时间转为Date类型的时间
     *
     * @param dateTime   LocalDateTime
     * @return Date
     */
    public static Date toDate(LocalDateTime dateTime) {
        return Date.from(dateTime.toInstant(zoneOffset));
    }
    /**
     * LocalDateTime类型的时间转为Date类型的时间
     *
     * @param dateTime   LocalDateTime
     * @param zoneOffset 时区
     * @return Date
     */
    public static Date toDate(LocalDateTime dateTime, ZoneOffset zoneOffset) {
        return Date.from(dateTime.toInstant(zoneOffset));
    }


    /**
     * Date类型的时间转为LocalDateTime类型的时间
     *
     * @param date   Date
     * @return Date
     */
    public static LocalDateTime fromDate(Date date) {
        return date.toInstant().atOffset(zoneOffset).toLocalDateTime();
    }

    /**
     * Date类型的时间转为LocalDateTime类型的时间
     *
     * @param date   Date
     * @param zoneOffset 时区
     * @return Date
     */
    public static LocalDateTime fromDate(Date date, ZoneOffset zoneOffset) {
        return date.toInstant().atOffset(zoneOffset).toLocalDateTime();
    }
}
