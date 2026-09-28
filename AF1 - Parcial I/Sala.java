public class Sala {
    private String tipoSala;
    private Funcion[] funciones;

    public Sala() {
        tipoSala = "";
        funciones = new Funcion[3];

        for (int i = 0; i < funciones.length; i++) {
            funciones[i] = new Funcion();
        }
    }

    public Sala(String ts, String h, int s) {
        tipoSala = ts;
        funciones = new Funcion[3];

        for (int i = 0; i < funciones.length; i++) {
            funciones[i] = new Funcion();
        }
    }

    public void Set(String ts, String h, int s) {
        tipoSala = ts;
    }

    public String getTipoSala() {
        return tipoSala;
    }

    public Funcion[] getFunciones() {

        return funciones;
    }

    public void asignarFuncion(int posicion, Funcion funcion) {
        funciones[posicion] = funcion;
    }

    public void imprimir() {
        System.out.println(
                "Tipo de Sala: " + tipoSala);
    }

    public void mostrarFuncion() {
        System.out.println();
        System.out.println(tipoSala);

        for (int i = 0; i < funciones.length; i++) {
            System.out.println();
            System.out.println("Funcion " + (i + 1));
            if (funciones[i].getPelicula().getNombre().equals("")) {
                System.out.println("Sin pelicula asignada.");

            } else {
                System.out.println("Horario: " + funciones[i].getHorario());
                System.out.println("Pelicula: " + funciones[i].getPelicula().getNombre());
            }
        }
    }

}
