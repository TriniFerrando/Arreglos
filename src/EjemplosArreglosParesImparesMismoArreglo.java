//Copiar pares e impares de un arreglo a otros arreglos segun que sean

import java.util.Scanner;

public class EjemplosArreglosParesImparesMismoArreglo {
    public static void main(String[] args) {
        int[] numeros, pares, impares; //declaro los 3 arreglos

        numeros = new int[6];          //Asigno valor al primer arreglo
        Scanner scanner= new Scanner(System.in);

        int largo= numeros.length;

        System.out.println("Ingrese un número: ");
        for(int i=0; i<largo; i++){
            numeros[i]= scanner.nextInt();
        }


        int contPares=0;
        int contImpares=0;
        for(int i=0; i<largo; i++){
            if(numeros[i] % 2 ==0){
                contPares++;
            }else{
                contImpares++;
            }

        }

        pares=new int[contPares];  //Asigno valor al segundo arreglo
        impares= new int[contImpares]; //Asigno valor al tercer arreglo


        int k=0;
        int j=0;
        for(int i=0; i<largo; i++){
            if(numeros[i] % 2 ==0){
                pares[k++]=numeros[i];
            }else{
                impares[j++]=numeros[i];
            }

        }

        System.out.println("Pares:");
        for(int i=0; i<pares.length ; i++){
            System.out.println(pares[i]);
        }
        System.out.println("\n");
        System.out.println("Impares:");
        for(int i=0; i<impares.length ; i++){
            System.out.println(impares[i]);
        }
    }
}
