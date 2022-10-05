package services;

import java.util.Collections;
import java.util.List;

public class PrintServiceEnterprise {

  //Creating a static method to find a maximum value inside an array, and return it.
  public static <T extends Comparable<T>> T max(List<T> list) {
    if (list.isEmpty()) {
      throw new IllegalStateException("List can't be empty");
    }
    return Collections.max(list);
  }
}