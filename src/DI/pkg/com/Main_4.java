package DI.pkg.com;

interface Phone {
    public void loadBasicHardware(String serialNumber, String ram, String processor);

    public void loadOS(String osType);
}

class Samsung implements Phone {

    @Override
    public void loadBasicHardware(String serialNumber, String ram, String processor) {
        System.out.println("seriel number " + serialNumber + " ram : " + ram + " processor : " + processor);
    }


    @Override
    public void loadOS(String osType) {
        System.out.println("os type : " + osType);
    }
}

class Pixel implements Phone {

    @Override
    public void loadBasicHardware(String serialNumber, String ram, String processor) {
        System.out.println("seriel number " + serialNumber + " ram : " + ram + " processor : " + processor);

    }

    @Override
    public void loadOS(String osType) {
        System.out.println("os type : " + osType);

    }
}

class IPhone implements Phone {

    @Override
    public void loadBasicHardware(String serialNumber, String ram, String processor) {
        System.out.println("seriel number " + serialNumber + " ram : " + ram + " processor : " + processor);

    }

    @Override
    public void loadOS(String osType) {
        System.out.println("os type : " + osType);
    }
}

class PhonemnufactureService {
    Phone phone;

    public PhonemnufactureService(Phone ph) {
        this.phone = ph;
    }

    public void buildPhone(String serialNumber, String ram, String processor, String osType) {
        this.phone.loadBasicHardware(serialNumber, ram, processor);
        this.phone.loadOS(osType);
    }

}

public class Main_4 {
    public static void main(String[] args) {
        Phone s1 = new Samsung();
        PhonemnufactureService ph = new PhonemnufactureService(s1);
        ph.buildPhone("sam-001", "dddr-4", "snapdragon", "android");

        Phone p1 = new Pixel();
        PhonemnufactureService ph1 = new PhonemnufactureService(p1);
        ph1.buildPhone("pix-001", "dddr-4", "snapdragon", "android");

        Phone i1 = new IPhone();
        PhonemnufactureService ph2 = new PhonemnufactureService(i1);
        ph2.buildPhone("iph-001", "dddr-4", "snapdragon", "iphone");
    }
}
