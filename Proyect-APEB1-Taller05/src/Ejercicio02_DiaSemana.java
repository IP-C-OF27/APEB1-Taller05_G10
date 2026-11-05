import java.util.Scanner;
/**
 * Ejercicio 02: "Día de la semana: Mostrar el nombre del día de la semana en 
 * función del número ingresado (1 para lunes, 2 para martes, etc.)."
 * @author Santiago, Nicolás
 * @version 1.0
 */
public class Ejercicio02_DiaSemana {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("De numero de dia (1-7): ");
        int dia = tcl.nextInt();
        String msjDia;
        switch (dia) 
        {//Inicio SENTENCIA DE SELECCION MULTIPLE
            case 1: msjDia  = "lunes";
                break;
            case 2: msjDia  = "martes";
                break;
            case 3: msjDia  = "miercoles";
                break;
            case 4: msjDia  = "jueves";
                break;
            case 5: msjDia  = "viernes";
                break;
            case 6: msjDia  = "sabado";
                break;
            case 7: msjDia  = "domingo";
                break;
            default:
                msjDia  = "error";
        }//Fin SENTENCIA DE SELECCION MULTIPLE
        System.out.println("El numero: " + dia + " corresponde a: " + msjDia);
    }
}

/***
 * EVIDENCIA DEL RUN:
 * run:
De numero de dia (1-7): 6
El numero: 6 corresponde a: sabado
BUILD SUCCESSFUL (total time: 7 seconds)
 */