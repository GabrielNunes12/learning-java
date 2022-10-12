package Problems;

import models.Product;
import models.ProductModel;
import services.PrintServiceEnterprise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainProblem36 {
  public static void main(String[] args) {
    Map<Product, Double> mappedValue = new HashMap<>();
    mappedValue.put(new Product("TV", 2000), 100000.00 );
    mappedValue.put(new Product("Barbie", 20), 10.00 );
    Product productKey = new Product("TV", 2000);
    System.out.println(mappedValue.get(productKey));
  }
}