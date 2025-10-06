package it.unibo.encapsulation.interfaces;

public class TestSimpleBankAccount {

    private TestSimpleBankAccount() {
        /*
         * Prevents object creation from the outside.
         */
    }

    public static void main(final String[] args) {
        // 1) Creare l' AccountHolder relativo a Andrea Rossi con id 1
        AccountHolder andreaRossi = new AccountHolder("Andrea","Rossi",1);
        // 2) Creare l' AccountHolder relativo a Alex Bianchi con id 2
        AccountHolder alexBianchi = new AccountHolder("Alex","Bianchi",2);
        // 3) Creare i due SimpleBankAccount corrispondenti
        SimpleBankAccount sbaAndreaRossi = new SimpleBankAccount(1, 0);
        SimpleBankAccount sbaAlexBianchi = new SimpleBankAccount(2, 100);
        // 4) Effettuare una serie di depositi e prelievi
        sbaAndreaRossi.deposit(1, 25);
        sbaAlexBianchi.deposit(2, 73);
        sbaAlexBianchi.withdraw(2,17);
        /*
         * 5) Stampare a video l'ammontare dei due conti e verificare la
         * correttezza del risultato
         */
        System.out.println(sbaAndreaRossi.getBalance() + " " + sbaAndreaRossi.getTransactionsCount());
        System.out.println(sbaAlexBianchi.getBalance() + " " + sbaAlexBianchi.getTransactionsCount());
        // 6) Provare a prelevare fornendo un id utente sbagliato
        sbaAndreaRossi.withdraw(2,10);
        // 7) Controllare nuovamente l'ammontare
        System.out.println(sbaAndreaRossi.getBalance() + " " + sbaAndreaRossi.getTransactionsCount());
    }
}
