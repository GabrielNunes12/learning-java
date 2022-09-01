package Problems;

import models.Product;

import java.util.Scanner;

public class MainProblem3 {
     public static void main(String[] args) {
         int tryOut;
         Scanner scanner = new Scanner(System.in);
         System.out.println("Digite quantas vezes quer tentar a média: ");
         tryOut = scanner.nextInt();
         int[] integerNumbers = new int[tryOut];
         int[] resultNumbersBelowZero = new int[integerNumbers.length];
         for(int index = 0; index < tryOut; index++) {
             System.out.println("Digite um número: ");
             int number = scanner.nextInt();
             integerNumbers[index] = number;
         }
         for(int indexResult = 0;  indexResult < integerNumbers.length; indexResult++) {
             if(integerNumbers[indexResult] < 0) {
                 resultNumbersBelowZero[indexResult] = integerNumbers[indexResult];
             }
         }
         for(int value : resultNumbersBelowZero) {
             if(value < 0){
                 System.out.println(value);
             }
         }
     }
}
