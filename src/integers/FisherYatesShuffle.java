/*
 * Fecha creación: 28/03/2016
 * CALCULO-SA
 */
package integers;

import org.apache.commons.lang.math.RandomUtils;

/**
 * // TODO: Describir funcionalidad
 * 
 * @author Dtrabas (Dtrabas@calculo-sa.es)
 */
public class FisherYatesShuffle {

   /**
    * @param args
    */
   public static void main(String[] args) {

      int suffle[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

      play(suffle);
      play(suffle);
      play(suffle);
      play(suffle);
      play(suffle);
      play(suffle);
      play(suffle);
      play(suffle);
      play(suffle);
      play(suffle);

   }

   /**
    * @param suffle
    */
   private static void play(int[] suffle) {
      fisherYatesShuffle(suffle);

      for (int i : suffle) {
         System.out.println(i);
      }

      System.out.println("----------------------");
   }

   /**
    * @param suffle
    */
   private static void fisherYatesShuffle(int[] suffle) {
      for (int i = suffle.length - 1; i > 1; i--) {
         int j = RandomUtils.nextInt(i + 1);
         swap(suffle, i, j);
      }
   }

   /**
    * @param suffle
    * @param i
    * @param j
    */
   private static void swap(int[] suffle, int i, int j) {
      int tmp = suffle[j];
      suffle[j] = suffle[i];
      suffle[i] = tmp;
   }

}
