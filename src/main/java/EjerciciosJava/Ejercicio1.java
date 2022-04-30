package EjerciciosJava;

public class Ejercicio1 {

    public static int n1 = 2;
    public static int n2 = 5;
    public static int n3 = 9;
    public static int n4 = 11;
    public static int n5 = 7;
    public static int n6 = 3;
    public static int n7 = 5;

    public static void comparador(int a, int b) {
        if(a > b){
            System.out.println(a + " es mayor que " + b);
        }
        else if(a < b){
            System.out.println(a + " es menor que " + b);
        }
        else {
            System.out.println("Las variables son iguales");
        }
    }

    public static void run() {
        comparador(n1, n2);
        comparador(n3, n4);
        comparador(n5, n6);
        comparador(n6, n2);
        comparador(n1, n4);
        comparador(n2, n7);
    }
}
