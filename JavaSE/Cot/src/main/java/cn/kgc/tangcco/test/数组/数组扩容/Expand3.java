import java.util.Arrays;

public class Expand3{
	public static void main(String[]args){
		//��ԭ����
		int []arr=new int[]{11,22,33,44,55};
		//��¼��Ĺ��߽��н��������� ���Ұ�ԭ���� ��ֵ���Ƶ���������
		int[]arr2=Arrays.copyOf(arr,arr.length*2);
		//��������� ��ֵ
		for(int i=0;i<arr2.length;i++){
			System.out.print(arr2[i]+"\t");
		}
		System.out.println();
	}
}