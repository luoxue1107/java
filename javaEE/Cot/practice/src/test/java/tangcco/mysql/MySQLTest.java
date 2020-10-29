package tangcco.mysql;
import cn.binarywang.tools.generator.ChineseIDCardNumberGenerator;
import cn.binarywang.tools.generator.ChineseNameGenerator;
import cn.binarywang.tools.generator.base.GenericGenerator;
import cn.hutool.core.util.IdUtil;
import com.alibaba.fastjson.JSON;
import org.junit.jupiter.api.Test;
import tangcco.vo.Student;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author 李庆华
 * @Description
 * @date 2020/10/27 12:16
 * Unit test for simple App.
 */
public class MySQLTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    /**
     * 查看
     */
    @Test
    public void testSelect1() {
        //复习：变量的作用域
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        List<Student> students = new ArrayList<Student>();
        try {
            //加载mysql驱动
            Class.forName("com.mysql.cj.jdbc.Driver");

            //获得一个数据库的连接
            connection = DriverManager.getConnection("jdbc:mysql://192.168.240.5:3306/2020_10_28_01", "root", "123456");

            //新建一个SQL语句执行对象
            statement = connection.createStatement();

            //执行SQL语句，返回一个结果集
            resultSet = statement.executeQuery("select s.id, s.name, s.sex, s.birthday, c.id as cid, c.name as cname from student s left join class c on s.class=c.id");

            //遍历结果集
            while (resultSet.next()) {
                Student student = new Student();

                student.setId(resultSet.getInt("id"));
                student.setName(resultSet.getString("name"));
                student.setGender(resultSet.getString("sex"));
                student.setBirthday(resultSet.getDate("birthday"));
                student.setCid(resultSet.getInt("cid"));
                student.setClazz(resultSet.getString("cname"));

                students.add(student);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
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
                students.forEach(student -> System.out.println(JSON.toJSONString(student)));
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


    /**
     * 数据库添加
     */
    @Test
    public void testInsert1() {
        Connection connection = null;
        Statement statement = null;


        try {

              ArrayList<Student> STUDENTS= new ArrayList<Student>();

                GenericGenerator IdCard = ChineseIDCardNumberGenerator.getInstance();
                ChineseNameGenerator name = ChineseNameGenerator.getInstance();


            //加载mysql驱动
            Class.forName("com.mysql.cj.jdbc.Driver");

            //获得一个数据库的连接
            connection = DriverManager.getConnection("jdbc:mysql://192.168.240.5:3306/2020_10_27", "root", "123456");

            //新建一个SQL语句执行对象
            statement = connection.createStatement();

            //执行SQL语句，返回执行语句后所影响的行数
            int status=0;
            for (int i = 0; i < 5; i++) {
                boolean add = STUDENTS.add(new Student( i+1,name.generate(), IdCard.generate(), i + 1, IdUtil.randomUUID()));
                System.out.println(add);
            }
            for (Student student: STUDENTS) {
                System.out.println(JSON.toJSONString(student));
                String sqlText="insert into `student`values ("+student.getId()+",'"+student.getName()+"','"+student.getGender()+
                        "','"+student.getBirthday()+"',"+student.getCid()+",'"+student.getClazz()+"')";
                System.out.println(sqlText);
                status = statement.executeUpdate(sqlText);
            }


            if (status > 0) {
                System.out.println("插入成功");
            } else {
                System.out.println("插入失败");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //关闭结果集
            try {
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
    }

    @Test
    public void testUpdate1() {
        Connection connection = null;
        Statement statement = null;

        try {
            //加载mysql驱动
            Class.forName("com.mysql.cj.jdbc.Driver");

            //获得一个数据库的连接
            connection = DriverManager.getConnection("jdbc:mysql://192.168.240.5:3306/2020_10_27", "root", "123456");

            //新建一个SQL语句执行对象
            statement = connection.createStatement();

            //执行SQL语句，返回执行语句后所影响的行数
            int status = statement.executeUpdate("update `student` set name = 'Tom' where id=4");

            if (status > 0) {
                System.out.println("修改成功");
            } else {
                System.out.println("修改失败");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //关闭结果集
            try {
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
    }

    @Test
    public void testDelete() {
        Connection connection = null;
        Statement statement = null;

        try {
            //加载mysql驱动
            Class.forName("com.mysql.cj.jdbc.Driver");

            //获得一个数据库的连接
            connection = DriverManager.getConnection("jdbc:mysql://192.168.240.5:3306/2020_10_27", "root", "123456");

            //新建一个SQL语句执行对象
            statement = connection.createStatement();

            //执行SQL语句，返回执行语句后所影响的行数
            int status = statement.executeUpdate("delete from `student` where id=5");

            if (status > 0) {
                System.out.println("删除成功");
            } else {
                System.out.println("删除失败");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //关闭结果集
            try {
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
    }

    @Test
    public void testSelect2() {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            //加载mysql驱动
            Class.forName("com.mysql.cj.jdbc.Driver");

            //获得一个数据库的连接
            connection = DriverManager.getConnection("jdbc:mysql://192.168.240.5:3306/2020_10_27", "root", "123456");

            //新建一个SQL语句执行对象
            statement = connection.createStatement();

            //执行SQL语句，返回一个结果集
            String sql = "select s.id,s.name,s.sex,s.birthday,c.name as class from student s left join class c on s.class=c.id";

            resultSet = statement.executeQuery(sql);

            List<Student> students = new ArrayList<>();

            //此行为错误写法，注意区别。复习对象的引用
            //Student student = new Student();

            //遍历结果集
            while (resultSet.next()) {
                Student student = new Student();

                student.setId(resultSet.getInt("id"));
                student.setName(resultSet.getString("name"));
                student.setGender(resultSet.getString("sex"));
                student.setBirthday(resultSet.getDate("birthday"));
                student.setClazz(resultSet.getString("class"));

                students.add(student);
            }

            for (Student s : students) {
                System.out.println(s.toString());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
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
    }

    @Test
    public void testInsert2() {
        Connection connection = null;
        PreparedStatement statement = null;

        Student student = new Student();
        student.setName("张三丰");
        student.setGender("男");
        student.setBirthday(new java.util.Date());
        student.setCid(3);

        try {
            //加载mysql驱动
            Class.forName("com.mysql.cj.jdbc.Driver");

            //获得一个数据库的连接
            connection = DriverManager.getConnection("jdbc:mysql://192.168.240.5:3306/2020_10_27", "root", "123456");

            //新建一个预编译SQL语句执行对象
            String sql = "insert into student(name, sex, birthday, class) values (?, ?, ?, ?)";

            statement = connection.prepareStatement(sql);

            //下标从1开始设置参数
            statement.setString(1, student.getName());
            statement.setString(2, student.getGender());
            //日期为java.sql包下的Date对象，构造函数参数要求是时间戳
            statement.setDate(3, new Date(student.getBirthday().getTime()));
            statement.setInt(4, student.getCid());

            //执行SQL语句，返回执行语句后所影响的行数
            int status = statement.executeUpdate();

            if (status > 0) {
                System.out.println("插入成功");
            } else {
                System.out.println("插入失败");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //关闭结果集
            try {
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
    }

    @Test
    public void testUpdate2() {
        Connection connection = null;
        PreparedStatement statement = null;

        Student student = new Student();
        student.setId(19);
        student.setName("张丰三");
        student.setGender("男");
        student.setBirthday(new java.util.Date());
        student.setCid(2);

        try {
            //加载mysql驱动
            Class.forName("com.mysql.cj.jdbc.Driver");

            //获得一个数据库的连接
            connection = DriverManager.getConnection("jdbc:mysql://192.168.240.5:3306/2020_10_27", "root", "123456");

            //新建一个预编译SQL语句执行对象
            String sql = "update student set name = ?, sex = ?, birthday = ?, class = ? where id = ?";

            statement = connection.prepareStatement(sql);

            //下标从1开始设置参数
            statement.setString(1, student.getName());
            statement.setString(2, student.getGender());
            //日期为java.sql包下的Date对象，构造函数参数要求是时间戳
            statement.setDate(3, new Date(student.getBirthday().getTime()));
            statement.setInt(4, student.getCid());
            statement.setInt(5, student.getId());

            //执行SQL语句，返回执行语句后所影响的行数
            int status = statement.executeUpdate();

            if (status > 0) {
                System.out.println("修改成功");
            } else {
                System.out.println("修改失败");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //关闭结果集
            try {
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
    }
}
