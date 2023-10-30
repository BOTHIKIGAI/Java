import java.util.Scanner;

public class contarNumeroLetras {

    public static void main (String[] args) {

        // Contar el numero de palabras que tiene una palabra

        Scanner leerT = new Scanner(System.in);

        String word;
        int numLetters;

        System.out.print("Ingrese la palabra: ");
        word = leerT.next();

        numLetters = word.length();

        System.out.println("La cantidad de letras en la palabra " + word + " es de " + numLetters);

        leerT.close();

    }
}
