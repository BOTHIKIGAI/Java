import java.util.Scanner;

public class biblioteca {
    
    public static void main(String[] args)  {

        // creacion

        Libro book=new Libro();
        String tit, aut;
        int pag;

        // uso de la clase scanner
        
        Scanner captura=new Scanner(System.in);

        // capturar titulo libro 1

        System.out.println("Digite el nombre del libro: ");
        tit = captura.next();

        // capturar autor libro 1

        System.out.println("Digite el nombre del autor del libro: ");
        aut = captura.next();

        // capturar paginas libro 1

        System.out.println("Digite la cantidad de paginas del libro: ");
        pag = captura.nextInt();

        book.setAutor1(aut);
        book.setTitulo1(tit);
        book.setPaginas1(pag);



        // capturar titulo libro 1

        System.out.println("Digite el nombre del libro: ");
        tit = captura.next();

        // capturar autor libro 2

        System.out.println("Digite el nombre del autor del libro: ");
        aut = captura.next();

        // capturar paginas libro 2

        System.out.println("Digite la cantidad de paginas del libro: ");
        pag = captura.nextInt();

        book.setAutor2(aut);
        book.setTitulo2(tit);
        book.setPaginas2(pag);

        // Metodo mostrar libro

        book.mostrarLibro();
        book.compararLibros();
    }


}
