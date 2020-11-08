package cn.kgc.service.impl;

import cn.kgc.dao.impl.CompanyDaoImpl;
import cn.kgc.pojo.Company;
import cn.kgc.service.ServiceCompany;

import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/8 13:39
 */
public class ServiceCompanyImpl  implements ServiceCompany {
    @Override
    public List<Company> getCompany() {
        CompanyDaoImpl company =new CompanyDaoImpl();
        return company.selectCompany();
    }
}
