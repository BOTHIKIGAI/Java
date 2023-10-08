import java.util.Random;
import java.util.Scanner;

public class numAleatorio {
    public static void main (String[] args) {
        
        // Ejercicio
        // Programa que solicite un numero al usuario y luego de un numero random entre ese numero 
        
        // Clase
        Scanner leerT = new Scanner(System.in); // Leer entradas por terminal
        Random rand = new Random();


        // Variables
        int Num = 0; // almacenar dato del usuario
        int NumRandom = 0; // almacenar numero resultado de random

        // Entrada de datos
        System.out.print("Ingrese un numero: ");
        Num = leerT.nextInt();

        // Procesar datos
        NumRandom = rand.nextInt(Num)+1;// se suma el uno para especificar el rango, de lo contrario iniciara en 0 

        // Salidad de datos
        System.out.println("El numero random resultante entre 1 y " + Num + " es " + NumRandom);

        leerT.close();
    }
}
