package EjerciciosJava;

import java.util.Scanner;

public class Ejercicio2 {

    static Scanner entrada = new Scanner(System.in);
    public static int n1, n2;

    public static void comparador(int a, int b) {
        if(a > b){
            System.out.println(a + " es mayor que " + b);
        }
        else if(a < b){
            System.out.println(a + " es menor que " + b);
        }
        else {
            System.out.println("Los números son iguales");
        }
    }

    public static void run() {
        System.out.print("Por favor ingrese un número: ");
        n1 = entrada.nextInt();
        System.out.print("Por favor ingrese un segundo número: ");
        n2 = entrada.nextInt();
        comparador(n1,n2);
    }
}
