import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String acNum = "2961926";
        double sb = setBalance();

        BankAccount myBA = new BankAccount(acNum, sb);
        myBA.debit(-1000);
        myBA.credit(50);
        myBA.credit(10000);

    }

    public static double setBalance() {

        Random rn = new Random();
        double bal = rn.nextInt(10000);
        System.out.println("You current balance is - " + bal);
        return bal;

    }

}
