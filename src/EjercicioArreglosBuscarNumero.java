import java.util.Scanner;

/*
Buscar elementos en un arreglo
 */
public class EjercicioArreglosBuscarNumero {
    public static void main(String[] args) {
        int[] a= new int[5];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        for(int i=0; i<a.length; i++){
            a[i]= scanner.nextInt();
        }

        System.out.println("Ingrse un numero a buscar:");
        int num= scanner.nextInt();
        int i=0;

        while(i < a.length && a[i] !=num){
            i++;
        }

        if(i == a.length){
            System.out.println("No se encontro");
        }else if (a[i] == num){
            System.out.println("encontrado! esta en la posicion "+ i);
        }





    }
}
