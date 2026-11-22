package value.reference.pkg;

// pass bby value
public class Main_1 {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("a: " + a);
        System.out.println("a: " + b);
        add(a,b);
        System.out.println("a: " + a );
        System.out.println("a: " + b );
    }

    private static void add(int a, int b){
        a = a + 10;
        b = b + 10;
    }
}
