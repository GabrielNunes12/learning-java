package Problems;

import models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MainProblem8 {
     public static void main(String[] args) {
         List<Employee> employeeList = new ArrayList<Employee>();
         int counterLoop;
         int idEmployee;
         double percentage;
         System.out.println("How many employees will be registered? ");
         Scanner scanner = new Scanner(System.in);
         counterLoop = scanner.nextInt();
         for(int index = 0; index < counterLoop; index++) {
             Employee employee = new Employee();
             System.out.println("Employee #" + (index + 1));
             System.out.println("Id: ");
             int id = scanner.nextInt();
             employee.setId(id);
             scanner.nextLine();
             System.out.println("Name: ");
             String name = scanner.nextLine();
             employee.setName(name);
             System.out.println("Salary: ");
             double salary = scanner.nextDouble();
             employee.setSalary(salary);
             employeeList.add(employee);
         }
         System.out.println("Enter the employee id that will have salary increase: ");
         idEmployee = scanner.nextInt();
         List<Employee> employeeFiltered = employeeList.stream().filter(employee -> employee.getId() == idEmployee)
                                                                .collect(Collectors.toList());
         System.out.println("Enter the percentage: ");
         percentage = scanner.nextDouble();
         for(Employee employee: employeeFiltered) {
             employee.setSalary((employee.getSalary() / percentage) + employee.getSalary());
             System.out.println("Bonified employee: ");
             System.out.println(employee.getId() + "," + employee.getName() + "," + employee.getSalary());
         }
         List<Employee> remainingEmployee = employeeList.stream().filter(employee -> employee.getId() != idEmployee).collect(Collectors.toList());
         for(Employee employeeNotFiltered : remainingEmployee) {
             System.out.println("Non bonified employee: ");
             System.out.println(employeeNotFiltered.getId() + "," + employeeNotFiltered.getName() + "," + employeeNotFiltered.getSalary());
         }
     }
}
