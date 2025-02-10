package state;

import interfaces.AccountState;
import models.Account;

public class CloseState implements AccountState {
  @Override
  public void deposit(Account account, double amount) {
    System.out.println("You cannot deposit on a closed account!");
    System.out.println(account.toString());
  }

  @Override
  public void withdraw(Account account, double amount) {
    System.out.println("You cannot withdraw from a closed account!");
    System.out.println(account.toString());
  }

  @Override
  public void active(Account account) {
    System.out.println("You cannot activate a closed account!");
  }

  @Override
  public void suspend(Account account) {
    System.out.println("You cannot suspend a closed account!");
  }

  @Override
  public void close(Account account) {
    System.out.println("Account is already closed!");
  }
}
