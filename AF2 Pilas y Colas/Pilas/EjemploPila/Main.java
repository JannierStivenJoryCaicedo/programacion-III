package Pilas.EjemploPila;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Libro> pila = new Stack<Libro>();
        Stack<Libro> pila2 = new Stack<Libro>();
        Libro l1 = new Libro("En Territorio Salvaje", "Erin Hunter");
        Libro l2 = new Libro("Antes de la Tormenta", "Erin Hunter");
        Libro l3 = new Libro("a street cat named Bob", "James Bowen");
        Libro l4 = new Libro("Memoria de mis ***** tristes", "Garcia Marquez");
        Libro l5 = new Libro("El Caballero de la Armadura Oxidada", "Robert Fisher");
        pila.push(l1);
        pila.push(l2);
        pila.push(l3);
        pila.push(l4);
        pila.push(l5);
        Libro l6 = new Libro("Fuego y Hielo", "Erin Hunter");
        Libro l7 = new Libro("Huellas Peligrosas", "Erin Hunter");
        Libro l8 = new Libro("Algebra Lineal", "Chungara");
        Libro l9 = new Libro("EL Bosque de los secretos", "Erin Hunter");
        Libro l10 = new Libro("El Cementerio de los Versos Perdidos", "Txus Di Felatio");
        pila2.push(l6);
        pila2.push(l7);
        pila2.push(l8);
        pila2.push(l9);
        pila2.push(l10);
        // Metodo Seleccionar enviando las dos pilas creadas dentro del Main
        Seleccionar(pila, pila2);
    }

    // Metodo Statico Fuera del Main
    public static void Seleccionar(Stack<Libro> a, Stack<Libro> b) {
        // PILAS Respectivas
        Stack<Libro> erinHunter = new Stack<Libro>();
        Stack<Libro> varios = new Stack<Libro>();
        // PILAS Auxiliares
        Stack<Libro> Eaux = new Stack<Libro>();
        Stack<Libro> Vaux = new Stack<Libro>();
        // Metodo para filtrar a la pila erinHunter solo los libros del autor ERIN
        // HUNTER y para filtrar los otros autores a las pila varios
        while (!a.isEmpty()) {
            Libro x = a.pop();
            if (x.getAutor() == "Erin Hunter")
                erinHunter.push(x);
            else
                varios.push(x);
        }
        // Metodo para filtrar a la pila erinHunter solo los libros del autor ERIN
        // HUNTER y para filtrar los otros autores a las pila varios
        while (!b.isEmpty()) {
            Libro x = b.pop();
            if (x.getAutor() == "Erin Hunter")
                erinHunter.push(x);
            else
                varios.push(x);
        }
        // Metodo para Mostrar por Consola los Libros de cada Pila
        while (!erinHunter.isEmpty()) {
            Libro e = erinHunter.pop();
            System.out.println("AUTOR: " + e.getAutor() + " " + " TITULO: " + e.getTitulo());
            Eaux.push(e);

        }
        while (!varios.isEmpty()) {
            Libro v = varios.pop();
            System.out.println("AUTOR: " + v.getAutor() + " " + " TITULO: " + v.getTitulo());
            Vaux.push(v);
        }
        // Metodo para volver a poner los libros a sus respectivas PILAS
        while (!Eaux.isEmpty()) {
            Libro aux = Eaux.pop();
            erinHunter.push(aux);
        }
        while (!Vaux.isEmpty()) {
            Libro aux = Vaux.pop();
            varios.push(aux);
        }
    }
}
