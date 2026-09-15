import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el numero de filas: ");
        int n = sc.nextInt();

        System.out.print("Ingrese el numero de columnas: ");
        int m = sc.nextInt();

        int[][]a = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j) {
                    a[i][j] = 1;
                } else {
                    a[i][j] = 0;
                }
            }
        }

        System.out.println("Matriz:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}