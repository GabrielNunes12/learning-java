package Model;

public class PessoaFisica extends Pessoa{

  public PessoaFisica(String name, double annualPayment, double healthCare) {
    super(name, annualPayment, healthCare);
  }

  public PessoaFisica(String name, double annualPayment) {
    super(name, annualPayment);
  }

  public PessoaFisica(String name) {
    super(name);
  }

  @Override
  public double federalTaxes() {
    if(super.getAnnualPayment() < 20000) {
      return super.getAnnualPayment() / 0.15;
    } else if (super.getHealthCare() > 0 && super.getAnnualPayment() > 20000) {
      return (super.getAnnualPayment() * 0.25) - (super.getHealthCare() * 0.50);
    } else {
      return 0;
    }
  }
}
