package nested.com.test1;


interface Greeting {
    void sayHello();
}

public class Main_3 {

    public static void main(String[] args) {
        Greeting customGreeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello from an anonymous class!");
            }
        };
        customGreeting.sayHello();

    }
}
