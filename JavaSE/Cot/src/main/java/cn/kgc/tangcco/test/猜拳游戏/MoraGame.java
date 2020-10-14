import java.util.Scanner;


public class MoraGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //电脑回合分
        int cCount = 0;
        //玩家回合分
        int pCount = 0;
        //玩家总分
        int pZong = 0;
        //电脑总分
        int cZong = 0;
        //类的录入
        Human p = new Human();
        computer c = new computer();
        //函数的调用
        tool(26,"-");
        System.out.print("欢迎进入游戏世界");
        tool(26,"-");
        System.out.println();
        tool(26," ");
        tool(15,"*");
        System.out.println();
        tool(27," ");
        tool(3,"*");
        System.out.print("猜拳开始");
        tool(3,"*");
        System.out.println();
        tool(26," ");
        tool(15,"*");
        System.out.println();
        p.renming();
        c.diannaoming();
        tool(67,"-");
        System.out.println();
        System.out.println(p.name + "\tVS\t" + c.name + "\t对战");
        tool(67,"-");
        System.out.println();
        //是否 开始游戏 判断
        System.out.println("要开始吗（y/n）");
        char start = input.next().charAt(0);
        tool(67,"-");
        System.out.println();
        // “y”开始游戏
        if (start == 'y') {
            System.out.println("游戏开始");
            //循环嵌套
            for (int b = 1; ;b++) {
                for (int v=1;v<=3; ){
                    System.out.println("第"+b+"场");
                    System.out.println("第" + v + "回合");
                    int computer = ((int) (Math.random() * 10) % 3 + 1);
                    System.out.println("请输入猜拳的编号（1.剪刀2.石头3.布）");
                    int piayer = input.nextInt();
                    //玩家选择 进行显示
                    switch (piayer){
                        case 1:
                            System.out.println(p.name+"\n出：剪刀");
                            break;
                        case 2:
                            System.out.println(p.name+"\n出：石头");
                            break;
                        case 3:
                            System.out.println(p.name+"\n出：布");
                            break;
                    }
                    //电脑选择 进行显示
                    switch (computer){
                        case 1:
                            System.out.println(c.name+"\n出：剪刀");
                            break;
                        case 2:
                            System.out.println(c.name+"\n出：石头");
                            break;
                        case 3:
                            System.out.println(c.name+"\n出：布");
                            break;
                    }
                    // 判断回合输赢
                    if (computer == piayer) {
                        //平局
                        System.out.println("平局 不算再来");
                        continue;
                    } else if ((piayer == 1 && computer == 3) || (piayer == 2 && computer == 1) || (piayer == 3 && computer == 2)) {
                        //玩家赢
                        System.out.println(p.name + "加一分");
                        System.out.println(c.name + "不加分");
                        pCount++;
                        //回合次数记录
                        v++;
                    } else if ((computer == 1 && piayer == 3) || (computer == 2 && piayer == 1) || (computer == 3 && piayer == 2)) {
                        //电脑赢
                        System.out.println(c.name + "赢了加一分");
                        System.out.println(p.name + "输了不加分");
                        cCount++;
                        v++;
                    }
                    tool(67,"-");
                    System.out.println();
                }
                if (cCount==2){
                    System.out.println("第一场"+c.name+"胜利");
                    cZong++;
                }else if (pCount==2){
                    System.out.println("第一场"+p.name+"胜利");
                    pZong++;
                }
                //判断三回合之后 是否继续
                System.out.println("是否继续？(y/n)");
                char start2=input.next().charAt(0);
                tool(67,"-");
                System.out.println();
                //这是是判断三回合 之后 是否继续 这里不继续
                if(start2=='n'){
                    //这里是判断玩家跟电脑 谁的分数高
                    if (cZong < pZong) {
                        //玩家赢
                        System.out.println("场数："+b+"场");
                        System.out.println("恭喜“" + p.name + "”赢得这场游戏");
                        System.out.println("遗憾“" + c.name + "”输了这场游戏");
                        tool(67,"-");
                        System.out.println();
                        break;
                    } else if (cZong > pZong) {
                        //电脑赢
                        System.out.println("场数："+b+"场");
                        System.out.println("恭喜“" + c.name + "”赢得这场游戏");
                        System.out.println("遗憾“" + p.name + "”输了这场游戏");
                        System.out.println();
                        break;
                    } else  if(cZong == pZong) {
                        //平局
                        System.out.println("场数："+b+"场");
                        System.out.println("平局了");
                        tool(67,"-");
                        System.out.println();
                        break;
                    }
                    //三回合完事之后的判断 是否 继续 这里是继续
                }else if(start2=='y'){
                    System.out.println("继续游戏");
                }
            }
            //开始时 判断是否进入的 否
        } else if(start=='n'){
            for (;;) {
                System.out.println("确定不进行游戏吗？");
                String confirm = input.next();
                if(confirm=="不确定"){
                    break;
                }
            }
        }
    }
    //建立一个函数
    public static void tool(int count,String symbol){
        for (int i = 1 ; i <= count;i++){
            System.out.print(symbol);
        }
    }
}

