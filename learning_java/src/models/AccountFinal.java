package models;
// prevent to extend this class
public final class AccountFinal {
  private int number;
  private String holder;
  // only extended classes and from the same package can listen to this protected variable
  protected Double balance;
  public AccountFinal() {
  }

  public AccountFinal(int number, String holder, Double balance) {
    this.number = number;
    this.holder = holder;
    this.balance = balance;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public String getHolder() {
    return holder;
  }

  public void setHolder(String holder) {
    this.holder = holder;
  }

  public Double getBalance() {
    return balance;
  }

  public void setBalance(Double balance) {
    this.balance = balance;
  }
  //prevent to override a method
  public final double deposit(double amount) {
    return this.balance += amount;
  }
  public double withdraw(double amount) {
    return this.balance -= amount + 5.0;
  }
}
