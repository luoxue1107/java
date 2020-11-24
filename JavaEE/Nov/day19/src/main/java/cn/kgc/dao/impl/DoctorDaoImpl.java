package cn.kgc.dao.impl;

import cn.kgc.dao.DoctorDao;
import cn.kgc.pojo.Doctor;
import cn.kgc.util.JDBCUtil;

import java.sql.*;
import java.util.*;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/23 16:53
 */
public class DoctorDaoImpl implements DoctorDao {
    @Override
    public Integer insertDoctor(Doctor doctor) {
        JDBCUtil jdbc= new JDBCUtil();
        String sql="insert into doctor(name,gender,birthday,id_Card,did) values(?,?,?,?,?)";
        Integer integer = jdbc.executeUpdate(sql, doctor.getName(), doctor.getGender(), doctor.getBirthday(), doctor.getId_Card(), doctor.getDid());
        jdbc.close();
        return integer;
    }

    @Override
    public Integer updateDoctor(Doctor doctor) {
        JDBCUtil jdbc= new JDBCUtil();
        String sql="update doctor set name = ?,gender=?,birthday=?,id_Card=?,did=? where uid = ?";
        Integer integer = jdbc.executeUpdate(sql, doctor.getName(), doctor.getGender(), doctor.getBirthday(), doctor.getId_Card(), doctor.getDid(),doctor.getUid());
        jdbc.close();
        return integer;
    }

    @Override
    public Integer deleteDoctor(Integer id) {
      JDBCUtil jdbc =new JDBCUtil();
        Integer integer = jdbc.executeUpdate("delete from doctor where uid=?", id);
        jdbc.close();
        return integer;
    }

    @Override
    public List<Doctor> selectDoctor(Map<String, Object> map) {
        JDBCUtil jdbc = new JDBCUtil();
        String title1 = (String) map.get("title");
        Integer title= Integer.valueOf(title1);
        Integer size =  (Integer) map.get("size");
        Integer initial = (Integer) map.get("initial");
        System.out.println("title"+title+"size"+size+"initial"+initial);
        ResultSet resultSet;
        List<Doctor> doctorList= new ArrayList<>();
        if (title == 0) {
            resultSet = jdbc.executeQuery("select * from doctor limit ?, ?", initial, size);
            try {
                while (resultSet.next()) {
                    doctorList.add(new Doctor(resultSet.getInt("uid"),
                            resultSet.getString("name"),
                            resultSet.getInt("gender"),
                            resultSet.getString("birthday"),
                            resultSet.getInt("did"),
                            resultSet.getString("id_Card")
                    ));
                }
                return doctorList;
            } catch (Throwable e) {
                e.printStackTrace();
            }
        } else {
            resultSet = jdbc.executeQuery("select *  from doctor where did=? limit ?, ?", title,initial, size);
            try {
                while (resultSet.next()) {
                    doctorList.add(new Doctor(resultSet.getInt("uid"),
                            resultSet.getString("name"),
                            resultSet.getInt("gender"),
                            resultSet.getString("birthday"),
                            resultSet.getInt("did"),
                            resultSet.getString("id_Card")
                    ));
                }
                return doctorList;
            } catch (Throwable t) {
                t.printStackTrace();
            }
        }
        jdbc.close();
        return null;
    }

    @Override
    public Doctor selectDoctorById(Integer id) {
        JDBCUtil jdbc=new JDBCUtil();
        ResultSet resultSet = jdbc.executeQuery("select * from doctor where uid=?", id);
        Doctor  doctor=new Doctor();
        try {
            if (resultSet.next()){
              doctor.setUid(resultSet.getInt("uid"));
              doctor.setName(resultSet.getString("name"));
              doctor.setGender(resultSet.getInt("gender"));
              doctor.setBirthday(resultSet.getString("birthday"));
              doctor.setDid(resultSet.getInt("did"));
              doctor.setId_Card(resultSet.getString("id_Card"));

            }
            return doctor;
        }catch (Throwable t) {
            t.printStackTrace();
        }
        jdbc.close();
        return doctor;
    }
}
