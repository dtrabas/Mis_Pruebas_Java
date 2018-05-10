/*
 * Fecha creación: 30/11/2015
 * CALCULO-SA
 */
package pruebas;

/**
 * // TODO: Describir funcionalidad
 * 
 * @author Dtrabas (Dtrabas@calculo-sa.es)
 */
public class ComparacionEnteros {

   /**
    * 
    */
   public ComparacionEnteros() {
      // TODO Cuerpo autogenerado

   }

   /**
    * @param args
    */
   public static void main(String[] args) {
      int a = Integer.MAX_VALUE;
      int b = Integer.MIN_VALUE;
      if (a < b) {
         System.out.println("a < b");
      }
      if (a - b < 0) {
         System.out.println("a - b < 0"); // Overflow. Return -1
      }
   }

}
