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

    @Override
    public Integer addOneClazz(Clazz clazz) {
        return new ClazzDaoImpl().insertOneClazz(clazz);
    }
    @Override
    public Clazz getClazzById(Integer id) {
        return null;
    }

    @Override
    public Integer setOneClazz(Clazz clazz) {
        return null;
    }

    @Override
    public Integer delClazzById(Integer id) {
        return  new ClazzDaoImpl().deleteClazzById(id);
    }
}
