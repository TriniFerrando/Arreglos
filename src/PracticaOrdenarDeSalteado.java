/*
Leer 10 números enteros desde el teclado para llenar un arreglo de 10 elementos.
Luego debemos mostrarlos en el siguiente orden: el último, el primero, el penúltimo,
el segundo, el antepenúltimo, el tercero, y así sucesivamente.
 */

import java.util.Scanner;

public class PracticaOrdenarDeSalteado {
    public static void main(String[] args) {

        int[] a = new int[10];
        Scanner scanner = new Scanner(System.in);

        int largo= a.length;

        System.out.println("Ingrese un numero: ");
        for(int i=0 ; i<largo ; i++){
            a[i]= scanner.nextInt();

        }


        for (int i = 0; i <= 4; i++) {
            System.out.println(a[9 - i]);
            System.out.println(a[i]);
        }


    }
}
