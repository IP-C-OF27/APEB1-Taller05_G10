import java.util.Scanner;
/**
 * Ejercicio 04: "Descuento en Compras: Calcular el precio final de un producto 
 * con un descuento del 10% si el precio original es mayor de $100; de lo 
 * contrario, no hay descuento."
 * @author Santiago, Nicolás
 * @version 1.0
 */
public class Ejercicio04_Descuento {
    public static void main(String[] args) {
        double precio;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Deme el precio: ");
        precio = tcl.nextDouble();
        if (precio > 100)
            precio = precio * 0.9;
        System.out.println(precio);
    }   
}
/***
 * EVIDENCIA DEL RUN:
 * Deme el precio: 1000
900.0
BUILD SUCCESSFUL (total time: 3 seconds)
*/