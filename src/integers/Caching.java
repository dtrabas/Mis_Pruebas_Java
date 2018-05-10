/*
 * Fecha creación: 28/03/2016
 * CALCULO-SA
 */
package integers;

/**
 * // TODO: Describir funcionalidad
 * 
 * @author Dtrabas (Dtrabas@calculo-sa.es)
 */
public class Caching {

   /**
    * @param args
    */
   public static void main(String[] args) {
      Integer i = 3;
      i = i + 1;
      Integer j = i;
      j = i + j;
      System.out.println("Fin...");
   }

}
