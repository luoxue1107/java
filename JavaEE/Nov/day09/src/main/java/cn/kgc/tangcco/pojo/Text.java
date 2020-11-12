package cn.kgc.tangcco.pojo;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/12 1:59
 */
public class Text {
    private Integer id;
    private String text;
    private Integer aid;

    public Text(Integer id, String text, Integer aid) {
        this.id = id;
        this.text = text;
        this.aid = aid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }
}
