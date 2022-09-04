package Problems;

import models.Person;

import java.util.Scanner;

public class MainProblem6 {
     public static void main(String[] args) {
         int indexes;
         Scanner scanner = new Scanner(System.in);
         double resultHighestNum = 0;
         int resultIndex = 0;
         System.out.println("How many people will be typed? ");
         indexes = scanner.nextInt();
         double[] vect = new double[indexes];
         for(int index = 0; index < indexes; index++) {
             System.out.println("Digite um número: ");
             int res = scanner.nextInt();
             vect[index] = res;
         }
         for(int index = 0; index < vect.length; index++) {
             if(vect.length > 1) {
                 for (int j = index + 1; j < vect.length; j++) {
                    if(vect[j] < vect[index]) {
                        resultHighestNum = vect[index];
                        resultIndex = index;
                    }
                    resultHighestNum = vect[j];
                    resultIndex = j;
                 }
             } else {
                 System.out.println(vect[index]);
             }
         }
         System.out.println("Maior valor: " + resultHighestNum);
         System.out.println("Posição do maior: " + resultIndex);
     }
}
