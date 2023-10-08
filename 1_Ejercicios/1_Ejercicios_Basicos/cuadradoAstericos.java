import java.util.Scanner;

public class cuadradoAstericos {
    public static void main(String[] args) {
        
        // Imprimir un cuadrado en base a numero entero

        // Clase
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        // Procesar datos
        // Validar si el número es válido (mayor que 0)

        if (numero <= 0) {
            
            System.out.println("El número debe ser mayor que 0.");

        } else {
            
            // Un ciclo que agregara fila por fila

            for (int fila = 1; fila <= numero; fila++) {

                // un ciclo que creara fila

                for (int columna = 1; columna <= numero; columna++) {
                    System.out.print("* ");
                }
                System.out.println(); // Con el salto de linea se pasa a la siguiente linea
            }
        }
        
        scanner.close();
    }
}
