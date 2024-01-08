import java.util.Scanner;

public class EjemplosArreglosPorScanner {
    public static void main(String[] args) {
        int[] a = new int[5];
        Scanner scanner = new Scanner(System.in);

        int largo= a.length;

        for(int i=0 ; i<largo ; i++){
            System.out.println("Ingrese un numero: ");
            a[i]= scanner.nextInt();

        }


        for(int i=0 ; i<largo ; i++){
            System.out.println("a = " + a[i]);
        }
    }
}
