package models;

import enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
  private String name;
  private WorkerLevel level;
  private Double baseSalary;
  private Department department;

  private List<HourContract> hourContract = new ArrayList<>();

  public List<HourContract> getHourContract() {
    return hourContract;
  }

  public void setHourContract(List<HourContract> hourContract) {
    this.hourContract = hourContract;
  }

  public void addContract(HourContract contract) {

  }

  public void removeContract(HourContract contract) {

  }

  public Double income(Integer year, Integer month) {
    Double sum = baseSalary;
    Calendar calendar = Calendar.getInstance();
    for(HourContract contract : hourContract) {
      calendar.setTime(contract.getDate());
      int calendar_year = calendar.get(Calendar.YEAR);
      int calendar_month = calendar.get(Calendar.MONTH);
      if(year == calendar_year && month == calendar_month) {
        sum += contract.totalValue();
      }
    }
    return sum;
  }

  public Worker() {
  }

  public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
    this.name = name;
    this.level = level;
    this.baseSalary = baseSalary;
    this.department = department;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getBaseSalary() {
    return baseSalary;
  }

  public void setBaseSalary(Double baseSalary) {
    this.baseSalary = baseSalary;
  }

  public WorkerLevel getLevel() {
    return level;
  }

  public void setLevel(WorkerLevel level) {
    this.level = level;
  }

  public Department getDepartment() {
    return department;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }
}
