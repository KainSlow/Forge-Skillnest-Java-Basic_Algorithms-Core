import clases.Algoritmos;

public class Aplicacion {
    public static void main(String[] args) {

        System.out.println("10 es par? " + Algoritmos.esPar(10));
        System.out.println("2 es par? " + Algoritmos.esPar(2));
        System.out.println("19 es par? " + Algoritmos.esPar(19));

        System.out.println("17 es primo? " + Algoritmos.esPrimo(17));
        System.out.println("11 es primo? " + Algoritmos.esPrimo(11));
        System.out.println("100 es primo? " + Algoritmos.esPrimo(100));

        System.out.println(Algoritmos.stringEnReversa("severlA"));
        System.out.println(Algoritmos.stringEnReversa("Hola!"));

        System.out.println(Algoritmos.esPalindromo("rapar"));
        System.out.println(Algoritmos.esPalindromo("pan"));
        System.out.println(Algoritmos.esPalindromo("La tomo como tal"));

        Algoritmos.secuenciaFizzBuzz(20);
    }
}