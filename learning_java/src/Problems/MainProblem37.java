package Problems;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class MainProblem37 {
  public static void main(String[] args) {
    Map<String, String> mappedVotes = new HashMap<>();

    String path = "C:\\tmp\\in.txt";

    try (BufferedReader br = new BufferedReader(new FileReader(path))) {
      String line = br.readLine();
      while (line != null) {
        String[] fields = line.split(",");
        mappedVotes.put("candidate", fields[0]);
        mappedVotes.put("vote", fields[1]);
        line = br.readLine();
      }
      //looping through a SetValue
      for(String keyValue : mappedVotes.keySet()) {
        System.out.println(mappedVotes.get(keyValue));
      }
    } catch (IOException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}