package Problems;

import models.Reservation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MainProblem24 {
  public static void main(String[] args) throws ParseException {
    File file = new File("C:\\temp\\cs.txt");
    Scanner scanner = null;
    try {
      scanner = new Scanner(file);
      while(scanner.hasNextLine()) {
        System.out.println(scanner.nextLine());
      }
    } catch (IOException e) {
      System.out.println("Error: " + e.getMessage());
    } finally {
      if(scanner != null) {
        scanner.close();
      }
    }
  }
}