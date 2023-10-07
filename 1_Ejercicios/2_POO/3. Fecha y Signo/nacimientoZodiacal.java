import java.util.Scanner;

public class nacimientoZodiacal {
    
    public static void main(String[] args) {
        
        // Creacion

        FechaZodiacal zofecha = new FechaZodiacal();
        int diaNac, mesNac, añoNac;

        // uso de clase scanner

        Scanner captura=new Scanner(System.in);

        // captura el dia 

        System.out.println("Digite el dia en que nacio: ");
        diaNac = captura.nextInt();

        // captura el mes

        System.out.println("Digite el mes (en numero) en que nacio: ");
        mesNac = captura.nextInt();

        // captura el año

        System.out.println("Digite el año (en numero) en que nacio: ");
        añoNac = captura.nextInt();

        // asignar valores a las variables de la clase Fecha Zodiacal

        zofecha.setDia(diaNac);
        zofecha.setMes(mesNac);
        zofecha.setAño(añoNac);

        // metodos

        zofecha.calcularEdad();
        zofecha.zodiaco(diaNac, mesNac);

    }
}
