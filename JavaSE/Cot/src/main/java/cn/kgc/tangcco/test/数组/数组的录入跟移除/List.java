import java.util.*;

public class List{
   // ����һ��ԭ���� ������д������Ҫдstatic
    static String[]nums = new String[5];
    //��ЧԪ�صĸ����� Ҳ����ЧԪ���±�
    static int size = 0;
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        for (;;){
        System.out.print("����1.(���)2.(ɾ��)3.(����)4.(�鿴)��");
        int c=input.nextInt();
        switch(c){
            case 1:
            for (;;) {
                print();
                System.out.print("����ʼ���Ϊ��0���������ţ�");
                int b = input.nextInt();
                System.out.println();
                if (b<0){
                    break;
                }
                System.out.print("¼��ֵ���룺");
                String k = input.next();
                System.out.println();
                insert(b, k);
                print();
                System.out.println("--------------------");
            }
            System.out.println("������ҳ");
            continue;
            case 2:
                for (;;) {
                    print();
                    System.out.println("����������ɾ���ı��");
                    int b = input.nextInt();
                    if (b<0) {
                        break;
                    }
                    remove(b);
                }
                System.out.println("������ҳ");
                continue;
            case 3:
                for(;;){
                print();
                System.out.print("������Ҫ���ĵı�ţ�");
                int b =input.nextInt();
                System.out.println();
                    if (b<0) {
                        break;
                    }
                System.out.print("����������¼���ֵ��");
                String k =input.next();
                System.out.println();
                change(b,k);
                }
                System.out.println("������ҳ");
                continue;
            case 4:
                print();
                continue;
            default:
                System.out.println("�������� ������1~4����");
                continue;
        }



    }
    }
    //Ԫ�ص�¼��
    public static void insert(int position,String value){
        //����д����±���ж� �Ƿ񳬹���ЧԪ�ظ���
        if(position >size||position<0){
            System.out.println("�������� ������һ����0~"+size+"������");
            return;
        }
        //��� ���鳤�ȸ���ЧԪ�ظ��� ����� ��������Ԫ��ֵ���� Ȼ�������������
        if (nums.length==size){
            arr();
        }
        //���������¼��ֵ
        for(int i = size;i > position;i--){
            //�����ֵ
            nums[i]=nums[i-1];
        }
        //Ԫ�ص�¼�� �� ���������е�λ��
        nums[position] = value;
        size++;
    }
    //����һ���µ����� Ȼ���ԭ�����ַ�ĵ��������ַ
    public static void arr(){
        //�������һ������һ�� ���ұߵĵ�ַ������ߵ�������
       nums=Arrays.copyOf(nums,nums.length*2);
    }
    //����ֵ��չ��
    public static void print(){
            for (int i=0;i<size;i++){
                System.out.print("���"+i+":"+nums[i]+"\t");
            }
            System.out.println();
        }



        //Ԫ�ص��Ƴ�
    public static void remove(int position){
        if (position<0||position>size){
            System.out.println("��������������0~"+(size-1)+"������");
            return;
        }
        //�Ȱ���Ҫɾ��������ֵ����ֵΪ0 Ҳ����˵��һ����ֵ
        nums[position]="0";
        /*
        Ȼ����������ֵ
        ����Ҫɾ�������Ԫ�ؿ�ʼ �����ֵ�����ǰ�� ֱ���������һ��ֵ
        ��ΪҪɾ��һ��ѭ������������ԭ�������鳤�� Ҫ��һ��ɾȥ��
          */
        for (int i=position;i<size-1;i++){
            nums[i]=nums[i+1];
        }
        //���������Ĳ���Ҳ�����Ѿ�������ɾ����Ԫ�ظ���Ϊ0
        // ���Ұ�ɾ����Ԫ��Ҳ����0�ŵ���� ����Ҫ��ԭ���Ƚ��м�1  ���������ЧԪ�� ��� �������ں���
        size--;
    }
    //Ԫ�صĸ���
    public static void change(int position,String value){
        if (position<0||position>size) {
            System.out.println("��������������0~"+(size-1)+"������");
            return;
        }
            nums[position] = value;
    }


}