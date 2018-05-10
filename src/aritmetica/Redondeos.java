/*
 * Fecha creación: 14/02/2018
 * CALCULO-SA
 */
package aritmetica;

/**
 * // TODO: Describir funcionalidad
 * 
 * @author dtrabas (dtrabas@calculo-sa.es)
 */
public class Redondeos {

   public static void main(String[] args) {
      double op1 = 0.105;
      double op2 = 0.20;
      System.out.println(suma(op1, op2));
      System.out.println(suma(op1, -op2));
      System.out.println(suma(op1, op2, op1));

      System.out.println("--------------");

      Double op11 = Double.valueOf(op1);
      Double op22 = Double.valueOf(op2);
      System.out.println(suma(op11, op22));
      System.out.println(suma(op11, Double.valueOf(-op22)));

      System.out.println("--------------");

      System.out.println(suma(op1, 0));
      System.out.println(suma(op11, null));
      System.out.println(suma(0, op2));
      System.out.println(suma(null, op22));
      System.out.println(suma(null, null));
      op22 = null;
      System.out.println(suma(op11, op22));
      System.out.println(suma(op11, op22, op11, op22));
   }

   public static double suma(double op1, double op2) {
      return Math.round((op1 + op2) * 100) / 100d;
   }

   public static double suma(Double... operandos) {
      double total = 0;
      for (Double obj : operandos) {
         if (obj != null) total = suma(total, obj.doubleValue());
      }
      return total;
   }

   public static double sumax(double op1, double op2) {
      return op1 + op2;
   }

   /**
    * Suma los dos objetos que recibe teniendo en cuenta que el valor <code>null</code> se trata
    * como cero.
    * 
    * @param obj1
    * @param obj2
    * @return
    */
   public static double suma(Double obj1, Double obj2) {
      double op1, op2;

      if (obj1 == null)
         op1 = 0;
      else op1 = obj1.doubleValue();

      if (obj2 == null)
         op2 = 0;
      else op2 = obj2.doubleValue();

      return suma(op1, op2);
   }

   /**
    * Suma los dos operandos tratando <code>null</code> como cero.
    * 
    * @param obj1
    * @param op2
    * @return
    */
   public static double suma(Double obj1, double op2) {
      double op1;

      if (obj1 == null)
         op1 = 0;
      else op1 = obj1.doubleValue();

      return suma(op1, op2);
   }

   /**
    * Suma los dos operandos tratando <code>null</code> como cero.
    * 
    * @param op1
    * @param obj2
    * @return
    */
   public static double suma(double op1, Double obj2) {
      double op2;

      if (obj2 == null)
         op2 = 0;
      else op2 = obj2.doubleValue();

      return suma(op1, op2);
   }

}
