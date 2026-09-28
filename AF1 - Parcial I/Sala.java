public class Sala {
    private String tipoSala;
    private Funcion[] funcion;

    public Sala() {
        tipoSala = "";
        funcion = new Funcion[3];

        for (int i = 0; i < funcion.length; i++) {
            funcion[i] = new Funcion();
        }
    }

    public Sala(String ts, String h, int s) {
        tipoSala = ts;
        funcion = new Funcion[3];

        for (int i = 0; i < funcion.length; i++) {
            funcion[i] = new Funcion();
        }
    }

    public void Set(String ts, String h, int s) {
        tipoSala = ts;
    }

    public String getTipoSala() {
        return tipoSala;
    }

}
