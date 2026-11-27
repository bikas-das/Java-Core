package interface2.diamond.pkg;

interface Car1{
    void drive();
}

interface ElectricCar1 extends Car1{

}

interface FuelCar1 extends Car1{

}

class BMWCar1 implements ElectricCar1, FuelCar1{

    @Override
    public void drive() {
        System.out.println("BMW's car engine....");
    }
}



public class Main_3 {
    public static void main(String[] args) {
   BMWCar1 car = new BMWCar1();
   car.drive();
    }
}
