import java.util.Arrays;

public class EjemplosArreglosFor {
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

        System.out.println("Usando for ");
        for(i =0; i<largo; i++){
            System.out.println("Para el indice " + i +": "+ numeros[i]);
        }


        System.out.println("\nUsando for each");
        for(int num: numeros) {
            System.out.println("Numeros= " + num);
        }
        System.out.println("\nUsando while");
       i = 0;
        while(i < largo){
            System.out.println("Para el indice " + i +": "+ numeros[i]);
            i++;

        }

        System.out.println("\nUsando do while");
        i =0;
        do{
            System.out.println("Para el indice " + i +": "+ numeros[i]);
            i++;

        } while(i<largo);




    }
}
