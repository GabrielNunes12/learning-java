package Problems;

import models.ProductModel;
import services.PrintServiceEnterprise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MainProblem27 {
  public static void main(String[] args)  {
    //understanding about wildcard types
    //right way
    List<?> wildCardList = new ArrayList<>();
    List<Integer> integers = new ArrayList<>();
    wildCardList = integers;

    //wrong way
    /**
     * You can't do that, because list<Integer> can't be upcasted to List<Object>
     *   besides being extended from Object */
    List<Object> myObject = new ArrayList<>();
    List<Integer> integers1 = new ArrayList<>();
    myObject = integers1;
  }
}