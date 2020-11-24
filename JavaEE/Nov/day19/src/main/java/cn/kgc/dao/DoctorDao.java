package cn.kgc.dao;


import cn.kgc.pojo.Doctor;

import java.util.List;
import java.util.Map;

/**
 * 李庆华
 * @Description
 * @date 2020/11/18 15:17
 */
public interface DoctorDao {
    Integer insertDoctor(Doctor doctor);
    Integer updateDoctor(Doctor doctor);
    Integer deleteDoctor(Integer id);
    List<Doctor> selectDoctor(Map<String, Object> map);
    Doctor selectDoctorById(Integer id);
}
