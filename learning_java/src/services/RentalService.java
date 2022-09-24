package services;

import Model.CarRental;
import Model.Invoice;

public class RentalService {
  private Double pricePerHour;
  private Double pricePerDay;

  private BrazilTaxService brazilTaxService;

  public RentalService(Double pricePerHour, Double pricePerDay, BrazilTaxService brazilTaxService) {
    this.pricePerHour = pricePerHour;
    this.pricePerDay = pricePerDay;
    this.brazilTaxService = brazilTaxService;
  }

  public RentalService() {
  }

  //calculating per day and per hour
  public void processInvoice(CarRental carRental) {
    long time1 = carRental.getStart().getTime();
    long time2 = carRental.getFinish().getTime();
    //convert to hour ms/s/m/h
    double hours = (double)(time2 - time1) / 1000 / 60 / 60;
    double basicPayment;
    if (hours < 12.00) {
      basicPayment = Math.ceil(hours) * pricePerHour;
    } else {
      basicPayment = Math.ceil(hours / 24) * pricePerDay;
    }
    double tax = brazilTaxService.tax(basicPayment);
    carRental.setInvoice(new Invoice(basicPayment, tax));
  }

  public Double getPricePerHour() {
    return pricePerHour;
  }

  public void setPricePerHour(Double pricePerHour) {
    this.pricePerHour = pricePerHour;
  }

  public Double getPricePerDay() {
    return pricePerDay;
  }

  public void setPricePerDay(Double pricePerDay) {
    this.pricePerDay = pricePerDay;
  }
}
