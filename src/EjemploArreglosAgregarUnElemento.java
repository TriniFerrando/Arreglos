//Insertando un nuevo elemento e incrementando el tamaño del arreglo

import java.util.Scanner;

public class EjemploArreglosAgregarUnElemento {
    public static void main(String[] args) {
        int[] num = new int[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        for(int i=0; i<num.length ;i++){
            num[i]= scanner.nextInt();
        }

        System.out.println();

        System.out.println("Ingrese el elemento:");
        int elemento= scanner.nextInt();

        System.out.println("Ingrese la posición(0-4):");
        int posicion= scanner.nextInt();



        int utlimo=num[num.length-1];
        for(int i= num.length-2 ; i >= posicion ;i--){
            num[i+1]=num[i];
        }


        num[posicion]=elemento;

        int[] nuevoArreglo= new int[num.length+1];
        System.arraycopy(num,0,nuevoArreglo,0,num.length);
        nuevoArreglo[posicion]= elemento;

        nuevoArreglo[nuevoArreglo.length-1]=utlimo;
        for(int i =0; i<nuevoArreglo.length; i++){
            System.out.println("Posicion " + i + " tien el numero "+nuevoArreglo[i]);
        }

    }
}
