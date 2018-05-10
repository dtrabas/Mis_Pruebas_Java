/*
 * Fecha creaci�n: 20/09/2016
 * CALCULO-SA
 */
package strings;

/**
 * // TODO: Describir funcionalidad
 * 
 * @author Dtrabas (Dtrabas@calculo-sa.es)
 */
public class LimpiaString {

   /**
    * @param args
    */
   public static void main(String[] args) {
      String prueba = "--INFORMACI�N--";
      System.out.println("[" + limpiaString(prueba) + "]");
   }

   /**
    * @param prueba
    * @return
    */
   private static String limpiaString(String cadena) {
      // Primero convertimos a may�sculas
      cadena = cadena.toUpperCase();
      // Eliminamos guiones iniciales
      while (cadena.startsWith("-")) {
         cadena = cadena.substring(1);
      }
      // Y finales
      while (cadena.endsWith("-")) {
         cadena = cadena.substring(0, cadena.length() - 1);
      }
      // Controlamos que INFORMACI�N llegue sin acentos
      if ("INFORMACI�N".equals(cadena)) {
         cadena = "INFORMACION";
      }
      return cadena;
   }

}
