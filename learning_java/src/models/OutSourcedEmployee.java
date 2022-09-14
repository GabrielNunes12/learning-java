package models;

public class OutSourcedEmployee extends EmployeePoli{
  private double additionalCharge;
  public OutSourcedEmployee(String name, Integer hours, Double valuePerHours, double additionalCharge) {
    super(name, hours, valuePerHours);
    this.additionalCharge = additionalCharge;
  }
  public OutSourcedEmployee() {
    super();
  }
  @Override
  public double payment() {
    return super.payment() + additionalCharge * 1.1;
  }
}
