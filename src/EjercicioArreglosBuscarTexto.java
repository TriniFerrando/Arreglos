import java.util.Scanner;

/*
Buscar elementos de tipo Texto en un arreglo
 */
public class EjercicioArreglosBuscarTexto {
    public static void main(String[] args) {
        String[] a= new String[4];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un nombre: ");
        for(int i=0; i<a.length; i++){
            a[i]= scanner.next();
        }

        System.out.println("Ingrse un nombre a buscar:");
        String nombre= scanner.next();
        int i=0;

        while(i < a.length && !a[i].equalsIgnoreCase(nombre)){
            i++;
        }

        if(i == a.length){
            System.out.println("No se encontro");
        }else if (a[i].toLowerCase().compareTo(nombre.toLowerCase()) == 0){
            System.out.println("encontrado! esta en la posicion "+ i);
        }

        // hacer equals y compareTo es lo mismo.



    }
}
