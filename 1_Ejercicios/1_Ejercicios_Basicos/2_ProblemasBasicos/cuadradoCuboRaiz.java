import java.util.Scanner;

public class cuadradoCuboRaiz {
    public static void main (String[] args) {

        // Ejercicio
        // Escribe un programa que lea un número entero del usuario y luego imprima el cuadrado, 
        // el cubo y la raíz cuadrada de ese número.

        // Clase
        Scanner leerT = new Scanner(System.in);

        // Variables
        float num = 0; // numero que sera modificado

        // Entrada de datos
        System.out.print("Ingresa un numero: ");
        num = leerT.nextFloat();

        leerT.close();

        // Procesar datos y salida
        System.out.println("El cuadrado de " + num + " es " + Math.pow(num, 2));
        System.out.println("El cubo de " + num + " es " + Math.pow(num , 3));
        System.out.println("La raiz cuadrada de " + num + " es " + Math.sqrt(num));



    }
}
