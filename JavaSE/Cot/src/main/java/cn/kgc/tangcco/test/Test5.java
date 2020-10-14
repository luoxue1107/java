import java.util.Scanner;

public class Test5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //初始库存
        int num_k = 50;
        int num_m = 30;
        int num_s = 40;
        int num_h = 60;

        //付的钱
        System.out.println("插卡输入您的钱数；");
        double money = input.nextDouble();
        //物品价格
        double $K = 3;
        double $M = 2;
        double $S = 4;
        double $H = 1;
        int y = 1;
        int n = 1;
        for (; ; ) {
            //超市界面
            System.out.println("<<<<<<<<超市>>>>>>>>\n 1.可乐\t3元 库存：" + num_k + "瓶\n 2.面包\t2元 " +
                    "库存：" + num_m + "个\n 3.薯片\t4元 库存：" + num_s + "袋\n 4.火腿\t1元" +
                    " 库存：" + num_h + "根\n 5.退出\n<<<<<<<<<<>>>>>>>>>\n 您的余额：" + money + "\n输入序号购买：");
            //选择物品
            int num = input.nextInt();
            //可乐
            if (num == 1) {
                System.out.println("购买可乐中 请输入购买数量：");
                //输入数量
                int num1 = input.nextInt();
                //判断输入数量是否正确
                if (num1 <= num_k) {
                    System.out.println("购买" + num1 + "瓶可乐\n价格:" + num1 * $K);
                    //判断钱包是否大于价格
                    double price = num1 * $K;
                    if (money > price) {
                        money = money - (num1 * $K);
                        num_k = num_k - num1;
                        System.out.println("购买成功\n您的余额：" + money + "\n可乐所剩" + num_k + "瓶");
                    } else {
                        n++;
                        if (n<=3) {
                            System.out.println("对不起 您的余额不足 你的余额：" + money);
                        }else {
                            System.out.println("gun");
                            break;
                        }
                    }
                } else {
                    y++;
                    if (y<=3) {
                        System.out.println("库存不足！！差" + (num1 - num_k) + "瓶");
                    } else {
                        System.out.println("gun");
                        break;
                    }

                }
                //面包
            } else if (num == 2) {
                System.out.println("购买面包中 请输入购买数量：");
                //输入数量
                int num2 = input.nextInt();
                //判断输入数量是否正确
                if (num2 <= num_m) {
                    System.out.println("购买" + num2 + "个面包\n价格:" + num2 * $M);
                    //判断钱是否大于价格
                    double price = num2 * $M;
                    if (money > price) {
                        money = money - (num2 * $M);
                        num_m = num_m - num2;
                        System.out.println("购买成功\n您的余额：" + money + "\n面包所剩" + num_m + "个");
                    } else
                        n++;
                    if (n<=3) {
                        System.out.println("对不起 您的余额不足 你的余额：" + money);
                    }else {
                        System.out.println("gun");
                        break;
                    }
                } else {
                    y++;
                    if (y <= 3) {
                        System.out.println("库存不足！！差" + (num2 - num_m) + "个");
                    }else {
                        System.out.println("gun");
                        break;
                    }
                }
                //薯片
            } else if (num == 3) {
                System.out.println("购买薯片中 请输入购买数量：");
                int num3 = input.nextInt();
                //判断输入数量是否正确
                if (num3 <= num_s) {
                    System.out.println("购买" + num3 + "瓶完成\n价格:" + num3 * $S);
                    //判断钱是否大于价格
                    double price = num3 * $S;
                    if (money > price) {
                        money = money - (num3 * $S);
                        num_s = num_s - num3;
                        System.out.println("购买成功\n您的余额：" + money + "\n薯片所剩" + num_s + "袋");
                    } else {
                        n++;
                        if (n <= 3) {
                            System.out.println("对不起 您的余额不足 你的余额：" + money);
                        }else {
                            System.out.println("gun");
                            break;
                        }

                    }
                } else {
                    y++;
                    if (y <= 3) {
                        System.out.println("库存不足！！差" + (num3 - num_s) + "袋");
                    }else {
                        System.out.println("gun");
                        break;
                    }

                }
                //火腿
            } else if (num == 4) {
                System.out.println("购买火腿中 请输入购买数量：");
                //输入数量
                int num4 = input.nextInt();
                //判断输入数量是否正确
                if (num4 <= num_h) {
                    System.out.println("购买" + num4 + "根火腿\n价格:" + num4 * $H);
                    //判断钱是否大于价格
                    double price = num4 * $H;
                    if (money > price) {
                        money = money - (num4 * $H);
                        num_h = num_h - num4;
                        System.out.println("购买成功\n您的余额：" + money + "\n火腿所剩" + num_h + "根");
                    } else {
                        n++;
                        if (n <= 3) {
                            System.out.println("对不起 您的余额不足 你的余额：" + money);
                        }else {
                            System.out.println("gun");
                            break;
                        }

                    }
                } else {
                    y++;
                    if (y <= 3) {
                        System.out.println("库存不足！！差" + (num4 - num_h) + "根");
                    }else {
                        System.out.println("gun");
                        break;
                    }
                }
                //输入错误
            } else if (num==5){
                System.out.println("欢迎下次光临！！！");
                break;
            }else {
                System.out.println("输入有误 请输入1~5序号");
            }
        }

    }

}
