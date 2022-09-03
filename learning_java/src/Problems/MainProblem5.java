package Problems;

import models.Person;

import java.util.Arrays;
import java.util.Scanner;

public class MainProblem5 {
     public static void main(String[] args) {
         int indexes;
         Scanner scanner = new Scanner(System.in);
         System.out.println("How many people will be typed? ");
         indexes = scanner.nextInt();
         Person[] personVect = new Person[indexes];
         String[] personName = new String[personVect.length];
         double mediumHeight = 0;
         double resultHeight;
         double resultAge = 0;
         double averageAge;
         for(int index = 0; index < indexes; index++) {
             System.out.println("Dados do " + (index + 1) + " pessoa :");
             Person person = new Person();
             System.out.println("name: ");
             person.setName(scanner.next());
             System.out.println("Age: ");
             person.setAge(scanner.nextInt());
             System.out.println("Height: ");
             person.setHeight(scanner.nextDouble());
             personVect[index] = person;
         }
        for(int indexResult = 0; indexResult < personVect.length; indexResult++) {
            mediumHeight += personVect[indexResult].getHeight();
            resultAge += personVect[indexResult].getAge();
            if(personVect[indexResult].getAge() < 16) {
                personName[indexResult] = personVect[indexResult].getName();
            }
        }
        resultHeight = (mediumHeight * 100) / indexes;
        averageAge = resultAge / indexes;
        System.out.println("Average height: " + resultHeight + "%");
        System.out.println("People below 16 years old: " + averageAge);
        System.out.println("People below 16 years old is: ");
        for(String values : personName) {
            if(values != null) {
                System.out.println(values);
            }
        }
     }
}
