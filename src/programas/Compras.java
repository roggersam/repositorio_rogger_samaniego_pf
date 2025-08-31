package programas;

import java.util.Scanner;
public class Compras {
    public static void main(String args[]){
        String nombre;
        double compra1, compra2, compra3, tc, pc;
        Scanner lectura= new Scanner(System.in);
        //
        System.out.print("Ingresa el nombre del cliente: ");
        nombre=lectura.next();
        System.out.print("Ingresa la compra1: ");
        compra1=lectura.nextDouble();
        System.out.print("Ingresa la compra2: ");
        compra2=lectura.nextDouble();
        System.out.print("Ingresa la compra3: ");
        compra3=lectura.nextDouble();
        //
        tc=compra1+compra2+compra3;
        pc=tc/3;
        //
        System.out.println("El total de compras es: "+tc);
        System.out.println("El promedio de compra es: "+pc);
        System.out.println("ACTUALIZACIÓN");
    }
}
