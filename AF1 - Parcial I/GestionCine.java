public class GestionCine {
    private Pelicula[] peliculas;
    private Sala[] salas;
    private int cantidadPeliculas;

    public GestionCine() {
        peliculas = new Pelicula[50];
        salas = new Sala[3];
        cantidadPeliculas = 0;
        crearSalas();
    }

    public void crearSalas() { 
        salas[0] = new Sala("1");
        salas[1] = new Sala("2");
        salas[2] = new Sala("3");
    }

    public Sala[] getSalas() {
        return salas;
    }

    public Pelicula[] getPeliculas() {
        return peliculas;
    }

    public int getCantidadPeliculas() {
        return cantidadPeliculas;
    }

    public void agregarPelicula(Pelicula pelicula) {
        if (cantidadPeliculas < peliculas.length) {
            peliculas[cantidadPeliculas] = pelicula;
            cantidadPeliculas++;
        }
    }

    public void mostrarPeliculas() {
        if (cantidadPeliculas == 0) {
            System.out.println("No hay peliculas registradas.");
        } else {
            for (int i = 0; i < cantidadPeliculas; i++) {
                System.out.println();
                System.out.println("Pelicula " + (i + 1));
                peliculas[i].imprimir();
            }
        }
    }

    public Pelicula obtenerPelicula(int posicion) {
        return peliculas[posicion];
    }

    public int validarAsignacion(int numeroSala, int posicionFuncion, Pelicula pelicula) {
        int resultado = 0;

        if (numeroSala < 1 || numeroSala > 3) {
            resultado = 1;
        } else if (posicionFuncion < 0 || posicionFuncion > 2) {
            resultado = 2;
        } else if (numeroSala == 3 && pelicula.getTipo().charAt(0) != '3') {
            resultado = 3;
        } else if ((numeroSala == 1 || numeroSala == 2)
                && pelicula.getTipo().charAt(0) == '3') {
            resultado = 4;
        } else if (salas[numeroSala - 1]
                .getFunciones()[posicionFuncion]
                .getPelicula()
                .getNombre()
                .length() > 0) {
            resultado = 5;
        } else {
            resultado = 6;
        }
        return resultado;
    }

    public int asignarPelicula(int numeroSala, int posicionFuncion, Pelicula pelicula) {
        int resultado = validarAsignacion(
                numeroSala,
                posicionFuncion,
                pelicula
        );
        if (resultado == 6) {salas[numeroSala - 1].asignarFuncion(posicionFuncion, pelicula);
        }
        return resultado;
    }
}
