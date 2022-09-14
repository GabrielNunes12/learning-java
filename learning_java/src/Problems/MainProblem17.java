package Problems;

import models.*;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainProblem17 {
  public static void main(String[] args) {
    //polimorfism
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number of employees: ");
    int employees = scanner.nextInt();
    List<EmployeePoli> employeePoliList = new ArrayList<EmployeePoli>();
    for(int index = 0; index < employees; index++) {
      System.out.println("Employee #"+ ( index + 1) + " data: ");
      System.out.println("Outsourced? (y/n): ");
      char isOutsourced = scanner.next().charAt(0);
      scanner.nextLine();
      System.out.println("Name: ");
      String name = scanner.nextLine();
      System.out.println("Hours: ");
      int hours = scanner.nextInt();
      System.out.println("Value per hour: ");
      double valuePerHour = scanner.nextDouble();
      scanner.nextLine();
      EmployeePoli employeePoli = new EmployeePoli(name, hours, valuePerHour);
      if(isOutsourced == 'y') {
        System.out.println("Additional charge: ");
        double additionalCharge = scanner.nextDouble();
        EmployeePoli outSourced = new OutSourcedEmployee(name, hours, valuePerHour, additionalCharge);
        employeePoliList.add(outSourced);
      } else {
        employeePoliList.add(employeePoli);
      }
    }
    //showing all employees in order
    System.out.println("Payments: ");
    for(EmployeePoli employee : employeePoliList) {
      System.out.println(employee.getName() + " - " + employee.payment());
    }
  }
}
