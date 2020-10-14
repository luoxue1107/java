public class Expand2{
	public static void main(String[]args){
		//原数组
		int [] arr = new int []{11,22,33,44,55};
		//新数组
		int [] arr2 = new int[arr.length * 2];
		//把原数组值复制到新数组 下标可以改  原数组长度也可随意改
		System.arraycopy(arr,0,arr2,0,arr.length);
		//输出新数组的值
		for(int i = 0;i<arr2.length;i++){
			System.out.print(arr2[i]+"\t");
		}
		System.out.println();
	}
}