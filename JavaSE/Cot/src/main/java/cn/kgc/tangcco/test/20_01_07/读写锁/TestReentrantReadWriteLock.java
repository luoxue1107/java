package My;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;

public class TestReentrantReadWriteLock {
    public static void main ( String[] args ) {
        //临界资源对象
        final myClassD myClassD1 =new myClassD ();
        Runnable C1=new Runnable () {
            @Override
            public void run ( ) {
                    try {
                        myClassD1.getV ();
                    } catch (InterruptedException e) {
                        e.printStackTrace (); }
            }
        };
        Runnable C2=new Runnable () {
            public void run ( )  {
                try {
                    myClassD1.setV (100);
                } catch (InterruptedException e) {
                    e.printStackTrace ();
                }
            }
        };
        //开始时间
        long long1=System.currentTimeMillis ();
        //创建 线程池
        ExecutorService s=Executors.newFixedThreadPool ( 20);
        for (int i = 0; i <20 ; i++) {
            //读线程 循环
            s.submit ( C1 );
        }

        for (int i = 0; i < 2; i++) {
            //写线程 循环
            s.submit ( C2 );
        }

        //停止线程池（将现在任务全部执行完毕，不在接受新的任务）
        s.shutdown ();

        //循环访问 任务结束情况 如果所以线程任务结束 主线程结束
        while (true){
            //如果所以线程任务都在结束之前完成 返回true
            if (s.isTerminated ()){
                System.out.println ("完事了");
                break;
            }
        }
        //主线程结束 判断运行开始到结束时间
        System.out.println (System.currentTimeMillis ()-long1);

    }
}
//读写锁
class myClassD{
    ReentrantReadWriteLock lock=new ReentrantReadWriteLock (  );
    ReadLock readLock= lock.readLock ();
    WriteLock writeLock= lock.writeLock ();

    private int v;
    //写方法
    public void setV ( int v ) throws InterruptedException {
        //写对象的 开始锁方法
        writeLock.lock();
        try{
            Thread.sleep ( 1000 );
            System.out.println (Thread.currentThread ().getName ()+"写");
            this.v = v;
        }finally {
            //写对象的 释放锁方法
            writeLock.unlock ();
        }


    }
    //读方法
    public int getV ( ) throws InterruptedException {
        //读对象的 开始锁方法
        readLock.lock ();
        try{
            Thread.sleep ( 1000 );
            System.out.println (Thread.currentThread ().getName ()+"读");
            return this.v;
        }
        finally {
            //读对象的 释放锁方法
            readLock.unlock ();
        }

    }
}