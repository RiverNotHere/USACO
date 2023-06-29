/*
ID: *****
LANG: JAVA
TASK: ride
*/

import java.util.*;
import java.io.*;

public class ride {
  public static void main(String[] args) throws IOException {
    BufferedReader f = new BufferedReader(new FileReader("ride.in"));
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));
    String comet, group;
    
    comet = f.readLine();
    int cometTotal = 1;
    for (Character c : comet.toCharArray()) {
      if (c != ' ') cometTotal *= c - 'A' + 1;
    }
    cometTotal %= 47;

    group = f.readLine();
    int groupTotal = 1;
    for (Character c : group.toCharArray()) {
      if (c != ' ') groupTotal *= c - 'A' + 1;
    }
    groupTotal %= 47;

    if (cometTotal == groupTotal) out.println("GO");
    else out.println("STAY");
    
    out.close();
  }
}
