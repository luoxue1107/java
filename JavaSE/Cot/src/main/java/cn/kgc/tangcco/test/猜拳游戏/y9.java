import java.util.Scanner;


public class y9{
	public static void main(String[]args){
	Scanner input=new Scanner(System.in);
	int cCount=0;
	int pCount=0;
	System.out.println("-------------------猜拳游戏--------------------------------");
	for(int i=1;;){
	System.out.print("请输入你的名字：");
	String pName=input.next();
	System.out.println("电脑人物：（1.曹操 2.刘备 3.张飞）");
	int f=input.nextInt();
	if(f==1){
		String cName="曹操";
	}else if(f==2){
		String cName="刘备";
	}else if(f==3){
		String cName="张飞";
	}
		int computer =((int)(Math.random()*10)%3+1);
			System.out.println("请输入猜拳的编号（1.剪刀2.石头3.布）");
		int piayer =input.nextInt();
		if(computer==piayer){
			System.out.println("平局");
			continue;
		}else if((piayer==1&&computer==3)||(piayer==2&&computer==1)||(piayer==3&&computer==2)){
			System.out.println("恭喜你赢了");
			pCount++;
		}else{
			System.out.println("遗憾你输了");
			cCount++;
			}
			if(cCount==2){
				
				break;
			}else if(pCount==2){
				
				break;
			}
			System.out.println(cName+"输了\n"+pName+"赢了");
			System.out.println(pName+"赢了\n"+cName+"输了");
			i++;
		}
	}
}