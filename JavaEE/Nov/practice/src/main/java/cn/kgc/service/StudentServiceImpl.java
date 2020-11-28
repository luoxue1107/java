package cn.kgc.service;

import cn.kgc.dao.StudentDaoImpl;
import cn.kgc.pojo.Clazz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/26 18:43
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDaoImpl studentDaoImpl;

    @Override
    public List<Clazz> getClazzList()
    {
       return studentDaoImpl.getClazzList();
}
}
