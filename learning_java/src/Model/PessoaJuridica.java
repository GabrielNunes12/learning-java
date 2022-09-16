package Model;

public class PessoaJuridica extends Pessoa{
  private int howManyPeople;
  public PessoaJuridica(String name, double annualPayment, double healthCare) {
    super(name, annualPayment, healthCare);
  }

  public PessoaJuridica(String name, double annualPayment) {
    super(name, annualPayment);
  }

  public PessoaJuridica(String name) {
    super(name);
  }
  public PessoaJuridica(String name, int howManyPeople) {
    super(name);
    this.howManyPeople = howManyPeople;
  }

  public int getHowManyPeople() {
    return howManyPeople;
  }

  @Override
  public double federalTaxes() {
    if(this.getHowManyPeople() >= 10) {
      return this.getAnnualPayment() * 0.14;
    }
    return this.getAnnualPayment() * 0.16;
  }
}
