package Problems;

import services.PrintService;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class MainProblem25 {
  public static void main(String[] args)  {
    Scanner scanner = new Scanner(System.in);
    PrintService<Integer> printService = new PrintService<>();
    System.out.println("How many values: ");
    int values = scanner.nextInt();
    for(int indexValue = 0; indexValue < values; indexValue++) {
      System.out.println("Your number #"+ (indexValue + 1));
      int value = scanner.nextInt();
      printService.addValue(value);
    }
    System.out.println(printService.print());
    System.out.println("First : " + printService.findFirst());
  }
}