import java.util.Scanner;

public class ordenNumeros {

    public static void main(String[] args) {
        
        // creacion

        Numeros_lista num=new Numeros_lista();
        int num1,num2,num3;

        // uso de la clase scanner

        Scanner captura=new Scanner(System.in);

        // capturar el numero 1

        System.out.println("Digite el primer numero: ");
        num1 = captura.nextInt();

        // captura el numero 2

        System.out.println("Digite el segundo numero: ");
        num2 = captura.nextInt();

        // captura el numero 3

        System.out.println("Digite el tercer numero: ");
        num3 = captura.nextInt();

        num.setPrimero(num1);
        num.setSegundo(num2);
        num.setTercero(num3);

        // metodos

        num.agregarNumLista();
        num.ordenarLista();

    }

}
