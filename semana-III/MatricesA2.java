public class MatricesA2 {
    public static void main(String[] args) {
        //declaracion de la matriz
        int[][]m = {{5, 8, 6},{1, 3, 2},{4, 9, 7}};

        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[0].length; j++){
                System.out.println("m["+i+"]["+j+"]="+m[i][j]);
            }           
        }
        
    }
}
