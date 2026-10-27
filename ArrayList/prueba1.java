package ArrayList;

import java.util.List;
import java.util.ArrayList;

public class prueba1 {

    public static void main(String[] args) {

        List<String> lst = new ArrayList<>();
        lst.add("Mercury");
        lst.add("Venus");
        lst.add("Earth");
        lst.add("JavaSoft");
        lst.add("Mars");
        lst.add("Jupiter");
        lst.add("Saturn");
        lst.add("Uranus");
        lst.add("Neptune");
        lst.add("Pluto");
        lst.set(1, "hola");

        System.out.println("List: " + lst);
        System.out.println("Size: " + lst.size());

    }

}
