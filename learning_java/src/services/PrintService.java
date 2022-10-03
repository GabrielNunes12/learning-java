package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService {
  List<Integer> integers = new ArrayList<>();

  public PrintService() {
  }

  public void addValue(Integer valueToBeAdded) {
    this.integers.add(valueToBeAdded);
  }
  public int findFirst() {
    return this.integers.get(0);
  }

  public String print() {
    return this.integers.toString();
  }

}
