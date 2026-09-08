public class MatricesA2 {
    public static void main(String[] args) {
        //declaracion de la matriz
        int[][]m = {{5, 8, 6},{1, 3, 2},{4, 9, 7}};

        for(int i = 0; i < m.length; i++){ //m.length siempre es para filas
            for(int j = 0; j < m[0].length; j++){ //m[0].length siempre es para columnas
                System.out.println("m["+i+"]["+j+"]="+m[i][j]);
            }           
        }
        
        //visualizar de mejor manera la matriz
        String cad = "";
        for(int i = 0; i < m.length; i++){ //m.length siempre es para filas
            for(int j = 0; j < m[0].length; j++){ //m[0].length siempre es para columnas
                cad += "|"+m[i][j];
            }
            cad += "|\n";
        }
        System.out.println(cad);
    }
}
