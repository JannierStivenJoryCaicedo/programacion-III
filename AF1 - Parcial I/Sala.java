import java.util.Random;

public class Sala {
    private int tipoSala;
    private String horario;
    private int silla;
    private String[][] matrizSala;

    public Sala() {
        tipoSala = 0;
        horario = "";
        silla = 0;
        this.inicializarMatrizSala();
    }

    public Sala(int ts, String h, int s) {
        tipoSala = 0;
        horario = h;
        silla = 0;
    }

    public void Set(int ts, String h, int s) {
        tipoSala = 0;
        horario = h;
        silla = 0;
    }

    public int getTipoSala() {
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

    public void inicializarMatrizSala() {
        if (tipoSala == 0) {
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
        } else {
            String[][] sala3 = {
                    { "A", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_" },
                    { "B", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_" },
                    { "C", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_" },
                    { "D", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_" },
                    { "E", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_" },
                    { "F", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_" }
            };
        }
    }

    public void calcularOcupacionSala() {
        Random aleatorio = new Random();
        int sillaVacia = 10 + aleatorio.nextInt(10);
        int sillaLlena = 0;

        while (sillaLlena < sillaVacia) {
            int filaRam = aleatorio.nextInt(matrizSala.length);
            int colRam = 1 + aleatorio.nextInt(12);

            if (matrizSala[filaRam][colRam].equals("_")) {
                matrizSala[filaRam][colRam] = "X";
                sillaLlena++;
            }
        }
    }

}
