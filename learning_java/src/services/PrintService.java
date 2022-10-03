package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
  List<T> integers = new ArrayList<>();

  public PrintService() {
  }

  public void addValue(T valueToBeAdded) {
    this.integers.add(valueToBeAdded);
  }
  public T findFirst() {
    return this.integers.get(0);
  }

  public String print() {
    return this.integers.toString();
  }

}
