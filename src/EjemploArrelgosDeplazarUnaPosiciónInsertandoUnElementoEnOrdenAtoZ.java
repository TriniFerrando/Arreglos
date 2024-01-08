
// Agregar un elemento en una posición adecuada de manera que se mantenga ordenado

import java.util.Scanner;

public class EjemploArrelgosDeplazarUnaPosiciónInsertandoUnElementoEnOrdenAtoZ {
    public static void main(String[] args) {
        int[] num = new int[5];
        int nuevo,posicion;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número:");
        for(int i =0; i<num.length; i++){
            num[i]= scanner.nextInt();
        }

        System.out.println();

        System.out.println("Nuevo elemento:");
        nuevo= scanner.nextInt();

        posicion= 0;

        while(posicion < num.length && nuevo > num[posicion] ){
            posicion++;
        }


        for(int i=num.length-2; i>= posicion; i--){
            num[i+1]= num[i];
        }
        num[posicion]=nuevo;

        System.out.println("Nuevo arreglo ordenado:");
        for(int i=0; i<num.length;i++){
            System.out.println("Posición "+ i + " tiene al " +num[i]);
        }

    }
}
