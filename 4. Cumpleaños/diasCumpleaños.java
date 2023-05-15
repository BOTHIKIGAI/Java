import java.util.Scanner;

public class diasCumpleaños {
    
    public static void main(String[] args) {
        
        // creacion

        FechaCumpleaños cumpleaños = new FechaCumpleaños();
        int diaCumpl, mesCumpl;

        // uso de clase scanner

        Scanner captura = new Scanner(System.in);

        System.out.println("Digite el dia en que cumple años: ");
        diaCumpl = captura.nextInt();

        // captura mes

        System.out.println("Digite el mes (en numero) en que cumple años: ");
        mesCumpl = captura.nextInt();

        // asignar valores

        cumpleaños.setDia(diaCumpl);
        cumpleaños.setMes(mesCumpl);

        // metodos

        cumpleaños.cuantoFalta();
        cumpleaños.diasPasadosUltimo();

    }
}
