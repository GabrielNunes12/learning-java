package Model;

public class Rectangle extends AbstractShape{

  private Double height;
  private Double width;

  public Rectangle(AbstractShape color, Double height, Double width) {
    super(color.getColor());
    this.height = height;
    this.width = width;
  }

  public Rectangle(Double height, Double width) {
    this.height = height;
    this.width = width;
  }

  public Double getHeight() {
    return height;
  }

  public void setHeight(Double height) {
    this.height = height;
  }

  public Double getWidth() {
    return width;
  }

  public void setWidth(Double width) {
    this.width = width;
  }

  public double area() {
    return width * height;
  }
}
