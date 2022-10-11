package Problems;

import Model.ClientU;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MainProblem34 {
  public static void main(String[] args) {
    //Creating a list
    Set<Integer> classA = new HashSet<>();
    Set<Integer> classB = new HashSet<>();
    Set<Integer> classC = new HashSet<>();
    Scanner scanner = new Scanner(System.in);
    System.out.println("How many students are: ");
    int students = scanner.nextInt();
    for(int indexStudents = 0; indexStudents < students; indexStudents++) {
      System.out.println("Your # " + (indexStudents + 1) + " student");
      int responseStudents = scanner.nextInt();
      classA.add(responseStudents);
    }
    System.out.println("How many students are on B's class: ");
    int studentsB = scanner.nextInt();
    for(int indexStudents = 0; indexStudents < studentsB; indexStudents++) {
      System.out.println("Your # " + (indexStudents + 1) + " student");
      int responseStudents = scanner.nextInt();
      classB.add(responseStudents);
    }
    System.out.println("How many students are on C's class: ");
    int studentsC = scanner.nextInt();
    for(int indexStudents = 0; indexStudents < studentsC; indexStudents++) {
      System.out.println("Your # " + (indexStudents + 1) + " student");
      int responseStudents = scanner.nextInt();
      classC.add(responseStudents);
    }
    //union all values inside a new Set
    Set<Integer> totalSet = new HashSet<>(classA);
    totalSet.addAll(classB);
    totalSet.addAll(classC);
    System.out.println("Total Students : " + totalSet.size());
  }
}