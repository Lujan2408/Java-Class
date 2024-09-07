package org.example;

public class Main {

  public static void main(String[] args) {

    BankAccount bankAccount = new BankAccount();

    bankAccount.sayHello("Jose");
    bankAccount.deposit(100.00);
    bankAccount.withdraw(20.000);
    bankAccount.withdraw(40.000);
    bankAccount.withdraw(40.000);
    bankAccount.withdraw(10.000);

  }
}