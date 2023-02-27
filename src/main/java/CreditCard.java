public class CreditCard extends BankCards implements ICharge {
    private double availableCredit;

    public CreditCard(double availableCredit, long cardNumber, String expiryDate, int securityNumber){
        super(cardNumber, expiryDate, securityNumber);
        this.availableCredit = availableCredit;

    }

    public double getAvailableCredit() {
        return availableCredit;
    }

    public double addTransactionCost(double chargeAmount) {
        double fee = chargeAmount * 0.02;
        return fee;
//        this.availableCredit -= this.availableCredit * 0.02;
    }

    public String logTransaction(double transaction) {
        return "Your transaction is " + transaction;
    }

    public void reduceAvailableCredit(double purchaseAmount){
        this.availableCredit -= purchaseAmount;
    }

    public void charge(double chargeAmount){
        double fee = addTransactionCost(chargeAmount);
        double purchaseAmount = (chargeAmount + fee);
        reduceAvailableCredit(purchaseAmount);
        logTransaction(purchaseAmount);
    }

    @Override
    public void pay(double purchaseAmount){
        reduceAvailableCredit(purchaseAmount);
    }
}
