package Problems;

import models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MainProblem9 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Your matrix will be like: ");
         int tryOuts = scanner.nextInt();
         int count = 0;
         int[][] matrix = new int[tryOuts][tryOuts];
         System.out.println("Type your values here: ");
         for(int i = 0; i < matrix.length; i++) {
             for (int j = 0; j < matrix[i].length; j++) {
                 matrix[i][j] = scanner.nextInt();
             }
         }
         System.out.println("main diagonal");
         for(int i = 0; i < tryOuts; i++) System.out.print(matrix[i][i] + "-");
         System.out.println();
         System.out.print("Counting how many negatives numbers are: ");
         for(int i = 0; i < matrix.length; i++) {
             for(int j = 0; j < matrix[i].length; j++) {
                 if (matrix[i][j] >= 0) {
                     continue;
                 }
                 count++;
             }
         }
         System.out.println();
         System.out.println("Negative numbers = " + count);
     }
}
