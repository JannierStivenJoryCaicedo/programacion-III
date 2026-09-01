public class Ejecutar {
    public static void main(String[] args) {
       //forma 1 - crear arreglo
       int[]a = {2, 8, 10, 6, 15, 20, 21, 1, 3, 12};

       //recorrer arreglo
       for(int i = 0; i < a.length; i++){
        System.out.println("a["+ i + "]=" + a[i]);
       }

    /*
       int[]b = new int[10];

       Random r = new Random();

       for(int i = 0; i < b.length; i++){
        b[i] = (r.nextInt()*10-1) + 1;
       }
    */

       //forma 2 - aleatorio

       int[]b = new int[10];
       int max = 100;
       int min = 1;

       for(int i = 0; i < b.length; i++){
        b[i] = (int)(Math.random()*(max-min+1)) + min;
       }

       //mostrar el arreglo
       for(int i = 0; i < b.length; i++){
        System.out.println("b["+ i + "]=" + b[i]);
       }
    }
}
