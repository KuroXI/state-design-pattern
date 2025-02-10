package controller;

import interfaces.AccountState;
import state.ActiveState;

public class AccountController {
  private AccountState state;
//
  public AccountController() {
    state = new ActiveState();
  }

  public AccountState getState() {
    return this.state;
  }

  public void setState(AccountState state) {
    this.state = state;
  }
}
