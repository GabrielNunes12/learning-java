package Problems;

import enums.ColorEnum;
import models.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class MainProblem19 {
  public static void main(String[] args) {
    //abstract classes and abstract methods
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number of shapes: ");
    int numberOfShape = scanner.nextInt();
    scanner.nextLine();
    List<Shape> shapes = new ArrayList<>();
    for(int index = 0; index < numberOfShape; index++) {
      System.out.println("Shape #" + (index + 1) + " data:");
      System.out.println("Rectangle or circle (r/c): ");
      char colorOption = scanner.next().charAt(0);
      scanner.nextLine();
      if(colorOption == 'r') {
        System.out.println("Color (BLACK, BLUE, RED): ");
        String color = scanner.nextLine();
        System.out.println("Width: ");
        double width = scanner.nextDouble();
        System.out.println("Height: ");
        double height = scanner.nextDouble();
        Shape rectangle = new Rectangle(width,height, ColorEnum.valueOf(color.toUpperCase()));
        shapes.add(rectangle);
      } else {
        System.out.println("Color (BLACK, BLUE, RED): ");
        String color = scanner.nextLine();
        System.out.println("Radius: ");
        double radius = scanner.nextDouble();
        Shape rectangle = new Circle(radius, ColorEnum.valueOf(color.toUpperCase()));
        shapes.add(rectangle);
      }
    }
    System.out.println("SHAPE AREAS: ");
    for(Shape shape : shapes) {
      System.out.printf("%.2f%n",shape.area());
    }
  }
}
