//Eliminar un elemento del arreglo

import java.util.Scanner;

public class EjemploArreglosEliminarUnElemento {
    public static void main(String[] args) {
        int[] num = new int[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        for(int i=0; i<num.length ;i++){
            num[i]= scanner.nextInt();
        }

        System.out.println();

        System.out.println("Ingrese la posición a eliminar (0-4):");
        int posicion= scanner.nextInt();

        for(int i = posicion; i< num.length-1 ; i++){
            num[i]=num[i+1];
        }

        for(int i =0; i<num.length; i++){
            System.out.println("Posicion " + i + " tien el numero "+num[i]);
        }

    }
}
