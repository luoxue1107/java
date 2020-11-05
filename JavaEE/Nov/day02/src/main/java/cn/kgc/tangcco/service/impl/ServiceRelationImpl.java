package cn.kgc.tangcco.service.impl;

import cn.kgc.tangcco.dao.impl.RelationDaoImpl;
import cn.kgc.tangcco.pojo.Course;
import cn.kgc.tangcco.service.ServiceRelation;
import cn.kgc.tangcco.util.jdbcUtil.JDBCUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/3 11:45
 */
public class ServiceRelationImpl implements ServiceRelation {
    private final RelationDaoImpl relation = new RelationDaoImpl();

    @Override
    public Integer addRelation(Integer sid, Integer[] cids) {
        int[] ints = relation.insertStdCourses(sid, cids);
        Integer integer = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] <= 0) {
                return integer;
            } else {
                integer = 1;
            }
        }
        return integer;
    }

    @Override
    public List<Integer> getCidsBySid(Integer sid) {
        return relation.selectCidsBySid(sid);
    }

    @Override
    public Integer delRelationBySid(Integer sid) {
     return relation.deleteCoursesBySid(sid);
    }

    @Override
    public List<Course> selectCoursesBySid(Integer sid) {
       return relation.selectCoursesBySid(sid);
    }
}
