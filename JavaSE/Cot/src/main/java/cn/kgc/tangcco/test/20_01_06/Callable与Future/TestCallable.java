package My;

import java.util.concurrent.*;

public class TestCallable {
    public static void main ( String[] args ) throws ExecutionException, InterruptedException {
        System.err.println ("开始");
        //Executors工具
        ExecutorService e=Executors.newFixedThreadPool ( 3 );
        //匿名内部 Callable实现类
        Callable<String> C1=new Callable<> () {
            @Override
            public String call ( ) throws Exception {
                Thread.sleep ( 5000 );
                String s="";
                for (char i = 'A'; i < 'Z'; i++) {
                    s+=i+"字";
                }
                return s;
            }
        };
        Callable<Integer> C2=new Callable<> () {
            int m;
            @Override
            public Integer call ( ) throws Exception {
                for (int i = 51; i <=100; i++) {
                    m+=i;
                }
                return m;
            }
        };
        Callable<Integer> C3=new Callable<> () {
            int m;
            @Override
            public Integer call ( ) throws Exception {
                for (int i = 1; i <= 50; i++) {
                    m+=i;
                }
                return m;
            }
        };

        //Future接口将call方法的返回值存进去
       Future<String> f1 = e.submit ( C1 );
       Future<Integer> f2 =e.submit ( C2 );
       Future<Integer> f3 =e.submit ( C3 );
       //get获取返回值
        System.out.println (f1.get ());
        System.out.println (f2.get ()+f3.get ());


    }
}