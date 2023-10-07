import java.util.Scanner;

public class piedraPapelTijera {
    public static void main (String[] args) {

        // Librerias
        Scanner leerT = new Scanner(System.in);

        // Variables
        String jugador1 = "";
        String jugador2 = "";

        // Menu
        System.out.println("---------------------------");

        System.out.println("Piedra = 1");
        System.out.println("Tijera = 2");
        System.out.println("Papel  = 3");

        System.out.println("---------------------------");

        // Entrada
        System.out.print("Ingrese su elección jugador 1 (Recuerde del 1 al 3): ");
        jugador1 = leerT.next();
        System.out.print("Ingrese su elección jugador 2 (Recuerde del 1 al 3): ");
        jugador2 = leerT.next();

        // Procesar

        // comparativa jugador 1

        if (jugador1.equals("1")  && jugador2.equals("2")) {
            System.out.println("El jugador 1 gana");

        } else if ( jugador1.equals("1") && jugador2.equals("3")) {
            System.out.println("El jugador 2 gana");

        } else if (jugador1.equals("2") && jugador2.equals("3")) {
            System.out.println("El jugador 2 gana");

        } else if (jugador1.equals("1") && jugador2.equals("1")) {
            System.out.println("Empate");

        } else if (jugador1.equals("2") && jugador2.equals("2")) {
            System.out.println("Empate");

        } else if (jugador1.equals("3") && jugador2.equals("3")) {
            System.out.println("Empate");

        } else if (jugador2.equals("1")  && jugador1.equals("2")) {         // Comparativa jugador 2
            System.out.println("El jugador 2 gana");

        } else if ( jugador2.equals("1") && jugador1.equals("3")) {
            System.out.println("El jugador 1 gana");

        } else if (jugador2.equals("2") && jugador1.equals("3")) {
            System.out.println("El jugador 1 gana");

        } else if (jugador2.equals("1") && jugador1.equals("1")) {
            System.out.println("Empate");

        } else if (jugador2.equals("2") && jugador1.equals("2")) {
            System.out.println("Empate");

        } else if (jugador2.equals("3") && jugador1.equals("3")) {
            System.out.println("Empate");
            
        } else {
            System.out.println("Error");  // por si algo sale mal...
        }        

        leerT.close();

    }
}
