public class PaymentInfo {
    private String user;
    private int id;
    private String publicKey;
    private double amount;
    private int installments;
    private long cardNumber;
    private int expirationDate;
    private int cvv;
    private String hashMd5;

    public PaymentInfo(String user, int id, String publicKey, double amount, int installments, long cardNumber, int expirationDate, int cvv) {
        this.user = user;
        this.id = id;
        this.publicKey = publicKey;
        this.amount = amount;
        this.installments = installments;
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }

    public String getUser() {
        return user;
    }

    public int getId() {
        return id;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public double getAmount() {
        return amount;
    }

    public int getInstallments() {
        return installments;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public int getExpirationDate() {
        return expirationDate;
    }

    public int getCvv() {
        return cvv;
    }

    public String getHashMd5() {
        return hashMd5;
    }

    public void setHashMd5(String hashMd5) {
        this.hashMd5 = hashMd5;
    }

    public String toJson() {
        // convertir a formato JSON
        return ""; // complemento despues
    }

    public String toCsv() {
        // onvertir a formato CSV
        return ""; // complemento despues
    }
}
