import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GiftCardTest {
    GiftCard giftcard;

    @Before
    public void setUp() {
        giftcard = new GiftCard(200);
    }

    @Test
    public void canGetBalance(){
        assertEquals(200, giftcard.getBalance(), 00);
    }

    @Test
    public void canReduceBalance(){
        giftcard.reduceBalance(20);
        assertEquals(180, giftcard.getBalance(), 00);
    }

    @Test
    public void canCharge(){
        giftcard.charge(80);
        assertEquals(120, giftcard.getBalance(), 00);
    }

    @Test
    public void canPay(){
        giftcard.pay(50);
        assertEquals(150, giftcard.getBalance(), 00);
    }

}
