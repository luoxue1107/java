package cn.kgc.service.impl;

import cn.kgc.dao.impl.DoctorDaoImpl;
import cn.kgc.pojo.Doctor;
import cn.kgc.service.DoctorService;

import java.util.List;
import java.util.Map;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/23 19:24
 */
public class DoctorServiceImpl implements DoctorService {
   DoctorDaoImpl daoDao= new DoctorDaoImpl();
    @Override
    public List<Doctor> getDoctorList(Map<String, Object> map) {
        PageServiceImpl pageServiceImpl=new PageServiceImpl();
        return pageServiceImpl.getPage(map).getDoctor();
    }

    @Override
    public Integer deleteDoctor(Integer id) {
        return daoDao.deleteDoctor(id);
    }

    @Override
    public Integer setDoctor(Doctor doctor) {
        return daoDao.updateDoctor(doctor);

    }

    @Override
    public Integer addDoctor(Doctor doctor) {
         return daoDao.insertDoctor(doctor);

    }
    @Override
    public Doctor getDoctorById(Integer id) {
        return daoDao.selectDoctorById(id);
    }
}
