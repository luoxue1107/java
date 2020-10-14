package My;


import java.util.concurrent.locks.ReentrantLock;

public class TestReentrantLock {
    public static void main ( String[] args ) {

    }
}
class myClassB{
    //创建重入锁对象
    private ReentrantLock lock=new ReentrantLock (  );
    private  String [] strings = {"","","","","",""};
    private int count =2 ;
    public void m1(String v){
        //开启锁
        lock.lock ();
        try{
            strings[count]=v;
            Thread.sleep ( 5000 );
        } catch (InterruptedException e) {
            e.printStackTrace ();
            //怕出现异常 释放锁不会运行 把代码写到finally里让其 首先运行
        } finally {
            //释放锁
            lock.unlock ();
        }

    }
}