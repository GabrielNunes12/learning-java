package models;

public class EmployeePoli {
  private String name;
  private Integer hours;
  private Double valuePerHours;

  public EmployeePoli() {
  }

  public EmployeePoli(String name, Integer hours, Double valuePerHours) {
    this.name = name;
    this.hours = hours;
    this.valuePerHours = valuePerHours;
  }
  public double payment() {
    return this.valuePerHours * this.hours;
  }

  public String getName() {
    return name;
  }

  public Integer getHours() {
    return hours;
  }

  public Double getValuePerHours() {
    return valuePerHours;
  }
}
