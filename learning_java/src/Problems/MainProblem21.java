package Problems;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainProblem21 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    try {
      String[] vect = scanner.nextLine().split(" ");
      int position = scanner.nextInt();
      System.out.println(vect[position]);
    }catch (InputMismatchException | ArrayIndexOutOfBoundsException error) {
      // show all occurrences about methods being called
      error.printStackTrace();
    }
  }
}
