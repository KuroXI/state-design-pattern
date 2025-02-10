package state;

import interfaces.AccountState;
import models.Account;

public class ActiveState implements AccountState {
  @Override
  public void deposit(Account account, double amount) {
    account.setBalance(account.getBalance() + amount);
    System.out.println("Deposited: " + amount);
    System.out.println(account.toString());
  }

  @Override
  public void withdraw(Account account, double amount) {
    account.setBalance(account.getBalance() - amount);
    System.out.println("Withdrew: " + amount);
    System.out.println(account.toString());
  }

  @Override
  public void active(Account account) {
    System.out.println("Account is already activated!");
  }

  @Override
  public void suspend(Account account) {
    System.out.println("Account is suspended!");
    account.setAccountState(new SuspendState());
  }

  @Override
  public void close(Account account) {
    System.out.println("Account is closed!");
    account.setAccountState(new CloseState());
  }
}
