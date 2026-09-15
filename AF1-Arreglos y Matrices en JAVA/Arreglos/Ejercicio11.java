public class Ejercicio11 {
    public static void main(String[] args) {
        int[] a = { 0, -6, -4, -2, 0, 2, 4, 6, 0 };
        int[] negativo = new int[a.length];
        int[] cero = new int[a.length];
        int[] positivo = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                negativo[i] = a[i];
            } else if (a[i] == 0) {
                cero[i] = a[i];
            } else {
                positivo[i] = a[i];
            }
        }

        System.out.println("Arreglo con los números negativos:");
        for (int i = 0; i < negativo.length; i++) {
            if (negativo[i] != 0) {
                System.out.println("negativo[" + i + "]=" + negativo[i]);
            }
        }

        System.out.println("Arreglo con los números cero:");
        for (int i = 0; i < cero.length; i++) {
            System.out.println("cero[" + i + "]=" + cero[i]);
        }

        System.out.println("Arreglo con los números positivos:");
        for (int i = 0; i < positivo.length; i++) {
            if (positivo[i] != 0) {
                System.out.println("positivo[" + i + "]=" + positivo[i]);
            }
        }
    }
}
