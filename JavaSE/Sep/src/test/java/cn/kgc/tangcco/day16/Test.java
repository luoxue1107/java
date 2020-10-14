package cn.kgc.tangcco.day16;

import lombok.AllArgsConstructor;

/**
 * @author 李庆华
 * @Description
 * @date 2020/9/21 9:25
 */
public class Test {
    public static void main(String[] args) {
        Test01[] test01 = new Test01[10];
        test01[1] = new Test01(5);
        test01[2] = new Test01(4);
        test01[3] = new Test01(1);
        test01[4] = new Test01(6);
        test01[5] = new Test01(7);

        Test01[] test02 = new Test01[10];
        for (Test01 t :
                test01

        ) {
            if (t == null) {
                continue;
            }
            System.out.println(t.m);
        }

        for (int i = 0; i < test01.length; i++) {
            if (test01[i] == null) {
                break;
            } else {
                for (int j = 0; j < test01.length - i - 1; j++) {
                    if (test01[j] != null) {
                        if (test01[i].m > test01[j + 1].m) {
                            Test01 test = test01[i];
                            test01[i] = test01[j + 1];
                            System.out.println(test01[i].m);
                            test01[j + 1] = test;
                            System.out.println(test01[i].m);
                        }
                    } else {
                        break;

                    }
                }
            }
        }
        System.out.println("+++++++++++++");
        for (Test01 t :
                test01) {
            if (t == null) {
                continue;
            }
            System.out.println(t.m);
        }
    }
}


