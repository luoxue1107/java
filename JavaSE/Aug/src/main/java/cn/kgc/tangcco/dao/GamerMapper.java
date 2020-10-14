package cn.kgc.tangcco.dao;

/**
 * @author 李庆华
 * @Description
 * @date 2020/8/21 15:10
 */
public interface GamerMapper {
    /**
     * 求两数之和
     */
    public int sum(int number1,int number2);

    /**
     * 给数组排序
     * @param numbers
     * @return
     */
    public int[] sort(int[] numbers);

    /**
     * 数组添加元素,并且不能有空元素
     * @param o
     * @param  obj
     * @return
     */
    public Object[] addElement(Object[] o, Object obj);
    //删除数组指定元素、并且不能有空元素存在
    public Object[] delElement(Object[] o,int index);
    //合并数组
    public Object[] HBitem(Object[] o1,Object[] o2);
    //查询指定元素是否存在于指定数组
    public boolean indexOf(Object[] o1,Object o);
    //创建游戏角色
    public Player addPlayer(int pid,String pname,double HP, double MP , int level,double exp);
    //升级：当经验 >=（当前等级*100）——（hp*0.3）时，经验减去相应部分、并升级（LEVEL+1）返 回boolean类型
    // eg: 19级升20级需要5000经验， 而我有20000 ， 升级后等级变为20，经验还剩15000
    public boolean upLevel(Player player);
    //每回复100点HP、消耗10经验，如果经验不够、无法获取经验
    // 参数 期望回复血量
    public int huiFU(int blood);
    //杀怪获取经验，并减少血量
    // 经验值计算：
    // 每个怪物固定获取怪物等级*10的经验值 , 当怪物等级小于玩家当前等级，10级以上时，经验计 算公式为： 怪物等级*10*0.5
    //当怪物等级大于玩家时经验计算公式为：怪物等级*10 + （怪物等级-人物等级）*100
    // 血量计算：
    // 每个怪物固定消耗怪物等级*5的血量, 当怪物等级小于玩家当前等级，10级以上时，减少的血量计算 公式为： 怪物等级*5*0.1
    // 当怪物等级大于玩家时经验计算公式为：怪物等级*5 + （怪物等级-人物等级）*50
    // 参数一：怪物等级
    // 参数二：击杀怪物数量
    // 返回值：击杀怪物后的经验
    public int killMonster(int monsterLevel,int count);
}
