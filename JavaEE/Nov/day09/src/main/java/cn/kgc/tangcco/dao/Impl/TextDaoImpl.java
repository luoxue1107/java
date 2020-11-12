package cn.kgc.tangcco.dao.Impl;

import cn.kgc.tangcco.dao.TextDao;
import cn.kgc.tangcco.pojo.Text;
import cn.kgc.tangcco.util.jdbc.JDBCUtil;

import java.sql.ResultSet;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/12 2:14
 */
public class TextDaoImpl implements TextDao {
    @Override
    public Text selectTextByJid(Integer jid) {
        JDBCUtil jdbcUtil = new JDBCUtil();
        ResultSet resultSet = jdbcUtil.executeQuery("select * from text where 1 and id=?", jid);

        try {
            if (resultSet.next()) {
                return new Text(resultSet.getInt("id"),
                        resultSet.getNString("text"), resultSet.getInt("aid"));
            }
        } catch (Throwable e) {
            jdbcUtil.close();
        }
        return null;
    }
}
