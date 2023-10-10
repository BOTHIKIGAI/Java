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

// 

public class califcacionClaseII {
    public static void main (String args[]) {
        
        // Clases
        Scanner leerC = new Scanner(System.in);
        
        // Variables

        // Variables - Credenciale 
        String userIns = "monica6";
        String passIns = "pass123";
        String userCoor = "gio7";
        String passCoor = "pass456";


        // Variables - Instructor
        String nombreE; 
        float notaE;
        float promedio = 0;
        float sumNotas = 0;

        // Variables Coordinador
        String nombreI; // nombre instructor
        String materiaI; 

        // Varibale de control
        int contadorE = 0;
        char rta = 0;
        int i = 0;
        int u = 0;
        

        while ( i == 0) {

            i = 0;

            System.out.println("Con que usuario ingresara");
            System.out.println("-------------------------");
            System.out.println("Coordinador = 1 | Instructor = 2");
            System.out.print("Respuesta: ");
            rta = leerC.next().charAt(0);

            if (rta == '1') {

                while ( u == 0) {
                    
                    System.out.print("Ingrese usuario: ");
                    userCoor = leerC.next();

                    System.out.print("Ingrese contraseña: ");
                    passCoor = leerC.next();

                    if ("gio7".equals(userCoor) && "pass456".equals(passCoor)) {

                        while (u == 0) {

                            System.out.println("Hola Coordinador");
                            System.out.println(" ");

                            System.out.println("Crear profesor: ");
                            nombreI = leerC.next();
                            System.out.println("Ingresar materia: ");
                            materiaI = leerC.next();
                            
                            System.out.println(" ");
                            System.out.println("Nuevo instructor creado");
                            System.out.println("-------------------------");
                            System.out.println("Nombre:    " + nombreI);
                            System.out.println("Materia: " + materiaI);

                            System.out.println(" ");
                            System.out.println("Desea salir del usuario? 0 = no y 1 = si");
                            u = leerC.nextInt();

                        }

                    } else {

                        System.out.println("Credenciales incorrectas");
                        System.out.println(" ");

                    }
                }

            } 

            else if (rta == '2') {

                while (i == 0) {

                    while ( u == 0) {
                    
                    System.out.print("Ingrese usuario: ");
                    userCoor = leerC.next();

                    System.out.print("Ingrese contraseña: ");
                    passCoor = leerC.next();

                    if ("monica6".equals(userCoor) && "pass123".equals(passCoor)) {

                        while (u == 0) {

                            System.out.println("Bienvenido instructor");

                            // Start
                            System.out.println("Desea iniciar el programa? Si = 1 o No = 2");
                            rta = leerC.next().charAt(0);

                            while (rta == '1') {
                                System.out.println("Ingrese el nombre del estudiante: ");
                                nombreE = leerC.next();

                                System.out.println("Ingrese la nota del estuidiante");
                                notaE = leerC.nextFloat();

                                sumNotas += notaE;
                                contadorE += 1;

                                System.out.println("Desea continuar con otro estudiante? Si = 1 o No = 2");
                                rta = leerC.next().charAt(0);

                            }

                                // Resultados
                                System.out.println("Suma notas: " + sumNotas);

                                System.out.println("El numero de estudiantes es de: " + contadorE);

                                promedio = sumNotas / contadorE;
                                System.out.println("El promedio es: " + promedio);

                                System.out.println("Fin del programa");

                                System.out.println(" ");
                                System.out.println("Desea salir del usuario? 0 = no y 1 = si");
                                u = leerC.nextInt();

                        }   

                    }

                    else { 

                        System.out.println("Credenciales incorrectas");
                        System.out.println(" ");

                    }

                }
                
            } 

        }
            
        else {

            System.out.println("Error");

        }
        
        // Clases - close
        leerC.close();
    }


    }

}