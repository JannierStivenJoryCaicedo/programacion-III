public class Ejercicio8 {
    public static void main(String[] args) {

        int[] a = new int[30];
        int max = 100;
        int min = 1;

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * (max - min + 1)) + min;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "]=" + a[i]);
        }

        int mayor = a[0];
        int menor = a[0];

        for (int i = 1; i < a.length; i++) {

            if (a[i] > mayor) {
                mayor = a[i];
            }

            if (a[i] < menor) {
                menor = a[i];
            }
        }

        int repeticionMayor = 0;
        int repeticionMenor = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == mayor) {
                repeticionMayor++;
            }
            if (a[i] == menor) {
                repeticionMenor++;
            }
        }
        System.out.println("El número mayor es: " + mayor + " y se repite " + repeticionMayor + " veces");
        System.out.println("El número menor es: " + menor + " y se repite " + repeticionMenor + " veces");
    }
}
