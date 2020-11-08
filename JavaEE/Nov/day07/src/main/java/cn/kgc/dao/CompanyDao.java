package cn.kgc.dao;

import cn.kgc.pojo.Company;

import java.util.List;

/**
 * @author 李庆华
 * @Description 连接数据库公司信息接口
 * @date 2020/11/7 13:43
 */
public interface CompanyDao {
    /**
     * 添加数据
     * @param company 公司信息
     * @return 0或负数为失败 正数为成功
     */
    Integer insertCompany(Company company);

    /**
     * 获取所有信息
     * @return
     */
    List<Company> selectCompany();

    /**
     * 以id 删除
     * @param id 编号
     * @return 0或负数为失败 正数为成功
     */
    Integer deleteCompany(Integer id);

    /**
     * 修改指定信息
     * @param company 新数据
     * @return 0或负数为失败 正数为成功
     */
    Integer updateCompany(Company company);


}
