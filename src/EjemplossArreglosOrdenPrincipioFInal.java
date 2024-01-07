/*
Se busca imprimir el primero con el ultimo,
el segundo con el ante último,
el tercero con el ante penultimo,etc..
 */

public class EjemplossArreglosOrdenPrincipioFInal {
    public static void main(String[] args) {
        int[] numeros= new int[10];

        int largo = numeros.length;

        for(int i = 0 ; i < largo ; i++){
            numeros[i] = i + 1; //le doy valor a cada indice
        }


        for(int i = 0 ; i < largo/2 ; i++){
            System.out.println(numeros[i] + " " + numeros[largo-1-i]);
        }




    }
}
