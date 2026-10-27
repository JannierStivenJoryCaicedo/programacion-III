package AF2.Pilas;

import java.util.Scanner;
import java.util.Stack;

public class Problema93 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la expresion que quiera: ");
        String expresion = sc.nextLine();

        Stack<Character> pila = new Stack<>();
        boolean correcto = true;

        for (int i = 0; i < expresion.length(); i++) {
            char c = expresion.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                pila.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (pila.isEmpty()) {
                    correcto = false;
                    break;
                }

                char apertura = pila.pop();

                if ((c == ')' && apertura != '(') ||
                        (c == ']' && apertura != '[') ||
                        (c == '}' && apertura != '{')) {
                    correcto = false;
                    break;
                }
            }
        }

        if (!pila.isEmpty()) {
            correcto = false;
        }

        if (correcto) {
            System.out.println("Los simbolos estan equilibrados.");
        } else {
            System.out.println("Los simbolos NO estan equilibrados.");
        }

        sc.close();
    }
}
