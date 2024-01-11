/*
Leer 7 números por teclado para llenar un arreglo y a continuación calcular el promedio
de los números positivos, el promedio de los negativos y contar el número de ceros.
 */

import java.util.Scanner;

public class PracticaSistemaEstadísticoDeUnArreglo {
    public static void main(String[] args) {

        int[] a = new int[7];
        Scanner scanner = new Scanner(System.in);

        int largo= a.length;

        System.out.println("Ingrese un numero: ");
        for(int i=0 ; i<largo ; i++){
            a[i]= scanner.nextInt();

        }

        int contPositivo=0;
        int sumaPositivo=0;
        int contNegativo=0;
        int sumaNegativo=0;
        int cont=0; //contador de ceros

        for (int i = 0; i < largo; i++) {
            if(a[i] == 0){
                cont++;
            } else if (a[i] > 0){
                contPositivo++;
                sumaPositivo+= a[i];
            }else{
                contNegativo ++;
                sumaNegativo+=a[i];
            }
        }

        System.out.println("Promedio de Positivos: "+ sumaPositivo/contPositivo);
        System.out.println("Promedio de Negativos: "+ sumaNegativo/contNegativo);
        System.out.println("Cantidad de ceros: "+ cont);
    }
}
