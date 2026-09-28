public class Sala {
    private String [][]m;
    private String tipoSala;
    private String horario;
    private int silla;

    public Sala() {
        m = null;
        tipoSala = "";
        horario = "";
        silla = 0;
    }

    public Sala(String ts, String h, int s) {
        tipoSala = ts;
        horario = h;
        silla = 0;
    }

    public void Set(String ts, String h, int s) {
        tipoSala = ts;
        horario = h;
        silla = 0;
    }

    public String getTipoSala() {
        return tipoSala;
    }

    public String getHorario() {
        return horario;
    }

    public int getSilla() {
        return silla;
    }

    public void imprimir() {
        System.out.println("Tipo de Sala: " + tipoSala);
        System.out.println("Horario: " + horario);
        System.out.println("Silla: " + silla);
    }

    String[][] sala1y2 = {
            { "A", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_" },
            { "B", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_" },
            { "C", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_" },
            { "D", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_" },
            { "E", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_" },
            { "F", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_" },
            { "G", " ", " ", "_", "_", "_", "_", "_", "_", "_", "_", "_", " " },
            { "H", " ", " ", "_", "_", "_", "_", "_", "_", "_", "_", "_", " " }
    };

    String[][] sala3 = {
            { "A", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_" },
            { "B", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_" },
            { "C", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_" },
            { "D", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_" },
            { "E", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_" },
            { "F", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_" }
    };

}
