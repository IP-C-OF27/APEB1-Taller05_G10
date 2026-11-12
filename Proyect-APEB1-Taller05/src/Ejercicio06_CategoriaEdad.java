import java.util.Scanner;
/**
 * Ejercicio 06: "Categoría de Edad: Clasificar a una persona en una categoría 
 * de edad (niño, adolescente, adulto) en función de su edad."
 * @author Santiago, Nicolás
 * @version 1.0
 */
public class Ejercicio06_CategoriaEdad 
{
    public static void main(String[] args) 
    {
        int edad;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        edad = tcl.nextInt();
        if (edad <= 12)
            System.out.println("Es nino");
        if (edad > 13 && edad <=17)
            System.out.println("Es adolescente");
        if (edad >= 18)
            System.out.println("Es adulto");
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese su edad: 18
Es adulto
BUILD SUCCESSFUL (total time: 2 seconds)
 */