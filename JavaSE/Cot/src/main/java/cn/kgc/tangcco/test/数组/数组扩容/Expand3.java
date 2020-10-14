import java.util.Arrays;

public class Expand3{
	public static void main(String[]args){
		//建原数组
		int []arr=new int[]{11,22,33,44,55};
		//用录入的工具进行建立新数组 并且把原数组 的值复制到新数组里
		int[]arr2=Arrays.copyOf(arr,arr.length*2);
		//输出新数组 的值
		for(int i=0;i<arr2.length;i++){
			System.out.print(arr2[i]+"\t");
		}
		System.out.println();
	}
}