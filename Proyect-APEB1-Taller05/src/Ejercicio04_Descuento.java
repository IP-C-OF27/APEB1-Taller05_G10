import java.util.Scanner;
/**
 * Ejercicio 04: "Texto del enunciado del ejercicio/problema...."
 * @author NombreAutor
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