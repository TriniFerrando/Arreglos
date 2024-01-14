/*
Escribir un programa que recorra un arreglo y genere un histograma en base a los valores de este.
El arreglo debe contener 12 elementos que corresponden a números enteros de rango 1 al 6.
Un histograma es una representación gráfica (de puntos o barra) de que tanto un elemento aparece en
un conjunto de datos, es decir debe mostrar la frecuencia para todos los números del 1 al 6, incluso si
no están presente en el arreglo.
Por ejemplo para el arreglo {4, 3, 4, 6, 6, 4, 1, 4, 5, 4, 1, 1} el histograma debería ser:
1: ***
2:
3: *
4: *****
5: *
6: **
Para la tarea usaremos el asterisco(*) como representación gráfica para el histograma.
 */


import java.util.Scanner;

public class PracticaImprimirHistograma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[]=new int[12];
        int i = 0;

        while(i < a.length){
            System.out.println("Ingrese un numero del 1 al 6: ");
            int num = scanner.nextInt();
            if(num >= 1 && num <=6){
                a[i]=num;
                i++;
            } else{
                System.out.println("Error, numero fuera del rango permitido.");
            }
        }

        String[] nuevoValor = new String[6];

        for(i=0; i< nuevoValor.length; i++){
            int aux=i +1;
            String histograma = aux + ":";
            for(int j=0; j<a.length;j++){
                if(aux==a[j]){
                    histograma += "*";
                }
            }
           nuevoValor[i]=histograma;
        }

        for(i=0; i<nuevoValor.length;i++){
            System.out.println(nuevoValor[i]);
        }



    }
}
