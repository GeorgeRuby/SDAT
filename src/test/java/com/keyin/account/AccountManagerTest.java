package com.keyin.account;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccountManagerTest {

    @Test
    public void testAccountWithdrawel() {
        AccountManger accountManger = new AccountManger();

        Account account1 = new Account(1, 200);
        accountManger.saveAccount(account1);

        double accountBalance = 0;

        try {
            accountBalance = accountManger.withdrawFunds(1, 200);
        } catch (InsufficentFundsException e) {
            throw new RuntimeException(e);
        }

        Assertions.assertEquals(0, accountBalance);

        boolean exceptionThrown = false;

        try {
            accountBalance = accountManger.withdrawFunds(1, 100.00);
        } catch (InsufficentFundsException isfe) {
            exceptionThrown = true;
        }

       Assertions.assertTrue(exceptionThrown);
    }
}
