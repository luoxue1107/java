package cn.kgc.tangcco.bean;

/**
 * @author 李庆华
 * @Description 空心等腰三角
 * @date 2020/8/13 18:57
 */
public class Test05 {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            if (i==1) {
                //第一行
                for (int j = 0; j < 5; j++) {
                    System.out.print(" ");
                }
                System.out.print("^");
            } else if(i==6){
                //最后一行
                for (int j = 0; j < 11; j++) {
                    System.out.print("^");
                }
            }else{
                //中间行
                //1.空格
                for (int j = 0; j < (6-i); j++) {
                    System.out.print(" ");
                }
                //2.一个O
                System.out.print("^");
                //3.很多空格
                for (int j = 0; j < (i*2-3); j++) {
                    System.out.print(" ");
                }
                //4.一个O
                System.out.print("^");
            }
            //换行
            System.out.println();
        }
    }
}
