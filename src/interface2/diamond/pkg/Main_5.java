package interface2.diamond.pkg;

interface Phone{
    default void start(){
        System.out.println("start generic phone.....");
    }
}

interface SmartPhone extends Phone{
    @Override
    default void start() {
        System.out.println("starting smart phone....");
    }
}

class Tablet implements Phone {
    @Override
    public void start() {
        System.out.println("starting tablet....");
    }
}

class AllinOneDevice  extends Tablet implements Phone{
//    @Override
//    public void start() {
//        System.out.println("starting all in one device....");
//    }


}

public class Main_5 {
    public static void main(String[] args) {
      Phone p1 = new AllinOneDevice();
      p1.start(); // class has the highest priority than interface...

    }
}
