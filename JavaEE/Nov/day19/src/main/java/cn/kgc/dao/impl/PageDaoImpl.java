package cn.kgc.dao.impl;

import cn.kgc.dao.PageDao;
import cn.kgc.util.JDBCUtil;

import java.sql.ResultSet;
import java.util.Map;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/23 16:44
 */
public class PageDaoImpl implements PageDao {
    @Override
    public Integer selectCount(Map<String,Object> map) {
        JDBCUtil jdbc = new JDBCUtil();

       String title1 = (String) map.get("title");
        System.out.println(title1);
        Integer title=Integer.valueOf(title1);
        Integer count=0;
        ResultSet resultSet;
        if (title==0){
            resultSet = jdbc.executeQuery("select count(*) as count from doctor");
            try{
                if (resultSet.next()){
                    count = resultSet.getInt("count");
                }
                return count;
            }catch (Throwable e) {
                e.printStackTrace();
            }
        }else {
            resultSet = jdbc.executeQuery("select count(*) as count from doctor where did=?", title);

            try {
                if (resultSet.next()){
                    count = resultSet.getInt("count");
                }
                return count;
            }catch (Throwable t) {
                t.printStackTrace();
            }
        }
        jdbc.close();
        return count;
    }
}
