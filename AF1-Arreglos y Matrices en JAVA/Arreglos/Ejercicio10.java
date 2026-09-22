public class Ejercicio10 {
    public static void main(String[] args) {
        int[] a = new int[7];
        int[] b = new int[7];
        int max = 10;
        int min = 1;

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * (max - min + 1)) + min;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "]=" + a[i]);
        }

        for (int i = 0; i <(a.length + 1) /2; i++) {
            if (i != a.length - 1 - i) {
                b[i] = a[i] + a[a.length - 1 - i];
                System.out.println("b[" + i + "]=" + b[i]);
            } else {
                b[i] = a[i];
                System.out.println("b[" + i + "]=" + b[i]);
            }
        }
    }
}
