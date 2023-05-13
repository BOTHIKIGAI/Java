import java.util.Scanner;

public class calcularNotas {
    public static void main(String[] args)  {
        
        // creacion 

        Numeros notas=new Numeros();
        String nom;
        float n1,n2;

        // uso de clase scanner

        Scanner captura=new Scanner(System.in);

        System.out.println("Digite el nombre del estudiante: ");
        nom=captura.next();

        // capturar las notas

        System.out.println("Digita la nota numero 1 para el estudiante:");
        n1=captura.nextFloat();

        System.out.println("Digita la nota numero 2 para el estudiante:");
        n2=captura.nextFloat();

        notas.setNombre(nom);
        notas.setNota1(n1);
        notas.setNota2(n2);

        System.out.println("El nombre del estudiante es: " + notas.getNombre());

        System.out.println("La nota 1 del estudiante es: " + notas.getNota1());
        System.out.println("La nota 1 del estudiante es: " + notas.getNota1());

        // Conocer si el estudiante aprobo o no

        notas.calcular();
        
    }
}
