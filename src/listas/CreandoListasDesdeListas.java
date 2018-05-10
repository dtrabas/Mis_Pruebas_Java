/*
 * Fecha creación: 29/12/2015
 * CALCULO-SA
 */
package listas;

import java.util.ArrayList;
import java.util.List;

/**
 * // TODO: Describir funcionalidad
 * 
 * @author Dtrabas (Dtrabas@calculo-sa.es)
 */
public class CreandoListasDesdeListas {

   public static void main(String args[]) {

      List<String> lista1 = new ArrayList<String>();
      lista1.add("uno");
      lista1.add("dos");
      lista1.add("tres");

      List<String> lista2 = new ArrayList<String>(lista1);
      lista2.set(0, "cuatro");
      lista2.set(1, "cinco");
      lista2.set(2, "seis");

      pintaLista(lista1, "lista1");
      pintaLista(lista2, "lista2");
      pintaLista(lista1, "lista1");
      pintaLista(new ArrayList<String>(), "Nada");
      pintaLista(null, "Null");

   }

   /**
    * @param lista2
    * @param string
    */
   private static void pintaLista(List<String> lista, String nombre) {

      System.out.println("Contenido de la lista " + nombre + ":");
      if (lista != null && !lista.isEmpty()) {
         for (String string : lista) {
            System.out.println("-- " + string);
         }
      } else {
         System.out.println("-- Lista vacía ---");
      }

   }

}
