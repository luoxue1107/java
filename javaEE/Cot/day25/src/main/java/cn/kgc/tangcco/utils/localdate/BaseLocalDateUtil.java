package cn.kgc.tangcco.utils.localdate;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author 李昊哲
 * @Description 日期工具类
 * @create 2020/9/4 上午10:35
 */
public abstract class BaseLocalDateUtil {
    /**
     * 时间格式化模板字符串
     */
    private static final String formatter = "yyyy-MM-dd";
    /**
     * 默认时区为东8区
     */
    private static final ZoneOffset zoneOffset = ZoneOffset.of("+8");

    /**
     * 将LocalDateTime格式化为时间指定的时间格式字符串
     *
     * @param localDate 欲被格式化的时间
     * @return 根据时间格式字符串模板格式化的时间字符串
     */
    public static String format(LocalDate localDate) {
        return DateTimeFormatter.ofPattern(formatter).format(localDate);
    }

    /**
     * 将LocalDateTime格式化为时间指定的时间格式字符串
     *
     * @param localDate  欲被格式化的时间
     * @param formatter 时间字符串模板
     * @return 根据时间格式字符串模板格式化的时间字符串
     */
    public static String format(LocalDate localDate, String formatter) {
        return DateTimeFormatter.ofPattern(formatter).format(localDate);
    }

    /**
     * 根据时间字符串模板将时间格式字符串解析为LocalDateTime
     *
     * @param text 时间字符串
     * @param formatter
     * @return
     */
    public static LocalDate parse(String text, DateTimeFormatter formatter) {
        return LocalDate.parse(text, DateTimeFormatter.ofPattern(BaseLocalDateUtil.formatter));
    }

    /**
     * 根据时间字符串模板将时间格式字符串解析为LocalDateTime
     *
     * @param text      时间字符串
     * @param formatter 时间字符串模板
     * @return
     */
    public static LocalDate parse(String text, String formatter) {
        return LocalDate.parse(text, DateTimeFormatter.ofPattern(formatter));
    }

    /**
     * LocalDateTime类型的时间转为Date类型的时间
     *
     * @param localDate   LocalDate
     * @return Date
     */
    public static Date toDate(LocalDate localDate) {
        return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }
    /**
     * LocalDateTime类型的时间转为Date类型的时间
     *
     * @param localDate   LocalDate
     * @param zoneOffset 时区
     * @return Date
     */
    public static Date toDate(LocalDate localDate, ZoneOffset zoneOffset) {
        return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }


    /**
     * Date类型的时间转为LocalDateTime类型的时间
     *
     * @param date   Date
     * @return Date
     */
    public static LocalDate fromDate(Date date) {
        return  date.toInstant().atZone(zoneOffset).toLocalDate();
    }

    /**
     * Date类型的时间转为LocalDateTime类型的时间
     *
     * @param date   Date
     * @param zoneOffset 时区
     * @return Date
     */
    public static LocalDate fromDate(Date date, ZoneOffset zoneOffset) {
        return  date.toInstant().atZone(zoneOffset).toLocalDate();
    }
}
