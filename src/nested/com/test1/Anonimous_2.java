package nested.com.test1;

public class Anonimous_2 {
    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("using runnable interface");
            }
        };
        r1.run();
    }
}
