package models;

public class OrderItem {
  private Integer quantity;

  private Product product;

  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  public OrderItem() {
  }

  public OrderItem(Integer quantity) {
    this.quantity = quantity;
  }

  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Double subTotal() {
    return this.getProduct().getProductPrice() * this.quantity;
  }
}
