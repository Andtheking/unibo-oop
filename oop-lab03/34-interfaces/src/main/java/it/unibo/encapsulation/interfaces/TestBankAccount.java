package it.unibo.encapsulation.interfaces;

public class TestBankAccount {

    private TestBankAccount() {
    }

    public static void main(final String[] args) {
        /*
         * 1) Creare l' AccountHolder relativo a Andrea Rossi con id 1
         */
        AccountHolder andreaRossi = new AccountHolder("Andrea", "Rossi",1);
        /*
         * 2) Creare l' AccountHolder relativo a Alex Bianchi con id 2
         */
        AccountHolder alexBianchi = new AccountHolder("Alex", "Bianchi",2);
        /*
         * 3) Dichiarare due variabili di tipo BankAccount ed inizializzarle,
         * rispettivamente, con oggetti di tipo SimpleBankAccount per il conto di
         * Rossi (ammontare iniziale = 0), e di tipo StrictBankAccount per il conto di
         * Bianchi (ammontare iniziale = 0)
         */
        BankAccount baAndrea = new SimpleBankAccount(1, 0);
        BankAccount baAlex = new StrictBankAccount(2,0);
        /*
         * 4) Prima riflessione: perché è stato possibile fare la new di due classi
         * diverse in variabili dello stesso tipo?
         */
        // Perché entrambe le classi implementano l'interfaccia, possono quindi essere generalizzate
        /*
         * 5) Depositare €10000 in entrambi i conti
         */
        baAndrea.deposit(1,10000);
        baAlex.deposit(2,10000);
        /*
         * 6) Prelevare €15000$ da entrambi i conti
         */
        baAndrea.withdraw(1,15000);
        baAlex.withdraw(2,15000);
        /*
         * 7) Stampare in stdout l'ammontare corrente
         */
        System.out.println(baAndrea.getBalance());
        System.out.println(baAlex.getBalance());
        /*
         * 8) Qual è il risultato e perché?
         */
        // Il risultato sarà probabilmente -5000 per Andrea e 10000 per Alex perché il primo è quello semplice senza vincoli e tasse e il secondo è quello strict
        /*
         * 9) Depositare nuovamente €10000 in entrambi i conti
         */
        baAndrea.deposit(1,10000);
        baAlex.deposit(2,10000);
        /*
         * 10) Invocare il metodo chargeManagementFees su entrambi i conti
         */
        baAndrea.chargeManagementFees(1);
        baAlex.chargeManagementFees(2);
        /*
         * 11) Stampare a video l'ammontare corrente
         */
        System.out.println(baAndrea.getBalance());
        System.out.println(baAlex.getBalance());
        /*
         * 12) Qual è il risultato e perché?
         */
        // Il risultato sarà probabilmente 5000 per Andrea e 20000-5-0.2 = 19994.8
    }
}
