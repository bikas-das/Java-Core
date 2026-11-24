package value.reference.pkg;



public class Main_3 {
    public static void main(String[] args) {

        int a1 = 10;
        int b1 = 10;
        System.out.println(a1 == b1);
        Integer a2 = 100;
        Integer b2 = 100;
        System.out.println(a2 == b2);

        Integer a3 = 200;
        Integer b3 = 200;
        System.out.println(a3 == b3);

//        Integer a5 = new Integer(10); depricated

        Integer a5 = Integer.valueOf(100);
        Integer b5 = Integer.valueOf(100);
        System.out.println(a5 == b5);

        Integer a6 = Integer.valueOf(128);
        Integer b6 = Integer.valueOf(128);
        System.out.println(a6 == b6);
        System.out.println(a6.equals(b6));
        System.out.println("intValue: " + (a6.intValue() == b6.intValue()));



    }
}
