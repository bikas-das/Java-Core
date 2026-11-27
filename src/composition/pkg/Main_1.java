package composition.pkg;


abstract class Phone{
     int size;
     String ram;
     String processor;

    public Phone(){

    }

    public Phone(int size, String ram, String processor) {
        this.size = size;
        this.ram = ram;
        this.processor = processor;
    }

    public void loadBasicHardware(){
        System.out.println(this.toString());
    }

    abstract void loadAndroidOS();

    @Override
    public String toString() {
        return "Phone{" +
                "size=" + size +
                ", ram='" + ram + '\'' +
                ", processor='" + processor + '\'' +
                '}';
    }
}

class PixelPhone extends Phone{

    public PixelPhone(int size, String ram, String proessor){
        super(size, ram, proessor);
    }

    void getHarddwareStuff(){
        loadBasicHardware();
    }
    @Override
    void loadAndroidOS() {
        System.out.println("load android for pixel...");
    }
}

class SamsungPhone extends Phone{

    public SamsungPhone(int size, String ram, String proessor){
        super(size, ram, proessor);
    }

    void getHarddwareStuff(){
        loadBasicHardware();
    }

    @Override
    void loadAndroidOS() {
        System.out.println("load android for samsung...");
    }
}

// this is the problem in inheritence.. ways to solve go  and change in parent class which will
// have impact in inherited child class...
// solution would be composition to resolve this type of issues.....

class Iphone extends Phone{

    @Override
    void loadAndroidOS() {

    }

    public  void loadIOS(){
        System.out.println("load ios for iphone.....");
    }
}
public class Main_1 {
    public static void main(String[] args) {

        PixelPhone p1 = new PixelPhone(6, "m123","p123");
        p1.loadBasicHardware();
        p1.loadAndroidOS();
        System.out.println("-----------------");
        SamsungPhone m1 = new SamsungPhone(7, "m123","p123");
        m1.loadBasicHardware();
        m1.loadAndroidOS();
    }
}
