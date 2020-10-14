package My;

import java.util.HashSet;

public class TestHashSet {
    public static void main ( String[] args ) {
        HashSet<String> strings=new HashSet<> (  );
        strings.add ( "a" );
        strings.add ( "b" );
        strings.add ( "c" );
        strings.add ( "d" );
        strings.add ( "e" );
        System.out.println (strings.size ());
        System.out.println (strings.toString ());

        for (String a:strings){
            System.out.println (a);
        }
    }
}
