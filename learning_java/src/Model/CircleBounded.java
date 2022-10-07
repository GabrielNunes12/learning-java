package Model;

public class CircleBounded implements Shape {

  private double radius;

  public CircleBounded(double radius) {
    super();
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  @Override
  public double area() {
    return Math.PI * radius * radius;
  }
}
