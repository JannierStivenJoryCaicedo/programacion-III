import java.util.Stack;

public class pilas {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();
        pila.push(2);
        pila.push(9);
        pila.push(4);
        pila.push(7);
        pila.push(1);
        pila.push(10);
        System.out.println("Pila: " + pila);
    }

    /*
     * public void push(int value) {
     * pila.push(value);
     * }
     * 
     * public int pop() {
     * if (pila.isEmpty()) {
     * throw new EmptyStackException();
     * }
     * return pila.pop();
     * }
     * 
     * public int peek() {
     * if (pila.isEmpty()) {
     * throw new EmptyStackException();
     * }
     * return pila.peek();
     * }
     */
}
