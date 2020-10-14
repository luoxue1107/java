package My;

public class TestWaitNotify {
    //开发者与消费者的关系
    public static void main ( String[] args ) {
        //临界资源 对象A
         final MyClassA A =new MyClassA ();
         //匿名内部类
         Thread t1=new Thread (){
            @Override
            public void run ( ) {
                for (char c='A';c<='Z';c++) {
                    //抛出异常
                    try {
                        //开发者 输入
                        A.m1 (c+"" );
                    } catch (InterruptedException e) {
                        e.printStackTrace ();
                    }
                }
            }
        };
        //匿名内部类
        Thread t2=new Thread (  ){
            @Override
            public void run ( ) {
                for (int i = 0; i < 26; i++) {
                    //抛出异常
                    try {
                        //消费者 输出
                        A.m2 ();
                    } catch (InterruptedException e) {
                        e.printStackTrace ();
                    }
                }
            }
        };
        //开发者线程
        t1.start ();
        //消费者线程
        t2.start ();
    }
}
//类
class MyClassA{
    //私有字符串数组长度为4
    private String[] strings=new String[4];
    //整数变量初始为0 用来做下标
    private int size=0;
    //同步方法m1 控制线程
    public synchronized void m1(String s) throws InterruptedException {
        //拿到锁的 线程需要释放一个 等待线程
        this.notify();
        //循环判断 下标 是否 小于数组长度；
        while (strings.length==size){
            //如果下标等于数组长 说明 此数组已满
            System.out.println ("已满");
            //让此线程 带值 进入等待区 等唤醒
            this.wait ();
        }
        System.out.println ("存:\t"+s);
        //如果 判断不成立  就完成赋值
        strings[size]=s;
        //并且 下标值加一
        size++;
        System.out.println ("加一后的下标："+size);
    }
    //同步方法m2
    public synchronized void m2() throws InterruptedException {
        this.notify ();
        //判断下标值 是否 为零；如果为零 说明 数组无值
        while (size==0) {
            System.out.println ( "空" );
            //如果没有值 此线程 进去等待区 等唤醒
            this.wait ();
        }
        System.out.println ("取:\t"+strings[size-1]);
        //如果判断 不成立 说明数组有值 可以输出操作
        //因为 赋值后的下标值 加一； 所以减一之后的下标 才是有值的下标元素
        strings[size-1]="";
        //取出了一个值所以 下标值也要减一 让其 不可以访问空的下标元素；
        size--;
        System.out.println ("减一后的下标:"+size);

    }






}

