public class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    double credit(double sumCredit) {
        System.out.println("The current balance is -  " + balance);
        if (balance < sumCredit) {
            System.out.println("There is not enough money in the account");
        } else {
            balance = balance - sumCredit;
            System.out.println("Current balance after credit " + sumCredit + " is -  " + balance);
        }
        return balance;
    }

    double debit(double sumDebit) {
        System.out.println("The current balance is -  " + balance);
        if (sumDebit>0) {
            balance = balance + sumDebit;
            System.out.println("Current balance after debit " + sumDebit + " is -  " + balance);
        } else {
            System.out.println("Attention! You cannot put a negative sum");
            System.out.println("Current balance is -  " + balance);
        }
        return balance;
    }

}
