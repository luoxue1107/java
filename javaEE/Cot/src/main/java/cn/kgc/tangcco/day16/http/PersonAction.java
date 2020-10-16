package cn.kgc.tangcco.day16.http;

import cn.binarywang.tools.generator.ChineseIDCardNumberGenerator;
import cn.binarywang.tools.generator.ChineseNameGenerator;
import cn.binarywang.tools.generator.base.GenericGenerator;
import cn.hutool.core.util.IdUtil;
import cn.kgc.tangcco.day16.pojo.Login;
import cn.kgc.tangcco.day16.pojo.Person;
import cn.kgc.tangcco.day16.vo.PersonVo;
import cn.kgc.tangcco.model.ResposeText;
import cn.kgc.tangcco.model.ResultCode;
import cn.kgc.tangcco.utils.servlet.BaseServlet;
import com.alibaba.fastjson.JSON;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/10/16 15:19
 */
@WebServlet(urlPatterns = "/Person.action")
public class PersonAction  extends BaseServlet {
    private  static List<PersonVo> personVos= new ArrayList<>();
    static {
        GenericGenerator iDcard = ChineseIDCardNumberGenerator.getInstance();
        ChineseNameGenerator name = ChineseNameGenerator.getInstance();
        for (int i = 0; i < 10; i++) {
        personVos.add(new PersonVo(i+1, IdUtil.fastSimpleUUID(), iDcard.generate(),
                name.generate(), name.generate()));
        }
        personVos.forEach(personVo -> System.out.println(JSON.toJSONString(personVo)));
    }


    /**
     * 手机号密码登录
     *
     * @param request  HttpServletRequest
     * @param response HttpServletResponse
     * @throws IOException IOException
     */
    public void loginByPassword(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String mobile = request.getParameter("mobile");
        String password = request.getParameter("password");
        Login login = new Login(mobile,password,null);
        ResposeText<Person> resposeText = new ResposeText<>(ResultCode.LOGIN_FAILED.getCode(), ResultCode.LOGIN_FAILED.getMsg(), null);
        for (int i = 0; i < logins.size(); i++) {
            if (logins.get(i).getMobile().equals(login.getMobile()) && logins.get(i).getPassword().equals(login.getPassword())) {
                for (int j = 0; j < personVos.size(); j++) {
                    if (personVos.get(j).getId().equals(logins.get(i).getPid())) {
                        resposeText = new ResposeText<>(ResultCode.LOGIN_SUCCESS.getCode(), ResultCode.LOGIN_SUCCESS.getMsg(), personVos.get(j));
                        printJsonObject(response, resposeText);
                        return;
                    }
                }
            }
        }
        printJsonObject(response, resposeText);
    }
    /**
     * 手机号密码登录
     *
     * @param request  HttpServletRequest
     * @param response HttpServletResponse
     * @param text  param
     * @throws IOException IOException
     */
    public void loginByPassword(HttpServletRequest request, HttpServletResponse response,String text) throws IOException {
        Login login = JSON.parseObject(text, Login.class);
        ResposeText<Person> resposeText = new ResposeText<>(ResultCode.LOGIN_FAILED.getCode(), ResultCode.LOGIN_FAILED.getMsg(), null);
        for (int i = 0; i < logins.size(); i++) {
            if (logins.get(i).getMobile().equals(login.getMobile()) && logins.get(i).getPassword().equals(login.getPassword())) {
                for (int j = 0; j < personVos.size(); j++) {
                    if (personVos.get(j).getId().equals(logins.get(i).getPid())) {
                        resposeText = new ResposeText<>(ResultCode.LOGIN_SUCCESS.getCode(), ResultCode.LOGIN_SUCCESS.getMsg(), personVos.get(j));
                        printJsonObject(response, resposeText);
                        return;
                    }
                }
            }
        }
        printJsonObject(response, resposeText);
    }

    /**
     * 返回人员简略信息
     *
     * @param request  HttpServletRequest
     * @param response HttpServletResponse
     * @throws IOException IOException
     */
    public void showPersons(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ResposeText<List<PersonVo>> resposeText = new ResposeText<List<PersonVo>>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMsg(), personVos);
        printJsonObject(response, JSON.toJSONString(resposeText));
    }

    /**
     * 根据数据库主键
     *
     * @param request  HttpServletRequest
     * @param response HttpServletResponse
     * @throws IOException IOException
     */
    public void deletePersonByById(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String[] ids = request.getParameterValues("id");
        ResposeText resposeText = new ResposeText<List<PersonVo>>(ResultCode.DATA_ERROR.getCode(), ResultCode.DATA_ERROR.getMsg(), null);
        for (String idText : ids) {
            int id = Integer.parseInt(idText);
            personVos.removeIf(personVo -> personVo.getId() == id);
        }
        personVos.forEach(personVo -> System.out.println(JSON.toJSONString(personVo)));
        resposeText = new ResposeText<List<PersonVo>>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMsg(), null);
        printJsonObject(response, JSON.toJSONString(resposeText));
    }

    /**
     * 新增人员
     *
     * @param request  HttpServletRequest
     * @param response HttpServletResponse
     * @throws IOException IOException
     */
    public void putPerson(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String mobile = request.getParameter("mobile");
        String idCard = request.getParameter("idCard");
        String fisrName = request.getParameter("fisrName");
        String lastName = request.getParameter("lastName");
        ResposeText resposeText = new ResposeText<List<PersonVo>>(ResultCode.DATA_ERROR.getCode(), ResultCode.DATA_ERROR.getMsg(), null);
        PersonVo personVo = new PersonVo(personVos.get(personVos.size() - 1).getId() + 1, IdUtil.fastSimpleUUID(), idCard, fisrName, lastName);
        if (personVos.add(personVo) && logins.add(new Login(mobile, "123456", personVo.getId()))) {
            resposeText = new ResposeText<List<PersonVo>>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMsg(), null);
            personVos.forEach(pv -> System.out.println(JSON.toJSONString(pv)));
            logins.forEach(login -> System.out.println(JSON.toJSONString(login)));
        }
        printJsonObject(response, JSON.toJSONString(resposeText));
    }

    /**
     * 从请求头中获取token
     *
     * @param request  HttpServletRequest
     * @param response HttpServletResponse
     * @throws IOException IOException
     */
    public void getToken(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ResposeText resposeText = new ResposeText<List<PersonVo>>(ResultCode.DATA_ERROR.getCode(), ResultCode.DATA_ERROR.getMsg(), null);
        System.out.println(request.getHeader("token"));
        resposeText = new ResposeText<List<PersonVo>>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMsg(), null);
        printJsonObject(response, JSON.toJSONString(resposeText));
    }

    /**
     * 获取cookie
     *
     * @param request  HttpServletRequest
     * @param response HttpServletResponse
     * @throws IOException IOException
     */
    public void getCookie(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ResposeText resposeText = new ResposeText<List<PersonVo>>(ResultCode.DATA_ERROR.getCode(), ResultCode.DATA_ERROR.getMsg(), null);
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            System.out.println(cookie.getName() + " = " + cookie.getValue());
        }
        resposeText = new ResposeText<List<PersonVo>>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMsg(), null);
        printJsonObject(response, JSON.toJSONString(resposeText));
    }

    /**
     * 利用commons-io保存上传文件
     *
     * @param request  HttpServletRequest
     * @param response HttpServletResponse
     * @throws IOException IOException
     */
    public void upload01(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        ResposeText<String> resposeText = new ResposeText<String>(ResultCode.DATA_ERROR.getCode(), ResultCode.DATA_ERROR.getMsg(), null);
        // 判断是否为Multipart类型表单
        if (ServletUtil.isMultipart(request)) {
            // 如果是否Multipart类型表单获取表单中上传的文件
            // 获取Part对象
            Part headerImg = request.getPart("headerImg");
            //调用获取文件名的方法
            String fileName = headerImg.getSubmittedFileName();
            System.out.println("源文件名>>>" + fileName);
            // 获取文件后缀名
            String extension = FilenameUtils.getExtension(fileName);
            // 获取项目的绝对路径
            String realPath = this.getServletContext().getRealPath("/");
            // 上次文件默认目录
            String upload = "upload";
            // 上传目录
            String upPath = realPath + File.separator + upload + File.separator + BaseDateUtil.format(new Date(), "yyyy/MM/dd/HH/mm");
            File file = new File(upPath);
            if (!file.exists()) {
                file.mkdirs();
            }
            // 新文件名字
            String newFileName = IdUtil.fastSimpleUUID() + "." + extension;
            // 保存文件
            FileUtils.copyToFile(headerImg.getInputStream(), new File(upPath + File.separator + newFileName));
            resposeText = new ResposeText<String>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMsg(), "");
            printJsonObject(response, JSON.toJSONString(resposeText));
        } else {
            resposeText.setMsg("表单应该配置multiple enctype=\"multipart/form-data\"");
            printJsonObject(response, JSON.toJSONString(resposeText));
            return;
        }
    }

    /**
     * 利用servlet3.x新特性保存上传文件
     *
     * @param request  HttpServletRequest
     * @param response HttpServletResponse
     * @throws IOException IOException
     */
    public void upload02(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        ResposeText<String> resposeText = new ResposeText<String>(ResultCode.DATA_ERROR.getCode(), ResultCode.DATA_ERROR.getMsg(), null);
        // 判断是否为Multipart类型表单
        if (ServletUtil.isMultipart(request)) {
            // 如果是否Multipart类型表单获取表单中上传的文件
            // 获取Part对象
            Part headerImg = request.getPart("headerImg");
            //调用获取文件名的方法
            String fileName = headerImg.getSubmittedFileName();
            System.out.println("源文件名>>>" + fileName);
            // 获取文件后缀名
            String extension = FilenameUtils.getExtension(fileName);
            // 获取项目的绝对路径
            String realPath = this.getServletContext().getRealPath("/");
            // 上次文件默认目录
            String upload = "upload";
            // 上传目录
            String upPath = realPath + File.separator + upload + File.separator + BaseDateUtil.format(new Date(), "yyyy/MM/dd/HH/mm");
            File file = new File(upPath);
            if (!file.exists()) {
                file.mkdirs();
            }
            // 新文件名字
            String newFileName = IdUtil.fastSimpleUUID() + "." + extension;
            // 保存文件
            headerImg.write(upPath + File.separator + newFileName);
            resposeText = new ResposeText<String>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMsg(), "");
            printJsonObject(response, JSON.toJSONString(resposeText));
        } else {
            resposeText.setMsg("表单应该配置multiple enctype=\"multipart/form-data\"");
            printJsonObject(response, JSON.toJSONString(resposeText));
            return;
        }
    }
}
