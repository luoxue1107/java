package My;

public class TestWaitAndNotify {
    public static void main ( String[] args ) throws InterruptedException {
        long l=System.currentTimeMillis ();
        System.err.println(l);
        //new一个公用对象
         myClass2 C=new myClass2 ();
        //new等待对象 进行构造赋值
        myClass0 c=new myClass0 (C);
        //new营救对象 进行营救一个线程
        myClass1 c1=new myClass1 (C);
        //等待 线程
        Thread t2=new Thread ( c );
        Thread t= new Thread ( c );
        //营救 线程
        Thread t1= new Thread ( c1 );
        //线程 运行抢夺时间片
        t2.start ();
        t1.start ();
        t.start ();
        t1.join ();
        Thread.sleep ( 5000 );
        synchronized (C){
            System.out.println ("main 开始营救");
            C.notify ();
            System.out.println ("main 营救结束");
        }
        long l2=System.currentTimeMillis ();
        System.err.println ("时间："+(l2-l)+"ms");

    }
}
class myClass2 {

}
//等待类
class myClass0 implements Runnable {
    private final myClass2 C;

    public myClass0 ( myClass2 C ) {
        this.C = C;
    }

    @Override
    public void run ( ) {
        synchronized (C) {
            System.out.println ( Thread.currentThread ().getId () + "等待对象开始" );
            try {
                //释放所以 锁 无限等待 等营救
                C.wait ();
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }
            System.out.println ( Thread.currentThread ().getId () + "等待对象结束" );
        }
    }
}
class myClass1 implements Runnable{
private final myClass2 C;
    public myClass1(myClass2 C){
        this.C=C;
    }
    public void run ( ) {
            synchronized (C){
                try {
                    Thread.sleep ( 5000 );
                } catch (InterruptedException e) {
                    e.printStackTrace ();
                }
                System.out.println ( Thread.currentThread ().getId () + "营救对象开始" );
               //营救临界资源一样的同步代码块下 任意一个无限等待的 线程
                C.notify ();
                //C.notifyAll ();营救全部
            System.out.println ( Thread.currentThread ().getId () + "营救对象完成" );
        }
    }
}