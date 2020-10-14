package cn.kgc.tangcco.Test.dao;

/**
 * @author 李庆华
 * @Description 接口
 * @date 2020/8/21 9:59
 */
public interface UserDao extends Dao01,Dao02 {
    /**
     * 数据库新增一条User记录
     */
    public abstract void  insertUser();
}
