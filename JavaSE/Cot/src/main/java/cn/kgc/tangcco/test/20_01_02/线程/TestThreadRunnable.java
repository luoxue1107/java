package My;

public class TestThreadRunnable{
    public static void main ( String[] args ) {
        MyR r=new MyR ();
        //把线程任务 存到线程里 让线程运行
        Thread t=new Thread ( r );
        Thread t2=new Thread ( r );
        Thread t3=new Thread ( r );
        Thread t4=new Thread ( r );
        t.start ();
        t2.start ();
        t3.start ();
        t4.start ();
    }
}
class MyR implements Runnable {

    @Override//线程任务
    public void run ( ) {
        for (int i = 0; i < 50;i++){
            System.out.println (Thread.currentThread ().getId ()+"\t"+i);
            try {
                //让线程 休眠时间
                Thread.sleep ( 2000 );
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }
        }
    }
}