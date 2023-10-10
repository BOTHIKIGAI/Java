
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
Realice un algoritmos que le solicite a un profesor ingresar las notas de 
sus estudiantes para calcular el promedio de toda la clase. El programa debe 
enviarle el siguiente mensaje al profesor: “Desea continuar ingresando notas 
para el estudiante? Si el profesor responde FINALIZAR, el programa termina y 
se calcula el promedio de la clase
*/


public class calificacionClase {
    public static void main (String args[]){
        Scanner leerC = new Scanner(System.in);
        
        
        //Declarar Variables
        float notaE1;
        float notaE2;
        float notaE3;
        int promedio;
        String nombreE1;
        String nombreE2;
        String nombreE3;
        char notaSofia;
        String idUsuario = "DMD";
        String clave = "dmd159";
        
        System.out.println("----------------------------------");
        System.out.println("** CREDENCIALES DE ACCESO **");
        System.out.println("");
        System.out.print("Código Usuario: ");
        idUsuario = leerC.next();
        System.out.print("Clave: ");
        clave = leerC.next();
        System.out.println("----------------------------------");
        
        if("DMD".equals(idUsuario) && "dmd159".equals(clave)) {

            System.out.println("");
            System.out.println("Información Estudiantes");
            System.out.println("");
            System.out.println("Estudiante 1");

            try{
                System.out.print("Nombre: ");
                //Capturar el nombre del estudiante
                nombreE1 = leerC.next();
                System.out.print("Nota: ");
                //Capturar la nota del estudiante
                notaE1 = leerC.nextFloat();

                if(notaE1 >= 7) {
                    System.out.println("La nota de: " + nombreE1 + " es A");
                    notaSofia = 'A';
                } else{
                    System.out.println("La nota de: " + nombreE1 + " es D");
                    notaSofia = 'D';
                }

                //Segundo Estudiante
                System.out.println("");
                System.out.println("Estudiante 2");
                System.out.print("Nombre: ");
                //Capturar el nombre del estudiante
                nombreE2 = leerC.next();
                System.out.print("Nota: ");
                //Capturar la nota del estudiante
                notaE2 = leerC.nextFloat();

                if(notaE2 >= 7) {
                    System.out.println("La nota de: " + nombreE2 + " es A");
                    notaSofia = 'A';
                } else{
                    System.out.println("La nota de: " + nombreE2 + " es D");
                    notaSofia = 'D';
                }

                //Tercer Estudiante
                System.out.println("");
                System.out.println("Estudiante 3");
                System.out.print("Nombre: ");
                //Capturar el nombre del estudiante
                nombreE3 = leerC.next();
                System.out.print("Nota: ");
                //Capturar la nota del estudiante
                notaE3 = leerC.nextFloat();

                if(notaE3 >= 7) {
                    System.out.println("La nota de: " + nombreE3 + " es A");
                    notaSofia = 'A';
                } else{
                    System.out.println("La nota de: " + nombreE3 + " es D");
                    notaSofia = 'D';
                }

                promedio = (int)(notaE1 + notaE2 + notaE3) / 3;


                System.out.println("");
                System.out.println("El estudiante " + nombreE1 + " octuvo una nota de " + notaE1);
                System.out.println("El estudiante " + nombreE2 + " octuvo una nota de " + notaE2);
                System.out.println("El estudiante " + nombreE3 + " octuvo una nota de " + notaE3);
                System.out.println("");
                System.out.println("El promedio de notas fue: " + promedio);


            } catch (InputMismatchException ex){
                System.out.println("Por favor, ingrese un valor numerico");
            }
        } else {
            System.out.println("Credenciales Incorrectas");
        }

        leerC.close();
    }
}
