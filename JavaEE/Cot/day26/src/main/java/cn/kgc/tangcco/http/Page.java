package cn.kgc.tangcco.http;

import cn.binarywang.tools.generator.ChineseIDCardNumberGenerator;
import cn.binarywang.tools.generator.ChineseNameGenerator;
import cn.binarywang.tools.generator.base.GenericGenerator;
import cn.kgc.tangcco.CharacterEncoding;
import cn.kgc.tangcco.person.Doctor;
import cn.kgc.tangcco.person.Office;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author 李庆华
 * @Description
 * @date 2020/10/26 14:27
 */
@WebServlet(urlPatterns = "/page.do")
public class Page extends HttpServlet {
    private static final long serialVersionUID = 883697129417552146L;
    private static final ArrayList<Doctor> DOCTOR_LIST = new ArrayList<>();
    private static final ArrayList<Office> OFFICE_LIST = new ArrayList<>();

    static {
        OFFICE_LIST.add(new Office(1, "内科"));
        OFFICE_LIST.add(new Office(2, "外科"));
        OFFICE_LIST.add(new Office(3, "精神科"));
        OFFICE_LIST.add(new Office(4, "妇产科"));
        OFFICE_LIST.add(new Office(5, "血液科"));
        OFFICE_LIST.add(new Office(6, "尿道科"));
        GenericGenerator idCard = ChineseIDCardNumberGenerator.getInstance();
        ChineseNameGenerator nameGenerator = ChineseNameGenerator.getInstance();
        for (int i = 0; i < 10; i++) {
            DOCTOR_LIST.add(new Doctor(100 + i, nameGenerator.generate(), idCard.generate(), i+1));
        }
        Collections.sort(DOCTOR_LIST, new Comparator<Doctor>() {
            @Override
            public int compare(Doctor o1, Doctor o2) {
                int i = o1.getId().compareTo(o2.getId());
                return i;
            }
        });
        DOCTOR_LIST.forEach(doctor -> System.out.println(JSON.toJSONString(doctor)));
        OFFICE_LIST.forEach(office -> System.out.println(JSON.toJSONString(office)));
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String page = req.getParameter("page");
        System.out.println("page:"+page);
        CharacterEncoding.CharacterEncoding(req, resp);
        String context = "<!DOCTYPE html>\n";
        String text = "医院管理系统";
        PrintWriter writer = resp.getWriter();
        writer.println(context +
                "<html>\n" +
                "<head><title>" + text + "</title></head>\n" +
                "<body bgcolor=\"#f0f0f0\">\n" +
                "<from>" +
                "<h1 align=\"center\">" + text + "</h1>\n" +
                "<table>\n" +
                "<table border=\"1px\" align=\"center\" cellspacing=\"0px\" cellpadding=\"15px\">" +
                " <thead>\n" +
                "            <tr>\n" +
                "                <th>编号</th>\n" +
                "                <th>姓名</th>\n" +
                "                <th>性别</th>\n" +
                "                <th>年龄</th>\n" +
                "                <th>科室</th>\n" +
                "                <th>操作</th>\n" +
                "            </tr>\n" +
                "        </thead>\n"
        );
        boolean content = true;
        for (int i = 0; i <5; i++) {
            writer.println(
                            "<tr>\n" +
                            "<td>" + DOCTOR_LIST.get(i).getId() + "</td>\n" +
                            "<td>" + DOCTOR_LIST.get(i).getName() + "</td>\n" +
                            "<td>" + (DOCTOR_LIST.get(i).getGender() == 1 ? "男" : "女") + "</td>\n" +
                            "<td>" + DOCTOR_LIST.get(i).getAge() + "</td>\n");

            for (Office office: OFFICE_LIST) {
                if (office.getId().equals(DOCTOR_LIST.get(i).getFid())){
                    writer.println( "<td>" + office.getName()+ "</td>\n");
                    content=false;
                }
                if (content){
                    writer.println( "<td>未规定职位</td>\n");
                }
            }
            writer.println(
                            "<td><a href=\"http://localhost/day26/\">修改</a></td>\n" +
                            "</tr>\n");
        }
        writer.println(
                "          </tbody>\n" +
                        "        </table>\n" +
                        "       <div>\n" +
                        "<a href=\"http://localhost/day26/page.do?page=1\">首页</a>\n"+

                        "       </div>\n" +

                        "    </form>\n" +
                        "</body>\n" +
                        "</html>");
    }
}
