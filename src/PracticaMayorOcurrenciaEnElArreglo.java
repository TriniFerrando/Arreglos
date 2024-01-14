/*
Para la tarea se debe crear un arreglo con 10 elementos (enteros en el rango de 1 a 9).
Escriba un programa que imprima el número que tiene más ocurrencias en el arreglo y también
imprimir la cantidad de veces que aparece en el arreglo.
Por ejemplo, para el arreglo: {1, 2, 3, 3, 4, 5, 5, 5, 6, 7}
Como resultado debería imprimir lo siguiente:
La mayor ocurrencias es: 3
El elemento que mas se repite es: 5
En el ejemplo, el elemento que más se repite en el arreglo es el número 5 con una ocurrencia de 3 veces.
 */

import java.util.Scanner;

public class PracticaMayorOcurrenciaEnElArreglo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] a = new int[10];
        int i =0;

        while(i < a.length){
            System.out.println("Ingrese un numero de 1 a 9: ");
            int num= scanner.nextInt();
            if(num>=1 && num<=9){
                a[i]=num;
                i++;
            }else {
                System.out.println("Número fuera del rango.");
            }


        }

        int[] valoresMasRepetidos = new int[10];


        for (i = 0; i < a.length; i++) {
            int cant = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    cant++;
                }
            }
            valoresMasRepetidos[i] = cant;
        }


        int posicion = 0;
        int max = 0;
        for (i = 0; i < 10; i++) {
            if (max < valoresMasRepetidos[i]) {
                max = valoresMasRepetidos[i];
                posicion = i;
            }
        }

        System.out.println("La mayor ocurrencia es: " + max);
        System.out.println("El elemento que mas veces se repite es: " + a[posicion]);



    }
}

