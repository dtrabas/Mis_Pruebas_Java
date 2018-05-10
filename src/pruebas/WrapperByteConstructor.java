/*
 * Fecha creación: 03/09/2015
 * CALCULO-SA
 */
package pruebas;

/**
 * // TODO: Describir funcionalidad
 * 
 * @author Dtrabas (Dtrabas@calculo-sa.es)
 */
public class WrapperByteConstructor {

   public static void main(String[] args) {
      int i1 = 1;
      final int i2 = 126;
      final int i3 = 245;
      // byte b1 = i1; // Compile-time error, not final variable
      byte b2 = i2; // OK, compile time constant
      // byte b3 = i3; // Compile-time error, over range
      byte b4 = (i2 + 1); // OK, compile time constant expression
      // byte b5 = (i1 + 2); // Compile-time error, not final variable
   }

}
