import java.util.Scanner;
/**
 * Ejercicio 03: "Mayor de tres números: Dados tres números distintos, 
 * determinar cuál es el mayor."
 * @author Nicolás , Santiago
 * @version 1.0
 */

public class Ejercicio03_MayorTresNumeros {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double numMayor = 0;
        System.out.print("Deme 3 numeros:  ");
        int n1 = tcl.nextInt(), n2 = tcl.nextInt(),n3 = tcl.nextInt(), mayor;
        if (n1 > n2)
        mayor = n1;
        else
            mayor = n2;
        if (mayor < n3)
            mayor = n3;
        System.out.println(mayor);       
        }
        }

/***
 * EVIDENCIA DEL RUN:
 * run:
Deme 3 numeros:  5 4 3
5
BUILD SUCCESSFUL (total time: 5 seconds)

 */