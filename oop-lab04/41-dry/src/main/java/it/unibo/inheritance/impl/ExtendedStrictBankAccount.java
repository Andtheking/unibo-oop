package it.unibo.inheritance.impl;

public class ExtendedStrictBankAccount extends SimpleBankAccount {
    private static final double TRANSACTION_FEE = 0.1;

    public ExtendedStrictBankAccount(int id, double balance) {
        super(id, balance);
    }

    @Override
    public void chargeManagementFees(int id) {
        final double feeAmount = SimpleBankAccount.MANAGEMENT_FEE + super.getTransactionsCount() * ExtendedStrictBankAccount.TRANSACTION_FEE;        if (super.checkUser(id) && isWithdrawAllowed(feeAmount)) {
            super.setBalance(super.getBalance() - feeAmount);
            super.resetTransactions();
        }  
    }

    @Override
    public void withdraw(int id, double amount) {
        if (isWithdrawAllowed(amount)) {
            super.withdraw(id, amount);
        }
    }

    private boolean isWithdrawAllowed(final double amount) {
        return super.getBalance() >= amount;
    }

}
