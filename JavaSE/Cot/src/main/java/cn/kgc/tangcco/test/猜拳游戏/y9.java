import java.util.Scanner;


public class y9{
	public static void main(String[]args){
	Scanner input=new Scanner(System.in);
	int cCount=0;
	int pCount=0;
	System.out.println("-------------------��ȭ��Ϸ--------------------------------");
	for(int i=1;;){
	System.out.print("������������֣�");
	String pName=input.next();
	System.out.println("���������1.�ܲ� 2.���� 3.�ŷɣ�");
	int f=input.nextInt();
	if(f==1){
		String cName="�ܲ�";
	}else if(f==2){
		String cName="����";
	}else if(f==3){
		String cName="�ŷ�";
	}
		int computer =((int)(Math.random()*10)%3+1);
			System.out.println("�������ȭ�ı�ţ�1.����2.ʯͷ3.����");
		int piayer =input.nextInt();
		if(computer==piayer){
			System.out.println("ƽ��");
			continue;
		}else if((piayer==1&&computer==3)||(piayer==2&&computer==1)||(piayer==3&&computer==2)){
			System.out.println("��ϲ��Ӯ��");
			pCount++;
		}else{
			System.out.println("�ź�������");
			cCount++;
			}
			if(cCount==2){
				
				break;
			}else if(pCount==2){
				
				break;
			}
			System.out.println(cName+"����\n"+pName+"Ӯ��");
			System.out.println(pName+"Ӯ��\n"+cName+"����");
			i++;
		}
	}
}