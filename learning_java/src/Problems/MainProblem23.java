package Problems;

import models.Reservation;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MainProblem23 {
  public static void main(String[] args) throws ParseException {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
    Scanner scanner = new Scanner(System.in);
    System.out.println("Room number");
    int roomNumber = scanner.nextInt();
    scanner.nextLine();
    System.out.println("Check-in-date DD/MM/YYYY: ");
    Date checkInDate = simpleDateFormat.parse(scanner.nextLine());
    System.out.println("Check-out-date DD/MM/YYYY: ");
    Date checkOutDate = simpleDateFormat.parse(scanner.nextLine());
    System.out.println(handleReservationResponse(checkInDate,checkOutDate,roomNumber));
  }
  public static String handleReservationResponse (Date checkIn, Date checkOut, Integer roomNumber) throws ParseException {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
    Scanner scanner = new Scanner(System.in);
    if(!checkOut.after(checkIn)) {
      System.out.println("Error in reservation: Check-out must date must be after check-in date!");
    } else {
      Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
      System.out.println(reservation.toString());
      scanner.nextLine();
      System.out.println("Enter data to update the reservation: ");
      System.out.println("Check-in-date DD/MM/YYYY: ");
      checkIn = simpleDateFormat.parse(scanner.nextLine());
      System.out.println("Check-out-date DD/MM/YYYY: ");
      checkOut = simpleDateFormat.parse(scanner.nextLine());
      reservation.updateDates(checkIn,checkOut);
      return reservation.toString();
    }
    return null;
  }
}