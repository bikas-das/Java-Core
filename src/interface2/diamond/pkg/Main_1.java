package interface2.diamond.pkg;

interface Payment {
    void pay();
}

class StripePayment implements Payment {

    @Override
    public void pay() {
        System.out.println("payment via stripe....");
    }
}

class PaypalPayment implements Payment {

    StripePayment payRef;
    @Override
    public void pay() {
        System.out.println("payment via paypal....");

    }
}

public class Main_1 {
    public static void main(String[] args) {

        Payment p1 = new StripePayment();
        p1.pay();

        Payment p2 = new PaypalPayment();
        p2.pay();

    }
}
