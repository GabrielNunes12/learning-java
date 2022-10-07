package Problems;

import Model.CircleBounded;
import Model.RectangleBounded;
import Model.Shape;

import java.util.ArrayList;
import java.util.List;

public class MainProblem29 {
  public static void main(String[] args) {
    //Covariance principle Get/put
    List<Integer> intList = new ArrayList<>();
    intList.add(2);
    intList.add(5);
    //you can extend any Number's child wrapper classes and Number itself
    List<? extends Number> list = intList;
    //you can't add a new value to this 'list'
    list.add(2);
    //but you can access the value
    list.get(0);

    //counter-variance principle get/put
    List<Object> objects = new ArrayList<>();
    objects.add("Maria");
    objects.add("Alex");
    //you can call a super class
    List<? super Number> myNums = objects;
    // you can add a new value, 'cause you are extending from Objects, everything is Object in Java
    myNums.add(2);
    myNums.add(23);
    //you can't cache this value into a new variable
    Number x = myNums.get(0);
  }
}