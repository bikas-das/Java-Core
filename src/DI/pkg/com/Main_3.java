package DI.pkg.com;


interface PaymentGateway {
    boolean pay(double amount, String token);
}

class StripePayment implements PaymentGateway {

    @Override
    public boolean pay(double amount, String token) {
        System.out.println("Charging $" + amount + " via Stripe API using token: " + token);
        return true;
    }
}

class FakePayment implements PaymentGateway {

    @Override
    public boolean pay(double amount, String token) {
        System.out.println("[TEST MODE] Simulating $" + amount + " charge via " + token + ".No real money moved.");
        return true;
    }
}

class PaypalPayment implements PaymentGateway{

    @Override
    public boolean pay(double amount, String token) {
        System.out.println("Charging $" + amount + " via Paypal API using token: " + token);
        return true;
    }
}

class OrderService {
    private final PaymentGateway paymentGateway;

    public OrderService(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void checkout(double amount, String token) {
        System.out.println("checking out....");
        var success = paymentGateway.pay(amount, token);
        if (success) {
            System.out.println("order confirmed.");
        }
    }
}

public class Main_3 {
    public static void main(String[] args) {

        PaymentGateway stripe = new StripePayment();
        OrderService orderService = new OrderService(stripe);
        orderService.checkout(99.99, "tok_345");

        PaymentGateway fake = new FakePayment();
        OrderService orderService1 = new OrderService(fake);
        orderService1.checkout(99.99, "tok_909");

        PaymentGateway paypal = new PaypalPayment();
        OrderService orderService2 = new OrderService(paypal);
        orderService2.checkout(90.12, "#101");


    }
}
