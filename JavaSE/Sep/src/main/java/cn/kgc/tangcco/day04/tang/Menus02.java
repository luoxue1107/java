package cn.kgc.tangcco.day04.tang;

import cn.kgc.tangcco.day04.tang.dao.impl.FunctionDaoImpl;

import java.util.Scanner;

/**
 * @author 李庆华
 * @Description
 * @date 2020/9/4 20:38
 */
public class Menus02 {
    private  static  Menus02 instance=new Menus02();

    public static Menus02 getInstance() {
        return instance;
    }

    private  Scanner input = new Scanner(System.in);
    //添加
    protected  void add() {
        System.out.print("请输入商品名称:");
        String name = input.next();
        System.out.print("请输入商品类型:");
        String category = input.next();
        System.out.print("请输入商品品牌:");
        String brand = input.next();
        System.out.print("请输入商品价格:");
        double price = 0.0;
        do {
            price = input.nextDouble();
        } while (price <= 0);
        System.out.print("请输入商品库存:");
        int inventory = 0;
        do {
            inventory = input.nextInt();
        } while (inventory <= 0);
        if (FunctionDaoImpl.getInstance().add(new Commodity(name, category, brand, price, inventory))) {
            System.out.println("存储成功");
        } else {
            System.out.println("存储失败");
        }
    }

    //查看
    protected  void showAll() {
        FunctionDaoImpl.getInstance().showAll();
    }

    //查寻
    protected  void show() {
        System.out.println("输入查找的商品类型");
        String category;
        do {
            category = input.next();
        } while (category == null);
        FunctionDaoImpl.getInstance().show(category);
    }

    protected  void addShoppingTrolley() {
        System.out.print("输入商品名称：");
        String name;
        do {
            name = input.next();
        } while (name == null);
        System.out.println();
        System.out.print("请输入购买数量:");
        int ins = 0;
        do {
            ins = input.nextInt();
        } while (ins <= 0);

        if (FunctionDaoImpl.getInstance().addShoppingTrolley(name, ins)) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
    }

    protected  void showShoppingTrolley() {
        FunctionDaoImpl.getInstance().showShoppingTrolley();
    }

    protected  void deleteCommodity() {
        show();
        System.out.print("请输入要删除的商品名称:");
        String name;
        do {
            name = input.next();
        } while (name == null);
        System.out.println();
        System.out.print("请输入删除的数量:");
        int ins = 0;
        do {
            ins = input.nextInt();
        } while (ins <= 0);
        FunctionDaoImpl.getInstance().deleteCommodity(name, ins);
        showAll();
    }
    protected void setInventory(){
        show();
        System.out.print("请输入要修改的商品名称:");
        String name;
        do {
            name= input.next();
        }while (name==null);
        System.out.println();
        System.out.print("请输入商品库存:");
        int inventory;
        do {
            inventory=input.nextInt();
        }while (inventory<=0);
        FunctionDaoImpl.getInstance().setInventory(name,inventory);
        showAll();
    }
}
