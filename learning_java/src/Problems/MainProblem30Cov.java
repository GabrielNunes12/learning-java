package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainProblem30Cov {
  public static void main(String[] args) {
    List<Integer> intList = Arrays.asList(1, 2, 3, 4);
    List<Double> doubleList = Arrays.asList(1.2, 24.00, 302.01, 4.22);
    List<Object> objList = new ArrayList<>();
    copy(intList, objList);
    copy(doubleList, objList);
  }
  //Covariance principle Get/put and counter-variance method
  public static void copy(List<? extends Number> source, List<? super Number> destiny) {
    for(Number numberSource : source) {
      destiny.add(numberSource);
    }
  }
}