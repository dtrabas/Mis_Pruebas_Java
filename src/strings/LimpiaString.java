/*
 * Fecha creación: 20/09/2016
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
      String prueba = "--INFORMACIÓN--";
      System.out.println("[" + limpiaString(prueba) + "]");
   }

   /**
    * @param prueba
    * @return
    */
   private static String limpiaString(String cadena) {
      // Primero convertimos a mayúsculas
      cadena = cadena.toUpperCase();
      // Eliminamos guiones iniciales
      while (cadena.startsWith("-")) {
         cadena = cadena.substring(1);
      }
      // Y finales
      while (cadena.endsWith("-")) {
         cadena = cadena.substring(0, cadena.length() - 1);
      }
      // Controlamos que INFORMACIÓN llegue sin acentos
      if ("INFORMACIÓN".equals(cadena)) {
         cadena = "INFORMACION";
      }
      return cadena;
   }

}
