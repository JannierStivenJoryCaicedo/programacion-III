public class Pelicula {
    private String nombre;
    private String idioma;
    private String tipo;
    private int duracion;

    public Pelicula() {
        nombre = "";
        idioma = "";
        tipo = "";
        duracion = 0;
    }

    public Pelicula(String n, String i, String t, int d) {
        nombre = n;
        idioma = i;
        tipo = t;
        duracion = d;
    }

    public void Set(String n, String i, String t, int d) {
        nombre = n;
        idioma = i;
        tipo = t;
        duracion = d;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdioma() {
        return idioma;
    }

    public String getTipo() {
        return tipo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Idioma: " + idioma);
        System.out.println("Tipo: " + tipo);
        System.out.println("Duracion: " + duracion + " minutos");
    }
}
