package Problems;

import models.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class MainProblem18 {
  public static void main(String[] args) throws ParseException {
    //polimorfism
    Scanner scanner = new Scanner(System.in);
    SimpleDateFormat simpleDateFormatter = new SimpleDateFormat("dd/MM/yyyy");
    System.out.println("Enter the number of products: ");
    int products = scanner.nextInt();
    List<ProductPoli> productPoliList = new ArrayList<ProductPoli>();
    for(int index = 0; index < products; index++) {
      System.out.println("Product #"+ ( index + 1) + " data: ");
      System.out.println("Common, used or imported (c/u/i): ");
      char hasOptions = scanner.next().charAt(0);
      scanner.nextLine();
      System.out.println("Name: ");
      String name = scanner.nextLine();
      System.out.println("Price: ");
      double price = scanner.nextDouble();
      scanner.nextLine();
      if(hasOptions == 'i'){
        System.out.println("Custom fee: ");
        double customFee = scanner.nextDouble();
        ProductPoli productPoli = new ImportedProduct(name,price,customFee, hasOptions);
        productPoliList.add(productPoli);
      } else if (hasOptions == 'u') {
        System.out.println("Manufacture date: (DD/MM/YYYY): ");
        Date manufactureDate = simpleDateFormatter.parse(scanner.next());
        ProductPoli productPoliUsed = new UsedProduct(name,price,manufactureDate,hasOptions);
        productPoliList.add(productPoliUsed);
      } else {
        ProductPoli productPoliStandard = new ProductPoli(name, price);
        productPoliList.add(productPoliStandard);
      }
    }
    //showing all product's price tags
    System.out.println("PRICE TAGS: ");
    for(ProductPoli productsPoli : productPoliList) {
      if(productsPoli.getCode() == 'i' && productsPoli instanceof ImportedProduct) {
        System.out.println(productsPoli.getName() + "$" +productsPoli.totalPrice() + "(Custom fee: " + ((ImportedProduct) productsPoli).getCustomFees() + ")");
      } else if (productsPoli.getCode() == 'u' && productsPoli instanceof UsedProduct) {
        System.out.println(productsPoli.getName() + "( used )" + "$" +productsPoli.totalPrice() + "Manufacture date: " + ((UsedProduct) productsPoli).getManufactureDate());
      } else {
        System.out.println(productsPoli.getName() + " $ " + productsPoli.totalPrice());
      }
    }
  }
}
