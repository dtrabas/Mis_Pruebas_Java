/*
 * Fecha creación: 17/10/2017
 * CALCULO-SA
 */
package pruebas;

import java.lang.reflect.InvocationTargetException;
import java.util.logging.Logger;

import org.apache.commons.beanutils.BeanUtils;

/**
 * // TODO: Describir funcionalidad
 * 
 * @author dtrabas (dtrabas@calculo-sa.es)
 */
public class PruebaBeanUtilsNullCopy {

   /** Logger */
   private static Logger logger = Logger.getLogger(PruebaBeanUtilsNullCopy.class.getName());

   /**
    * 
    */
   public PruebaBeanUtilsNullCopy() {
      // TODO Cuerpo autogenerado

   }

   /**
    * @param args
    */
   public static void main(String[] args) {
      Tontin foo1 = new Tontin("A", "B");
      Tontin foo2 = new Tontin("C", null);

      try {
         BeanUtils.copyProperties(foo1, foo2);
      } catch (IllegalAccessException e) {
         // TODO Catch autogenerado
         e.printStackTrace();
      } catch (InvocationTargetException e) {
         // TODO Catch autogenerado
         e.printStackTrace();
      }

      System.out.println(foo1);

   }

   public static class Tontin {

      Tontin(String tonto1, String tonto2) {
         this.tonto1 = tonto1;
         this.tonto2 = tonto2;
      }

      private String tonto1;
      private String tonto2;

      /**
       * @return Obtiene el valor de tonto1.
       */
      public String getTonto1() {
         return this.tonto1;
      }

      /**
       * @param tonto1
       *           Nuevo valor de tonto1.
       */
      public void setTonto1(String tonto1) {
         this.tonto1 = tonto1;
      }

      /**
       * @return Obtiene el valor de tonto2.
       */
      public String getTonto2() {
         return this.tonto2;
      }

      /**
       * @param tonto2
       *           Nuevo valor de tonto2.
       */
      public void setTonto2(String tonto2) {
         this.tonto2 = tonto2;
      }

   }

}
