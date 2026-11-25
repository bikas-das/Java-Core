package interface2.diamond.pkg;


interface TestI {
    static final String PI = "3.14";


    default void callGetData() {
        System.out.println("inside default...");
        getDta();
        getData2();
    }

    static void callStaticOnly() {
        getData2();
    }

    private void getDta() {
        System.out.println("hello, from private method...");
    }

    private static void getData2() {
        System.out.println("hello, from private static method...");
    }

}

class AnotherTest implements TestI{

    @Override
    public void callGetData() {
        System.out.println("inside child class.....");
        TestI.super.callGetData();
    }
}


public class Main_Test {
    public static void main(String[] args) {
        System.out.println(TestI.PI);
        TestI.callStaticOnly();
        TestI test = new AnotherTest();
        test.callGetData();
    }
}
