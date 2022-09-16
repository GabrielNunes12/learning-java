package Problems;

import Model.Pessoa;
import Model.PessoaFisica;
import Model.PessoaJuridica;
import enums.ColorEnum;
import models.Circle;
import models.Rectangle;
import models.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainProblem20 {
  public static void main(String[] args) {
    //abstract classes and abstract methods
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number of tax payers: ");
    int numberOfShape = scanner.nextInt();
    scanner.nextLine();
    List<Pessoa> pessoas = new ArrayList<>();
    for(int index = 0; index < numberOfShape; index++) {
      System.out.println("Tax payer #" + (index + 1) + " data:");
      System.out.println("Individual or company (i/c)? ");
      char isCompanyOrIndividual = scanner.next().charAt(0);
      if(isCompanyOrIndividual == 'c') {
        scanner.nextLine();
        System.out.println("Name: ");
        String name = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Annual income: ");
        double annualIncome = scanner.nextDouble();
        System.out.println("Number of employees: ");
        double employees = scanner.nextDouble();
        Pessoa company = new PessoaJuridica(name,annualIncome, employees);
        pessoas.add(company);
      } else {
        scanner.nextLine();
        System.out.println("Name: ");
        String name = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Annual income: ");
        double annualIncome = scanner.nextDouble();
        System.out.println("Health expenditures: ");
        double healthExpenditures = scanner.nextDouble();
        Pessoa individual = new PessoaFisica(name,annualIncome,healthExpenditures);
        pessoas.add(individual);
      }
    }
    System.out.println("Taxes: ");
    double sumAllFederalTaxes = 0.00;
    for(Pessoa person : pessoas) {
      sumAllFederalTaxes += person.federalTaxes();
      System.out.println(person.getName() + ": $ " + person.federalTaxes());
    }
    System.out.println("Total taxes paid: " + sumAllFederalTaxes);
  }
}
