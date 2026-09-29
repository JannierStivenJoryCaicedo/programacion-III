import java.util.Scanner;

public class CinemaStar {
        
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        GestionCine cine = new GestionCine();
        int opcion;

        do {
            System.out.println();
            System.out.println("==============================");
            System.out.println("       CINEMASTAR");
            System.out.println("==============================");
            System.out.println("1. Crear peliculas");
            System.out.println("2. Asignar funciones");
            System.out.println("3. Ventas");
            System.out.println("4. Salir");
            System.out.println("==============================");
            System.out.print("Seleccione una opcion: ");

            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    int opcionPeliculas;
                    do {
                        System.out.println();
                        System.out.println("========= PELICULAS =========");
                        System.out.println("1. Agregar pelicula");
                        System.out.println("2. Mostrar peliculas");
                        System.out.println("3. Regresar");
                        System.out.print("Seleccione una opcion: ");

                        opcionPeliculas = teclado.nextInt();
                        teclado.nextLine();

                        switch (opcionPeliculas) {

                            case 1:
                                System.out.println();
                                System.out.println("=== REGISTRAR PELICULA ===");

                                System.out.print("Nombre: ");
                                String nombre = teclado.nextLine();
                                System.out.print("Idioma: ");
                                String idioma = teclado.nextLine();
                                System.out.print("Tipo (35mm o 3D): ");
                                String tipo = teclado.nextLine();
                                System.out.print("Duracion en minutos: ");
                                int duracion = teclado.nextInt();
                                teclado.nextLine();
                                Pelicula pelicula = new Pelicula(nombre, idioma, tipo, duracion);
                                cine.agregarPelicula(pelicula);
                                System.out.println();
                                System.out.println("Pelicula registrada.");
                                break;

                            case 2:
                                cine.mostrarPeliculas();
                                break;
                            case 3:
                                System.out.println("Regresando...");
                                break;
                            default:
                                System.out.println("Opcion incorrecta.");
                        }

                    } while (opcionPeliculas != 3);

                    break;

                case 2:
                    int opcionFunciones;

                    do {
                        System.out.println();
                        System.out.println("====== ASIGNACION DE FUNCIONES ======");
                        System.out.println("1. Asignar pelicula");
                        System.out.println("2. Mostrar funciones");
                        System.out.println("3. Regresar");
                        System.out.print("Seleccione una opcion: ");

                        opcionFunciones = teclado.nextInt();
                        teclado.nextLine();

                        switch (opcionFunciones) {

                            case 1:
                                if (cine.getCantidadPeliculas() == 0) {
                                    System.out.println();
                                    System.out.println("Primero debe registrar peliculas.");
                                } else {
                                    System.out.println();
                                    cine.mostrarPeliculas();

                                    System.out.println();
                                    System.out.print("Seleccione la pelicula: ");

                                    int numeroPelicula = teclado.nextInt();
                                    teclado.nextLine();

                                    if (numeroPelicula < 1 || numeroPelicula > cine.getCantidadPeliculas()) {
                                        System.out.println("Pelicula inexistente.");

                                    } else {
                                        Pelicula peliculaSeleccionada = cine.obtenerPelicula(numeroPelicula - 1);
                                        System.out.println();
                                        System.out.println("1. Sala 1");
                                        System.out.println("2. Sala 2");
                                        System.out.println("3. Sala 3");
                                        System.out.print("Seleccione la sala: ");

                                        int numeroSala = teclado.nextInt();
                                        teclado.nextLine();

                                        System.out.println();
                                        System.out.println("1. 14:00 - 16:30");
                                        System.out.println("2. 16:30 - 19:00");
                                        System.out.println("3. 19:00 - 21:00");
                                        System.out.print("Seleccione el horario: ");

                                        int numeroHorario = teclado.nextInt();
                                        teclado.nextLine();

                                        int resultado = cine.asignarPelicula(numeroSala, numeroHorario - 1, peliculaSeleccionada);

                                        if (resultado == 1) {
                                            System.out.println("Sala inexistente.");
                                        } else if (resultado == 2) {
                                            System.out.println("Horario inexistente.");
                                        } else if (resultado == 3) {
                                            System.out.println("La Sala 3 solamente permite peliculas 3D.");

                                        } else if (resultado == 4) {
                                            System.out.println("Las Salas 1 y 2 solamente permiten peliculas 35mm.");

                                        } else if (resultado == 5) {
                                            System.out.println("Ya existe una pelicula asignada en ese horario.");
                                        } else {
                                            System.out.println("Pelicula asignada correctamente.");
                                        }
                                    }
                                }

                                break;

                            case 2:
                                System.out.println();
                                System.out.println("========= FUNCIONES =========");

                                for (int i = 0; i < 3; i++) {
                                    System.out.println();
                                    System.out.println("Sala " + (i + 1));

                                    Funcion[] funciones = cine.getSalas()[i].getFunciones();

                                    for (int j = 0; j < 3; j++) {
                                        System.out.println("Horario: " + funciones[j].getHorario());

                                        if (funciones[j].getPelicula().getNombre().length() == 0) {
                                            System.out.println("Pelicula: Sin asignar");
                                        } else {
                                            System.out.println("Pelicula: " + funciones[j].getPelicula().getNombre());
                                        }
                                        System.out.println("Sillas disponibles: " + funciones[j].getDisponibles());
                                    }
                                }

                                break;

                            case 3:
                                System.out.println("Regresando...");

                                break;

                            default:
                                System.out.println("Opcion incorrecta.");
                        }

                    } while (opcionFunciones != 3);

                    break;

                case 3:

                    int opcionVentas;

                    do {
                        System.out.println();
                        System.out.println("=========== VENTAS ===========");
                        System.out.println("1. Comprar silla");
                        System.out.println("2. Mostrar sillas");
                        System.out.println("3. Regresar");
                        System.out.print("Seleccione una opcion: ");

                        opcionVentas = teclado.nextInt();
                        teclado.nextLine();

                        switch (opcionVentas) {

                            case 1:
                                System.out.println();
                                System.out.println("========= COMPRAR =========");
                                System.out.print("Numero de sala: ");

                                int numeroSalaVenta = teclado.nextInt();
                                teclado.nextLine();

                                if (numeroSalaVenta < 1 || numeroSalaVenta > 3) {
                                    System.out.println("Sala inexistente.");
                                } else {
                                    System.out.println();
                                    System.out.println("1. 14:00 - 16:30");
                                    System.out.println("2. 16:30 - 19:00");
                                    System.out.println("3. 19:00 - 21:00");
                                    System.out.print("Seleccione el horario: ");

                                    int numeroHorarioVenta = teclado.nextInt(); teclado.nextLine();

                                    if (numeroHorarioVenta < 1 || numeroHorarioVenta > 3) {

                                        System.out.println("Horario inexistente.");

                                    } else {
                                        Funcion funcion =cine.getSalas()[numeroSalaVenta - 1].getFunciones()[numeroHorarioVenta - 1];

                                        if (funcion.getPelicula().getNombre().length() == 0) {
                                            System.out.println("No hay una pelicula asignada a esta funcion.");

                                        } else {
                                            funcion.mostrarSillas();
                                            System.out.print("Digite la fila: ");
                                            String fila = teclado.nextLine();
                                            System.out.print("Digite el numero de silla: ");

                                            int numeroSilla =
                                                    teclado.nextInt();

                                            teclado.nextLine();

                                            int resultado =
                                                    funcion.comprarSilla(fila, numeroSilla);

                                            if (resultado == 1) {
                                                System.out.println("La fila no existe.");
                                            } else if (resultado == 2) {
                                                System.out.println("El numero de silla debe estar entre 1 y 12.");
                                            } else if (resultado == 3) {
                                                System.out.println("Esa silla no existe en esta fila.");
                                            } else if (resultado == 4) {
                                                System.out.println("La silla ya esta ocupada.");
                                            } else {
                                                int precio = funcion.precioSilla(fila);

                                                System.out.println();
                                                System.out.println("Compra realizada correctamente.");
                                                System.out.println("Silla: " + fila + numeroSilla);
                                                System.out.println("Valor: $"+ precio);
                                                System.out.println("Sillas disponibles: "+ funcion.getDisponibles());
                                            }
                                        }
                                    }
                                }

                                break;

                            case 2:
                                System.out.println();
                                System.out.print("Numero de sala: ");

                                int salaMostrar = teclado.nextInt();
                                teclado.nextLine();

                                if (salaMostrar < 1 || salaMostrar > 3) {
                                    System.out.println("Sala inexistente.");
                                } else {
                                    System.out.println();
                                    System.out.println("1. 14:00 - 16:30");
                                    System.out.println("2. 16:30 - 19:00");
                                    System.out.println("3. 19:00 - 21:00");
                                    System.out.print("Seleccione el horario: ");
                                    int horarioMostrar = teclado.nextInt();
                                    teclado.nextLine();

                                    if (horarioMostrar < 1 || horarioMostrar > 3) {
                                        System.out.println("Horario inexistente.");
                                    } else {
                                        Funcion funcionMostrar =cine.getSalas()[salaMostrar - 1].getFunciones()[horarioMostrar - 1];
                                        funcionMostrar.mostrarSillas();
                                    }
                                }

                                break;

                            case 3:
                                System.out.println("Regresando...");

                                break;

                            default:
                                System.out.println("Opcion incorrecta.");
                        }

                    } while (opcionVentas != 3);

                    break;

                case 4:
                    System.out.println();
                    System.out.println("Gracias por utilizar CinemaStar.");
                    break;

                default:
                    System.out.println();
                    System.out.println(
                            "Opcion incorrecta.");
            }
        } while (opcion != 4);
        teclado.close();
    }
}
