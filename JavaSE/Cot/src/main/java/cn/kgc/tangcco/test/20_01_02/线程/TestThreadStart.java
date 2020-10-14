package My;

public class TestThreadStart {
    public static void main ( String[] args ) {
        MyThread thread=new MyThread (  );
        MyThread2 thread2=new MyThread2 (  );

        //thread.run ();
        thread.start ();
        thread2.start ();
        for (int i=0;i<50;i++){
            System.out.println ("main"+i);
        }
        System.err.println ("结束");

    }

    }
class MyThread extends Thread{
    public void run(){
        for (int i=0;i<50;i++){
            System.out.println("t\t"+i);
        }
        System.out.println ("T1 结束");
    }
}
class MyThread2 extends Thread{
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println ( "t2\t" + i );

        }
        System.out.println ( "T2 结束" );
    }
}