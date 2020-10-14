public class Expand{
	public static void main(String[]args){
		//原数组
		int[]arr = new int []{11,22,33,44,55};
		//建立一个新数组
		int[]arr2 = new int[arr.length*2];
		//把原数组的值复制到新数组里
		for(int i=0;i<arr.length;i++){
			arr2[i]=arr[i];
		}
		for(int i =0;i<arr2.length;i++){
			System.out.print(arr2[i]+"\t");
		}
		System.out.println();
	
	
	}
}