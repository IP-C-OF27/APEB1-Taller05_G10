import java.util.Scanner;
/**
 * Ejercicio 07: Rango de Notas: Asignar una letra (A, B, C, D) a una 
 * calificación en función de su rango (A para 90-100, B para 80-89, etc.).
 * @author NombreAutor
 * @version 1.0
 */

public class Ejercicio07_RangoNotas {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese su nota del 1 al 100: ");
        int nota = tcl.nextInt();
        
        if (nota >= 90 && nota <= 100) {
        System.out.println("Felicidades su nota es de A");}
        else if (nota >= 80 && nota <= 89){
        System.out.println("Muy bien su nota es de B");}
        else if (nota >= 70 && nota <=79){
        System.out.println("Bien su nota es de C");
        }
        else if (nota >= 60 && nota <= 69){
        System.out.println("Su nota es de D");}
        else {
            System.out.println("Reprobado");
        }
        
    }
}

/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese su nota del 1 al 100: 95
Felicidades su nota es de A
BUILD SUCCESSFUL (total time: 2 seconds)

 */