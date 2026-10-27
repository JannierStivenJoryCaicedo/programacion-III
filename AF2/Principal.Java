package AF2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Personaje xieLian = new Personaje("Xie Lian");
        Personaje huaCheng = new Personaje("Hua Cheng");
        Personaje weiWuxian = new Personaje("Wei Wuxian");
        Personaje lanWangji = new Personaje("Lan Wangji");

        // Inventario original de Xie Lian
        xieLian.agregarTunica(
            new Tunica("Túnica blanca",
                "Túnica tradicional de color blanco")
        );

        xieLian.agregarTunica(
            new Tunica("Túnica de cultivo",
                "Vestimenta para sus viajes")
        );

        xieLian.agregarArma(
            new Arma("Ruoye",
                "Cinta espiritual")
        );

        xieLian.agregarAccesorio(
            new Accesorio("Sombrero de bambú",
                "Sombrero para cubrir el rostro")
        );

        // Inventario original de Hua Cheng
        huaCheng.agregarTunica(
            new Tunica("Túnica roja",
                "Vestimenta roja característica")
        );

        huaCheng.agregarArma(
            new Arma("E-Ming",
                "Cimitarra espiritual")
        );

        huaCheng.agregarAccesorio(
            new Accesorio("Pendiente plateado",
                "Pendiente con significado personal")
        );

        // Inventario original de Wei Wuxian
        weiWuxian.agregarTunica(
            new Tunica("Túnica negra",
                "Vestimenta oscura")
        );

        weiWuxian.agregarArma(
            new Arma("Suibian",
                "Espada de Wei Wuxian")
        );

        weiWuxian.agregarArma(
            new Arma("Chenqing",
                "Flauta espiritual")
        );

        weiWuxian.agregarAccesorio(
            new Accesorio("Cinta roja",
                "Accesorio para el cabello")
        );

        // Inventario original de Lan Wangji
        lanWangji.agregarTunica(
            new Tunica("Túnica blanca y azul",
                "Vestimenta del clan Lan")
        );

        lanWangji.agregarArma(
            new Arma("Bichen",
                "Espada de Lan Wangji")
        );

        lanWangji.agregarAccesorio(
            new Accesorio("Cinta frontal",
                "Cinta tradicional del clan Lan")
        );

        List<Personaje> personajes = new ArrayList<>();

        personajes.add(xieLian);
        personajes.add(huaCheng);
        personajes.add(weiWuxian);
        personajes.add(lanWangji);

        int opcion;

        do {
            System.out.println("\n================================");
            System.out.println("   INVENTARIO DE PERSONAJES");
            System.out.println("             DANMEI");
            System.out.println("================================");

            for (int i = 0; i < personajes.size(); i++) {
                System.out.println((i + 1) + ". " + personajes.get(i).getNombre());
            }

            System.out.println("0. Salir");
            System.out.print("Selecciona un personaje: ");

            opcion = leerEntero();

            if (opcion >= 1 && opcion <= personajes.size()) {

                Personaje seleccionado = personajes.get(opcion - 1);
                gestionarPersonaje(seleccionado);

            } else if (opcion != 0) {
                System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

        System.out.println("¡Gracias por utilizar el inventario danmei!");

        scanner.close();
    }

    public static void gestionarPersonaje(Personaje personaje) {

        int opcion;

        do {
            System.out.println("\n================================");
            System.out.println("Personaje: " + personaje.getNombre());
            System.out.println("================================");

            System.out.println("1. Ver inventario");
            System.out.println("2. Añadir objeto");
            System.out.println("3. Quitar objeto");
            System.out.println("0. Volver al menú principal");

            System.out.print("Selecciona una opción: ");

            opcion = leerEntero();

            switch (opcion) {

                case 1:
                    mostrarInventario(personaje);
                    break;

                case 2:
                    agregarObjeto(personaje);
                    break;

                case 3:
                    quitarObjeto(personaje);
                    break;

                case 0:
                    System.out.println("Volviendo al menú principal...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);
    }

    public static void mostrarInventario(Personaje personaje) {

        System.out.println("\n--- INVENTARIO DE "
            + personaje.getNombre().toUpperCase() + " ---");

        System.out.println("\nTÚNICAS:");

        mostrarLista(personaje.getTunicas());

        System.out.println("\nARMAS:");

        mostrarLista(personaje.getArmas());

        System.out.println("\nACCESORIOS:");

        mostrarLista(personaje.getAccesorios());
    }

    // Aqui se muestra una lista numerada
    public static <T> void mostrarLista(List<T> lista) {

        if (lista.isEmpty()) {
            System.out.println("No hay objetos.");
            return;
        }

        for (int i = 0; i < lista.size(); i++) {

            System.out.println(
                (i + 1) + ". " + lista.get(i)
            );
        }
    }

    public static void agregarObjeto(Personaje personaje) {

        System.out.println("\n¿Qué deseas añadir?");
        System.out.println("1. Túnica");
        System.out.println("2. Arma");
        System.out.println("3. Accesorio");

        System.out.print("Selecciona el tipo de objeto: ");

        int tipo = leerEntero();

        if (tipo < 1 || tipo > 3) {
            System.out.println("Tipo de objeto no válido.");
            return;
        }

        System.out.print("Nombre del objeto: ");
        String nombre = scanner.nextLine().trim();

        if (nombre.isEmpty()) {
            System.out.println("El nombre no puede estar vacío.");
            return;
        }

        System.out.print("Descripción del objeto: ");
        String descripcion = scanner.nextLine().trim();

        if (descripcion.isEmpty()) {
            descripcion = "Sin descripción";
        }

        switch (tipo) {

            case 1:
                personaje.agregarTunica(
                    new Tunica(nombre, descripcion)
                );
                break;

            case 2:
                personaje.agregarArma(
                    new Arma(nombre, descripcion)
                );
                break;

            case 3:
                personaje.agregarAccesorio(
                    new Accesorio(nombre, descripcion)
                );
                break;
        }

        System.out.println(
            "¡" + nombre + " se añadió al inventario de "
            + personaje.getNombre() + "!"
        );
    }

    public static void quitarObjeto(Personaje personaje) {

        System.out.println("\n¿Qué deseas quitar?");
        System.out.println("1. Túnica");
        System.out.println("2. Arma");
        System.out.println("3. Accesorio");

        System.out.print("Selecciona el tipo de objeto: ");

        int tipo = leerEntero();

        if (tipo < 1 || tipo > 3) {
            System.out.println("Tipo de objeto no válido.");
            return;
        }

        switch (tipo) {

            case 1:
                eliminarTunica(personaje);
                break;

            case 2:
                eliminarArma(personaje);
                break;

            case 3:
                eliminarAccesorio(personaje);
                break;
        }
    }

    public static void eliminarTunica(Personaje personaje) {

        List<Tunica> lista = personaje.getTunicas();

        System.out.println("\nTÚNICAS DISPONIBLES:");

        mostrarLista(lista);

        if (lista.isEmpty()) {
            return;
        }

        System.out.print("Número de la túnica que deseas quitar: ");

        int indice = leerEntero() - 1;

        if (personaje.eliminarTunica(indice)) {
            System.out.println("Túnica eliminada correctamente.");
        } else {
            System.out.println("Número de túnica no válido.");
        }
    }

    public static void eliminarArma(Personaje personaje) {

        List<Arma> lista = personaje.getArmas();

        System.out.println("\nARMAS DISPONIBLES:");

        mostrarLista(lista);

        if (lista.isEmpty()) {
            return;
        }

        System.out.print("Número del arma que deseas quitar: ");

        int indice = leerEntero() - 1;

        if (personaje.eliminarArma(indice)) {
            System.out.println("Arma eliminada correctamente.");
        } else {
            System.out.println("Número de arma no válido.");
        }
    }

    public static void eliminarAccesorio(Personaje personaje) {

        List<Accesorio> lista = personaje.getAccesorios();

        System.out.println("\nACCESORIOS DISPONIBLES:");

        mostrarLista(lista);

        if (lista.isEmpty()) {
            return;
        }

        System.out.print(
            "Número del accesorio que deseas quitar: "
        );

        int indice = leerEntero() - 1;

        if (personaje.eliminarAccesorio(indice)) {
            System.out.println("Accesorio eliminado correctamente.");
        } else {
            System.out.println("Número de accesorio no válido.");
        }
    }
}