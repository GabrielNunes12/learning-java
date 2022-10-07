package Problems;

import Model.CircleBounded;
import Model.RectangleBounded;
import Model.Shape;

import java.util.ArrayList;
import java.util.List;

public class MainProblem28 {
  public static void main(String[] args) {

    List<Shape> myShapes = new ArrayList<>();
    myShapes.add(new RectangleBounded(3.0, 2.0));
    myShapes.add(new CircleBounded(2.0));

    List<CircleBounded> myCircles = new ArrayList<>();
    myCircles.add(new CircleBounded(2.0));
    myCircles.add(new CircleBounded(3.0));

    System.out.println("Total area: " + totalArea(myCircles));
  }

  //looping through every element which type is Shape or subtypes of Shape
  /*You can not add values to this list, because it is extending from shape, it is wildcard method*/
  public static double totalArea(List<? extends Shape> list) {
    double sum = 0.0;
    for (Shape s : list) {
      sum += s.area();
    }
    return sum;
  }
}