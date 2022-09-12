package models;
//when extends some classes it means you'll use every behavior and methods from super class
public class BusinessAccount extends Account {
  private Double loanLimit;

  public BusinessAccount() {
    super();
  }

  public BusinessAccount(int number, String holder, Double balance, Double loanLimit) {
    super(number, holder, balance);
    this.loanLimit = loanLimit;
  }

  public Double getLoanLimit() {
    return loanLimit;
  }

  public void setLoanLimit(Double loanLimit) {
    this.loanLimit = loanLimit;
  }
  public void loan(double amount) {
    if(amount <= loanLimit) {
      balance += amount - 10.0;
    }
  }
}
