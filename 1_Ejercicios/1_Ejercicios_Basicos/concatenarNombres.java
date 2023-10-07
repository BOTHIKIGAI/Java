import java.util.Scanner;

public class concatenarNombres {

    public static void main (String[] args) { 

        // Pedir al usuario su nombre y apellido en dos variables diferentes y luego concatenar este

        Scanner LeerT = new Scanner(System.in); // Libreria para leer por consola entradas

        String name; //nombre
        String lastname; //apellido

        System.out.println("Ingresa nombre: ");
        name = LeerT.next();

        System.out.println("Ingresa apellido: ");
        lastname = LeerT.next();

        System.out.println("Hola " + name + " " + lastname);

        LeerT.close();

    }
    
}
