import java.util.Scanner;

public class CinemaStar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GestionCine cine = new GestionCine();

        int opcion;

        do {
            System.out.println("CinemaStar");
            System.out.println("1. Creacion de peliculas");
            System.out.println("2. Asignacion de funciones");
            System.out.println("3. Ventas");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = scanner.nextInt();
            scanner.nextLine();
        } while (opcion != 4);
    }
}
