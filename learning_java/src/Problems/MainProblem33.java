package Problems;

import Model.ClientU;
import models.ProductModel;
import services.PrintServiceEnterprise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.*;

public class MainProblem33 {
  public static void main(String[] args) {
    //read a file
    Set<ClientU> list = new HashSet<>();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter path name: ");
    String path = scanner.nextLine();
    try (BufferedReader br = new BufferedReader(new FileReader(path))) {
      String line = br.readLine();
      while (line != null) {
        //split a string by space
        String[] fields = line.split(" ");
        //instantiate a class
        //set user [o] to setUsername
        //set user[1] to setDate
        list.add(new ClientU(fields[0], Date.from(Instant.parse(fields[1]))));
        line = br.readLine();
      }
      //show total distinct users with Set<Class>
      System.out.println("Total users: " + list.size());

    } catch (IOException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}