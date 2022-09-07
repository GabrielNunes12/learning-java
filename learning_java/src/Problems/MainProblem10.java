package Problems;

import java.util.Objects;
import java.util.Scanner;

public class MainProblem10 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("X pos: ");
    int tryOuts = scanner.nextInt();
    System.out.println("Y pos: ");
    int tryOutsYPos = scanner.nextInt();
    int matrixNumberFilter;
    int[][] matrix = new int[tryOuts][tryOutsYPos];
    System.out.println("Type your values here: ");
    for(int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        matrix[i][j] = scanner.nextInt();
      }
    }
    System.out.println("Which occurrence do you want to filter in a matrix? ");
    matrixNumberFilter = scanner.nextInt();
    System.out.println();
    for(int i = 0; i < matrix.length; i++) {
      for(int j = 0; j < matrix[i].length; j++) {
        if(matrix[i][j] == matrixNumberFilter) {
          try {
            System.out.println();
            System.out.print("Position: " + i + "," + j);
            System.out.println();
            if(j > 0) {
              System.out.print("Left: " + matrix[i][j - 1]);
            }
            System.out.println();
            if(j < matrix[i].length - 1) {
              System.out.print("Right: " + matrix[i][j + 1]);
            }
            System.out.println();
            if(i < matrix.length - 1) {
              System.out.print("down: " + matrix[i + 1][j]);
            }
            System.out.println();
            if(i > 0) {
              System.out.print("Up: " + matrix[i - 1][j]);
            }
            System.out.println();
          } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println(exception);
          }
        }
      }
    }
  }
}
