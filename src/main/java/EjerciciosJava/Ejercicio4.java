package EjerciciosJava;

import java.util.Scanner;

public class Ejercicio4 {

    static Scanner entrada = new Scanner(System.in);

     static public final double iva = 1.21;
     static public double precio;

     static public void sumarIva(double precio) {

        System.out.println("El producto tiene un precio total de: " + precio*iva);
     }

    public static void run() {
        System.out.print("\nPor favor ingrese el precio del producto,\n" +
                "el IVA sera adicionado: ");
        precio = entrada.nextInt();
        sumarIva(precio);
    }
}
