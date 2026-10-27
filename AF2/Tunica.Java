package AF2;

public class Tunica {

    private String nombre;
    private String descripcion;

    public Tunica(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return nombre + " - " + descripcion;
    }
}