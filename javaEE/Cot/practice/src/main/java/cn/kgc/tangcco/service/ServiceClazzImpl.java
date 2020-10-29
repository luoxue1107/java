package cn.kgc.tangcco.service;
import cn.kgc.tangcco.dao.impl.ClazzDaoImpl;
import cn.kgc.tangcco.pojo.Clazz;
import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/10/29 13:50
 */
public class ServiceClazzImpl implements ServiceClazz {
    @Override
    public List<Clazz> getClazzList() {
        return new ClazzDaoImpl().selectAllClazzs();
    }
}
