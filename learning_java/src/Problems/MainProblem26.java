package Problems;

import models.ProductModel;
import services.PrintService;
import services.PrintServiceEnterprise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainProblem26 {
  public static void main(String[] args)  {
    List<ProductModel> list = new ArrayList<>();

    String path = "C:\\tmp\\in.txt";

    try (BufferedReader br = new BufferedReader(new FileReader(path))) {

      String line = br.readLine();
      while (line != null) {
        String[] fields = line.split(",");
        list.add(new ProductModel(fields[0], Double.parseDouble(fields[1])));
        line = br.readLine();
      }

      ProductModel x = PrintServiceEnterprise.max(list);
      System.out.println("Most expensive:");
      System.out.println(x);

    } catch (IOException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}