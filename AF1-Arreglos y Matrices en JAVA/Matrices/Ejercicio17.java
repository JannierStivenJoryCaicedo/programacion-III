public class Ejercicio17 {
    public static void main(String[] args) {

        int[][] m = { { 5, 8, 6 }, { 1, 3, 2 }, { 4, 9, 7 } };
        int sumaFila = 0;
        int sumaColumna = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                sumaFila += m[i][j];
            }
            System.out.println("Fila " + i + ": " + sumaFila);
        }

        for (int j = 0; j < m[0].length; j++) {
            for (int i = 0; i < m.length; i++) {
                sumaColumna += m[i][j];
            }
            System.out.println("Columna " + j + ": " + sumaColumna);
        }
    }
}
