//Copiar pares e impares de un arreglo de enteros y en sus respectivos arreglos

import java.util.Scanner;

public class EjemplosArreglosParesImparesMismoArreglo {
    public static void main(String[] args) {
        int[] numeros = new int[6];
        Scanner scanner= new Scanner(System.in);

        int largo= numeros.length;

        System.out.println("Ingrese un número: ");
        for(int i=0; i<largo; i++){
            numeros[i]= scanner.nextInt();
        }

    }
}
