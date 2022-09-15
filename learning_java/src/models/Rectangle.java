package models;

import enums.ColorEnum;

public class Rectangle extends Shape {
  private double width;
  private double height;

  public Rectangle(double width, double height, ColorEnum colorEnum) {
    super(colorEnum);
    this.width = width;
    this.height = height;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double weight) {
    this.width = weight;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  @Override
  public double area() {
    return this.getWidth() * this.getHeight();
  }
}
