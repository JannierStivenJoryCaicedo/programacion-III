import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] a = new int[30];
        int max = 10;
        int min = 1;

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * (max - min + 1)) + min;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "]=" + a[i]);
        }

        System.out.print("Ingrese el numero que desea buscar: ");
        int n = sc.nextInt();

        int contador = 0;

        for (int i = 0; i < a.length; i++) {

            if (a[i] == n) {
                contador++;
            }
        }
        System.out.println("\nEl numero " + n + " aparece " + contador + " veces.");
    }
}
