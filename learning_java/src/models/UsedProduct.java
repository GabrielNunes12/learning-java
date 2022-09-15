package models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends ProductPoli {
  private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
  private Date manufactureDate;

  public UsedProduct(String name, double price, Date manufactureDate) {
    super(name, price);
    this.manufactureDate = manufactureDate;
  }

  public UsedProduct(String name, double price, Date manufactureDate, char code) {
    super(name, price, code);
    this.manufactureDate = manufactureDate;
  }


  public UsedProduct() {
  }

  public Date getManufactureDate() {
    return manufactureDate;
  }

  public void setManufactureDate(Date manufactureDate) {
    this.manufactureDate = manufactureDate;
  }
  @Override
  public String priceTag() {
    return super.priceTag();
  }
  @Override
  public double totalPrice() {
    return super.getPrice();
  }
}
