import java.util.Scanner;
/**
 * Ejercicio 10: "Valores pares o impares: Dado un valor entero ingresado por 
 * teclado (positivo o negativo), determinar si se trata de un valor par o 
 * impar."
 * @author Santiago, Nicolás
 * @version 1.0
 */
public class Ejercicio10_ParesImpares 
{
    public static void main(String[] args) 
    {
        int num;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        num = tcl.nextInt();
        num = num % 2;
        if (num == 0)
            System.out.println("Es par");
        else
            System.out.println("Es impar");
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese un numero: 10
Es par
BUILD SUCCESSFUL (total time: 23 seconds)
 * run:
Ingrese un numero: -7
Es impar
BUILD SUCCESSFUL (total time: 4 seconds)
 */