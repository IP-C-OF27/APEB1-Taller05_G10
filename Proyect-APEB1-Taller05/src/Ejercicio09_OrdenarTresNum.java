import java.util.Scanner;
/**
 * Ejercicio 09: Ordenamiento de Tres Números: Dados tres números, 
   ordenarlos en orden ascendente.
 * @author Nicolás, Santiago 
 * @version 1.0
 */
public class Ejercicio09_OrdenarTresNum {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese su primer numero :");
        int n1 = tcl.nextInt();
        System.out.print("Ingrese su segundo numero :");
        int n2 = tcl.nextInt();
        System.out.print("Ingrese su tercer numero :");
        int n3 = tcl.nextInt();
        if (n1 < n2 && n2 < n3){
        System.out.println("El orden es : " + n1 + "-" + n2 + "-" + n3);}
        else if (n1 < n3 && n3 < n2){
        System.out.println("El orden es : " + n1 + "-" + n3 + "-" + n2);}
        else if (n2 < n1 && n1 < n3){
        System.out.println("El orden es : " + n2 + "-" + n1 + "-" +n3);}
        else if (n2 < n3 && n3 < n1){
        System.out.println("El orden es : " + n2 + "-" + n3 + "-" + n1);}
        else if (n3 < n1 && n1 < n2){
        System.out.println("El orden es : " + n3 + "-" + n1 + "-"+ n2);}
        else {
        System.out.println("El orden es : " + n3 + "-" +n2 + "-" + n1);    
        }}}
 
/***
run:
Ingrese su primer numero :1
Ingrese su segundo numero :5
Ingrese su tercer numero :3
El orden es : 1-3-5
BUILD SUCCESSFUL (total time: 4 seconds)
 */