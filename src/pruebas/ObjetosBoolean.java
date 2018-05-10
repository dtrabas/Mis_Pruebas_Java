/*
 * Fecha creación: 24/09/2015
 * CALCULO-SA
 */
package pruebas;

/**
 * // TODO: Describir funcionalidad
 * 
 * @author Dtrabas (Dtrabas@calculo-sa.es)
 */
public class ObjetosBoolean {

   /**
    * @param args
    */
   public static void main(String[] args) {
      Boolean b1 = false;
      Boolean b2 = false;
      Boolean b3 = false;

      System.out.println("b1=" + b1 + " b2=" + b2 + " b3=" + b3);
      System.out.println();
      System.out.println(b1.hashCode());
      System.out.println(b2.hashCode());
      System.out.println(b3.hashCode());

      b1 = true;
      b3 = true;

      System.out.println("b1=" + b1 + " b2=" + b2 + " b3=" + b3);
      System.out.println();
      System.out.println(b1.hashCode());
      System.out.println(b2.hashCode());
      System.out.println(b3.hashCode());

   }

}
