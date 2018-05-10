/*
 * Fecha creación: 19/01/2016
 * CALCULO-SA
 */
package pruebas;

import java.util.Calendar;

/**
 * // TODO: Describir funcionalidad
 * 
 * @author Dtrabas (Dtrabas@calculo-sa.es)
 */
public class CrearCalendarConNull {

   /**
    * @param args
    */
   public static void main(String[] args) {
      Calendar cal = Calendar.getInstance();
      cal.setTime(null);
      cal.add(Calendar.DATE, 10);
      System.out.println(cal);
   }

}
