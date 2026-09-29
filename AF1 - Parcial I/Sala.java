public class Sala {
    private String tipoSala;
    private Funcion[] funciones;

    public Sala() {
        tipoSala = "";
        funciones = new Funcion[3];
    }

    public Sala(String ts) {
        tipoSala = ts;
        funciones = new Funcion[3];
        crearFunciones();
    }

    public String getTipoSala() {
        return tipoSala;
    }

    public Funcion[] getFunciones() {
        return funciones;
    }

    public void crearFunciones() {
        String[] horarios = { "14:00 - 16:30", "16:30 - 19:00", "19:00 - 21:00"};

        for (int i = 0; i < 3; i++) {
            String[][] matriz;
            if (tipoSala.charAt(0) == '3') {
                matriz = crearMatrizSala3();
            } else {
                matriz = crearMatrizSala12();
            }
            Pelicula pelicula = new Pelicula();
            funciones[i] = new Funcion(horarios[i], pelicula, matriz, tipoSala.charAt(0) - '0');
            funciones[i].ocuparSillasAleatorias();
        }
    }

    public String[][] crearMatrizSala12() {
        String[][] matriz = {
            {"A", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_"},
            {"B", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_"},
            {"C", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_"},
            {"D", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_"},
            {"E", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_"},
            {"F", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_"},
            {"G", " ", " ", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", " "},
            {"H", " ", " ", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", " "}
        };

        return matriz;
    }

    public String[][] crearMatrizSala3() {
        String[][] matriz = {
            {"A", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_"},
            {"B", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_"},
            {"C", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_"},
            {"D", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_"},
            {"E", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_"},
            {"F", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_"}
        };
        return matriz;
    }

    public void asignarFuncion(int posicion, Pelicula pelicula) {
        funciones[posicion].asignarPelicula(pelicula);
    }
    
}
