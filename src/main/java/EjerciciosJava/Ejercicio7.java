package EjerciciosJava;

import java.util.Scanner;

public class Ejercicio7 {
    static Scanner entrada = new Scanner(System.in);

    static public int number;

    static public void run () {
        do{
            System.out.print("Por favor ingresa un número: ");
            number = entrada.nextInt();
        }
        while (number<0);
        System.out.println("El número es: " + number);
    }


}
