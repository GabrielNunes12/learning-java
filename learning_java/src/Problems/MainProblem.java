package Problems;

import java.util.Arrays;
import java.util.Scanner;

public class MainProblem {
     public static void main(String[] args) {
         int tryOut;
         double height;
         Scanner scanner = new Scanner(System.in);
         System.out.println("Digite quantas vezes quer tentar a média: ");
         tryOut = scanner.nextInt();
         double[] tries = new double [tryOut];
         for(int index = 0; index <= tryOut; index++) {
             if(index == tryOut) {
                 break;
             } else {
                 System.out.println("Sua altura: ");
                 height = scanner.nextDouble();
                 tries[index] = height;
             }
         }
         double result = Arrays.stream(tries).sum() / tryOut;
         System.out.println(String.format("A média de altura foi: %.2f", result));
     }
}
