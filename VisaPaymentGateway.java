import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;

public class VisaPaymentGateway implements PaymentGateway {
    public void processPayment(PaymentInfo paymentInfo) {
        // Procesar el pago con la pasarela de pago de Visa
        double commission = paymentInfo.getAmount() * 0.05;
        double iva = commission * 0.12;
        double totalAmount = paymentInfo.getAmount() + commission + iva;

        // Formatear el archivo a XML
        String xmlData = "<Payment>\n" +
                "  <User>" + paymentInfo.getUser() + "</User>\n" +
                "  <ID>" + paymentInfo.getId() + "</ID>\n" +
                "  <Amount>" + formatCurrency(totalAmount) + "</Amount>\n" +
                "</Payment>";

        try {
            FileWriter fileWriter = new FileWriter("payment_visa.xml");
            fileWriter.write(xmlData);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        private String formatCurrency(double amount) {
        DecimalFormat df = new DecimalFormat("#.00");
        return df.format(amount);
    }
}
