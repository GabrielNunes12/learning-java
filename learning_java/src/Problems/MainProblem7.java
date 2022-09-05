package Problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MainProblem7 {
     public static void main(String[] args) {
         List<String> names = new ArrayList<>();
         names.add("James");
         names.add("João");
         names.add("Maria");
         names.add("Priscila");
         for(String name : names) {
             System.out.println(name);
         }
         System.out.println("-------------------------------");
         String namesFiltered = names.stream().filter(name -> name.charAt(0) == 'J').findFirst().orElse(null);
         System.out.println(namesFiltered);
         System.out.println("-------------------------------");
         List<String> namesFiltered2 = names.stream().filter(name -> name.charAt(0) == 'M').collect(Collectors.toList());
         for(String name : namesFiltered2) {
             System.out.println(name);
         }
         System.out.println("-------------------------------");
         int findIndexOf = names.indexOf("Maria");
         System.out.println(findIndexOf);
     }
}
