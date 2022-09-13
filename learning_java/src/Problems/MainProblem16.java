package Problems;

import enums.OrderEnum;
import models.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MainProblem16 {
  public static void main(String[] args) throws ParseException {
    //Upcasting and Down casting with objects
    //polimorfism
    Account account = new Account();
    Account savingsAccToAcc = new SavingsAccount();
    Account businessAccountToAccount = new BusinessAccount();

    //down casting
    //in order to use methods that not contain in class itself you can use down casting or upcasting
    BusinessAccount bcAccount = (BusinessAccount) new Account();

    //instanceof to check if an object is an instance of something
    if(account instanceof Account) {

    }
  }
}
