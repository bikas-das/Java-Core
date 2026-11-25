package interface2.diamond.pkg;

interface Car{
    void drive();
}

class ElectricCar implements Car{

    @Override
    public void drive() {
        System.out.println("electric car....");
    }
}

class FuelCar implements Car{

    @Override
    public void drive() {
        System.out.println("fuel car....");
    }
}

//class BMWCar extends ElectricCar, FuelCar{  multiple inheritence issues......
//
//}
public class Main_2 {
    public static void main(String[] args) {

    }
}
