import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BankAccountTest {
    BankAccount bankAccount;

    @Before
    public void init(){
       bankAccount = new BankAccount("11111", 1000);
    }
    @Test
    public void checkDebitRegular(){
        double expectRegularSum = 1500;
        double actualRegularSum = bankAccount.debit(500);
        Assert.assertEquals("Debit Regular Sum", expectRegularSum, actualRegularSum, expectRegularSum-actualRegularSum);

        double expectZeroSum = 1500;
        double actualZeroSum = bankAccount.debit(0);
        Assert.assertEquals("Debit Zero Sum", expectZeroSum, actualZeroSum, expectZeroSum - actualZeroSum);

        double expectNegativeSum = 1500;
        double actualNegativeSum = bankAccount.debit(-500);
        Assert.assertEquals("Debit Negative Sum", expectNegativeSum, actualNegativeSum, expectNegativeSum-actualNegativeSum);
    }

    @Test
    public void checkCreditOperation(){
        double expectLessBalanceSum = 500;
        double actualLessBalanceSum = bankAccount.credit(500);
        Assert.assertEquals("Credit LessBalance Sum", expectLessBalanceSum, actualLessBalanceSum, expectLessBalanceSum-actualLessBalanceSum);

        double expectMoreBalanceSum = 500;
        double actualMoreBalanceSum = bankAccount.credit(10000);
        Assert.assertEquals("Credit MoreBalance Sum", expectMoreBalanceSum, actualMoreBalanceSum, expectMoreBalanceSum-actualMoreBalanceSum);



    }

}
