import java.util.ArrayList;
import java.util.List;

public class Personaje {

    private String nombre;

    private List<Tunica> tunicas;
    private List<Arma> armas;
    private List<Accesorio> accesorios;

    public Personaje(String nombre) {
        this.nombre = nombre;

        tunicas = new ArrayList<>();
        armas = new ArrayList<>();
        accesorios = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    // Métodos para añadir objetos

    public void agregarTunica(Tunica tunica) {
        tunicas.add(tunica);
    }

    public void agregarArma(Arma arma) {
        armas.add(arma);
    }

    public void agregarAccesorio(Accesorio accesorio) {
        accesorios.add(accesorio);
    }

    // Métodos para consultar las listas

    public List<Tunica> getTunicas() {
        return tunicas;
    }

    public List<Arma> getArmas() {
        return armas;
    }

    public List<Accesorio> getAccesorios() {
        return accesorios;
    }

    // Métodos para eliminar objetos por su posición

    public boolean eliminarTunica(int indice) {
        if (indice >= 0 && indice < tunicas.size()) {
            tunicas.remove(indice);
            return true;
        }

        return false;
    }

    public boolean eliminarArma(int indice) {
        if (indice >= 0 && indice < armas.size()) {
            armas.remove(indice);
            return true;
        }

        return false;
    }

    public boolean eliminarAccesorio(int indice) {
        if (indice >= 0 && indice < accesorios.size()) {
            accesorios.remove(indice);
            return true;
        }

        return false;
    }
}