/*
 * Fecha creación: 24/02/2016
 * CALCULO-SA
 */
package fechas;

import java.util.Calendar;
import java.util.Date;

/**
 * // TODO: Describir funcionalidad
 * 
 * @author Dtrabas (Dtrabas@calculo-sa.es)
 */
public class PruebasCalendar {

   /**
    * @param args
    */
   public static void main(String[] args) {
      Calendar calFecReenvio = Calendar.getInstance();
      calFecReenvio.set(2100, 12, 31);
      Date fechaDate = calFecReenvio.getTime();

      System.out.println("fechaDate = " + fechaDate);

   }

}
