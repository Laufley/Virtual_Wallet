import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class WalletTest {

    CreditCard creditCard;
    DebitCard debitCard;
    GiftCard giftCard;
    Wallet wallet;

    @Before
    public void setUp(){
         creditCard = new CreditCard(500, 1409481248901L,"12/07/2028", 890);
         debitCard = new DebitCard(671856, "83-76-82",500, 887766798877722L, "12/05/2025", 799);
         giftCard = new GiftCard(200);
         wallet = new Wallet();
    }

    @Test
    public void canAddIChargeable() {
        wallet.addChargeable(creditCard);
        ArrayList<ICharge> expectedChargeables = new ArrayList<>();
        expectedChargeables.add(creditCard);
        assertEquals(expectedChargeables, wallet.getChargeables());
    }

    @Test
    public void canSelectChargeable() {
        wallet.addChargeable(creditCard);
        wallet.addChargeable(debitCard);
        wallet.selectChargeable(debitCard);
        assertEquals(debitCard, wallet.getSelectedChargeable());
    }

    @Test
    public void testPay() {
        giftCard.setBalance(100);
        giftCard.getBalance();
        wallet.addChargeable(giftCard);
        wallet.selectChargeable(giftCard);
        wallet.pay(50);
        assertEquals(50, giftCard.getBalance(), 0.00);
    }

}
