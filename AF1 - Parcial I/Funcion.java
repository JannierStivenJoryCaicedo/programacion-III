public class Funcion {
    private String horario;
    private String[][] matrizSillas;
    private Pelicula pelicula;
    private int sillaDisponible;
    private int tipoSala;

    public Funcion() {
        horario = "";
        pelicula = new Pelicula();
        matrizSillas = null;
        sillaDisponible = 0;
        tipoSala = 0;
    }

    public Funcion(String h, Pelicula p, String[][] s, int sd, int ts) {
        horario = h;
        pelicula = p;
        matrizSillas = s;
        sillaDisponible = sd;
        tipoSala = ts;
    }

    public void Set(String h, Pelicula p, String[][] s, int sd, int ts) {
        horario = h;
        pelicula = p;
        matrizSillas = s;
        sillaDisponible = sd;
        tipoSala = ts;
    }

    public String getHorario() {
        return horario;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public String[][] getSillas() {
        return matrizSillas;
    }

    public int getSillaDisponible() {
        return calcularDisponible();
    }

    public int calcularDisponible() {
        int cantidad = 0;
        if (matrizSillas != null) {
            for (int i = 0; i < matrizSillas.length; i++) {
                for (int j = 0; j < matrizSillas[i].length; j++) {

                    if (matrizSillas[i][j].equals("_")) {
                        cantidad++;
                    }
                }
            }
        }
        return cantidad;
    }

    public void llenarMatrizAleatoriamente() {
        int cantidad = (int) (Math.random() * 11) + 5;
        int ocupadas = 0;

        while (ocupadas < cantidad) {
            int fila = (int) (Math.random() * matrizSillas.length);
            int columna = (int) (Math.random() * matrizSillas[0].length);

            if (matrizSillas[fila][columna].equals("_")) {
                matrizSillas[fila][columna] = "X";
                ocupadas++;
            }
        }
        sillaDisponible = calcularDisponible();
    }
}
