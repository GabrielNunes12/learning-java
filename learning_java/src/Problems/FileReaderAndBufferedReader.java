package Problems;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class FileReaderAndBufferedReader {
  public static void main(String[] args) throws ParseException {
    FileReader file = null;
    BufferedReader bufferedReader = null;
    String path = "C:\\temp\\in.txt";
    try {
      file = new FileReader(path);
      bufferedReader = new BufferedReader(file);
      String line = bufferedReader.readLine();
      while(line != null) {
        System.out.println(line);
        line = bufferedReader.readLine();
      }
    } catch (IOException e) {
      System.out.println("Error: " + e.getMessage());
    } finally {
      try {
        if(bufferedReader != null) {
          bufferedReader.close();
        }
        if(file != null) {
          file.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

  }
}