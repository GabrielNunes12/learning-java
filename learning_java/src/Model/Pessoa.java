package Model;

public abstract class Pessoa {
  private String name;
  private double annualPayment;
  private double healthCare;

  public Pessoa(String name, double annualPayment, double healthCare) {
    this.name = name;
    this.annualPayment = annualPayment;
    this.healthCare = healthCare;
  }

  public Pessoa(String name, double annualPayment) {
    this.name = name;
    this.annualPayment = annualPayment;
  }

  public Pessoa(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getAnnualPayment() {
    return annualPayment;
  }

  public void setAnnualPayment(double annualPayment) {
    this.annualPayment = annualPayment;
  }

  public double getHealthCare() {
    return healthCare;
  }

  public void setHealthCare(double healthCare) {
    this.healthCare = healthCare;
  }

  public abstract double federalTaxes();
}
