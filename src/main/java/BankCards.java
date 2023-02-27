public abstract class BankCards extends Wallet {
    private long cardNumber;
    private String expiryDate;
    private int securityNumber;


    public BankCards(long cardNumber, String expiryDate, int securityNumber){
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.securityNumber = securityNumber;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public int getSecurityNumber() {
        return securityNumber;
    }

//    public abstract  makeTransaction();
}
