public class Expand{
	public static void main(String[]args){
		//ԭ����
		int[]arr = new int []{11,22,33,44,55};
		//����һ��������
		int[]arr2 = new int[arr.length*2];
		//��ԭ�����ֵ���Ƶ���������
		for(int i=0;i<arr.length;i++){
			arr2[i]=arr[i];
		}
		for(int i =0;i<arr2.length;i++){
			System.out.print(arr2[i]+"\t");
		}
		System.out.println();
	
	
	}
}