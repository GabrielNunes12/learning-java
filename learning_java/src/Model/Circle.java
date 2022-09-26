package Model;

public class Circle extends AbstractShape{
  private double radius;

  public Circle(AbstractShape color, double radius) {
    super(color.getColor());
    this.radius = radius;
  }

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double area() {
    return Math.PI * radius * radius;
  }
}
