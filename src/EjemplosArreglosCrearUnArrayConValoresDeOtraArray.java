public class EjemplosArreglosCrearUnArrayConValoresDeOtraArray {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int[] a = new int[20];
        int[] b= new int[20];

        int largo = numeros.length;

        for (int i = 0; i < largo; i++) {
            numeros[i] = i + 1; //le doy valor a cada indice
        }

        //Para poder crear una variable que contenga valores de otra variable
        //necesitams crear el aux para poder asignarle el valor
        int aux = 0;
        for (int i = 0; i < largo; i++) {
            a[aux++] = numeros[i];
            a[aux++] = numeros[largo - 1 - i];
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println("Array a i= " + i + " valor: " + a[i]);
        }

        System.out.println("\n");
        int aux1=0;
        for(int i=0; i<a.length; i++){
            b[aux1++]=a[i];
        }

        for (int i = 0; i < b.length; i++) {
            System.out.println("Array b i= " + i + " valor: " + b[i]);

        }


    }
}