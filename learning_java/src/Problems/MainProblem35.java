package Problems;

import java.util.*;

public class MainProblem35 {
  public static void main(String[] args) {
    Map<String, String> mappedValue = new HashMap<>();
    mappedValue.put("id", "1234");
    mappedValue.put("value", "abiWan");
    System.out.println(mappedValue.get("id"));
    for(String map : mappedValue.values()) {
      System.out.println(map);
    }
  }
}