/*
 * Fecha creación: 18/01/2016
 * CALCULO-SA
 */
package pruebas;

import java.util.regex.Pattern;

/**
 * Pruebas para comprobar si un objeto es un array
 * 
 * @author Dtrabas (Dtrabas@calculo-sa.es)
 */
public class EsUnArray {

   /** RegEx para eliminar caracteres invalidos del Xml */
   public static Pattern INVALID_XML_CHARS = Pattern
         .compile("[^\\u0009\\u000A\\u000D\\u0020-\\uD7FF\\uE000-\\uFFFD\uD800\uDC00-\uDBFF\uDFFF]");

   /**
    * 
    * @param cadena
    * @return
    */
   public static String eliminaCaracteresInvalidosXml(String cadena) {
      if (cadena != null) {
         return INVALID_XML_CHARS.matcher(cadena).replaceAll("");
      } else {
         return cadena;
      }
   }

   /**
    * @param args
    */
   public static void main(String[] args) {
      Object o = new int[] {1, 2};
      int[] arrayInt = new int[] {1, 2};
      System.out.println(o instanceof int[]); // prints "true"
      System.out.println(arrayInt instanceof int[]); // ???
      System.out.println(isArray(o)); // prints "true"
      System.out.println(isArray(arrayInt)); // ???
      System.out.println("*" + eliminaCaracteresInvalidosXml(null) + "*");
      System.out.println("*" + eliminaCaracteresInvalidosXml("") + "*");
   }

   public static boolean isArray(final Object obj) {
      return obj instanceof Object[];
   }

}
