import clases.Algoritmos;

public class Aplicacion{
    public static void main(String[]args){
        Algoritmos algo = new Algoritmos();

        System.out.println("10 es par? " + algo.esPar(10));
        System.out.println("2 es par? " + algo.esPar(2));
        System.out.println("19 es par? " + algo.esPar(19));

        System.out.println("17 es primo? " + algo.esPrimo(17));
        System.out.println("11 es primo? " + algo.esPrimo(11));
        System.out.println("100 es primo? " + algo.esPrimo(100));

        System.out.println(algo.stringEnReversa("severlA"));
        System.out.println(algo.stringEnReversa("Hola!"));

        System.out.println(algo.esPalindromo("rapar"));
        System.out.println(algo.esPalindromo("pan"));
        System.out.println(algo.esPalindromo("La tomo como tal"));

        algo.secuenciaFizzBuzz(20);
    }
}