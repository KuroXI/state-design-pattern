package interfaces;

import models.Account;

public interface AccountState {
  void deposit(Account account, double amount);
  void withdraw(Account account, double amount);
  void active(Account account);
  void suspend(Account account);
  void close(Account account);
}
