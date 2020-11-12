package cn.kgc.util.jdbc;

import  java.sql.*;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/7 14:19
 */
public class JdbcUtil {
    //驱动器
    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    //URL
    public static final String URL = "jdbc:mysql://192.168.53.39/2020_11_07";
    //用户
    public static final String USER = "root";
    //密码
    public static final String PASSWORD = "123456";
    //连接
    private Connection connection;
    //声明
    private PreparedStatement statement;
    //结果集
    private ResultSet resultSet;

    /**
     * 初始连接数据库
     *
     * @return 返回连接后的连接对象
     */
    private Connection getConnection() {
        try {
            //获取mysql类
            Class.forName(DRIVER);

            //连接数据库
            connection = DriverManager.getConnection(URL, USER, PASSWORD);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    /**
     * 更新数据库数据
     *
     * @param sql     数据库
     * @param objects object长度可变数组
     * @return 结果集
     */
    public Integer executeUpdate(String sql, Object... objects) {
        try {
            //执行sql命令
            statement = connection.prepareStatement(sql);

            for (int i = 0; i < objects.length; i++) {
                //根据sql语句里的?索引 把object数据里的值以下标的顺序逐个给?赋值到
                statement.setObject(i + 1, objects[i]);
            }
            return statement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return 0;
        }
    }

    /**
     * 查看数据库数据
     *
     * @param sql     数据库
     * @param objects object数组
     * @return 数据结果
     */
    public ResultSet executeQuery(String sql, Object... objects) {
        try {
            //执行sql语句命令
            statement = connection.prepareStatement(sql);

            for (int i = 0; i < objects.length; i++) {
                //根据sql语句里的?索引 把object数据里的值以下标的顺序逐个给?赋值到
                statement.setObject(i + 1, objects[i]);
            }
            return  statement.executeQuery();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return null;
        }

    }

    /**
     *
     * @param sql sql语句
     * @param params 二维数组
     * @return int数组
     */
    public int[] excuteBatch(String sql, Object[][] params) {
        try {
            statement = connection.prepareStatement(sql);

            //循环所有的输入参数
            for (int i = 0; i < params.length; i++) {
                //循环每一个参数，每一个参数为一个数组
                for(int j = 0; j < params[i].length; j++) {
                    statement.setObject(j+1, params[i][j]);
                }
                //加入批量处理
                statement.addBatch();
            }

            //执行批量处理
            return statement.executeBatch();
        } catch (SQLException e) {
            e.printStackTrace();

            return null;
        }
    }



    /**
     * 关闭流
     */
    public void close() {
        //关闭结果集
        try {
            if (resultSet != null) {
                resultSet.close();
            }

            //关闭操作对象
            if (statement != null) {
                statement.close();
            }

            //关闭连接
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public JdbcUtil() {
//       初始化对象同时连接数据库
        getConnection();
    }


}
