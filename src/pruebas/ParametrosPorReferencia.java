/*
 * Fecha creación: 27/10/2015
 * CALCULO-SA
 */
package pruebas;

import java.util.ArrayList;
import java.util.List;

/**
 * Prueba para comprobar como se comporta el paso de variables a funciones: valor/Referencia
 * 
 * @author Dtrabas (Dtrabas@calculo-sa.es)
 */
public class ParametrosPorReferencia {

   public static void main(String[] args) {
      String cad = "Cadena inicial";
      foo(cad);
      System.out.println("Cadena final=" + cad);
      List<Long> lista = new ArrayList<Long>(0);
      System.out.println(lista.size());
   }

   private static void foo(String cadena) {
      System.out.println("Cadena = " + cadena);
      cadena = "Otra cadenaXXX";
      System.out.println("Cadena = " + cadena);
   }

}
