package Problems;

import Model.Client;

import java.util.*;

public class MainProblem32 {
  public static void main(String[] args) {
    //HashSet -> unordered
    Set<String> set = new HashSet<>();
    set.add("TV");
    set.add("Notebook");
    set.add("Tablet");
    System.out.println(set.contains("Notebook"));
    //TreeSet -> Ordered List
    Set<String> treeSet = new TreeSet<>();
    treeSet.add("Tree");
    treeSet.add("Set");
    System.out.println(treeSet.contains("Set"));
    //LinkedHashSet -> Keep the order inside the list
    Set<String> linkedHashSet = new LinkedHashSet<>();
    linkedHashSet.add("TV");
    linkedHashSet.add("Notebook");
    linkedHashSet.add("Tablet");
    System.out.println(linkedHashSet.contains("Notebook"));
    //union, difference and intersection
    Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
    Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));
    //union
    Set<Integer> c = new TreeSet<>(a);
    c.addAll(b);
    System.out.println(c);
    //intersection
    Set<Integer> d = new TreeSet<>(a);
    d.retainAll(b);
    System.out.println(d);
    //difference
    Set<Integer> e = new TreeSet<>(a);
    e.removeAll(b);
    System.out.println(e);
  }
}