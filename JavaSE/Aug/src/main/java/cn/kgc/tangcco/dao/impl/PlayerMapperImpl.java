package cn.kgc.tangcco.Test.dao.impl;

import cn.kgc.tangcco.Test.dao.GamerMapper;
import cn.kgc.tangcco.Test.dao.Player;

/**
 * @author 李庆华
 * @Description
 * @date 2020/8/21 15:10
 */
public class PlayerMapperImpl implements GamerMapper {
    /**
     * 求和
     *
     * @param number1 int数
     * @param number2 int数
     * @return 和
     */
    @Override
    public int sum(int number1, int number2) {
        return number1 + number2;
    }

    /**
     * int数组 排序
     *
     * @param numbers int数组
     * @return 排完序的数组
     */
    @Override
    public int[] sort(int[] numbers) {
        int count;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[i] > numbers[j]) {

                    count = numbers[i];

                    numbers[i] = numbers[j];

                    numbers[j] = count;
                }
            }
        }
        return numbers;
    }

    @Override
    public Object[] addElement(Object[] o, Object obj) {
        int e=o.length;
        Object [] o1= new Object[e];
        for (int i = 0; i < o.length; i++) {
            o1[i]=o[i];
        }

        for (int i = 0; i < o.length; i++) {
            if (o[i]==null){
                o[i]=obj;
            }else {
                e++;
            }
        }
        return o1;
    }

    @Override
    public Object[] delElement(Object[] o, int index) {
        Object[] o1=new Object[o.length-1];
        for (int i = 0; i < o.length; i++) {
            if (i==index){
                o[i]=null;
                o[i]=o[o.length-1];
                for (int j = 0; j <o1.length; j++) {
                    o1[j]=o[j];
                }
            }
        }

        return o1;
    }



    @Override
    public Object[] HBitem(Object[] o1, Object[] o2) {
        Object[] count = new Object[o1.length + o2.length];
        for (int i = 0; i < count.length; i++) {
            count[i] = o1[i];
            if (i == o1.length - 1) {
                for (Object o : o2) {
                    count[i] = o;
                }
            }
        }
        return count;
    }

    @Override
    public boolean indexOf(Object[] o1, Object o) {
        for (Object value : o1) {
            if (value.equals(o)){
                return true;
            }
        }
        return false;
    }

    @Override
    public Player addPlayer(int pid, String pname, double HP, double MP, int level, double exp) {
        Player player =new Player();
        player.setExp(exp);
        player.setHP(HP);
        player.setLevel(level);
        player.setMP(MP);
        player.setPid(pid);
        player.setPname(pname);
        return player;
    }

    @Override
    public boolean upLevel(Player player) {

        return false;
    }

    @Override
    public int huiFU(int blood) {
        return 0;
    }

    @Override
    public int killMonster(int monsterLevel, int count) {
        return 0;
    }
}
