package cn.kgc.tangcco.day04.tang;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author 李庆华
 * @Description
 * @date 2020/9/4 22:30
 */
public class File {
    private  static  File instance=new File();

    public static File getInstance() {
        return instance;
    }

    public void print(String str,String str2){


      FileWriter fileWriter;

      {
          try {
              fileWriter = new FileWriter(str2+"购物车文档.txt");
              for (int i = 0; i < str.length(); i++) {

                  fileWriter.write(str);;
                  fileWriter.flush();
                  fileWriter.close();
              }
          } catch (IOException e) {
          }
      }
  }
}
