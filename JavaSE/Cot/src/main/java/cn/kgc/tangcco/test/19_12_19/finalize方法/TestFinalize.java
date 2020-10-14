package My;

public class TestFinalize {
    public static void main ( String[] args ) throws Throwable {
        Object o = new Object ();
        o = null;
        System.gc ();
    }
}

class S1 {
    public void finalize ( ) throws Throwable {
        S2.o = this;
        System.out.println ( "回收" );
        super.finalize ();
    }
}

class S2 {
    public static S1 o;
}