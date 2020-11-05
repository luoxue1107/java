package cn.kgc.tangcco.pojo;

import java.util.Date;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/5 9:39
 */
public class Image {
    /**
     * 图片编号
     */
    private Integer id;
    /**
     * 图片名称
     */
    private String name;
    /**
     * 图片存入时间
     */
    private Date date;
    /**
     * 图片路径
     */
    private String URL;

    public Image(Integer id, String name, Date date, String URL) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.URL = URL;
    }

    public Image() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getURL() {
        return URL;
    }

    public void setSb(String URL) {
        this.URL = URL;
    }
}
