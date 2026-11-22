package nested.com.test1;

class Computer{
    static private String modelName = "lenovo";
    private int price;

    static void dispalay(){
        System.out.println("model name : " + modelName
        );
    }

    static class Cpu{

        void getData(){
            System.out.println("accessing variable : " + modelName);
            dispalay();
        }

    }

}
public class Main {
    public static void main(String[] args) {
        Computer.Cpu c1 = new Computer.Cpu();
        c1.getData();

    }
}
