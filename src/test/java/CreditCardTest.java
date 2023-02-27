import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreditCardTest {
    CreditCard creditCard;

    @Before
    public void before(){
        creditCard = new CreditCard(500, 1409481248901L,"12/07/2028", 890);
    }

    @Test
    public void canAddPercentageToTransaction(){
        assertEquals(2, creditCard.addTransactionCost(100), 0.0);
    }

    @Test
    public void canLogTransactions(){
        creditCard.charge(100);
        assertEquals("Your transaction is 100.0", creditCard.logTransaction(100));
    }

    @Test
    public void canReduceAvailableCredit(){
        creditCard.charge(100);
        assertEquals(398, creditCard.getAvailableCredit(), 0.0);
    }

    @Test
    public void canPay(){
        creditCard.pay(50);
        assertEquals(450, creditCard.getAvailableCredit(), 00);
    }
}
