import java.util.Scanner;
//����һ����calc����
public class calc {
    //�����������
    int java;
    int C;
    int DB;
    /*��ķ��� Ҳ����˵����Ĳ��� ����return�Ƿ���ֵ����˼
    ����Ҫ��java+C+Bd��� ������zong
    int����˼ ���ص�ֵ����������
     */
    public int zong(){
        return java+C+DB;
    }
    public double pingjun(){
        return (java+C+DB)/3.0;
    }
}
//�����Ը��µ���
class lianxi18{
    public static void main(String[] args) {
        //����¼��
        Scanner shuRu = new Scanner(System.in);
        //����calc��� ���� Ϊi Ȼ����i������
        calc i = new calc();
        System.out.print("������java�ɼ���");
        //����¼���ֵ���� calc���е� java�������
        i.java = shuRu.nextInt();
        System.out.print("������C�ɼ���");
        i.C = shuRu.nextInt();
        System.out.print("������DB�ɼ���");
        i.DB = shuRu.nextInt();
        /*�����ǰ� calc����� �е� ���з�ֵ�� zongֵ������
        ��� �෽�� ��Ҫ���� �������� ���������
         */
        System.out.println("�ܳɼ�:" + i.zong());
        System.out.println("ƽ���ɼ�:" + i.pingjun());
    }
}
