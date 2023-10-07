import java.util.Scanner;

public class parImpar {
    
    public static void main (String[] args) {

        // Pedir al usuario un numero entero y determinar si es par o impar

        Scanner leerT = new Scanner(System.in);

        // Variables

        int Num = 0;
        
        // Solicitar datos

        System.out.print("Ingresa el numero entero: ");
        Num = leerT.nextInt();

        // Operacion

        if ((Num % 2)== 0) {

            System.out.println("El numero " + Num + " es par ");

        } else {

            System.out.println("El numero " + Num + " es impar ");

        }
        
        leerT.close();

    }

}
