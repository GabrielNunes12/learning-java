package Problems;

import enums.OrderEnum;
import models.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.stream.StreamSupport;

public class MainProblem15 {
  public static void main(String[] args) throws ParseException {
    //String builder + Object composition
    Scanner scanner = new Scanner(System.in);
    SimpleDateFormat dateTimeFormatter = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat dateTimeFormatterWithHours = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    StringBuilder stringBuilder = new StringBuilder();
    OrderModel orderModel = new OrderModel();
    System.out.println("Enter client data: ");
    System.out.println();
    System.out.print("Name: ");
    String name = scanner.nextLine();
    System.out.println();
    System.out.print("Email: ");
    String email = scanner.nextLine();
    System.out.println();
    System.out.print("Birth date: ");
    String birthDate = scanner.nextLine();
    Client client = new Client(name,email,dateTimeFormatter.parse(birthDate));
    System.out.println();
    System.out.print("Enter order data: ");
    System.out.println();
    System.out.print("Status: ");
    String orderStatus = scanner.nextLine();
    orderModel.setOrderStatus(OrderEnum.valueOf(orderStatus));
    System.out.println();
    System.out.print("How many items to this order: ");
    int countItems = scanner.nextInt();
    System.out.println();
    orderModel.setOrderMoment(new Date());
    orderModel.setClient(client);
    for(int index = 0; index < countItems; index++) {
      OrderItem orderItem = new OrderItem();
      Product product = new Product();
      System.out.println("Enter #"+ (index + 1) + " item data: ");
      System.out.println("Product name: ");
      scanner.nextLine();
      String productName = scanner.nextLine();
      product.setProductName(productName);
      System.out.println();
      System.out.println();
      System.out.print("Product price: ");
      Double productPrice = scanner.nextDouble();
      product.setProductPrice(productPrice);
      orderItem.setProduct(product);
      System.out.println("Quantity: ");
      int quantity = scanner.nextInt();
      orderItem.setQuantity(quantity);
      orderModel.addItem(orderItem);
    }
    System.out.println(orderModel.toString());
  }
}
