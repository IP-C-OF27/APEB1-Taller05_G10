import java.util.Scanner;
/**
 * Ejercicio 05: Año Bisiesto: Comprobar si un año ingresado es bisiesto o no.
 * Si es bisiesto, mostrar un mensaje especial.
 * @author Nicolás , Santiago
 * @version 1.0
 */

public class Ejercicio05_AñoBisiesto {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese el Ano :");
        int ano = tcl.nextInt();
        System.out.print("Ingrese los días del ano: ");
        int dias = tcl.nextInt();
        if (dias>365){
            System.out.println("Su ano es bisiesto");
        } 
        }
        }

/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese el Ano :2024
Ingrese los d�as del ano: 366
Su ano es bisiesto
BUILD SUCCESSFUL (total time: 9 seconds)
 */