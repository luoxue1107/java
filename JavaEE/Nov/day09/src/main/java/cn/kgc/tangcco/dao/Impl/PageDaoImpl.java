package cn.kgc.tangcco.dao.Impl;

import cn.kgc.tangcco.dao.PageDao;
import cn.kgc.tangcco.util.jdbc.JDBCUtil;

import java.sql.ResultSet;
import java.util.Map;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/11 12:01
 */
public class PageDaoImpl implements PageDao {
    @Override
    public Integer selectTotalPage(Map<String, Object> map) {
        JDBCUtil jdbcUtil = new JDBCUtil();
        String title;
        title = (String) map.get("title");
        String initialTime = (String) map.get("initialTime");
        String lastMinute = (String) map.get("lastMinute");
        System.out.println(title);
        System.out.println(initialTime);
        System.out.println(lastMinute);

        StringBuffer sql = new StringBuffer("select count(*) as count from journalism ");

        if (title != null && ! title.equals("")  || initialTime != null && ! initialTime.equals("")  || lastMinute != null && ! lastMinute.equals("")) {
            sql.append("where 1");
        }
        if (title != null && !title.equals("")) {
            sql.append(" and synopsis like'%" + title + "%'");
        }
        if (initialTime != null && !initialTime.equals("")) {
            sql.append(" and '" + initialTime + "' < creationTime");
            if (lastMinute != null && ! lastMinute.equals("")) {
                sql.append(" and '" + lastMinute + "' > creationTime ");
            }
        } else if (lastMinute != null && !lastMinute.equals("")) {

            sql.append(" and '" + lastMinute + "' > creationTime ");
        }

        System.out.println(sql.toString());
        ResultSet resultSet = jdbcUtil.executeQuery(sql.toString());
        try {
            if (resultSet.next()) {
                System.out.println(resultSet.getInt("count"));
                return resultSet.getInt("count");
            }
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            jdbcUtil.close();
        }
        return 0;
    }
}
