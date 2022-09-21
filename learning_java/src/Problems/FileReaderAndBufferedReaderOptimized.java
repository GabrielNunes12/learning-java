package Problems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;

public class FileReaderAndBufferedReaderOptimized {
  public static void main(String[] args) throws ParseException {
    String path = "C:\\temp\\in.txt";
    /*Optimized way to instantiate a buffered reader and a file*/
    try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
      String line = bufferedReader.readLine();
      while (line != null) {
        System.out.println(line);
        line = bufferedReader.readLine();
      }
    } catch (IOException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}