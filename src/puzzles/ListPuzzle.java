/*
 * Fecha creación: 28/12/2015
 * CALCULO-SA
 */
package puzzles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListPuzzle {

   public static void main(String args[]) {
      List<String> circus1 = new ArrayList<String>();
      circus1.add("Monkey");
      circus1.add("Elephant");

      List<String> zoo1 = new ArrayList<String>(circus1);
      zoo1.add("Lion");
      System.out.println("zoo1 size: " + zoo1.size());

      String[] circus2 = {"Monkey", "Elephant"};

      List<String> zoo2 = Arrays.asList(circus2);
      Collections.swap(zoo2, 0, 1);
      System.out.println("zoo2 size: " + zoo2.size());
      for (String s : circus2) {
         System.out.println(s);
      }

      int array[] = {3, 5, 7, 8};
      List lArray = Arrays.asList(array);
      System.out.println("lArray.size()=" + lArray.size());

   }
}
