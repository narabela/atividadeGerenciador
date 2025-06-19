package entities;

public class Account {

    private int accountNumber;
    private String accountHolder;
    private double saldo; //Balance

    public Account() {

    }

    public Account(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    
    public Account(int accountNumber, String accountHolder, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        deposit(initialDeposit);
  
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAccountNumber() {
        return accountNumber;
    }


    public void deposit(double amount) {
        if (amount > 0) {
            saldo += amount;
        } else {
            System.out.println("Invalid value! ");
        }
    }

    public void withdraw(double amount) {
        saldo -= amount;
        saldo -=5;
    }

    public String toString() {
        return "Account Number: " + getAccountNumber() + ", Account Holder: " + getAccountHolder() + ",  Balance: $" + getSaldo();
    }

}
