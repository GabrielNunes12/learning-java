package Problems;

import java.sql.Array;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class MainProblem11 {
  public static void main(String[] args) {
    //How to instantiate a Date and Time in Java ISO - 8601
      // there are 3 ways to instantiate a date-time from exact time
    //Local date without hours
    LocalDate localDate = LocalDate.now();
    System.out.println(localDate);

    //LocalDate with hours
    LocalDateTime localDateTime = LocalDateTime.now();
    System.out.println(localDateTime);

    //Global time might include time zone
    Instant globalTime = Instant.now();
    System.out.println(globalTime);

    //Converting from ISO 8601 to a LocalDate
    LocalDate iso8601ToLocalDate = LocalDate.parse("2022-07-20");
    System.out.println(iso8601ToLocalDate);

    //Converting from ISO 8601 to a LocalDate with Time
    LocalDateTime iso8601ToLocalDateTime = LocalDateTime.parse("2022-07-20T16:08");
    System.out.println(iso8601ToLocalDateTime);

    //Converting from ISO 8601 to Instant with Time
    Instant iso8601ToInstant = Instant.parse("2022-07-20T16:08:30Z");
    System.out.println(iso8601ToInstant);

    //Converting from ISO 8601 to a Instant with Time but calculating time zone
    //need to offset the date and time, converting to Instant and then only then showing the value
    OffsetDateTime odt = OffsetDateTime.parse( "2010-12-27T10:50:44.000-08:00" );
    Instant iso8601ToInstantWithCalc = odt.toInstant();
    System.out.println(iso8601ToInstantWithCalc);

    //Formatting date and time
    DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter dtFormatterWithHours = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    LocalDate isoToPattern = LocalDate.parse("20/04/2020",dtFormatter);
    LocalDateTime isoToPatternWithHours = LocalDateTime.parse("20/04/2020 09:10",dtFormatterWithHours);
    System.out.println(isoToPattern);
    System.out.println(isoToPatternWithHours);

    //displaying your formatted date
    DateTimeFormatter formatterHour = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate localDate1 = LocalDate.parse("2022-08-10");
    System.out.println(localDate1.format(formatterHour));

    //Displaying formatted date on Instant (Global w/ timezone)
    //to customize your date with Instant type you MUST pass withZone method
    DateTimeFormatter fm2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
    Instant globalHour = Instant.parse("2022-08-20T01:30:26.000Z");
    System.out.println(fm2.format(globalHour));

    //Converting instant global time to a localdate
    LocalDate date04 = LocalDate.parse("2022-08-01");
    Instant dateInst = Instant.parse("2022-08-01T01:08:20Z");
    LocalDate resultFormat = LocalDate.ofInstant(dateInst, ZoneId.systemDefault());
    LocalDateTime resultFormatTime = LocalDateTime.ofInstant(dateInst, ZoneId.of("Portugal"));
    System.out.println(resultFormat);
    System.out.println(resultFormatTime);

    //Calculus Hour and date
    DateTimeFormatter dateFormatterSunday = DateTimeFormatter.ofPattern("dd/MM/yyyy").withZone(ZoneId.systemDefault());
    //today's day
    LocalDate today = LocalDate.now(ZoneId.systemDefault());
    //count today's day
    ZonedDateTime todayStart = today.atStartOfDay(ZoneId.systemDefault());
    //first day of the year
    ZonedDateTime firstOfTheYear = todayStart.with(TemporalAdjusters.firstDayOfYear());
    //first day of the next year
    ZonedDateTime zdtFirstOfNextYear = firstOfTheYear.with(TemporalAdjusters.firstDayOfNextYear());
    //first sunday of this year
    ZonedDateTime firstSundayOfThisYear = firstOfTheYear.with(TemporalAdjusters.dayOfWeekInMonth(1, DayOfWeek.SUNDAY));
    //first 53 sundays
    List<ZonedDateTime> sundays = new ArrayList<>(53);
    //variable changes while loop
    ZonedDateTime zdt = firstSundayOfThisYear;
    while(zdt.isBefore(zdtFirstOfNextYear)) {
      //adding a date to a list
      sundays.add(zdt);
      //printing the formatted list
      System.out.println("Sundays #" + sundays.size() + " : " + dateFormatterSunday.format(zdt));
      //adding a week to count
      zdt = zdt.plusWeeks(1);
    }
  }
}
