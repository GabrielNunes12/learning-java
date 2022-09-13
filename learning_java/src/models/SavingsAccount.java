package models;

public class SavingsAccount extends Account{
  private Double interestRate;
  private Double balance;

  public SavingsAccount() {
  }

  public SavingsAccount(int number, String holder, Double balance, Double interestRate) {
    super(number, holder, balance);
    this.interestRate = interestRate;
  }

  public Double getInterestRate() {
    return interestRate;
  }

  public void setInterestRate(Double interestRate) {
    this.interestRate = interestRate;
  }

  public void updateBalance() {
    this.balance += 10;
  }

  @Override
  public double withdraw(double amount) {
    return this.balance -= amount;
  }
}
