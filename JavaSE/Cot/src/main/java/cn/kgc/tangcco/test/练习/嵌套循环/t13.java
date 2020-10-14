package drill;

	public class t13 {
	    public static void main(String[] args) {
	        int He = 0;
	     for (int i=1;i<=10;i++){
	            System.out.println(He);
	            He=He+i;
	            if (He>=20){
	                break;//Í£Ö¹
	            }
	        }
	    }

	}
	class w1 {
	    public static void main(String[] args) {
	        int gang=0;
	        for (int i =1;i<100;i++){
	            System.out.println(i);
	            if (i%3!=0){
	                gang=gang+i;
	            }
	        }
	        System.out.println("ºÍ"+gang);
	    }
	}
