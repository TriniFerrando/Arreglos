import java.util.Scanner;

public class EjemplosArreglosMax {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        Scanner scanner = new Scanner(System.in);

        int largo = numeros.length;

        for(int i=0; i<largo; i++){
            System.out.println("Ingrese un número: ");
            numeros[i]= scanner.nextInt();
        }

        int max=0;
        for(int i=0; i<largo; i++ ){
            max = (numeros[max]) > numeros[i] ? max : i;
        }


        System.out.println("Los números ingresados son: ");
        for(int i =0; i<largo; i++){
            System.out.println(numeros[i]);
        }

        System.out.println("El maximo es: " + numeros[max]);


    }
}
