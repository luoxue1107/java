public class Expand2{
	public static void main(String[]args){
		//ԭ����
		int [] arr = new int []{11,22,33,44,55};
		//������
		int [] arr2 = new int[arr.length * 2];
		//��ԭ����ֵ���Ƶ������� �±���Ը�  ԭ���鳤��Ҳ�������
		System.arraycopy(arr,0,arr2,0,arr.length);
		//����������ֵ
		for(int i = 0;i<arr2.length;i++){
			System.out.print(arr2[i]+"\t");
		}
		System.out.println();
	}
}