package interface2.diamond.pkg;

interface Car2{
    default void drive(){
        System.out.println("generic car...");
    }
}

interface ElectricCar2 extends Car2{
    @Override
    default void drive() {
        System.out.println("electric car...");
    }
}

interface FuelCar2 extends Car2{
    @Override
    default void drive() {
        System.out.println("fuel car...");
    }
}

class BMWCar2 implements ElectricCar2, FuelCar2{
    @Override
    public void drive() {
     ElectricCar2.super.drive();
     FuelCar2.super.drive();
    }
}
public class Main_4 {
    public static void main(String[] args) {
       Car2 car = new BMWCar2();
       car.drive();
    }
}
