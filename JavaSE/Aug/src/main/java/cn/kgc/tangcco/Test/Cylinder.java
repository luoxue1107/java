package cn.kgc.tangcco.Test.Test;

/**
 * @author 李庆华
 * @Description
 * @date 2020/8/19 20:36
 */
public class Cylinder {
    /**
     * 半径
     */
    private double radius;
    /**
     * 高
     */
    private double tall;

    /**
     * 输入圆柱高 和 低面半径
     * @param radius 圆柱低面半径
     * @param tall 圆柱高
     * @return 判断 是否为0以下
     */
    public boolean setValue(double radius, double tall) {
        //判断
        if (radius <= 0 || tall <= 0) {
            return false;
        } else {
            this.radius = radius;
            this.tall = tall;
            return true;
        }
    }

    /**
     * 低面积
     *
     * @return 低圆面积
     */
    private double getArea() {
        return Math.PI * (this.radius * this.radius);

    }

    /**
     * 体积
     *
     * @return 圆柱体积
     */
    private double getVolume() {
        return this.tall * (this.getArea());
    }

    /**
     * 打印
     */
    public void print(){
        System.out.println("圆柱体的底边的半径是"+this.radius+"\n高是"+this.tall+"\n底面积是"+this.getArea()+"\n体积是"+this.getVolume());
    }
}
