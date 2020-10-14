package drill;

public class t1 {
	    public static void main(String [] args) {
	        int days =123;
	        int week = days/7;
	        System.out.println(week+"周");
	        int yuDay = days%7;
	        System.out.println(yuDay+"天");
	        System.out.println("---------------");
	         double r=1.5;
	         System.out.println("面积"+3.14*r*r);
	         System.out.println("---------------");
	         boolean R =5<2;
	        System.out.println(R);
	        boolean C=5<9;
	        System.out.println(C);
	        System.out.println("---------------");
	        int shenggao =155;
	        int qian=1000; int tinzhong = 88;
	        boolean B = shenggao >180 && qian >500 && tinzhong>60;
	        System.out.println(B);
	    }
	}
