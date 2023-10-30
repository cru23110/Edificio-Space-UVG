public class PaymentProcessor {
    private PaymentGateway paymentGateway;

    public PaymentProcessor(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void processPayment(PaymentInfo paymentInfo) {
        paymentGateway.processPayment(paymentInfo);
    }
}