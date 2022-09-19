package models;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
  private Integer roomNumber;
  private Date checkIn;
  private Date checkOut;
  private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

  public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
    this.roomNumber = roomNumber;
    this.checkIn = checkIn;
    this.checkOut = checkOut;
  }

  public Reservation() {

  }
  public Integer getRoomNumber() {
    return roomNumber;
  }

  public void setRoomNumber(Integer roomNumber) {
    this.roomNumber = roomNumber;
  }

  public Date getCheckIn() {
    return checkIn;
  }

  public void setCheckIn(Date checkIn) {
    this.checkIn = checkIn;
  }

  public Date getCheckOut() {
    return checkOut;
  }

  public void setCheckOut(Date checkOut) {
    this.checkOut = checkOut;
  }
  //calculating duration (days)
  public long duration() {
    long timeDiffer = checkOut.getTime() - checkIn.getTime();
    return TimeUnit.DAYS.convert(timeDiffer, TimeUnit.MILLISECONDS);
  }
  public void updateDates(Date checkIn, Date checkOut) {
    this.checkIn = checkIn;
    this.checkOut = checkOut;
  }

  @Override
  public String toString() {
    return "Reservation: " +
            "Room: " + roomNumber +
            ", check-in: " + simpleDateFormat.format(checkIn) +
            ", check-out: " + simpleDateFormat.format(checkOut) + " " +
            this.duration() +
            " nights";
  }
}
