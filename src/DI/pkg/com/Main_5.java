package DI.pkg.com;

interface Phone1 {
    public void loadBasicHardware();
    public void loadOS(String osType);
}

class Samsung1 implements Phone1 {
    String modelNo;
    String ram;
    String cpu;

    public Samsung1(String modelNo, String ram, String cpu) {
        this.modelNo = modelNo;
        this.ram = ram;
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "Samsung1{" +
                "modelNo='" + modelNo + '\'' +
                ", ram='" + ram + '\'' +
                ", cpu='" + cpu + '\'' +
                '}';
    }

    @Override
    public void loadBasicHardware() {
        System.out.println(this.toString());
    }

    @Override
    public void loadOS(String osType) {
        System.out.println("loaded os :  " + osType);
    }
}

class Pixel1 implements Phone1 {
    String modelNo;
    String ram;
    String cpu;


    public Pixel1(String modelNo, String ram, String cpu) {
        this.modelNo = modelNo;
        this.ram = ram;
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "Pixel1{" +
                "modelNo='" + modelNo + '\'' +
                ", ram='" + ram + '\'' +
                ", cpu='" + cpu + '\'' +
                '}';
    }

    @Override
    public void loadBasicHardware() {
        System.out.println(this.toString());
    }

    @Override
    public void loadOS(String osType) {
        System.out.println("loaded os :  " + osType);

    }
}

class IPhone1 implements Phone1 {

    String modelNo;
    String ram;
    String cpu;

    public IPhone1(String modelNo, String ram, String cpu) {
        this.modelNo = modelNo;
        this.ram = ram;
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "IPhone1{" +
                "modelNo='" + modelNo + '\'' +
                ", ram='" + ram + '\'' +
                ", cpu='" + cpu + '\'' +
                '}';
    }

    @Override
    public void loadBasicHardware() {
        System.out.println(this.toString());
    }

    @Override
    public void loadOS(String osType) {
        System.out.println("loaded os :  " + osType);
    }
}

class PhoneManufacurer1 {
    Phone1 phone1;

    public PhoneManufacurer1(Phone1 ph1) {
        this.phone1 = ph1;

    }

    void makePhone(String osType) {
        this.phone1.loadBasicHardware();
        this.phone1.loadOS(osType);
    }
}

public class Main_5 {

    public static void main(String[] args) {

        Phone1 p1 = new Samsung1("sam-001", "ddr-1", "sam-processor");
        PhoneManufacurer1 man1 = new PhoneManufacurer1(p1);
        man1.makePhone("android");

        Phone1 p2 = new Pixel1("pix-001", "ddr-1", "pix-processor");
        PhoneManufacurer1 man2 = new PhoneManufacurer1(p2);
        man2.makePhone("android");


        Phone1 p3 = new IPhone1("iph-001", "ddr-1", "iph-processor");
        PhoneManufacurer1 man3 = new PhoneManufacurer1(p3);
        man3.makePhone("iphone");
    }


}
