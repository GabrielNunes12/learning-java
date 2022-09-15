package models;

public class ImportedProduct extends ProductPoli {
  private Double customFees;

  public ImportedProduct() {
    super();
  }

  public ImportedProduct(String name, double price, Double customFees, char tag) {
    super(name, price, tag);
    this.customFees = customFees;
  }
  public ImportedProduct(String name, double price, Double customFees) {
    super(name, price);
    this.customFees = customFees;
  }

  public Double getCustomFees() {
    return customFees;
  }

  public void setCustomFees(Double customFees) {
    this.customFees = customFees;
  }
  @Override
  public String priceTag() {
    return super.priceTag();
  }
  @Override
  public double totalPrice() {
    return super.getPrice() + this.customFees;
  }
}
