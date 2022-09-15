package models;

import enums.ColorEnum;

import java.awt.*;

public class Circle extends Shape {
  private double radius;

  public Circle(double radius, ColorEnum colorEnum) {
    super(colorEnum);
    this.radius = radius;
  }

  @Override
  public double area() {
    return Math.PI * radius * radius;
  }
}
