package My;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestDispose {
    public static void main ( String[] args ){
        Scanner input = new Scanner ( System.in );
        try {
            System.out.println ("被除数");
            int i1 = input.nextInt ();
            System.out.println ("除数");
            int i2 = input.nextInt ();
            int V = i1 / i2;
            System.out.println (V);
        } catch (InputMismatchException e){
            //自己写的报错提示
            System.out.println ("错误1");
            System.out.println ("必须是整数");
            //打印错误原因
            System.out.println ( e.getMessage () );
            //虚拟机自动报错 堆栈中打印运行流程
            e.printStackTrace ();
        } catch (Exception e) {
            System.out.println ( "错误2" );
        } catch (AbstractMethodError e){
            System.out.println ("错误3");
        }
        System.out.println ( "结束" );
    }
}