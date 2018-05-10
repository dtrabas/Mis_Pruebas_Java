/*
 * Fecha creación: 04/07/2017
 * CALCULO-SA
 */
package messageformat;

import java.text.ChoiceFormat;
import java.text.MessageFormat;
import java.text.ParsePosition;
import java.util.Date;

/**
 * // TODO: Describir funcionalidad
 * 
 * @author dtrabas (dtrabas@calculo-sa.es)
 */
public class PruebaMessageFormat {

   /**
    * @param args
    */
   public static void main(String[] args) {

      System.out.println(MessageFormat.format("El parámetro \"{0}\" no existe", "PRUEBA"));

      System.out.println(MessageFormat.format("Así queda un patrón currency: {0,number,currency}", 123456));
      System.out.println();

      System.out.println(MessageFormat.format("La fecha actual short es {0,date,short}", new Date()));
      System.out.println(MessageFormat.format("La fecha actual medium es {0,date,medium}", new Date()));
      System.out.println(MessageFormat.format("La fecha actual long es {0,date,long}", new Date()));
      System.out.println(MessageFormat.format("La fecha actual full es {0,date,full}", new Date()));
      System.out.println();

      System.out.println(MessageFormat.format("La hora actual short es {0,time,short}", new Date()));
      System.out.println(MessageFormat.format("La hora actual medium es {0,time,medium}", new Date()));
      System.out.println(MessageFormat.format("La hora actual long es {0,time,long}", new Date()));
      System.out.println(MessageFormat.format("La hora actual full es {0,time,full}", new Date()));
      System.out.println();

      System.out.println(MessageFormat.format("Proceso iniciado el {0,date,long} a las {0,time,medium}", new Date()));
      System.out.println();

      MessageFormat messageFormat = new MessageFormat("The disk \"{0}\" contains {1}.");
      String diskName = "MyDisk";
      double[] filelimits = {0, 1, 2};
      String[] filepart = {"no files", "one file", "{1,number} files"};
      ChoiceFormat fileform = new ChoiceFormat(filelimits, filepart);
      messageFormat.setFormatByArgumentIndex(1, fileform);

      System.out.println(messageFormat.format(new Object[] {diskName, Long.valueOf(0)}));
      System.out.println(messageFormat.format(new Object[] {diskName, Long.valueOf(1)}));
      System.out.println(messageFormat.format(new Object[] {diskName, Long.valueOf(10)}));
      System.out.println();

      MessageFormat mf = new MessageFormat("{0,number,#.##}, {0,number,#.#}");
      Object[] objs = {new Double(3.1415)};
      String result = mf.format(objs);
      System.out.println(result);
      // result now equals "3.14, 3.1"
      objs = null;
      objs = mf.parse(result, new ParsePosition(0));
      System.out.println(mf.format(objs));
      System.out.println();

   }

}
