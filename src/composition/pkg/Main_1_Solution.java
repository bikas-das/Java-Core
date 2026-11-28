package composition.pkg;

class Phone1 {
    int size;
    String ram;
    String processor;

    public Phone1() {

    }

    public Phone1(int size, String ram, String processor) {
        this.size = size;
        this.ram = ram;
        this.processor = processor;
    }

    public void loadBasicHardware() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Phone{" +
                "size=" + size +
                ", ram='" + ram + '\'' +
                ", processor='" + processor + '\'' +
                '}';
    }
}

class Andriod1 {

    public void loadAndroid() {
        System.out.println("load android os...");
    }
}

class PixelPhone1 {

    private Andriod1 andr;
    Phone1 ph1;

    public PixelPhone1(int size, String ram, String processor) {

        ph1 = new Phone1(size, ram, processor);
        this.andr = new Andriod1();

    }

    void getHarddwareStuff() {
        ph1.loadBasicHardware();
        andr.loadAndroid();
    }

}

class SamsungPhone1 {

    private Andriod1 andr;
    Phone1 ph1;


    public SamsungPhone1(int size, String ram, String processor) {
        ph1 = new Phone1(size, ram, processor);
        this.andr = new Andriod1();

    }

    void getHarddwareStuff() {
        ph1.loadBasicHardware();
        andr.loadAndroid();
    }

}


class Iphone1 {
    Phone1 ph1;

    public Iphone1(int size, String ram, String processor) {
        ph1 = new Phone1(size, ram, processor);
    }

    public void loadIOS() {
        ph1.loadBasicHardware();
        System.out.println("load ios for iphone.....");
    }
}

public class Main_1_Solution {
    public static void main(String[] args) {
        PixelPhone1 p1 = new PixelPhone1(5, "m123", "p123");
        p1.getHarddwareStuff();
        System.out.println("-----------------");
        SamsungPhone1 m1 = new SamsungPhone1(6, "m123", "p123");
        m1.getHarddwareStuff();
        System.out.println("-----------------");

        Iphone1 ip1 = new Iphone1(5,"ipx789", "mac561");
        ip1.loadIOS();

    }
}
