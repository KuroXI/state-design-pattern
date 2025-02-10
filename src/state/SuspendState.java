package state;

import interfaces.AccountState;
import models.Account;

public class SuspendState implements AccountState {
  @Override
  public void deposit(Account account, double amount) {
    System.out.println("You cannot deposit on a suspended account!");
    System.out.println(account.toString());
  }

  @Override
  public void withdraw(Account account, double amount) {
    System.out.println("You cannot withdraw from a suspended account!");
    System.out.println(account.toString());
  }

  @Override
  public void active(Account account) {
    System.out.println("Account is activated!");
    account.setAccountState(new ActiveState());
  }

  @Override
  public void suspend(Account account) {
    System.out.println("Account is already suspended!");
  }

  @Override
  public void close(Account account) {
    System.out.println("Account is closed!");
    account.setAccountState(new CloseState());
  }
}
