package Test15;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.*;

public class TestQueue {
    public static void main ( String[] args ) throws InterruptedException {
        Queue<String> queues= new LinkedList<> (  );
        //添加 抛异常
        System.out.println (queues.add ( "A" ));

        //添加 不抛异常
        System.out.println (queues.offer ( "A" ));
        //移除 抛异常
        System.out.println (queues.remove ());
        //移除 不抛异常
        System.out.println (queues.poll ());
        //获取 抛异常
       // System.out.println(queues.element ());
        //获取 不抛异常
        System.out.println (queues.peek ());

        //线程安全 队列集合
       Queue queue=new ConcurrentLinkedDeque ();
        //数组类性队列
        BlockingQueue<String> bq=new ArrayBlockingQueue<String> ( 10 );
        //阻塞添加
        bq.put("A");
        //阻塞移除
        bq.take ();
        System.out.println (bq.remainingCapacity ());
        //链表类型队列
        BlockingQueue<String> q2=new LinkedBlockingDeque<> ();
        //等待 添加
        System.out.println (q2.offer ( "A",1000, TimeUnit.SECONDS));
        //等待 移除
        q2.poll ( 1000,TimeUnit.SECONDS );
        System.out.println (q2.remainingCapacity ());
    }
}
















