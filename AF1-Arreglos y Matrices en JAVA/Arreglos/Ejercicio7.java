public class Ejercicio7 {
   public static void main(String[] args) {

      int[] a = { 2, 4, 6, 8, 10, 11, 13, 15, 17, 19 };
      int[] b = new int[a.length];
      int[] c = new int[a.length];

      for (int i = 0; i < a.length; i++) {
         if (a[i] % 2 == 0) {
            b[i] = a[i];
         } else {
            c[i] = a[i];
         }
      }

      System.out.println("Arreglo con los números pares:");
      for (int i = 0; i < b.length; i++) {
         if (b[i] != 0) {
            System.out.println("b[" + i + "]=" + b[i]);
         }
      }

      System.out.println("Arreglo con los números impares:");
      for (int i = 0; i < c.length; i++) {
         if (c[i] != 0) {
            System.out.println("c[" + i + "]=" + c[i]);
         }
      }
   }
}
