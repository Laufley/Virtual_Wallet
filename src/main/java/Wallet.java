import java.util.ArrayList;

public class Wallet {

    private ArrayList<ICharge> chargeables;
    private ICharge selectedChargeable;


    public Wallet(){
        this.chargeables = new ArrayList<>();
        this.selectedChargeable = selectedChargeable;  //do I need this? I don't think i should add it to the constructor properties but I need the variable for the methods...
    }

    public ArrayList<ICharge> getChargeables() {
        return chargeables;
    }

    //Add new Ichargeable to the collection:
    public void addChargeable(ICharge chargeable) {
        chargeables.add(chargeable);
    }

    public void selectChargeable(ICharge selectectedChargeable) {
        selectedChargeable = selectectedChargeable;
    }

    public ICharge getSelectedChargeable (){
        return this.selectedChargeable;
    }



    //ability to pay with selected Ichargeable:
    public void pay(double price){
        selectedChargeable.charge(price);
    }
    //This method allows the user to decide which payment method to use (credit, debit, gift)
    //polymorphism, each children will implement its pay method but they will have the same signature.
}
