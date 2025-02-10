package models;

import interfaces.AccountState;
import state.ActiveState;

public class Account {
  private final String accountNumber;
  private double balance;
  private AccountState accountState;

  public Account(String accountNumber, double balance) {
    this.accountNumber = accountNumber;
    this.balance = balance;
    this.accountState = new ActiveState();
  }

  public String getAccountNumber() {
    return this.accountNumber;
  }

  public double getBalance() {
    return balance;
  }

  public AccountState getAccountState() {
    return accountState;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public void setAccountState(AccountState accountState) {
    this.accountState = accountState;
  }

  public void deposit(double amount) {
    this.accountState.deposit(this, amount);
  }

  public void withdraw(double amount) {
    this.accountState.withdraw(this, amount);
  }

  public void activate() {
    this.accountState.active(this);
  }

  public void suspend() {
    this.accountState.suspend(this);
  }

  public void close() {
    this.accountState.close(this);
  }

  public String toString() {
    return "Account number: " + this.accountNumber + ", Balance: " + this.balance;
  }
}
