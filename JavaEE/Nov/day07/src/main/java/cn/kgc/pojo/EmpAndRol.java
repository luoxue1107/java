package cn.kgc.pojo;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/9 15:26
 */
public class EmpAndRol {
    private  Integer eid;
    private  Integer rid;

    public EmpAndRol(Integer eid, Integer rid) {
        this.eid = eid;
        this.rid = rid;
    }

    public EmpAndRol() {
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }
}
