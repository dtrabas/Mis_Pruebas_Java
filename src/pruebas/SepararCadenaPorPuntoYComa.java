/*
 * Fecha creación: 22/10/2015
 * CALCULO-SA
 */
package pruebas;

/**
 * // TODO: Describir funcionalidad
 * 
 * @author Dtrabas (Dtrabas@calculo-sa.es)
 */
public class SepararCadenaPorPuntoYComa {

   /**
    * @param args
    */
   public static void main(String[] args) {

      String cadena = "uno;; dos";

      String[] array = cadena.split(";");

      for (String elemento : array) {
         System.out.println("*" + elemento + "*");
      }

   }

}
