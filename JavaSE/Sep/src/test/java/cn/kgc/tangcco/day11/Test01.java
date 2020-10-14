package cn.kgc.tangcco.day11;

import org.junit.Test;
import org.springframework.beans.propertyeditors.InputStreamEditor;

import java.io.*;

/**
 * @author 李庆华
 * @Description
 * @date 2020/9/11 22:09
 */
public class Test01 {
  @Test
    public void test01(){
      BufferedReader input=null;
      FileInputStream inputStream=null;
      FileReader reader =null;
      InputStreamReader inputStreamReader= null;
      try {
          inputStream =new FileInputStream("src/resources/pom.xml");
          inputStreamReader = new InputStreamReader(inputStream);
           input= new BufferedReader(inputStreamReader);
          int read =-1;
          while ((read= input.read())!=-1) {
              System.out.print((char)read);
          }
      } catch (Exception e) {
          e.printStackTrace();
      }finally {
          if (input!=null){
              try {
                  input.close();
              } catch (IOException e) {
                  e.printStackTrace();
              }
          }
      }
  }
}
