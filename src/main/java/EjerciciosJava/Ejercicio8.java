package EjerciciosJava;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio8 {

    static Scanner entrada = new Scanner(System.in);
    static public String dia;
    static public String laboral = "Hoy es laboral";
    static public String noLaboral = "Hoy se descansa";


    static public void esLaboral (String dia) {

        switch(dia){
            case "lunes", "martes", "miercoles", "jueves","viernes":
                System.out.println(laboral);
                break;
            case "sabado", "domingo":
                System.out.println(noLaboral);
                break;
            default:
                System.out.println("No ingresaste un dia valido");

        }
    }
    public static void run() {
        System.out.println("Bienvenido(a), ingrese un dia de la semana: ");
        dia = entrada.nextLine().toLowerCase();
        esLaboral(dia);
    }
}
