package org.example;

public class BankAccount {

  // Constants
  private static final String INVALID_AMOUNT_MESSAGE = "Invalid amount.";
  private static final String INSUFFICIENT_FUNDS = "Insufficient funds.";
  private static final String NEW_BALANCE_AMOUNT = "Your new balance is: $";

  // Attribute (Global Variable)
  private Double balance;

  // Constructor
  public BankAccount() {
    balance = 0.0;
  }

  // Method
  private void printBalance () {
    System.out.println(NEW_BALANCE_AMOUNT + balance);
  }

  // Method
  public void sayHello(String accountOwner) {
    System.out.println("Welcome " + accountOwner);
  }

  // Method
  public void deposit(Double amount) {
    if (amount == null || amount <= 0) {
      System.out.println(INVALID_AMOUNT_MESSAGE);
    } else {
      System.out.println("Deposited: $" + amount);
      this.balance += amount; //Update the balance to the new amount
      printBalance();
    }
  }

  // Method
  public void withdraw(Double amount) {
    if (amount == null || this.balance <= 0 || amount == 0) {
      System.out.println(INSUFFICIENT_FUNDS);
    } else {
      System.out.println("Withdrew: $" + amount);
      this.balance -= amount;
      printBalance();
    }
  }
}