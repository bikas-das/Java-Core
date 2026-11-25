package nested.com.test1;


// effective final variable...in local class
class Outer2{
    void display(){
        int x = 10;
//        x++;  cant change its final implicitly by compiler
        class Local{
            void welcome(){
                System.out.println("welcome from local class");
                System.out.println(x);
            }
        }
        Local local = new Local();

        local.welcome();
    }
}

public class LocalTest {
    public static void main(String[] args) {
    Outer2 out = new Outer2();
    out.display();
    }
}
