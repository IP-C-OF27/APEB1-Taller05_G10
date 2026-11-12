import java.util.Scanner;
/**
 * Ejercicio 08: "Calculadora de IMC: Calcular el índice de masa corporal (IMC) 
 * de una persona y clasificarla en función de su valor (bajo peso, peso normal, 
 * sobrepeso, etc.)"
 * @author Santiago, Nicolás
 * @version 1.0
 */
public class Ejercicio08_CalculadoraIMC 
{
    public static void main(String[] args) 
    {
        double IMC, peso, estatura;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese su peso: ");
        peso = tcl.nextDouble();
        System.out.print("Ingrese su estatura: ");
        estatura = tcl.nextDouble();
        IMC = peso / (estatura * estatura);
        if (IMC < 18.5)
            System.out.println("Bajo peso");
        if (IMC >= 18.5 && IMC < 25)
            System.out.println("Peso normal");
        if (IMC >= 25 && IMC < 30)
            System.out.println("Sobre peso");
        if (IMC >= 30)
            System.out.println("Obesidad");
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese su peso: 70
Ingrese su estatura: 1,75
Peso normal
BUILD SUCCESSFUL (total time: 7 seconds)
 */