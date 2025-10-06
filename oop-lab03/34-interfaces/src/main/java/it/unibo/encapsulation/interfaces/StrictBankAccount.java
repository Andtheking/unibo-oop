package it.unibo.encapsulation.interfaces;

public class StrictBankAccount implements BankAccount {
    private final int id;   
    double balance;
    int transactions;
    static double ATM_TRANSACTION_FEE = 5;

    public StrictBankAccount(final int id, final double balance) {
        this.id = id;
        this.balance = balance;
        this.transactions = 0;
    }

    public int getId() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }

    public int getTransactionsCount() {
        return this.transactions;
    }

    public void deposit(final int id, final double amount) {
        if (this.id != id) return;
        this.transactions++;
        this.balance += amount;
    }

    public void withdraw(final int id, final double amount) {
        if (this.id != id) return;
        if (this.balance < amount) return;
        this.transactions++;
        this.balance -= amount;
    }

    public void depositFromATM(final int id, final double amount) {
        if (this.id != id) return;
        deposit(id, amount);
        chargeManagementFees(id);
    }

    public void withdrawFromATM(final int id, final double amount) {
        if (this.id != id) return;
        withdraw(id, amount);
        chargeManagementFees(id);
    }

    public void chargeManagementFees(final int id) {
        /*
         * Riduce il bilancio del conto di un ammontare pari alle spese di gestione
         */
        if (this.id != id) return;
        this.balance -= ATM_TRANSACTION_FEE + (0.1 * this.transactions);
    }
}
