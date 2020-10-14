package My;

import java.util.Objects;

public class TestSynchronized {
    public static void main ( String[] args ) throws InterruptedException {
       //获取开始时间
        long s=System.currentTimeMillis ();
        Bank bank=new Bank ( "100","123",2000.0 );
        a1 A=new a1 ( bank );
        a2 B=new a2 ( bank );
        a3 C=new a3 ( bank );
        //线程
        Thread thread=new Thread ( A );
        Thread thread1=new Thread ( B );
        Thread thread2=new Thread ( C );
        thread.start ();
        thread1.start ();
        thread2.start ();

        thread.join ();
        thread1.join ();
        thread2.join ();
        long s2 =System.currentTimeMillis ();
        System.err.println (s2-s);
    }
}
class a3 implements Runnable{
    private Bank bank;
    public a3(Bank bank){
        this.bank=bank;
    }
    @Override
    public void run ( ) {
       bank.m ( "100","123",1500 );
        bank.m2 ( "100", "123");
        System.out.println ("A3 完成");
    }
}
class a1 implements Runnable {
    private final Bank bank;
    public a1(Bank bank){
        this.bank=bank;
    }
    @Override
    public void run ( ) {
        bank.m ( "100","123",1500 );
        bank.m2 ( "100", "123");
            System.out.println ("A1  完成");
    }
}
class a2 implements Runnable{
    private final Bank bank;
    public a2(Bank bank){
        this.bank=bank;
    }
    @Override
    public void run ( ) {
        bank.m ( "100","123",1500 );
        bank.m2 ( "100", "123");
            System.out.println ("A2  完成");
    }
}

class Bank{
    private String ID;
    private String pwd;
    private double balance;
    Bank ( String id,String pwd,double balance ) {
        this.ID = id;
        this.pwd=pwd;
        this.balance=balance;
    }
    public synchronized void m(String ID,String pwd,double m) {
           // synchronized (this){ 和synchronized方法是一样的
        //同步代码块 谁先进来 谁拿到锁标记 其他线程只能等 拿锁的完成之后才可以 循行下一个线程
            try {
                Thread.sleep ( 1000 );
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }
            if (this.ID.equals ( ID ) && this.pwd.equals ( pwd )) {
                System.out.println ( "取款>>>" );
                System.out.println ( "余额：" + this.balance );
                if (m < this.balance) {

                    this.balance -= m;
                    System.out.println ( "余额；" + this.balance );
                } else {
                    System.out.println ( "余额不足！！" );
            }
        }
    }
    public void m2(String ID,String pwd) {
        try {
            Thread.sleep ( 1000 );
        } catch (InterruptedException e) {
            e.printStackTrace ();
        }
        if (this.ID.equals ( ID ) && this.pwd.equals ( pwd )) { ;
                System.out.println ( "余额：" + this.balance );
        }
    }

    @Override
    public int hashCode ( ) {
        return Objects.hash ( ID, pwd, balance );
    }
}