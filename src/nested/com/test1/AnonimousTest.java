package nested.com.test1;

class Person{

    void getData(){
        System.out.println("generic person");
    }
}
public class AnonimousTest {
    public static void main(String[] args) {

        Person p1 = new Person(){
            @Override
            void getData() {
//                super.getData();
                System.out.println("anonymous person");
            }

            void getParentData(){
                super.getData();
            }

        };

          p1.getData();
//          p1.getParentData(); work with change to var var p1 = new Person()

    }
}

