package EjerciciosJava;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio9 {

    static Scanner entrada = new Scanner(System.in);
    static public String cadena;
    static public String frase = "La sonrisa sera la mejor arma contra la tristeza";

    static public void concatenar(String a, String b){
        System.out.println("\n" + a + " y " + b.toLowerCase() + "\n");
    }
    public static void run() {
        System.out.println("Bienvenido(a), ingresa tu mejor frase y mira la mágia: ");
        cadena = entrada.nextLine();
        concatenar(frase.replaceAll("a","e"),cadena);
    }
}
