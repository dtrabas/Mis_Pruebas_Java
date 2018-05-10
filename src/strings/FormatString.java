/*
 * Fecha creación: 10/10/2017
 * CALCULO-SA
 */
package strings;

/**
 * // TODO: Describir funcionalidad
 * 
 * @author dtrabas (dtrabas@calculo-sa.es)
 */
public class FormatString {

   /**
    * 
    */
   public FormatString() {
      // TODO Cuerpo autogenerado

   }

   /**
    * @param args
    */
   public static void main(String[] args) {
      String codPostal = String.format("%05d", Integer.valueOf("".trim()));
      System.out.println("***" + codPostal + "***");
   }

}
