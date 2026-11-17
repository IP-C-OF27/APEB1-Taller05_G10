import java.util.Scanner;
/**
 * Ejercicio 13: Sistema de reservas hoteleras: En una hostería de la ciudad de 
 * Loja se hace un descuento del 10% si el cliente se hospeda más de 5 días, 
 * del 15% si se hospeda más de 10 días y del 20% si se hospeda más de 15 días.
 * Elaborar una solución que pida el número de días y el precio diario de la 
 * habitación y luego calcule e imprima el subtotal por pagar, el descuento y 
 * el total por pagar.
 * @author Nicolás , Santiago
 * @version 1.0
 */

public class Ejercicio13_ReservasHoteles {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese el número de dias de hospedaje: ");
        int dias = tcl.nextInt();
        System.out.print("Ingrese el precio diario de la habitación: ");
        double precioDia = tcl.nextDouble();
        double subtotal = dias * precioDia;
        double porcentajeDescuento;
        double descuento;
        double totalPagar;
        if(dias > 15){
        porcentajeDescuento = 0.20;}
        else if (dias > 10){
        porcentajeDescuento = 0.15;}
        else if (dias > 5){
        porcentajeDescuento = 0.10;}
        else {
        porcentajeDescuento = 0.00;}
        descuento = subtotal * porcentajeDescuento;
        totalPagar = subtotal - descuento;
        System.out.println("----RESERVA DEL HOTEL----");
        System.out.println("Dias hospedados : " + dias);
        System.out.println("Precio por dia : " + precioDia);
        System.out.println("Subtotal : " + subtotal);
        System.out.println("Descuento aplicado (" + (porcentajeDescuento * 100)+ "%: )" + descuento);
        System.out.println("Total a pagar : " + totalPagar);
        }}
       
/***
 * EVIDENCIA DEL RUN:
run:
Ingrese el n�mero de dias de hospedaje: 6
Ingrese el precio diario de la habitaci�n: 10
----RESERVA DEL HOTEL----
Dias hospedados : 6
Precio por dia : 10.0
Subtotal : 60.0
Descuento aplicado (10.0%)6.0
Total a pagar : 54.0
BUILD SUCCESSFUL (total time: 9 seconds)
 */       
                
    


