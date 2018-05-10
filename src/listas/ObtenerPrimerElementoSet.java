/*
 * Fecha creación: 19/04/2016
 * CALCULO-SA
 */
package listas;

import java.util.HashSet;
import java.util.Iterator;

/**
 * // TODO: Describir funcionalidad
 * 
 * @author Dtrabas (Dtrabas@calculo-sa.es)
 */
public class ObtenerPrimerElementoSet {

   /**
    * @param args
    */
   public static void main(String[] args) {

      HashSet<Integer> hashSet = new HashSet<Integer>();
      hashSet.add(Integer.valueOf(1));
      hashSet.add(Integer.valueOf(2));
      System.out.println(hashSet.iterator().next());
      System.out.println(hashSet.iterator().next());
      if (hashSet.iterator().hasNext()) {
         System.out.println(hashSet.iterator().next());
      }

      Iterator<Integer> iterator = hashSet.iterator();
      System.out.println(iterator.next());
      System.out.println(iterator.next());

   }

}
