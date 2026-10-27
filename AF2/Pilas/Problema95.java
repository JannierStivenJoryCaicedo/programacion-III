package AF2.Pilas;

import java.util.Scanner;
import java.util.Stack;

public class Problema95 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Stack<Integer> P1 = new Stack<>();
        Stack<Integer> P2 = new Stack<>();
        Stack<Integer> P3 = new Stack<>();
        Stack<Integer> P4 = new Stack<>();
        Stack<Integer> P5 = new Stack<>();

        int i, j, k;

        while (true) {
            System.out.print("Ingrese i (0 para terminar): ");
            i = sc.nextInt();

            if (i == 0) {
                break;
            }

            System.out.print("Ingrese j: ");
            j = sc.nextInt();

            System.out.print("Ingrese k (-1 para vaciar, 0 normal): ");
            k = sc.nextInt();

            switch (Math.abs(i)) {

                case 1:
                    if (k == -1) {
                        P1.clear();
                    } else if (k == 0) {
                        if (i > 0) {
                            P1.push(j);
                        } else if (!P1.isEmpty()) {
                            P1.pop();
                        } else {
                            System.out.println("P1 esta vacia mi loco.");
                        }
                    }
                    break;

                case 2:
                    if (k == -1) {
                        P2.clear();
                    } else if (k == 0) {
                        if (i > 0) {
                            P2.push(j);
                        } else if (!P2.isEmpty()) {
                            P2.pop();
                        } else {
                            System.out.println("P2 esta vacia mi loco.");
                        }
                    }
                    break;

                case 3:
                    if (k == -1) {
                        P3.clear();
                    } else if (k == 0) {
                        if (i > 0) {
                            P3.push(j);
                        } else if (!P3.isEmpty()) {
                            P3.pop();
                        } else {
                            System.out.println("P3 esta vacia mi loco.");
                        }
                    }
                    break;

                case 4:
                    if (k == -1) {
                        P4.clear();
                    } else if (k == 0) {
                        if (i > 0) {
                            P4.push(j);
                        } else if (!P4.isEmpty()) {
                            P4.pop();
                        } else {
                            System.out.println("P4 esta vacia mi loco.");
                        }
                    }
                    break;

                case 5:
                    if (k == -1) {
                        P5.clear();
                    } else if (k == 0) {
                        if (i > 0) {
                            P5.push(j);
                        } else if (!P5.isEmpty()) {
                            P5.pop();
                        } else {
                            System.out.println("P5 esta vacia mi loco.");
                        }
                    }
                    break;

                default:
                    System.out.println("Valor de i invalido.");
            }
        }

        System.out.println("\nContenido de las pilas:");
        System.out.println("P1 = " + P1);
        System.out.println("P2 = " + P2);
        System.out.println("P3 = " + P3);
        System.out.println("P4 = " + P4);
        System.out.println("P5 = " + P5);

        sc.close();
    }
}
