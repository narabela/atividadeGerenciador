package app;

import entities.Account;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Account account;

        Locale.setDefault(Locale.US);

        System.out.println("Enter account number:");
        int acNumber = in.nextInt();
        System.out.println("Enter account holder: ");
        in.nextLine();
        String acHolder = in.nextLine();

        System.out.println("Is there an initial deposit? y/n ");
        String option = in.next();
        if ("y".equals(option)) {
            System.out.println("Enter the initicial deposit value: ");
            double initialDeposit = in.nextDouble();
            account = new Account(acNumber, acHolder, initialDeposit);

        } else {
            account = new Account(acNumber, acHolder);
        }

        System.out.println("");
        System.out.println("Account data: " + account);
        System.out.println("");

        System.out.print("Enter a deposit value: ");
        double amount = in.nextDouble();
        account.deposit(amount);

        System.out.println("Update account data: " + account);

        System.out.print("Enter a withdraw value: ");
        amount = in.nextDouble();
        account.withdraw(amount);

        System.out.println("Update account data: " + account);

        in.close();

    }
}
