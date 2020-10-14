package My;

import java.util.ArrayList;
import java.util.List;

public class TestConsumerAndProducer {
    public static void main ( String[] args ) throws InterruptedException {
        myClass C=new myClass ();
        myClass3 C3=new myClass3 ( C );
        myClass4 C4=new myClass4 ( C );
        myClass5 C5=new myClass5 ( C );
        C3.start ();
        C4.start ();
        C5.start ();

    }
}
//生产
class myClass3 extends Thread{
    private myClass C;
    public myClass3(myClass C){
        this.C=C;
    }
    @Override
    public void run ( ) {
        System.out.println ("C3 开始");
        for(char c='A';c<='E';c++){
        C.Add (c);
            System.out.println ("存："+c);
        }
        System.out.println ("C3 结束");
    }
}
//生产
class myClass5 extends Thread{
    private myClass C;
    public myClass5(myClass C){
        this.C=C;
    }
    @Override
    public void run ( ) {
        System.out.println ("C5 开始");
        for(char c='F';c<='K';c++){
            C.Add (c);
            System.out.println ("存："+c);
        }
        System.out.println ("C5 结束");
    }
}
//消费
class myClass4 extends Thread{
    private myClass C;
    public myClass4(myClass C){
        this.C=C;
    }
        @Override
    public synchronized void run(  ){
            System.out.println ("C4 开始");
        for ( int i =0;i < 4;i++){
            System.out.println ("取"+C.poll ());
        }
            System.out.println ("C4 结束");
    }
}
//公用
class myClass{
    private List<Object> list=new ArrayList<> (  );

    //存
    public  synchronized void Add(Object o ){
        int size = 4;
        while (list.size() == size){
            try {
                this.wait ();
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }
            this.notifyAll ();
        }
        list.add ( o );
    }
    //取
    public synchronized Object poll ()  {
        while (list.size ()==0){
            try {
                this.wait ();
                //被唤醒
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }
        }
        this.notifyAll ();
        return list.remove ( 0 );
    }


}