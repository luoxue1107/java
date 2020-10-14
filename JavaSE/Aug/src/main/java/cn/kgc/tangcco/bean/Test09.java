package cn.kgc.tangcco.Test.bean;

import java.util.Scanner;

/**
 * @author 李庆华
 * @Description 作业
 * 自己编写20个任意的方法 可以使用控制台输入输出功能
 * @date 2020/8/15 16:49
 */
public class Test09 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("输入 +, - , * , /");
        char num = input.next().charAt(0);
        switch (num) {
            case '+':
                System.out.println(add(input.nextDouble(),input.nextDouble()));
                break;
            case '-':
                System.out.println(subtract(input.nextDouble(),input.nextDouble()));
                break;
            case '*':
                System.out.println(multiply(input.nextDouble(),input.nextDouble()));
                break;
            case '/':
                System.out.println(divide(input.nextDouble(),input.nextDouble()));
                break;
            default:
                System.out.println("输入有误 请输入+，-，*，/");
        }

    }

    /**
     * 加法
     *
     * @param a 加数
     * @param b 加数
     * @return 和
     */
    static double add(double a, double b) {
        return a + b;
    }

    static double add(double a, double b, double c) {
        return add(a, b) + c;
    }

    static double add(double a, double b, double c, double d) {
        return add(a, b, c) + d;
    }

    static double add(double a, double b, double c, double d, double e) {
        return add(a, b, c, d) + e;
    }

    static double add(double a, double b, double c, double d, double e, double f) {
        return add(a, b, c, d, e) + f;
    }

    /**
     * 减法
     *
     * @param a 被减数
     * @param b 减数
     * @return 差
     */

    static double subtract(double a, double b) {
        return a - b;
    }

    static double subtract(double a, double b, double c) {
        return subtract(a, b) - c;
    }

    static double subtract(double a, double b, double c, double d) {
        return subtract(a, b, c) - d;
    }

    static double subtract(double a, double b, double c, double d, double e) {
        return subtract(a, b, c, d) - e;
    }

    static double subtract(double a, double b, double c, double d, double e, double f) {
        return subtract(a, b, c, d, e) - f;
    }

    /**
     * 乘法
     *
     * @param a 乘数
     * @param b 乘数
     * @return 积
     */
    static double multiply(double a, double b) {
        return a * b;
    }

    static double multiply(double a, double b, double c) {
        return multiply(a, b) * c;
    }

    static double multiply(double a, double b, double c, double d) {
        return multiply(a, b, c) * d;
    }

    static double multiply(double a, double b, double c, double d, double e) {
        return multiply(a, b, c, d) * e;
    }

    static double multiply(double a, double b, double c, double d, double e, double f) {
        return multiply(a, b, c, d, e) * f;
    }

    /**
     * 除法
     *
     * @param a 被除数
     * @param b 除数
     * @return 商
     */
    static double divide(double a, double b) {
        return a / b;
    }

    static double divide(double a, double b, double c) {
        return divide(a, b) / c;
    }

    static double divide(double a, double b, double c, double d) {
        return divide(a, b, c) / d;
    }

    static double divide(double a, double b, double c, double d, double e) {
        return divide(a, b, c, d) / e;
    }

    static double divide(double a, double b, double c, double d, double e, double f) {
        return divide(a, b, c, d, e) / f;
    }
}








