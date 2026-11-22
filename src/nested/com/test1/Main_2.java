package nested.com.test1;


class Person1{
    private String userName = "jay";

    void details(){
        System.out.println(userName);
    }

    class Person2{

        void getDetals(){
            details();
            System.out.println(userName);
        }
    }
}

public class Main_2 {
    public static void main(String[] args) {

        Person1 p1 = new Person1();
        Person1.Person2 p2 = p1.new Person2();
        p2.getDetals();
    }
}
