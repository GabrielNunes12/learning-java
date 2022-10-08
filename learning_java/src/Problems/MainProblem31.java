package Problems;

import Model.Client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainProblem31 {
  public static void main(String[] args) {
    //equals it is a delayed method, but it is 100% accuracy
    String x = "Mariah";
    String b = "Carey";
    System.out.println(x.equals(b)); //returns true or false if it is equal to the other value
    //hashCode it is a fastest method, but can give a false-positive
    String a = "Luke";
    String c = "Skywalker";
    System.out.println(a.hashCode()); //returns a random number
    System.out.println(c.hashCode()); //returns a random number
    //Hashcode rule -> HashCode can collide to another object
    // if the values are different, then the outcome will be different
    // if the values are the same, then the outcome will be the same.
    Client cliente = new Client("Bob", "bob@gmail.com");
    Client cliente2 = new Client("Boba", "boba@gmail.com");
    System.out.println(cliente2.equals(cliente));
    System.out.println(cliente2.hashCode());
    System.out.println(cliente.hashCode());
  }
}