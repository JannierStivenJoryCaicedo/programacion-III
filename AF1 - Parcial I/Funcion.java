public class Funcion {
    private String horario;
    private Pelicula pelicula;
    private String[][] sillas;
    private int disponibles;
    private int tipoSala;

    public Funcion() {
        horario = "";
        pelicula = new Pelicula();
        sillas = null;
        disponibles = 0;
        tipoSala = 0;
    }

    public Funcion(String h, Pelicula p, String[][] s, int ts) {
        horario = h;
        pelicula = p;
        sillas = s;
        tipoSala = ts;
        disponibles = calcularDisponibles();
    }

    public void Set(String h, Pelicula p, String[][] s, int ts) {
        horario = h;
        pelicula = p;
        sillas = s;
        tipoSala = ts;
        disponibles = calcularDisponibles();
    }

    public String getHorario() {
        return horario;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public String[][] getSillas() {
        return sillas;
    }

    public int getDisponibles() {
        return disponibles;
    }

    public int getTipoSala() {
        return tipoSala;
    }

    public void asignarPelicula(Pelicula p) {
        pelicula = p;
    }

    public int calcularDisponibles() {
        int cantidad = 0;

        if (sillas != null) {
            for (int i = 0; i < sillas.length; i++) {
                for (int j = 1; j < sillas[i].length; j++) {

                    if (sillas[i][j].charAt(0) == '_') {
                        cantidad++;
                    }
                }
            }
        }
        return cantidad;
    }

    public void ocuparSillasAleatorias() {
        int cantidad = (int) (Math.random() * 11) + 5;
        int ocupadas = 0;

        while (ocupadas < cantidad) {
            int fila = (int) (Math.random() * sillas.length);
            int columna = (int) (Math.random() * 12) + 1;

            if (sillas[fila][columna].charAt(0) == '_') {
                sillas[fila][columna] = "X";
                ocupadas++;
            }
        }
        disponibles = calcularDisponibles();
    }

    public void mostrarSillas() {
        System.out.println();
        System.out.println("Horario: " + horario);
        System.out.println("Pelicula: " + pelicula.getNombre());
        System.out.println();

        for (int i = 0; i < sillas.length; i++) {
            for (int j = 0; j < sillas[i].length; j++) {
                System.out.print(sillas[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Sillas disponibles: " + disponibles);
    }

    public int buscarFila(String fila) {
        int posicion = -1;

        for (int i = 0; i < sillas.length; i++) {
            if (sillas[i][0].charAt(0) == fila.charAt(0)) {
                posicion = i;
            }
        }
        return posicion;
    }

    public int comprarSilla(String fila, int numero) {
        int filaEncontrada = buscarFila(fila);
        int resultado = 0;

        if (filaEncontrada == -1) {
            resultado = 1;
        } else if (numero < 1 || numero > 12) {
            resultado = 2;
        } else if (sillas[filaEncontrada][numero].charAt(0) == ' ') {
            resultado = 3;
        } else if (sillas[filaEncontrada][numero].charAt(0) == 'X') {
            resultado = 4;
        } else {
            sillas[filaEncontrada][numero] = "X";
            disponibles = calcularDisponibles();
            resultado = 5;
        }
        return resultado;
    }

    public int precioSilla(String fila) {
        int precio = 8000;

        if (tipoSala == 3) {
            precio = 10000;
        } else {
            if (fila.charAt(0) == 'G' || fila.charAt(0) == 'H') {
                precio = 12000;
            }
        }
        return precio;
    }
}
