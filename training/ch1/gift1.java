/*
ID: gyoushi1
LANG: JAVA
TASK: gift1
*/

import java.io.*;
import java.util.*;

public class gift1 {
  public static void main(String[] args) throws IOException {
    BufferedReader f = new BufferedReader(new FileReader("gift1.in"));
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("gift1.out")));
    StringTokenizer st;

    int n = Integer.parseInt(f.readLine());
    LinkedHashMap<String, Integer> moneys = new LinkedHashMap<>();

    for (int i = 0; i < n; i++) {
      moneys.put(f.readLine(), 0);
    }

    for (int i = 0; i < n; i++) {
      
      String giver = f.readLine();
      st = new StringTokenizer(f.readLine());
      int amt = Integer.parseInt(st.nextToken()), people = Integer.parseInt(st.nextToken());
      // System.out.println(giver + " : " + people + " " + amt);

      if (people != 0 && amt != 0) {
        int receivedAmt = amt/people;
        for (int j = 0; j < people; j++) {
          String receiver = f.readLine();
          // System.out.println(giver + " -> " + receiver);
          moneys.put(receiver, moneys.get(receiver) + receivedAmt);
          moneys.put(giver, moneys.get(giver) - receivedAmt);
        }
      } else if (people != 0) {
        for (int j = 0; j < people; j++) {
          f.readLine();
        }
      }
    }

    moneys.forEach((k, v) -> out.println(k + " " + v));

    out.close();
  }
}