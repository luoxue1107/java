package My;

public class MyThreadTest {
    public static void main ( String[] args ) throws InterruptedException {
        Thread thread1=new Thread ( new Th1 () );
        Thread thread2=new Thread ( new Th2 () );
        thread1.start ();
        thread2.start ();
        for (int i=0;i<50;i++){
            System.out.println ("main\t"+i);
            if (i==20){
                thread1.join ();
            }
        }
    }
}
class Th1 implements Runnable {

    @Override
    public void run ( ) {
        for (int i = 0; i < 50; i++) {
            System.out.println (Thread.currentThread ().getId ()+"TH1\t"+i);
            if (i % 2 !=0){
                //放弃 本次时间片
                Thread.yield ();
            }
        }
        System.out.println ("TH1 结束");
    }
}
class Th2 implements Runnable {
    @Override
    public void run ( ) {
        for (int i = 0; i < 50; i++) {
            System.out.println (Thread.currentThread ().getId ()+"TH2\t"+i);
            if (i % 3 !=1){
                Thread.yield ();
            }
        }
        System.out.println ("TH2 结束");
    }
}