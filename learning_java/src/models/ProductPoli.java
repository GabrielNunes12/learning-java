package models;

public class ProductPoli {
  private String name;
  private double price;
  private String tag;
  private char code;

  public ProductPoli(String name, double price) {
    this.name = name;
    this.price = price;
  }
  public ProductPoli(String name, double price, char code) {
    this.name = name;
    this.price = price;
    this.code = code;
  }
  public ProductPoli(String name, double price, char code, String tag) {
    this.name = name;
    this.price = price;
    this.code = code;
    this.tag = tag;
  }

  public ProductPoli() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }
  public String priceTag() {
    return this.tag;
  }

  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }
  public double totalPrice() {
    return this.getPrice();
  }

  public char getCode() {
    return code;
  }
}
