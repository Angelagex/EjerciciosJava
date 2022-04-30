package EjerciciosJava;

import java.util.Scanner;

public class Ejercicio10 {

    static Scanner entrada = new Scanner(System.in);
    static public String cadena;

    public static void run() {
        System.out.println("Bienvenido(a), ingresa tu mejor frase y mira la mágia: ");
        cadena = entrada.nextLine();
        System.out.println(cadena.replaceAll(" ", ""));
    }
}
