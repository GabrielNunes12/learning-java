package models;

import enums.OrderEnum;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderModel {
  private static SimpleDateFormat dateTimeFormatter = new SimpleDateFormat("dd/MM/yyyy");
  private static SimpleDateFormat dateTimeFormatterWithHours = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
  private Date orderMoment;
  private OrderEnum orderStatus;
  private List<OrderItem> orderItemList = new ArrayList<>();

  private Client client;

  public OrderModel(Date orderMoment, OrderEnum orderStatus) {
    this.orderMoment = orderMoment;
    this.orderStatus = orderStatus;
  }

  public OrderModel() {
  }

  public Date getOrderMoment() {
    return orderMoment;
  }

  public void setOrderMoment(Date orderMoment) {
    this.orderMoment = orderMoment;
  }

  public OrderEnum getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(OrderEnum orderStatus) {
    this.orderStatus = orderStatus;
  }

  public void addItem (OrderItem orderItem) {
    this.orderItemList.add(orderItem);
  }

  public void removeItem (OrderItem orderItem) {
    this.orderItemList.remove(orderItem);
  }

  public Client getClient() {
    return client;
  }

  public void setClient(Client client) {
    this.client = client;
  }

  @Override
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    double resultOrderItem = 0;
    System.out.println("Order Summary: ");
    stringBuilder.append("Order moment: " + dateTimeFormatterWithHours.format(this.orderMoment) + "\n");
    stringBuilder.append("Order status: " + this.orderStatus + "\n");
    stringBuilder.append("Client: " + this.client.getName() +
            "("+this.client.getBirthDate()+")" + " - " + this.client.getEmail());
    stringBuilder.append("Order item: ");
    for(OrderItem item : orderItemList) {
      resultOrderItem += item.subTotal();
      stringBuilder.append(item.getProduct().getProductName() + "," + item.getProduct().getProductPrice() + ", " + "Quantity: "
              + item.getQuantity() + ", " + "Subtotal: " + item.subTotal() + " total price: " + resultOrderItem);
    }
    return stringBuilder.toString();
  }
}
