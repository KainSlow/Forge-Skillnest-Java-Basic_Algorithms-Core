package clases;

public class Algoritmos{

    public static boolean esPar(int numero){
        return (numero%2) == 0;
    }

    //Fermat's Little Theorem
    public static boolean esPrimo(int numero){
        if( numero <=  1){
            return false;
        }

        for (int i = 2; i < numero/2 ; ++i){
            if (numero%i == 0) return false;
        }

        return true;
    }

    public static String stringEnReversa(String valor){
        String nuevoValor = "";
        for(int i = valor.length()-1; i >= 0; i--){
            nuevoValor += valor.charAt(i);
        }
        return nuevoValor;
    }

    public static boolean esPalindromo(String valor){
        valor = valor.replaceAll("\\s", "");
        valor = valor.toLowerCase();
        return valor.compareToIgnoreCase(stringEnReversa(valor)) == 0;
    }

    public static void secuenciaFizzBuzz(int numero){
        String resultado = "";
        
        for(int i = 1; i <= numero; i++){

            if( i % 3 == 0){
                resultado += "Fizz ";
            }
            else if(i%5 == 0){
                resultado += "Buzz ";
            }
            else{
                resultado += String.valueOf(i) + " ";
            }
        }

        System.out.println(resultado);
    }
}