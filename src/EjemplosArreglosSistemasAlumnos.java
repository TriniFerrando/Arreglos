import java.util.Scanner;

/* Sistema de notas de alumnos por asignaturas
Se tiene al nivel primario con 3 asignaturas: matematica-historia-lenguaje.
Para el curso de 7 alumnos se tiene que poder asignale una nota a cada uno en dichas asignaturas.
Calcular el promedio general de cada curso y el promedio por asignatura y promedio por alumno
*/
public class EjemplosArreglosSistemasAlumnos {
    public static void main(String[] args) {
        double[] matematica, historia, lenguaje;

        matematica=new double[7];
        historia= new double[7];
        lenguaje=new double[7];

        Scanner scanner= new Scanner(System.in);

        System.out.println("Ingrese 7 notas de estudiantes para matemática: ");
        for(int i=0; i<matematica.length; i++){
            matematica[i]= scanner.nextDouble();
        }


        System.out.println("Ingrese 7 notas de estudiantes para historia: ");
        for(int i=0; i<historia.length; i++){
            historia[i]= scanner.nextDouble();
        }

        System.out.println("Ingrese 7 notas de estudiantes para lenguaje: ");
        for(int i=0; i<lenguaje.length; i++){
            lenguaje[i]= scanner.nextDouble();
        }

        int sumaNotasMatematicas=0, sumaNotasHistoria=0, sumaNotasLenguaje=0;

        //sumo el total de notas de cada materia
        for(int i=0; i<matematica.length; i++){
            sumaNotasMatematicas +=matematica[i];
            sumaNotasHistoria += historia[i];
            sumaNotasLenguaje += lenguaje[i];
        }

        double promMate= sumaNotasMatematicas/matematica.length;
        double promHist =sumaNotasHistoria/historia.length;
        double promLenguaje = sumaNotasLenguaje/lenguaje.length;

        System.out.println("Promedio general matematica: "+ promMate);
        System.out.println("Promedio general historia: " +promHist);
        System.out.println("Promedio general lenguaje: "+promLenguaje);


        System.out.println("Promedio total: "+ (promMate+promHist+promLenguaje)/3 );

        //Alumno en particular
        System.out.println("Ingrese identificador de alumno (0-6): ");
        int id= scanner.nextInt();
        double promAlumno= (matematica[id]+historia[id]+lenguaje[id])/3;

        System.out.println("Promedio del alumno Nro "+id +" es de " +promAlumno);
    }
}
