package Problems;

import models.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MainProblem14 {
  public static void main(String[] args) throws ParseException {
    //String builder
    Scanner scanner = new Scanner(System.in);
    SimpleDateFormat dateTimeFormatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    Post post = new Post(dateTimeFormatter.parse("21/06/2018 13:05:44"), "Travelling to New Zealand", "I'm going to visit", 12);
    post.setComments(new Comment("have a nice trip"));
    post.setComments(new Comment("Wow that's awesome!"));
    Post post2 = new Post(dateTimeFormatter.parse("28/07/2018 23:14:19"), "Good night guys", "See you tomorrow", 5);
    post2.setComments(new Comment("good night"));
    post2.setComments(new Comment("May the Force be with you"));

    System.out.println(post);
    System.out.println(post2);

  }
}
