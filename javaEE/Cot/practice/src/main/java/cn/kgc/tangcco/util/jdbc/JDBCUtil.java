package cn.kgc.tangcco.util.jdbc;

import java.sql.*;

/**
 * @author 李庆华
 * @Description
 * @date 2020/10/28 11:09
 */
public class JDBCUtil {

    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String URL = "jdbc:mysql://192.168.100.174:3306/2020_10_28_01";
    public static final String USER = "root";
    public static final String PASSWORD = "123456";

    //初始
   private Connection connection;
   private PreparedStatement statement;
   private ResultSet resultSet;

    /**
     *  连接数据库
     * @return 连接
     */
   private  Connection getConnection(){
       try {
           //获取mysql类
           Class.forName(DRIVER);

            connection = DriverManager.getConnection(URL, USER, PASSWORD);

       } catch (ClassNotFoundException | SQLException e) {
           e.printStackTrace();
       }
       return connection;
   }

    /**
     * 查看数据库数据
     * @param sql 数据库
     * @param objects object数组
     * @return 结果集
     */
   public   ResultSet executeQuery(String sql, Object...objects){
       try {
           statement =connection.prepareStatement(sql);
           for (int i = 0; i < objects.length; i++) {
               statement.setObject(i+1,objects[i]);
           }
           return statement.executeQuery();
       } catch (SQLException throwables) {
           throwables.printStackTrace();
           return null;
       }
   }

    /**
     *  更新数据库数据
     * @param sql 数据库
     * @param objects object数组
     * @return 结果集
     */
   public   Integer executeUpdate(String sql, Object...objects){
       try {
           statement =connection.prepareStatement(sql);
           for (int i = 0; i < objects.length; i++) {
               statement.setObject(i+1,objects[i]);
           }
          return statement.executeUpdate();
       } catch (SQLException throwables) {
           throwables.printStackTrace();
           return 0;
       }
   }

    /**
     * 关闭流
     */
   public void  close(){
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

   public JDBCUtil(){
//       初始化对象同时连接数据库
       getConnection();
   }



}
