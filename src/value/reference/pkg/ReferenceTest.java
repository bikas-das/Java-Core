package value.reference.pkg;


class NumberGame {
    public int x;
    public int y;

    public NumberGame(int x, int y) {
        this.x = x;
        this.y = y;
    }

}

public class ReferenceTest {
    public static void main(String[] args) {

        NumberGame num1 = new NumberGame(10, 20);
        System.out.println(num1.x);
        System.out.println(num1.y);
        changeNumberValues(num1);
        System.out.println("after ---------");
        System.out.println(num1.x);
        System.out.println(num1.y); // shallow copy...
        System.out.println("scenario-2 no deep copy yet...");

        NumberGame num2 = new NumberGame(100, 200);
        System.out.println(num2.x);
        System.out.println(num2.y);
        changeNumberValues(num2);
        System.out.println(num2.x);
        System.out.println(num2.y);

    }

    private static void changeNumberValues(NumberGame num){
           num.x = num.x + 10;
           num.y = num.y + 10;
    }
}
