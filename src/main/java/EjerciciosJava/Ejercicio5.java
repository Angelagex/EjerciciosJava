package EjerciciosJava;

public class Ejercicio5 {

    public static void pares() {
        int i = 1;
        System.out.println("\nLos números pares del 1 al 100 son :");
        while ( i <= 100) {
            if (i % 2 == 0) {
                System.out.print(i + ", ");
            }
            i++;
        }
    }

    public static void impares() {
        int i = 1;
        System.out.println("\nLos números impares del 1 al 100 son :");
        while ( i <= 100) {
            if (i % 2 != 0) {
                System.out.print(i + ", ");
            }
            i++;
        }
    }

    public static void run() {
        pares();
        impares();
    }
}
