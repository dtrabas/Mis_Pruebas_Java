/*
 * Fecha creación: 21/03/2018
 * CALCULO-SA
 */
package reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * // TODO: Describir funcionalidad
 * 
 * @author dtrabas (dtrabas@calculo-sa.es)
 */
public class Prueba {

   /**
    * @throws NoSuchMethodException
    * @throws SecurityException
    * @throws InvocationTargetException
    * @throws IllegalAccessException
    * @throws IllegalArgumentException
    * 
    */
   public Prueba() {}

   /**
    * @param args
    */
   public static void main(String[] args) {
      Prueba p = new Prueba();

      Method m;
      try {
         m = p.getClass().getMethod("foo1", Integer.class);
         m.invoke(p, (Object) Integer.valueOf(1));

         m = p.getClass().getMethod("foo2", Double.class);

         m.invoke(p, (Object) Double.valueOf(2));

      } catch (Exception e) {

      }
   }

   public void foo1(Integer n) {
      System.out.println("Foo1" + n);
   }

   public void foo2(Double n) {
      System.out.println("Foo2" + n);
   }

}
