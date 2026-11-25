package equality.com.pkg;

public class Main_1 {
    public static void main(String[] args) {
        Integer a1 = 200;
        Integer a2 = 200;
        System.out.println("o/p -> 1 : " + (a1 == a2));

        Integer b1 = Integer.valueOf(100);
        Integer b2 = Integer.valueOf(100);
        System.out.println("o/p -> 2 : " + (b1 == b2)); // because of cached innt value -126 to 127

        Integer c1 = Integer.valueOf(200);
        Integer c2 = Integer.valueOf(200);
        System.out.println("o/p -> 3 : " + (c1 == c2));

        System.out.println("o/p -> 4 : " + (c1.equals(c2))); // returns c1.intValue() and same for c2...
        System.out.println("______________________________________________");

        String s1 = "bikash";
        String s2 = "bikash";
        System.out.println("o/p -> 5 : " + (s1 == s2)); // compares the address and belongs to same address return true

        String s3 = new String("bikash");
        String s4 = new String("bikash");
        System.out.println("o/p -> 6 : " + (s3 == s4)); // compares address and find different return false
        System.out.println("o/p -> 7 : " + (s1.equals(s2))); // here value comparison happens ... not address o/p -- true

        String literal = "Java";
        String dynamic = new String("Java");
        String literal2 = dynamic.intern();  // calling intern() fetches same value from pool points to same address
        System.out.println("o/p -> 8 : " + (literal == literal2)); // both points to string pool
        System.out.println("o/p -> 9 : " + (dynamic == literal2));

        String strLiteral = "hello";
        String strDynamic = new String("hello");

        System.out.println("o/p -> 10 : " + (strLiteral == strDynamic));          // false (pool vs. general heap)
        System.out.println("o/p -> 11 : " + (strLiteral == dynamic.intern()));  // true (both access the exact same StringTable entry)
        System.out.println("o/p -> 12 : " + (strLiteral == literal.intern())); // true

        System.out.println("o/p -> 13 : " + (strLiteral.equals(strDynamic)));

        System.out.println("o/p -> 14 : " + (strLiteral.intern().equals(strDynamic)));

        String t1 = new String("test");
        String t2 = new String("test");

        System.out.println("o/p -> 15 : " + (t1 == t2.intern())); // nothing is creasted on the pool yet...
    }
}
