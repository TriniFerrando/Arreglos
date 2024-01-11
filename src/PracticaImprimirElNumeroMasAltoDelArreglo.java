/*
Escriba un programa que imprima el número más alto de un arreglo de 7 elementos
(de rango 11 a 99), por ejemplo {14, 33, 15, 36, 78, 21, 43}, si se repite un valor considerar uno solo.
 */

import java.util.Scanner;

public class PracticaImprimirElNumeroMasAltoDelArreglo {
    public static void main(String[] args) {

        int[] a = new int[7];
        Scanner scanner = new Scanner(System.in);

        int largo= a.length;

        System.out.println("Ingrese un numero: ");
        for(int i=0 ; i<largo ; i++){
            a[i]= scanner.nextInt();

        }

        int max=0;
        for (int i = 0; i < largo; i++) {
            max = (max > a[i])? max: a[i];
        }

        System.out.println("Valor más alto: "+ max);
    }
}
