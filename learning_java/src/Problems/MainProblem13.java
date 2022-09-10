package Problems;

import enums.OrderEnum;
import enums.WorkerLevel;
import models.Department;
import models.HourContract;
import models.Order;
import models.Worker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class MainProblem13 {
  public static void main(String[] args) throws ParseException {
    //Object composition
    int contractsWork = 0;
    Scanner scanner = new Scanner(System.in);
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
    System.out.println("Enter department's name: " );
    String departmentName = scanner.nextLine();
    System.out.println("Enter worker data: ");
    System.out.println();
    System.out.print("name: ");
    String workerName = scanner.nextLine();
    System.out.println();
    System.out.print("Level: ");
    String workerLevel = scanner.nextLine();
    System.out.println();
    System.out.print("Base salary: ");
    Double baseSalary = scanner.nextDouble();
    System.out.println();
    Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
    System.out.print("How many contracts to this worker: ");
    contractsWork = scanner.nextInt();
    System.out.println();
    for(int indexHours = 1; indexHours <= contractsWork; indexHours++) {
      System.out.print("Enter contract #" + indexHours);
      System.out.println();
      System.out.print("Date (DD/MM/YYYY): ");
      Date contractDate = simpleDateFormat.parse(scanner.next());
      System.out.println();
      System.out.print("Value per hour: ");
      double valuePerHour = scanner.nextDouble();
      System.out.println();
      System.out.print("Duration: ");
      int hours = scanner.nextInt();
      HourContract hourContract = new HourContract(contractDate, valuePerHour, hours);
      worker.addContract(hourContract);
    }
    System.out.println();
    System.out.println("Enter month and year to calculate income (MM/YYYY):");
    String monthAndYear = scanner.next();
    int month = Integer.parseInt(monthAndYear.substring(0, 2));
    int year = Integer.parseInt(monthAndYear.substring(3));
    System.out.println("Worker name: " + worker.getName());
    System.out.println("Department: " + worker.getDepartment().getName());
    System.out.println("Income for: " + monthAndYear + ": " + String.format("%.2f", worker.income(year,month)));

  }
}
