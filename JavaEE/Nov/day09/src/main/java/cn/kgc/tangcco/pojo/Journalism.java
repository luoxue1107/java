package cn.kgc.tangcco.pojo;

import java.util.Date;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/11 11:41
 */
public class Journalism {
    //    id` int(11) auto_increment comment'新闻编号',
    private Integer id;
    //            `synopsis` TINYBLOB not null comment'新闻简介',
    private  String synopsis;
    //            `creationTime` date not null comment'创建时间',
    private Date creationTime;
    //            `aid` int(11) not null comment'作者编号',
    private Integer aid;
    //            `vid` int(11) not null comment'浏览量',
    private  Integer view;

    private  Integer tid;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getView() {
        return view;
    }

    public void setView(Integer view) {
        this.view = view;
    }

    public Journalism(Integer id, String synopsis, Date creationTime,
                      Integer aid, Integer view ,Integer tid) {
        this.id = id;
        this.synopsis = synopsis;
        this.creationTime = creationTime;
        this.aid = aid;
        this.view = view;
        this.tid = tid;
    }
}
