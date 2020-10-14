import java.util.Scanner;

public class Test7 {
    public static void main(String[] ages) {
        Scanner input = new Scanner(System.in);
        //创建一个寸学员名字的数组
        String []arr= new String[20];
        int a=0;
        //循环存入学员姓名
        while (a<arr.length){
        System.out.println("输入第"+(a+1)+"号姓名");
        String num=input.next();
        arr[a]=num;
        a++;
        if (a==arr.length){
            System.out.println("是否查看名单n/y");
            char cha=input.next().charAt(0);
            if (cha=='y'){
                for (int j=0;j<arr.length;j++){
                    System.out.println((j+1)+"号"+arr[j]);
                }
            }else if (cha=='n'){
                break;
            }else {
                System.out.println("输入有误n/y");
            }
        }
        }
        System.out.println("姚老师带的钱数");
        double Yao = input.nextDouble();
        System.out.println("姚老师有" + Yao);
        double money = 0.0;
        double $a = 1.0;
        double $b = 3.0;
        double $c = 10.0;
        boolean f = false;
        //20个学员询问
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "学员");
            System.out.println("你要吃雪糕吗n/y");
            //录入n y
            char num = input.next().charAt(0);
            // n 为不吃雪糕
            if (num == 'n') {
                System.out.println(arr.length+ "学员\n不吃雪糕");
                //y 为吃雪糕 再去询问吃什么价格的雪糕
            } else if (num == 'y') {
                System.out.println("超市有：1.1元雪糕 2.3元雪糕 3.10元雪糕" + arr[i]+ "学员您想吃哪一种");
                int num1 = input.nextInt();
                //一元雪糕
                if (num1 == 1) {
                    money++;
                    if (money > Yao) {
                        System.out.println("雪糕的总价为：" + money + "老师的钱不够了差" + (money - Yao) + "元");
                        int num2 = (int) (Math.random() * 20);
                        System.out.println("在20名学员中抽取一名学员付钱学员为:\n" + arr[num2] + "号学员\n恭喜！！恭喜！！");
                        break;
                    }
                    //三元雪糕
                } else if (num1 == 2) {
                    money += 3;
                    if (money > Yao) {
                        System.out.println("雪糕的总价为：" + money + "老师的钱不够了差" + (money - Yao) + "元");
                        int num2 = (int) (Math.random() * 20);
                        System.out.println("在20名学员中抽取一名学员付钱学员为:\n" + arr[num2] + "号学员\n恭喜！！恭喜！！");
                        break;
                    }
                    //十元雪糕
                } else if (num1 == 3) {
                    money += 10;
                    if (money > Yao) {
                        System.out.println("雪糕的总价为：" + money + "老师的钱不够了差" + (money - Yao) + "元");
                        int num2 = (int) (Math.random() * 20);
                        System.out.println("在20名学员中抽取一名学员付钱学员为:\n" + arr[num2] + "学员\n恭喜！！恭喜！！");
                        break;
                    }
                } else {
                    System.out.println("输入有误！！请输入序号1~3");
                }
            } else {
                System.out.println("输入错误！！！ 请输入y或n");
            }
        }
    }
}