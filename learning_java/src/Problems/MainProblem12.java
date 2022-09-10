package Problems;

import enums.OrderEnum;
import models.Order;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainProblem12 {
  public static void main(String[] args) {
    //ENUM
    Order order = new Order(1080, new Date(), OrderEnum.PENDING_PAYMENT);
    System.out.println(order.toString());

    //Getting user's option by a string
    OrderEnum userEnum = OrderEnum.valueOf("DELIVERED");
    System.out.println(userEnum);
  }
}
