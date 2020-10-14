package drill;

public class t2 {
	public static void main(String [] args) {
	     String b = 10>11 ? "对":"错";
	        System.out.println(b);
	/*
	        与 （&&）或 （||）非（！）
	 */
	        //多选多
	        boolean B = 10>2 && 5<4;
	        //多选一
	        boolean C = 7<10||5>3;
	        //反向值
	        boolean V = !(7>8);
	        System.out.println(B);
	        System.out.println(C);
	        System.out.println(V);

	}
}


