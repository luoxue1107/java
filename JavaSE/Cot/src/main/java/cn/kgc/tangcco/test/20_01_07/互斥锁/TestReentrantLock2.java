package My;

import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

public class TestReentrantLock2 {
    public static void main ( String[] args )  {
       final myClassC myClassC1 =new myClassC ();
        Runnable C1=new Runnable () {
            @Override
            public void run ( ) {
                try {
                    myClassC1.getV ();
                } catch (InterruptedException e) {
                    e.printStackTrace ();
                }
            }
        };
        Runnable C2=new Runnable () {
            @Override
            public void run ( ) {
                try {
                    myClassC1.setV ( 100 );
                } catch (InterruptedException e) {
                    e.printStackTrace ();
                }
            }
        };
        //创建 线程池
        ExecutorService E= Executors.newFixedThreadPool (20 );
        //开始时间
        long long1=System.currentTimeMillis ();

        for (int i = 0; i < 20; i++) {

            E.submit ( C1 );
        }
        for (int i = 0; i < 2; i++) {
            E.submit ( C2 );
        }
        E.shutdown ();
        while (true){
            if (E.isTerminated ()){
                System.out.println ("完事了");
                break;
            }
        }
        //结束时间减去开始时间 用的时间
        System.out.println (System.currentTimeMillis ()-long1);

    }
}
//互斥锁
class myClassC{
    ReentrantLock lock=new ReentrantLock (  );
    private int v;
    //读方法
    public int getV ( ) throws InterruptedException {
        //开始锁
        lock.lock ();
        try{Thread.sleep ( 1000 );
            System.out.println (Thread.currentThread ().getName ()+"读");
            return v;
            //释放锁
        }finally { lock.unlock (); }

    }
    //写方法
    public void setV ( int v ) throws InterruptedException {
        //开始锁
        lock.lock ();
        try{
            Thread.sleep ( 1000 );
            System.out.println (Thread.currentThread ().getName ()+"写");
            this.v = v;
            //释放锁
        } finally { lock.unlock (); }

    }
}
