public class GiftCard extends Wallet implements ICharge{
    private double balance;
    public GiftCard(double balance){

        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void reduceBalance(double purchaseAmount){
        balance -= purchaseAmount;
    }

    public double addTransactionCost(double purchaseAmount) {
        double fee = 0.00;
        return purchaseAmount * fee;
    }

    public void charge(double chargeAmount){
        if (balance > chargeAmount){
            balance -= chargeAmount;
        }
    }

    @Override
    public void pay(double purchaseAmount){
        reduceBalance(purchaseAmount);
    }

    public void setBalance(int newBalance) {
        this.balance = newBalance;
    }
}
