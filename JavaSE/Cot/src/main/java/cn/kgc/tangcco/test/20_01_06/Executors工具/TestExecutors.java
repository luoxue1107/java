package My;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestExecutors {
    //线程池
    public static void main ( String[] args ) {
        //线程池(引用)  Executors 工具
        ExecutorService e= Executors.newFixedThreadPool (2);
        ExecutorService e2= Executors.newCachedThreadPool ();

        Runnable r1=new Runnable () {
            @Override
            public void run ( ) {
                for (int i = 0; i < 50; i++) {
                    System.out.println (Thread.currentThread ().getName ()+"\t"+i);
                }
            }
        };
        e2.submit ( r1 );
        e2.submit ( r1 );
        e2.submit ( r1 );
        e2.submit ( r1 );
        e2.submit ( r1 );
        e2.submit ( r1 );
        e2.submit ( r1 );
        e2.submit ( r1 );
        e2.submit ( r1 );
        e2.submit ( r1 );
        e2.submit ( r1 );
        e2.submit ( r1 );

    }
}