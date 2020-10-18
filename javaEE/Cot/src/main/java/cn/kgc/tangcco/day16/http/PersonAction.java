package cn.kgc.tangcco.day16.http;

import cn.binarywang.tools.generator.ChineseIDCardNumberGenerator;
import cn.binarywang.tools.generator.ChineseMobileNumberGenerator;
import cn.binarywang.tools.generator.ChineseNameGenerator;
import cn.binarywang.tools.generator.base.GenericGenerator;
import cn.hutool.core.util.IdUtil;
import cn.hutool.extra.servlet.ServletUtil;
import cn.kgc.tangcco.day16.pojo.Login;
import cn.kgc.tangcco.day16.pojo.Person;
import cn.kgc.tangcco.day16.vo.PersonVo;
import cn.kgc.tangcco.model.ResposeText;
import cn.kgc.tangcco.model.ResultCode;
import cn.kgc.tangcco.utils.date.BaseDateUtil;
import cn.kgc.tangcco.utils.servlet.BaseServlet;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/10/16 15:19
 */

@MultipartConfig
@WebServlet(urlPatterns = "/Person.action" ,loadOnStartup = 1)
public class PersonAction  extends BaseServlet {
    private  static final List<PersonVo> PERSON_VOS = new ArrayList<>();
    private static  final List<Login> LOGINS = new ArrayList<>();
    static {
        GenericGenerator iDcard = ChineseIDCardNumberGenerator.getInstance();
        ChineseNameGenerator name = ChineseNameGenerator.getInstance();
        ChineseMobileNumberGenerator mobile = ChineseMobileNumberGenerator.getInstance();
        for (int i = 0; i < 5; i++) {
            String formerName = name.generate();
            PERSON_VOS .add(new PersonVo(i+1, IdUtil.fastSimpleUUID(), iDcard.generate(),
                formerName, formerName));
            LOGINS.add( new Login(mobile.generate(), "123456",i+1));
        }
        PERSON_VOS .forEach(personVo -> System.out.println(JSON.toJSONString(personVo)));
        LOGINS.forEach(login -> System.out.println(JSON.toJSONString(login)));
    }


    /**
     * 手机号密码登录
     *
     *
     * @param request  HttpServletRequest
     * @param response HttpServletResponse
     * @throws IOException IOException
     */
    public void loginByPassword(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String mobile = request.getParameter("mobile");
        String password = request.getParameter("password");
        Login login = new Login(mobile,password,null);
        ResposeText<Person> responseText = new ResposeText<>(ResultCode.LOGIN_FAILED.getCode(), ResultCode.LOGIN_FAILED.getMsg(), null);
        for (Login value : LOGINS) {
            if (value.getMobile().equals(login.getMobile()) && value.getPassword().equals(login.getPassword())) {
                for (PersonVo personVo : PERSON_VOS) {
                    if (personVo.getId().equals(value.getPid())) {
                        responseText = new ResposeText<>(ResultCode.LOGIN_SUCCESS.getCode(), ResultCode.LOGIN_SUCCESS.getMsg(), personVo);
                        printJsonObject(response, responseText);
                        return;
                    }
                }
            }
        }
        printJsonObject(response, responseText);
    }
    /**
     * 手机号密码登录
     *
     * @param request  HttpServletRequest
     * @param response HttpServletResponse
     * @throws IOException IOException
     */
    public void loginByPassword01(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String string = IOUtils.toString(request.getInputStream(), StandardCharsets.UTF_8);
        //获取  text xml字符串 转换成的login对象  
        Login login = JSON.parseObject(string, Login.class);
        ResposeText<Person> resposeText = new ResposeText<>(ResultCode.LOGIN_FAILED.getCode(), ResultCode.LOGIN_FAILED.getMsg(), null);
        outer:for (Login value : LOGINS) {
            if (value.getMobile().equals(login.getMobile()) && value.getPassword().equals(login.getPassword())) {
                for (PersonVo personVo : PERSON_VOS) {
                    if (personVo.getId().equals(value.getPid())) {
                        resposeText = new ResposeText<>(ResultCode.LOGIN_SUCCESS.getCode(), ResultCode.LOGIN_SUCCESS.getMsg(), personVo);
                        System.out.println(JSON.toJSONString(personVo));
                        break outer;
                    }
                }
            }
        }
        printJsonObject(response, resposeText);
    }

    /**
     *   body raw 传值 Headers Content-Type=application/json
     * @param request 访问
     * @param response 响应
     * @throws IOException  IOException
     */
    public void login(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ServletInputStream inputStream = request.getInputStream();
        String string = IOUtils.toString(inputStream, "UTF-8");
        System.out.println(string);
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String temp;
        StringBuffer stringBuffer = new StringBuffer();
        while ((temp = bufferedReader.readLine()) != null) {
            stringBuffer.append(temp);
        }
        System.out.println(temp);
        inputStream.close();
        inputStreamReader.close();
        bufferedReader.close();




    }

    /**
     * 返回人员简略信息
     *
     * @param request  HttpServletRequest
     * @param response HttpServletResponse
     * @throws IOException IOException
     */
    public void showPersons(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ResposeText<List<PersonVo>> resposeText = new ResposeText<>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMsg(), PERSON_VOS );
        printJsonObject(response, resposeText);
    }

    /**
     * 根据数据库主键移除
     *
     * @param request  HttpServletRequest
     * @param response HttpServletResponse
     * @throws IOException IOException
     */
    public void deletePersonByById(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ResposeText resposeText = new ResposeText<List<PersonVo>>(ResultCode.DATA_ERROR.getCode(), ResultCode.DATA_ERROR.getMsg(), null);
        if ( request.getParameterValues("id").length > 0) {
            String[] ids = request.getParameterValues("id");
            boolean b = false;
            for (String idText : ids) {
                int id = Integer.parseInt(idText);
                b = PERSON_VOS .removeIf(personVo -> personVo.getId() == id);
            }
            if (b) {
                PERSON_VOS .forEach(personVo -> System.out.println(JSON.toJSONString(personVo)));
                resposeText = new ResposeText<List<PersonVo>>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMsg(), null);
                printJsonObject(response, JSON.toJSONString(resposeText));
            }
            printJsonObject(response, JSON.toJSONString(resposeText));
        }else {
            printJsonObject(response, JSON.toJSONString(resposeText));

        }
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
        String formerName = request.getParameter("formerName");
        String lastName = request.getParameter("lastName");
        String password = request.getParameter("password");

        ResposeText resposeText = new ResposeText<List<PersonVo>>(ResultCode.DATA_ERROR.getCode(), ResultCode.DATA_ERROR.getMsg(), null);
        PersonVo personVo = new PersonVo(PERSON_VOS .get(PERSON_VOS .size() - 1).getId() + 1, IdUtil.fastSimpleUUID(), idCard, formerName, lastName);
        if (PERSON_VOS .add(personVo) && LOGINS.add(new Login(mobile, password, personVo.getId()))) {
            resposeText = new ResposeText<List<PersonVo>>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMsg(), null);
            PERSON_VOS .forEach(personVo2 -> System.out.println(JSON.toJSONString(personVo2)));
            LOGINS.forEach(login -> System.out.println(JSON.toJSONString(login)));
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
    public void upload(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        ResposeText<String> responseText = new ResposeText<>(ResultCode.DATA_ERROR.getCode(), ResultCode.DATA_ERROR.getMsg(), null);
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
            System.out.println("文件后缀"+extension);
            // 获取项目的绝对路径
            String realPath = this.getServletContext().getRealPath("/");
            System.out.println("服务器项目路径"+realPath);
            // 上传文件默认目录
            String upload = "upload";
            // 创建上传路径  File.separator 获取当前系统的路径分隔符     BaseDateUtil.format(new Date(), "yyyy/MM/dd/HH/mm")  获取当前时间的格式化的字符串
            String upPath = realPath + File.separator + upload + File.separator + BaseDateUtil.format(new Date(), "yyyy/MM/dd/HH/mm/ss");
            System.out.println("上传目录"+upPath);
            //创建一个新的文件目录
            File file = new File(upPath);
            //判断如果没有此目录路径则创建目录
            if (!file.exists()) {
                //创建多级目录
                file.mkdirs();
            }
            // 新文件名字
            String newFileName = IdUtil.fastSimpleUUID() + "." + extension;
            System.out.println("上传到服务器的文件名字"+newFileName);

            // 保存文件  拷贝文件到上传的项目路径  一个写入流 一个文件路径
            File fileWed = new File(upPath + File.separator + newFileName);
            FileUtils.copyToFile(headerImg.getInputStream(),fileWed);
            responseText = new ResposeText<>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMsg(), JSONObject.toJSONString(fileWed));
            printJsonObject(response, JSON.toJSONString(responseText));
        } else {
            responseText.setMsg("表单应该配置multiple enctype=\"multipart/form-data\"");
            printJsonObject(response, JSON.toJSONString(responseText));
        }
    }
//
//    /**
//     * 利用servlet3.x新特性保存上传文件
//     *
//     * @param request  HttpServletRequest
//     * @param response HttpServletResponse
//     * @throws IOException IOException
//     */
//    public void upload02(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//        ResposeText<String> resposeText = new ResposeText<String>(ResultCode.DATA_ERROR.getCode(), ResultCode.DATA_ERROR.getMsg(), null);
//        // 判断是否为Multipart类型表单
//        if (ServletUtil.isMultipart(request)) {
//            // 如果是否Multipart类型表单获取表单中上传的文件
//            // 获取Part对象
//            Part headerImg = request.getPart("headerImg");
//            //调用获取文件名的方法
//            String fileName = headerImg.getSubmittedFileName();
//            System.out.println("源文件名>>>" + fileName);
//            // 获取文件后缀名
//            String extension = FilenameUtils.getExtension(fileName);
//            // 获取项目的绝对路径
//            String realPath = this.getServletContext().getRealPath("/");
//            // 上次文件默认目录
//            String upload = "upload";
//            // 上传目录
//            String upPath = realPath + File.separator + upload + File.separator + BaseDateUtil.format(new Date(), "yyyy/MM/dd/HH/mm");
//            File file = new File(upPath);
//            if (!file.exists()) {
//                file.mkdirs();
//            }
//            // 新文件名字
//            String newFileName = IdUtil.fastSimpleUUID() + "." + extension;
//            // 保存文件
//            headerImg.write(upPath + File.separator + newFileName);
//            resposeText = new ResposeText<String>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMsg(), "");
//            printJsonObject(response, JSON.toJSONString(resposeText));
//        } else {
//            resposeText.setMsg("表单应该配置multiple enctype=\"multipart/form-data\"");
//            printJsonObject(response, JSON.toJSONString(resposeText));
//            return;
//        }
//    }
}
