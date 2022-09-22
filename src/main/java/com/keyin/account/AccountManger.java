package com.keyin.account;

import java.util.HashMap;

public class AccountManger {
    private HashMap<Integer, Account> accounts = new HashMap<Integer, Account>();

    public AccountManger() {
        Account account1 = new Account(1, 10);
        Account account2 = new Account(2, 100);

        this.saveAccount(account1);
        this.saveAccount(account2);
    }
    public Account getAccount(int id) {
        return accounts.get(id);
    }

    public void saveAccount(Account account) {
        accounts.put(account.getId(), account);
    }

    public void transferFunds(int fromAccountId, int toAccountId) {
        Account account1 = getAccount(fromAccountId);
        Account account2 = getAccount(toAccountId);

        account2.setAmount(account2.getAmount() + account1.getAmount());
    }

    public static void main(String[] args) {
        AccountManger accountManger = new AccountManger();

//        String accountId = args[0];


        accountManger.transferFunds(1, 2);

        System.out.println("Account Balance: " + accountManger.getAccount(2).getAmount());
    }
}
