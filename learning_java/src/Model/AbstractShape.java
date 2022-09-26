package Model;

import enums.ColorEnum;

public abstract class AbstractShape implements Shape {
  private ColorEnum color;

  public ColorEnum getColor() {
    return color;
  }

  public void setColor(ColorEnum color) {
    this.color = color;
  }

  public AbstractShape() {
  }

  public AbstractShape(ColorEnum color) {
    this.color = color;
  }
}
