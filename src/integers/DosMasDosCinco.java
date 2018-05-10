/*
 * Fecha creación: 28/03/2016
 * CALCULO-SA
 */
package integers;

import java.lang.reflect.Field;

/**
 * // TODO: Describir funcionalidad
 * 
 * @author Dtrabas (Dtrabas@calculo-sa.es)
 */
public class DosMasDosCinco {

   public static void main(String[] args) throws SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
      Class cache = Integer.class.getDeclaredClasses()[0];
      Field c = cache.getDeclaredField("cache");
      c.setAccessible(true);
      Integer[] array = (Integer[]) c.get(cache);
      array[132] = array[133];

      System.out.printf("%d", 2 + 2);
   }
}
