import java.util.Scanner;

import javax.sound.midi.Soundbank;

import java.util.Date;
import java.util.InputMismatchException;
import java.text.SimpleDateFormat;

public class promedioNotas {
    public static void main (String[] args) {

        // Librerias
        Scanner leert = new Scanner(System.in);
        Date fecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");

        // Variables

            // Variables Inicio de Sesion

                // Maestro

                String usu; // Estudiante = juanes123   Maestro academico = master123
                String pass;  // pass123

            // Variables Estudiante

        String nomE = "Alumno";
        float notaFinal = 0.0f;

            // Variables reporte

        String fechaHoy = formato.format(fecha);

            // Variables Calificacion
        
        float[] notasCalificaciónParciales = new float[3];
        float notaExamenFinal, notaExposicion, notaTrabajoFinal, asistencia;
        int numClases = 0;

            // Varaibles Porcentajes

        float porcentajeParcial = 0.20f;
        float porcentajeExamenFinal = 0.40f;
        float porcentajeExposicion = 0.10f;
        float porcentajeTrabajoFinal = 0.15f;
        float porcentajeAsistencia = 0.15f;
        float sumPorcentaje = (porcentajeAsistencia + porcentajeExamenFinal + porcentajeExposicion + porcentajeParcial + porcentajeTrabajoFinal);

            // Variables Porcentajes para realizar cambios
        
        float porcentajeCambioParcial = porcentajeParcial;
        float porcentajeCambioExamenFinal = porcentajeExamenFinal;
        float porcentajeCambioExposicion = porcentajeExposicion;
        float porcentajeCambioTrabajoFinal = porcentajeTrabajoFinal;
        float porcentajeCambioAsistencia = porcentajeAsistencia;

        float sumPorcentajeCambio = (porcentajeCambioAsistencia + porcentajeCambioExamenFinal + porcentajeCambioExposicion + porcentajeCambioParcial + porcentajeCambioTrabajoFinal);


            // Variables de control

        int inicioSoftware = 1; // La continuidad del software
        int inicioSesion = 1; // La continuidad de la sesión de software

            // Variables de control - Sesión Instructro

        int codigoInstructor = 1; // Iteración para ejecutar las opciones del instructor
        int opcionMenu;           // Iteraión opciones menu
        int codigoPorcentaje = 1; // Iteración para cambio de notas
        int numParciales = 3; // Cantidad de parciales que abra
        int numCambioParciales = 3; // Variables para establecer si cumple con las reglas o no, si cumple numParciales tomara su valor
        int operación = 1; // Variable de control para usar en diferentes ciclos while de operacion de cambio

        // Inicio del sisitema 

        // Bienvenida

        System.out.println("// -------------- // -------------- //");
        System.out.println(" ");
        System.out.println("Bienvenid  a Software J");
        System.out.println(" ");
        System.out.println("// -------------- // -------------- //");
        System.out.println(" ");
        System.out.println(" ");

        while (inicioSoftware == 1) {

            ////////////////////////////////////////////////////////////////////////////////////////
            
            // Ingreso de credencialxes

            System.out.println(" ");
            System.out.println("Ingrese sus credenciales");
            System.out.println(" ");
            System.out.print("Usuario: ");
            usu = leert.next();
            System.out.print("Contraseña: ");
            pass = leert.next();
            System.out.println(" ");

            // Reinicio de variables de sesión
            inicioSesion = 1;
            codigoInstructor = 1;

            ////////////////////////////////////////////////////////////////////////////////////////

            while (inicioSesion == 1) {

                if (usu.equals("master123") && pass.equals("pass123")) {

                    ////////////////////////////////////////////////////////////////////////////////////////

                    // Saludo
                    System.out.println(" ");
                    System.out.println("Hola Instructor " + usu);
                    System.out.println("Fecha: " + fechaHoy);
                    System.out.println(" ");


                    // Inicio de preguntas                    
                    while (codigoInstructor == 1) {

                        // Inicio de consultas
                        System.out.println(" ");
                        System.out.println("¿Que desea consultar?");
                        System.out.println(" ");
                        System.out.println("---------------------------------------------------------------");
                        System.out.println("|   Opcion   |                  Descripción                   |");
                        System.out.println("---------------------------------------------------------------");
                        System.out.println("|     1      |                  porcentajes                   |");
                        System.out.println("|     2      |              modificar porcentajes             |");
                        System.out.println("|     3      |          cambio de numero de parciales         |");
                        System.out.println("|     4      |                     Salir                      |");
                        System.out.println("---------------------------------------------------------------");
                        System.out.println(" ");
                        System.out.print("Respuesta: ");
                        opcionMenu = leert.nextInt();

                        // Condicionales menu 

                        if (opcionMenu == 1) {

                            /*
                             * 
                             * <--- Consultar los porcentajes --->
                             * 
                             */

                            System.out.println(" ");
                            System.out.println("Porcentajes calificaciones");
                            System.out.println(" ");
                            System.out.println(" Porcentaje parcial: " + (porcentajeParcial * 100 )+ " %");
                            System.out.println(" Porcentaje examen final: " + (porcentajeExamenFinal * 100 ) + " %");
                            System.out.println(" Porcentaje exposición: " + (porcentajeExposicion * 100 ) + " %");
                            System.out.println(" Porcentaje trabajo final: " + (porcentajeTrabajoFinal * 100 ) + " %");
                            System.out.println(" Porcentaje asistencia: " + (porcentajeAsistencia * 100 ) + " %");
                            System.out.println(" ");

                        }
                        
                        else if (opcionMenu == 2) {
                            
                            /*
                             * 
                             * <--- Modificar porcentajes --->
                             * 
                             * En el siguiente bloque de codigo se modificara dos valores de variables. Se debera modificar
                             * dos porque la suma de los porcentajes nunca debe ser mayor ni menos a 100 por el 100%.
                             * No se puede modificar unicamente uno porque la suma daria menor o mayor a 100, si se aumenta
                             * un porcentaje se disminuye otro, lo mismo pasaria de la manera contraria.
                             * 
                             */

                            System.out.println(" ");
                            System.out.println("Modificar porcentajes");
                            System.out.println(" ");

                            // Porcentajes
                            System.out.println(" ");
                            System.out.println("Los porcentajes actuales son: ");
                            System.out.println(" ");
                            System.out.println(" Porcentaje parcial: " + (porcentajeParcial * 100 )+ " %");
                            System.out.println(" Porcentaje examen final: " + (porcentajeExamenFinal * 100 ) + " %");
                            System.out.println(" Porcentaje exposición: " + (porcentajeExposicion * 100 ) + " %");
                            System.out.println(" Porcentaje trabajo final: " + (porcentajeTrabajoFinal * 100 ) + " %");
                            System.out.println(" Porcentaje asistencia: " + (porcentajeAsistencia * 100 ) + " %");
                            System.out.println(" ");

                            // ¿Que cambio realizar?
                            System.out.println(" ");
                            System.out.println("¿Que cambio desea realizar?");
                            System.out.println(" ");
                            System.out.println("----------------------------------------------");
                            System.out.println("|   Opcion   |          Descripción          |");
                            System.out.println("----------------------------------------------");
                            System.out.println("|     1      |            Parcial            |");
                            System.out.println("|     2      |         Examen final          |");
                            System.out.println("|     3      |          Exposicion           |");
                            System.out.println("|     4      |         Trabajo final         |");
                            System.out.println("|     5      |           Asitencia           |");
                            System.out.println("|     6      |       Cancelar operación      |");
                            System.out.println("----------------------------------------------");
                            System.out.println(" ");
                            System.out.print("Respuesta: ");
                            codigoPorcentaje = leert.nextInt();
                            System.out.println(" ");

                            ////////////////////////////////////////////////////////////////////////////////////////

                            // Condicional

                                // Porcentaje

                            if (codigoPorcentaje == 1) { // Cambio parcial

                                // Mensaje actual de las variables
                                System.out.println(" ");
                                System.out.println("<-- Parcial -->");
                                System.out.println(" ");
                                System.out.println("El porcentaje actual es: " + porcentajeParcial + "%");
                                System.out.println(" ");

                                // Ingresar nuevo porcentaje
                                System.out.print("Ingrese el nuevo porcentaje: ");
                                porcentajeCambioParcial = leert.nextInt();
                                System.out.println(" ");

                            }

                            else if (codigoPorcentaje == 2) { //Examen final

                                // Mensaje actual de las variables
                                System.out.println(" ");
                                System.out.println(" Examen final ");
                                System.out.println(" ");
                                System.out.println("El porcentaje actual es: " + porcentajeExamenFinal + "%");
                                System.out.println(" ");
                                
                                // Ingresar nuevo porcentaje
                                System.out.print("Ingrese el nuevo porcentaje: ");
                                porcentajeCambioExamenFinal = leert.nextInt();
                                System.out.println(" ");

                            }

                            else if (codigoPorcentaje == 3) { // Exposición

                                // Mensaje actual de las variables
                                System.out.println(" ");
                                System.out.println(" Exposición ");
                                System.out.println(" ");

                                // Ingresar nuevo porcentaje
                                System.out.println("El porcentaje actual es: " + porcentajeExposicion + "%");
                                System.out.println(" ");

                            }

                            
                            else if (codigoPorcentaje == 4) { // Trabajo final

                                // Mensaje actual de las variables
                                System.out.println(" ");
                                System.out.println(" Trabajo final ");
                                System.out.println(" ");

                                // Ingresar nuevo porcentaje
                                System.out.println("El porcentaje actual es: " + porcentajeTrabajoFinal + "%");
                                System.out.println(" ");

                            }

                            
                            else if (codigoPorcentaje == 5) { // Asistencia

                                // Mensaje actual de las variables
                                System.out.println(" ");
                                System.out.println(" Asistencia ");
                                System.out.println(" ");

                                // Ingresar nuevo porcentaje
                                System.out.println("El porcentaje actual es:  " + porcentajeAsistencia + "%" );
                                System.out.println(" ");

                            }

                            else if (codigoPorcentaje == 6) { // Cancelación de la operación

                                System.out.println(" ");
                                System.out.println(" Operación cancelada ");
                                System.out.println(" ");

                            }

                            else {

                                System.out.println(" ");
                                System.out.println(" Error o dato ingresado incorrectamente ");
                                System.out.println(" ");


                            }

                            /*
                             * 
                             * <-- Cambio segunda variable -->
                             * 
                             * Se debe cambiar una segunda variable para que la suma de los porcentajes sea igual a 100.
                             * 
                             */

                            System.out.println("¿Que porcentaje modificara a cambio?");
                            System.out.println("----------------------------------------------");
                            System.out.println("|   Opcion   |          Descripción          |");
                            System.out.println("----------------------------------------------");
                            System.out.println("|     1      |            Parcial            |");
                            System.out.println("|     2      |         Examen final          |");
                            System.out.println("|     3      |          Exposicion           |");
                            System.out.println("|     4      |         Trabajo final         |");
                            System.out.println("|     5      |           Asitencia           |");
                            System.out.println("|     6      |       Cancelar operación      |");
                            System.out.println("----------------------------------------------");
                            System.out.println(" ");
                            System.out.print("Rspuesta: ");
                            codigoPorcentaje = leert.nextInt();
                            System.out.println(" ");

                        } 


                        else if (opcionMenu == 3) { // Modificar le numero de parciale

                            // Mensaje numero de parciales
                            System.out.println(" ");
                            System.out.println("El numero de parciales actual es de: " + numParciales);
                            System.out.println(" ");
       
                            while (operación == 1) {

                                // Inicio de cambio
                                System.out.println(" ");
                                System.out.println("¿A cuanto desea cambiarlo? (No puede ser mayor a 5)");
                                System.out.print("Nueva cantidad de parciales: ");
                                numCambioParciales = leert.nextInt();
                                System.out.println(" ");


                                // Condicionales - Verificar que el parcial sea mayor a 0 o menor a 5
                                if (numCambioParciales <= 0 || numCambioParciales > 5) {

                                    // Mensaje de error
                                    System.out.println(" ");
                                    System.out.println("Ingresaste un valor mayor a 5 o menor a 0");
                                    System.out.println(" ");

                                }

                                // Condicionales - Verificar que el parcial sea menor a 5 y 
                                else if (numCambioParciales <= 5 && numCambioParciales > 0) {

                                    // Cambio cantidad de parciales
                                    System.out.println(" ");
                                    System.out.println("El cambio se ha realizado correctamente");
                                    numParciales = numCambioParciales;
                                    System.out.println("El nuevo numero de parciales es: " + numParciales);

                                    // Finalizar ciclo
                                    operación = 2; 

                                }

                                else {

                                    // Mensaje de error
                                    System.out.println(" ");
                                    System.out.println("Error");
                                    System.out.println(" ");

                                    // Finalizar ciclo
                                    operación = 2;

                                }


                            }
                        

                        }

                        else if (opcionMenu == 4) {

                            /* 
                             * 
                             * <-- Salir del sistema de información -->
                             * Si el usuario final se retracta podra cancelar la operación y salir inmediatamanete
                             * 
                             */

                            System.out.println(" ");

                        } 

                        else {
                            
                            // Mensaje de error
                            System.out.println(" ");
                            System.out.println("Opción invalida");
                            System.out.println(" ");

                        }

                        // Reinicio de variables
                        operación = 1;

                        // Realizar otra consulta
                        System.out.println(" ");
                        System.out.println("¿Desea realizar otra acción? Si = 1    No = 2");
                        System.out.print("Respuesta: ");
                        codigoInstructor = leert.nextInt();
                        System.out.println(" ");

                    }


                    // Salir del sistema
                    System.out.println(" ");
                    System.out.println("¿Desea salir de la sesión? Si = 2    No = 1");
                    System.out.print("Respuesta: ");
                    inicioSesion = leert.nextInt();

                    // Condicional - Verificación cierre de sesión

                    // Si inicioSesion igual a 1 se continuara la sesión y volvera al menu
                    if (inicioSesion == 1) {
                        codigoInstructor = 1;
                    } 

                    // Si inicioSesion igual a 2 se cerrara
                    else if (inicioSesion == 2) {
                        codigoInstructor = 2;
                    }

                    // Si inicioSesion es diferente a cualquier valor solictiado se cerrara la sesión
                    else {
                        codigoInstructor = 2;
                    }

                    System.out.println(" ");


                    ////////////////////////////////////////////////////////////////////////////////////////

                }


                else if (usu.equals("juanes123") && pass.equals("pass123")) {

                    ////////////////////////////////////////////////////////////////////////////////////////

                    // Saludo
                    System.out.println(" ");
                    System.out.println("Hola estudiante " + usu);
                    System.out.println("Fecha: " + fechaHoy);
                    System.out.println(" ");
                    
                    // Salir de la sesión
                    System.out.println(" ");
                    System.out.println("¿Desea salir de la sesión? Si = 2    No = 1");
                    System.out.print("Respuesta: ");
                    inicioSesion = leert.nextInt();
                    System.out.println(" ");

                    ////////////////////////////////////////////////////////////////////////////////////////

                } 
                
                else {
                    
                    // Mensaje de error
                    System.out.println(" ");
                    System.out.println("Credenciales incorrectas");
                    System.out.println(" ");
                    inicioSesion = 2;

                }

            }

        } 

        System.out.println("Gracias por usar software J");


    }
}
