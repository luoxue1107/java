package My;

public class TestEncapsulate {
    //基本类型转包装类型
    public static void main ( String[] args ) {

        byte b=10;
        Byte b1=new Byte (b);
        System.out.println (b1 );
        int a=20;
        Byte b2=new Byte ( a );
       System.out.println (b2);
       Byte b3=m ( b2 );
        System.out.println (b3);
         double b4=b1.booleanValue ();
         System.out.println (b4);
    }
    public static Byte m(Object a){
        return null;
    }
        
}
class Byte{
    private final byte value;
    public Byte(byte value){
        this.value=value;
    }
    public Byte(int value){
        //int 类型强转为byte
        this.value=(byte) value;
    }
    public String toString(){
        //把byte类型的 转为字符串类型的
        return Integer.toString ( this.value );
    }
    public double booleanValue(){
        //把byte类型的转为别的数字类型；
        return (double) this.value;
    }

    public byte byteValue ( ) {
    }

