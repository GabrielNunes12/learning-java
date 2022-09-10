package models;

import enums.OrderEnum;

import java.util.Date;

public class Order {
  private Integer id;
  private Date orderMoment;
  private OrderEnum orderStatus;

  public Order(Integer id, Date orderMoment, OrderEnum orderStatus) {
    this.id = id;
    this.orderMoment = orderMoment;
    this.orderStatus = orderStatus;
  }

  public Order() {
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
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

  @Override
  public String toString() {
    return "Order{" +
            "id=" + id +
            ", orderMoment=" + orderMoment +
            ", orderStatus=" + orderStatus +
            '}';
  }
}
