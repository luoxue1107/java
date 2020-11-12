package cn.kgc.tangcco.dao.Impl;

import cn.kgc.tangcco.dao.JournalismDao;
import cn.kgc.tangcco.pojo.Journalism;
import cn.kgc.tangcco.util.jdbc.JDBCUtil;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/11 12:01
 */
public class JournalismDaoImpl implements JournalismDao {
    @Override
    public List<Journalism> selectAllJournalism(Map<String, Object> map) {
        JDBCUtil jdbcUtil = new JDBCUtil();
        List<Journalism> list = new ArrayList<>();
        String title = (String) map.get("title");
        String initialTime = (String) map.get("initialTime");
        String lastMinute = (String) map.get("lastMinute");
        System.out.println(title);
        System.out.println(initialTime);
        System.out.println(lastMinute);
        Integer size = (Integer) map.get("size");
        Integer initial = (Integer) map.get("initial");


        StringBuffer sql = new StringBuffer("select * from journalism ");
        if (title != null && !title.equals("") || initialTime != null && !initialTime.equals("") || lastMinute != null && !lastMinute.equals("")) {
            sql.append("where 1 ");
        }
        if (title != null && !title.equals("")) {
            sql.append("and synopsis like'%" + title + "%'");
        }
        if (initialTime != null && !initialTime.equals("")) {
            sql.append(" and '" + initialTime + "' < creationTime ");
            if (lastMinute != null && !lastMinute.equals("")) {

                sql.append(" and '" + lastMinute + "' > creationTime ");
            }
        } else if (lastMinute != null && !lastMinute.equals("")) {
            sql.append(" and '" + lastMinute + "' > creationTime ");
        }
        sql.append("order by `creationTime` desc limit ?, ? ");
        System.out.println(sql.toString());
        ResultSet resultSet = jdbcUtil.executeQuery(sql.toString(), initial, size);
        try {
            while (resultSet.next()) {
                list.add(new Journalism(resultSet.getInt("id"),
                        resultSet.getString("synopsis"),
                        resultSet.getDate("creationTime"),
                        resultSet.getInt("aid"),
                        resultSet.getInt("view"),
                        resultSet.getInt("tid")
                ));
            }
            return list;
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            jdbcUtil.close();
        }
        return null;
    }

    @Override
    public Integer insertJournalism(Journalism journalism) {
        return null;
    }

    @Override
    public Integer deleteJournalism(Integer id) {
        return null;
    }

    @Override
    public Integer updateJournalismView(Integer view, Integer id) {
        System.out.println("view"+view);
        System.out.println("id"+id);
        JDBCUtil jdbcUtil = new JDBCUtil();
        Integer integer = jdbcUtil.executeUpdate("update journalism set view = ? where 1 and id = ?", view, id);
        jdbcUtil.close();
        return integer;
    }

    @Override
    public Journalism selectJournalismById(Integer id) {
        JDBCUtil jdbcUtil = new JDBCUtil();

        ResultSet resultSet = jdbcUtil.executeQuery("select * from journalism where 1 and id=?", id);

        try {
            if (resultSet.next()) {
                return new Journalism(resultSet.getInt("id"),
                        resultSet.getString("synopsis"),
                        resultSet.getDate("creationTime"),
                        resultSet.getInt("aid"),
                        resultSet.getInt("view"),
                        resultSet.getInt("tid"));
            }
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            jdbcUtil.close();
        }
        return null;
    }
}
