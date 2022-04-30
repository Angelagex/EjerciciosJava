package EjerciciosJava;

public class Ejercicio6 {


    public static void pares() {
        System.out.println("\nLos números pares del 1 al 100 son :");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ", ");
            }
        }
    }

    public static void impares() {
        System.out.println("\nLos números impares del 1 al 100 son :");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + ", ");
            }
        }
    }

    public static void run() {
        pares();
        impares();
    }
}
