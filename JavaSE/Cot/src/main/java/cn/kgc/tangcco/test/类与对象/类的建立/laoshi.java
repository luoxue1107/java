package drill;

public class laoshi {
    //����
    String xingshi;
    String jiaoshou;
    int jiaoling;
    //����
    public void shouke(){
        System.out.println("����ʦ");
        System.out.println("�ҽ�"+xingshi);
        System.out.println("�ڿ�"+jiaoshou);
        System.out.println("����"+jiaoling);

    }
}
class ys{
    public static void main(String[] args) {
        //������ʦ�ഴ��һ������
        laoshi i=new laoshi();
        i.xingshi="��ʦ";
        i.jiaoshou= "java";
        i.jiaoling=10;

        i.shouke();
    }
}
