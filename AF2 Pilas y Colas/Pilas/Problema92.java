package Pilas;
import java.util.Stack;

public class Problema92 {

    public static boolean verificar(String cadena) {
        Stack<Character> pila = new Stack<>();
        int pos = cadena.indexOf('&');

        if (pos == -1) {
            return false;
        }

        // aqui se guarda X en la pila
        for (int i = 0; i < pos; i++) {
            pila.push(cadena.charAt(i));
        }

        // aqui se compara con Y
        for (int i = pos + 1; i < cadena.length(); i++) {

            if (pila.isEmpty()) {
                return false;
            }

            char c = pila.pop();

            if (c != cadena.charAt(i)) {
                return false;
            }
        }

        return pila.isEmpty();
    }

    public static void main(String[] args) {

        String texto = "abc&cba";

        if (verificar(texto)) {
            System.out.println("Cumple la forma X&Y");
        } else {
            System.out.println("No cumple la forma X&Y");
        }
    }
}

