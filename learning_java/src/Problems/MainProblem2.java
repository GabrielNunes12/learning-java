package Problems;

import models.Product;

import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

public class MainProblem2 {
     public static void main(String[] args) {
         int tryOut;
         String productName;
         double result = 0;
         double resultParsed = 0;
         Scanner scanner = new Scanner(System.in);
         System.out.println("Digite quantas vezes quer tentar a média: ");
         tryOut = scanner.nextInt();
         Product[] productVect = new Product[tryOut];
         for(int index = 0; index < tryOut; index++) {
             Product product = new Product();
             System.out.println("Qual o aparelho: ");
             productName = scanner.next();
             System.out.println("Custo do produto: ");
             product.setProductPrice(scanner.nextDouble());
             productVect[index] = product;
         }
         for(int indexResult = 0;  indexResult < productVect.length; indexResult++) {
             result += productVect[indexResult].getProductPrice();
         }
         resultParsed = result / tryOut;
         System.out.println(String.format("A média de altura foi: %.2f", resultParsed));
     }
}
