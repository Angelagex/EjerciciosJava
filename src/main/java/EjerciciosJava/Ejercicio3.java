package EjerciciosJava;

import java.util.Scanner;

public class Ejercicio3 {

    static Scanner entrada = new Scanner(System.in);

    static public double radio;

    static public void areaCalculator(double radio) {
        System.out.println("El área es: " + Math.PI * (Math.pow(radio,2)));
    }

    public static void run() {
        System.out.print("\nBienvenido(a),\n" +
                "Si desea calcular el área de un círculo, \n" +
                "por favor ingrese el radio del mismo: ");
        radio = Double.parseDouble(entrada.nextLine());
        areaCalculator(radio);
    }
}
