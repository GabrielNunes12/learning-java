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
    Reservation reservation = new Reservation(roomNumber, checkInDate, checkOutDate);
    System.out.println(reservation.toString());
  }
}