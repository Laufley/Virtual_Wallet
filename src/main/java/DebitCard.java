public class DebitCard extends BankCards implements ICharge {
    private int accountNumber;
    private String sortCode;

    private double balance;

    public DebitCard(int accountNumber, String sortCode, double balance, long cardNumber, String expiryDate, int securityNumber){
        super(cardNumber, expiryDate, securityNumber);
        this.accountNumber = accountNumber;
        this.sortCode = sortCode;
        this.balance = balance;

    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getSortCode() {
        return sortCode;
    }

    public double getBalance(){
        return this.balance;
    }

    public void reduceAvailableBalance(double purchaseAmount){
        this.balance -= purchaseAmount;
    }

    public String logTransaction(double transaction) {
        return "Your transaction is " + transaction;
    }

    public void charge(double chargeAmount){
        double fee = addTransactionCost(chargeAmount);
        double purchaseAmount = (chargeAmount + fee);
        reduceAvailableBalance(purchaseAmount);
        logTransaction(purchaseAmount);
    }

    public double addTransactionCost(double purchaseAmount) {
        double fee = 0.00;
        return purchaseAmount * fee;
    }

    @Override
    public void pay(double purchaseAmount){
        reduceAvailableBalance(purchaseAmount);
    }
}
