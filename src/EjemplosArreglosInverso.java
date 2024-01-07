import java.util.Arrays;

public class EjemplosArreglosInverso {
    public static void main(String[] args) {
        int[] numeros = new int[4]; //-1 para la última posición

        numeros[0]=10;
        numeros[1]=-6;
        numeros[2]=2;
        numeros[3]=56;

        Arrays.sort(numeros);//los ordena de menor a mayor

        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[3]; // es igual a numero[numero.length -1]

        int largo= numeros.length;

        //recorre al array de atras para adelante
        System.out.println("Opcion 1 de inverso: ");
        for(i =0; i<largo ; i++) {
            System.out.println("Para el indice " + (largo-1-i) + ": " + numeros[largo-1-i]);
        }

        System.out.println("\nOpcion 2 de inverso: ");
        i=0;
        for(i = (largo-1-i); i>=0 ; i--) {
            System.out.println("Para el indice " + i + ": " + numeros[i]);
        }

    }
}
