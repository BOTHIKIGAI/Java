import java.util.Scanner;

public class mediaListaNumeroEnteros {
    public static void main (String[] args) {

        // Ejercicios
        // Escribe un programa que lea una lista de números enteros y luego imprima la media de 
        // los números.

        // Clases
        Scanner leerT = new Scanner(System.in);

        // Variables
        float num = 0; // almacena hasta donde va la lista 
        float sumTotal = 0; // la suma total de la lista de numeros
        float media = 0; // la media de la lista de numeros obtenida
        


        // Entrada de datos
        System.out.print("Ingresa un numero (mayor a 1): ");
        num = leerT.nextInt();

        // Cerrar escaner
        leerT.close();

        // Procesar datos
        if (num <= 1) {
            System.out.println("La proxima ingresa un numero mayor a 1");
            // No puedo generar una lista si empieza desde 0 o 1

        } else {
            for (int i = 1; i <= num; i++) {
               sumTotal += i;

               // num = 5
               // sumTotal = sumTotal + i
               // 1 + 2 + 3 + 4 + 5
               // sumTotal  = 15
               // media = 15 / 5

                // num = 4
               // sumTotal = sumTotal + i
               // 1 + 2 + 3 + 4
               // sumTotal  = 10
               // media = 10 / 4
               
            }

            media = sumTotal/num;
            // la media es la suma total de los elementos dividida por el numero de elementos

            System.out.println("La media de una lista de 1 a " + num + " es de " + media);

        }



    }
}
