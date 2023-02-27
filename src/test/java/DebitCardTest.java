import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DebitCardTest {
    DebitCard debitCard;

    @Before
    public void before(){
        debitCard = new DebitCard(671856, "83-76-82",500, 887766798877722L, "12/05/2025", 799);
    }

    @Test
    public void doesntAddTransactionCost(){
        assertEquals(0, debitCard.addTransactionCost(100),0.0);
    }

    @Test
    public void canLogTransactions(){
        debitCard.charge(100);
        assertEquals("Your transaction is 100.0", debitCard.logTransaction(100));
    }

    @Test
    public void canReduceAvailableBalance(){
        debitCard.charge(100);
        assertEquals(400, debitCard.getBalance(), 0.0);
    }

    @Test
    public void canPay(){
        debitCard.pay(50);
        assertEquals(450, debitCard.getBalance(), 00);
    }
}
