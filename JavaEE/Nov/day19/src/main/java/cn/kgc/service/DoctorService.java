package cn.kgc.service;

import cn.kgc.pojo.Doctor;

import java.util.List;
import java.util.Map;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/23 19:22
 */
public interface DoctorService {
    List<Doctor> getDoctorList(Map<String, Object> map);

    Integer deleteDoctor(Integer id);

    Integer setDoctor(Doctor doctor);

    Integer addDoctor(Doctor doctor);

    Doctor getDoctorById(Integer id);
}
