import java.util.Scanner;

public class imprimirNumeroEntre {
    public static void main (String [] args) {

        // Ejercicio
        // Crear un programa que pida al usuario un número entero, y luego imprima 
        // todos los números pares entre 1 y ese número.

        // Scanner
        Scanner leerT = new Scanner(System.in);

        // Variables
        int NumUser = 0;

        // Entrada
        System.out.print("Ingrese un numero: "); 
        NumUser = leerT.nextInt();

        // Procesar

        if (NumUser > 1 ) {
            
            System.out.println("Imprimiendo del 1 al " + NumUser);

            for (int i = 1;i <= NumUser; i++) {

                if ((i % 2)== 0) { // si la sustración de la división de i por 2 es igual a 0 significa que es par

                    System.out.println(i); // si es par se imprimira la variable i
                
                }

                // si no es par continuara
                
            }

        } else {
            System.out.println("La proxima ingresa un numero mayor a 1");
        }

        leerT.close();

    }
}