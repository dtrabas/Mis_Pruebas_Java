/*
 * Fecha creación: 10/02/2016
 * CALCULO-SA
 */
package pruebas;

public class StringBuffer_vs_StringBuilder {

   public static void main(String[] args) {
      int N = 77777777;
      long t;

      {
         StringBuffer sb = new StringBuffer();
         t = System.currentTimeMillis();
         for (int i = N; i-- > 0;) {
            sb.append("");
         }
         System.out.println(System.currentTimeMillis() - t);
      }

      {
         StringBuilder sb = new StringBuilder();
         t = System.currentTimeMillis();
         for (int i = N; i-- > 0;) {
            sb.append("");
         }
         System.out.println(System.currentTimeMillis() - t);
      }
   }
}
