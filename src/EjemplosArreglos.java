import javax.lang.model.SourceVersion;
import java.util.Arrays;

public class EjemplosArreglos {
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

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);




    }
}
