package models;

import enums.ColorEnum;
// abstract classes can't be instantiated
// abstract methods on abstract class can not be implemented *Only subclasses can*
public abstract class Shape {
  private ColorEnum color;

  public Shape(ColorEnum color) {
    this.color = color;
  }

  public abstract double area();
}
