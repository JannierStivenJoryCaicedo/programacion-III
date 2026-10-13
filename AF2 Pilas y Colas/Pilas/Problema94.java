package Pilas;

import java.util.Scanner;
import java.util.Stack;

public class Problema94 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Stack<Integer> P1 = new Stack<>();
        Stack<Integer> P2 = new Stack<>();
        Stack<Integer> P3 = new Stack<>();
        Stack<Integer> P4 = new Stack<>();
        Stack<Integer> P5 = new Stack<>();

        int i, j;

        while (true) {
            System.out.print("Ingrese i (0 para terminar): ");
            i = sc.nextInt();

            if (i == 0) {
                break;
            }

            System.out.print("Ingrese j: ");
            j = sc.nextInt();

            switch (i) {

                case 1:
                    P1.push(j);
                    break;

                case 2:
                    P2.push(j);
                    break;

                case 3:
                    P3.push(j);
                    break;

                case 4:
                    P4.push(j);
                    break;

                case 5:
                    P5.push(j);
                    break;

                case -1:
                    if (!P1.isEmpty()) {
                        P1.pop();
                    } else {
                        System.out.println("P1 esta vacia.");
                    }
                    break;

                case -2:
                    if (!P2.isEmpty()) {
                        P2.pop();
                    } else {
                        System.out.println("P2 esta vacia.");
                    }
                    break;

                case -3:
                    if (!P3.isEmpty()) {
                        P3.pop();
                    } else {
                        System.out.println("P3 esta vacia.");
                    }
                    break;

                case -4:
                    if (!P4.isEmpty()) {
                        P4.pop();
                    } else {
                        System.out.println("P4 esta vacia.");
                    }
                    break;

                case -5:
                    if (!P5.isEmpty()) {
                        P5.pop();
                    } else {
                        System.out.println("P5 esta vacia.");
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
