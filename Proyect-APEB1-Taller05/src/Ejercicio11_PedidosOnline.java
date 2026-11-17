import java.util.Scanner;
/**
 * Ejercicio 11: Pedidos online: Desarrollar una solución que imprima el costo 
 * de un pedido de un artículo del cual se tiene la descripción, la cantidad 
 * que se requiere y el precio unitario. Si la cantidad pedida excede de 50 
 * unidades, se hace un descuento de 15%.
 * @author Nicolás , Santiago
 * @version 1.0
 */

public class Ejercicio11_PedidosOnline {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Diga la descripcion del articulo : ");
        String descripcion = tcl.nextLine();
        System.out.print("Ingrese cantidad requerida : ");
        int cant = tcl.nextInt();
        System.out.print("Ingrese el precio unitario: ");
        double precioUnitario = tcl.nextDouble();
        double subtotal = cant * precioUnitario;
        double totalFinal;
        double descuento = 0;
        if (cant > 50){
            descuento = subtotal * 0.15;
            totalFinal = subtotal;}
        else {
            totalFinal = subtotal;}
        System.out.println("----PEDIDO-----");
        System.out.println("Articulo : " + descripcion);
        System.out.println("Cantidad : " + cant);
        System.out.println("Precio Unitario : " + precioUnitario);
        System.out.println("Subtotal : " + subtotal);
        if(cant > 50){
        System.out.println("Descuento aplicado (15%): " + descuento);}
        else {
        System.out.println("Descuento : 0.00");}
        System.out.println("TOTAL A PAGAR ES : " + subtotal);
     }}  
        
/***
run:
Diga la descripcion del articulo : gomitas de azucar 
Ingrese cantidad requerida : 3
Ingrese el precio unitario: 5
----PEDIDO-----
Articulo : gomitas de azucar 
Cantidad : 3
Precio Unitario : 5.0
Subtotal : 15.0
Descuento : 0.00
TOTAL A PAGAR ES : 15.0
BUILD SUCCESSFUL (total time: 11 seconds)
 */
