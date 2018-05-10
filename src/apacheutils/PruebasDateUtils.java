/*
 * Fecha creación: 02/12/2015
 * CALCULO-SA
 */
package apacheutils;

import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;

import org.apache.commons.lang.time.DateFormatUtils;
import org.apache.commons.lang.time.DateUtils;
import org.apache.commons.lang.time.StopWatch;

/**
 * Probando las DateUtils de Apache Commons...
 * 
 * @author Dtrabas (Dtrabas@calculo-sa.es)
 */
public class PruebasDateUtils {

   /**
    * @param args
    */
   public static void main(String[] args) {

      pruebaIterarFechasSemana();

      pruebaRedondeoFechasMesArribaMesAbajo();

      pruebaTruncateFechaActual();
   }

   /**
    * 
    */
   private static void pruebaTruncateFechaActual() {
      Date now = new Date();
      Date truncYear = DateUtils.truncate(now, Calendar.YEAR);
      Date truncMonth = DateUtils.truncate(now, Calendar.MONTH);
      System.out.println("now: " + DateFormatUtils.ISO_DATETIME_TIME_ZONE_FORMAT.format(now));
      System.out.println("truncYear: " + DateFormatUtils.ISO_DATETIME_TIME_ZONE_FORMAT.format(truncYear));
      System.out.println("truncMonth: " + DateFormatUtils.ISO_DATETIME_TIME_ZONE_FORMAT.format(truncMonth));
   }

   /**
    * 
    */
   private static void pruebaRedondeoFechasMesArribaMesAbajo() {
      Calendar cal = Calendar.getInstance();
      cal.set(2004, 2, 5, 10, 2, 2);
      System.out.println(DateUtils.round(cal.getTime(), DateUtils.SEMI_MONTH));

      cal.add(Calendar.DAY_OF_MONTH, 19);
      System.out.println(cal.getTime());
      System.out.println(DateUtils.round(cal.getTime(), DateUtils.SEMI_MONTH));
   }

   /**
    * 
    */
   private static void pruebaIterarFechasSemana() {

      StopWatch stWatch = new StopWatch();

      // Start StopWatch
      stWatch.start();

      // Get iterator for all days in a week starting Monday
      Iterator itr = DateUtils.iterator(new Date(), DateUtils.RANGE_WEEK_CENTER);

      while (itr.hasNext()) {
         Calendar gCal = (Calendar) itr.next();
         System.out.println(gCal.getTime());
      }

      // Stop StopWatch
      stWatch.stop();
      System.out.println("Time Taken >>" + stWatch.getTime());

   }

}
