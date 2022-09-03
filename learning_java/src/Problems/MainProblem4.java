package Problems;

import java.util.Arrays;
import java.util.Scanner;

public class MainProblem4 {
     public static void main(String[] args) {
         int indexes;
         Scanner scanner = new Scanner(System.in);
         System.out.println("Digite quantas vezes quer tentar a média: ");
         indexes = scanner.nextInt();
         double[] doubleNumbers = new double[indexes];
         for(int index = 0; index < indexes; index++) {
             System.out.println("Digite um número: ");
             double number = scanner.nextDouble();
             doubleNumbers[index] = number;
         }
         for(int indexValue = 0; indexValue < doubleNumbers.length; indexValue++) {
             System.out.print("Valores: ");
             System.out.print(doubleNumbers[indexValue]);
         }
         double media = Arrays.stream(doubleNumbers).sum() / indexes;
         double summed = Arrays.stream(doubleNumbers).sum();
         System.out.println();
         System.out.println("Média: " + media);
         System.out.println("Soma: " + summed);

     }
}
