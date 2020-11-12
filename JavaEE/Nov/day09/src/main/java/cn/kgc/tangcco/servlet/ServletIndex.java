package cn.kgc.tangcco.servlet;

import cn.kgc.tangcco.pojo.Author;
import cn.kgc.tangcco.pojo.Journalism;
import cn.kgc.tangcco.pojo.Text;
import cn.kgc.tangcco.service.Impl.ServiceAuthorImpl;
import cn.kgc.tangcco.service.Impl.ServiceJournalismImpl;
import cn.kgc.tangcco.service.Impl.ServiceTextImpl;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * @author 李庆华
 * @Description
 * @date 2020/11/12 1:49
 */
@WebServlet(urlPatterns = "/index.text")
public class ServletIndex extends HttpServlet {
    private static final long serialVersionUID = 75058696440255237L;
    ServiceTextImpl textImpl = new ServiceTextImpl();
    ServiceJournalismImpl journalismImpl = new ServiceJournalismImpl();
    ServiceAuthorImpl authorImpl = new ServiceAuthorImpl();
    String jid = null;
    Journalism journalism1 = null;


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        jid = req.getParameter("jid");
        journalism1 = journalismImpl.getJournalismById(Integer.parseInt(jid));
        System.out.println(JSON.toJSONString(journalism1));
        Integer view = journalism1.getView();
        System.out.println("view"+view);
        view++;
        Integer integer = journalismImpl.setJournalismView(view, Integer.parseInt(jid));
        if (integer>0){
            System.out.println(integer);
        }else {
            System.out.println(integer);
        }
        Text texts = textImpl.getTextByJid(journalism1.getTid());
        List<Author> authorList = authorImpl.getAuthor();
        req.setAttribute("authorList", authorList);
        req.setAttribute("texts", texts.getText());
        req.setAttribute("journalism", journalism1);
        req.setAttribute("view", view);
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
    @Override
    public void destroy() {

    }
}
