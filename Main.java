public class Main {
    public static void main(String[] args) {
        // Obtener la información del pago desde el archivo JSON
        PaymentInfo paymentInfo = new PaymentInfo("usuario123", 1, "public_key_123", 100.0, 3, 1234567812345678L, 1223, 123);

        PaymentGateway paymentGateway;
        String cardNumberStr = String.valueOf(paymentInfo.getCardNumber());
        if (cardNumberStr.startsWith("4")) {
            paymentGateway = new VisaPaymentGateway();
        } else {
            throw new IllegalArgumentException("Tarjeta no válida");
        }

        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentGateway);
        paymentProcessor.processPayment(paymentInfo);
    }
}
