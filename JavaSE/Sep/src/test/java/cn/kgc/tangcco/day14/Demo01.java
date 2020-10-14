package cn.kgc.tangcco.day14;

import org.dom4j.*;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.junit.Test;

import javax.xml.parsers.SAXParser;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.SimpleFormatter;

/**
 * @author 李庆华
 * @Description
 * @date 2020/9/14 8:38
 */
public class Demo01 {
    @Test
    public void test01() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");


        Document document = DocumentHelper.createDocument();;
        Element root1 = document.addElement("root1");
        XMLWriter xmlWriter = null;

        String str = "";
       Element[] arr =new Element[3];
        try {
            //创建解析器
            SAXReader saxReader = new SAXReader();
            //创建文档对象
            Document read = saxReader.read("src/resources/student.xml");
            //获取根元素
            Element rootElement = read.getRootElement();
            //获取子元素
            List<Element> elements = rootElement.elements();
            for (int i = 0; i < arr.length ;i++) {
                arr[i]=elements.get(i);
            }
            for (int i = 0; i <arr.length ; i++) {
                for (int j = 0; j < arr.length-i-1; j++) {
                    if ( dateFormat.parse(arr[j].element("birthday").getText()).after(dateFormat.parse(arr[j+1].element("birthday").getText())) ) {
                        Element element=arr[j+1];
                        arr[j+1]=arr[j];
                        arr[j]=element;

                    }
                }
            }

            for (Element e:arr) {
                String id = e.attributeValue("id");
                str += "id=" + id + "\n";
                //指定标签元素
                Element name = e.element("name");
                Element birthday = e.element("birthday");
                str += "名字:" + name.getText() + ",生日:" + birthday.getText() + "\n";



                Element element = root1.addElement("root2");
                element.addAttribute("id",e.attributeValue("id"));
                Element element1 = element.addElement("名字");
                element1.setText(name.getText());
                Element element2 = element.addElement("生日");
                element2.setText(birthday.getText());
                xmlWriter = new XMLWriter(new FileOutputStream("src/resources/student02.xml"), new OutputFormat().createPrettyPrint());
                xmlWriter.write(document);
                xmlWriter.flush();
            }


//            for (Element e : elements) {
//
//              String id = e.attributeValue("id");
//              System.out.println(id);
//              Attribute id1 = e.attribute("id");
//              String text = e.getText();
//              byte[] bytes = text.getBytes();
//              System.out.println(new String(bytes));
//
//
//              System.out.println( name.getText()+","+birthday.getText());
//                子元素的所有子元素
//              List<Element> elements1 = e.elements();
//
//              for (Element e1:elements1) {
//                  System.out.println(e1.getText());
//              }
//                String id = e.attributeValue("id");
//                str += "id=" + id + "\n";
//                //指定标签元素
//                Element name = e.element("name");
//                Element birthday = e.element("birthday");
//                str += "名字:" + name.getText() + ",生日:" + birthday.getText() + "\n";
//
//
//
//            }
//

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println(str);
            if (xmlWriter != null) {
                try {
                    xmlWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }



    @Test
    public void test02() {
        try {

            List<Element> elements = new SAXReader().read("pom.xml").getRootElement().elements();
            for (Element e : elements) {
                System.out.println(e.getText());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
