import java.util.Scanner;
/**
 * Ejercicio 12: "Calculo de impuestos: Desarrollar una solución que permita 
 * leer los datos de un automóvil (marca, origen y costo) imprima el impuesto 
 * por pagar y el precio de venta (incluido el impuesto). Si el origen es 
 * Alemania el impuesto es 20%, si es de Japón el impuesto es 30%, si es de 
 * Italia, 15%, y si es de USA, 8%"
 * @author Santiago, Nicolás
 * @version 1.0
 */
public class Ejercicio12_CalculoImpuestos 
{
    public static void main(String[] args) 
    {
        String marca, origen;
        double costo, impuesto, costoTotal;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese la marca del automovil: ");
        marca = tcl.nextLine();
        System.out.print("Ingrese el origen del automovil: ");
        origen = tcl.nextLine();
        System.out.print("Ingrese el costo del automovil: ");
        costo = tcl.nextDouble();
        switch (origen) 
        {
            case "Alemania":;
            impuesto = costo * 0.20;
                break;
            case "Japon":;
            impuesto = costo * 0.30;
                break;
            case "Italia":;
            impuesto = costo * 0.15;
                break;
            case "USA":;
            impuesto = costo * 0.08;
                break;
            default:
                impuesto = 0;
        }
        costoTotal = costo + impuesto;
        System.out.println("Impuesto por pagar: " + impuesto);
        System.out.println("Precio de venta: " + costoTotal);
    }
}
/***
 * EVIDENCIA DEL RUN:
 * 
 * run:
Ingrese la marca del automovil: Toyota
Ingrese el origen del automovil: Japon
Ingrese el costo del automovil: 18000
Impuesto por pagar: 5400.0
Precio de venta: 23400.0
BUILD SUCCESSFUL (total time: 14 seconds)
 */