import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class promedioNotas {
    public static void main (String[] args) {

        // Clase scanner
        Scanner leert = new Scanner(System.in);
        
        // Clase fecha
        
        Date fecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");

        // Variables

            // Variables Inicio de Sesion

                // Maestro y Estudiante

                String usu; // Estudiante = juanes123   Maestro academico = master123
                String pass;  // pass123

        String nomE = "";
        float notaFinal = 0.0f;

            // Variables reporte

        String fechaHoy = formato.format(fecha);

            // Variables Calificacion
    
        float notaExamenFinal = 0;
        float notaExposicion= 0; 
        float notaTrabajoFinal = 0; 
        float notaAsistencia = 0;
        float notaParcialPromedio = 0;
        String resultado = "";

            // Clases

        int numClases = 0;
        int numClassAsistidas = 0;
        float porcentajeClasesAsistidas = 0.0f;

            // Rango de notas o calificación

        float maxNota = 0;
        float minNota = 0;

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

            // Variables de calificación

        float[] notasCalificaciónParciales = new float[numParciales];
        float notaParcial;

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
                                System.out.println("El porcentaje actual es: " + (porcentajeParcial * 100) + "%");
                                System.out.println(" ");

                                // Ingresar nuevo porcentaje
                                System.out.print("Ingrese el nuevo porcentaje: ");
                                porcentajeCambioParcial = leert.nextFloat();
                                porcentajeCambioParcial /= 100;
                                System.out.println(" ");
                                

                            }

                            else if (codigoPorcentaje == 2) { //Examen final

                                // Mensaje actual de las variables
                                System.out.println(" ");
                                System.out.println("<-- Examen final -->");
                                System.out.println(" ");
                                System.out.println("El porcentaje actual es: " + (porcentajeExamenFinal * 100) + "%");
                                System.out.println(" ");
                                
                                // Ingresar nuevo porcentaje
                                System.out.print("Ingrese el nuevo porcentaje: ");
                                porcentajeCambioExamenFinal = leert.nextFloat();
                                porcentajeCambioExamenFinal /= 100;
                                System.out.println(" ");

                            }

                            else if (codigoPorcentaje == 3) { // Exposición

                                // Mensaje actual de las variables
                                System.out.println(" ");
                                System.out.println("<-- Exposición -->");
                                System.out.println(" ");
                                System.out.println("El porcentaje actual es: " + (porcentajeExposicion * 100) + "%");
                                System.out.println(" ");

                                // Ingresar nuevo porcentaje
                                System.out.print("Ingrese el nuevo porcentaje: ");
                                porcentajeCambioExposicion = leert.nextFloat();
                                porcentajeCambioExposicion /= 100;
                                System.out.println(" ");

                            }

                            
                            else if (codigoPorcentaje == 4) { // Trabajo final

                                // Mensaje actual de las variables
                                System.out.println(" ");
                                System.out.println("<-- Trabajo final -->");
                                System.out.println(" ");
                                System.out.println("El porcentaje actual es: " + (porcentajeTrabajoFinal * 100) + "%");
                                System.out.println(" ");

                                // Ingresar nuevo porcentaje
                                System.out.print("Ingrese el nuevo porcentaje: ");
                                porcentajeCambioTrabajoFinal = leert.nextFloat();
                                porcentajeCambioTrabajoFinal /= 100;
                                System.out.println(" ");

                            }

                            
                            else if (codigoPorcentaje == 5) { // Asistencia

                                // Mensaje actual de las variables
                                System.out.println(" ");
                                System.out.println("<-- Asistencia -->");
                                System.out.println(" ");
                                System.out.println("El porcentaje actual es:  " + (porcentajeAsistencia * 100) + "%" );
                                System.out.println(" ");

                                // Ingresar nuevo porcentaje
                                System.out.print("Ingrese el nuevo porcentaje: ");
                                porcentajeCambioAsistencia = leert.nextFloat();
                                porcentajeCambioAsistencia /= 100;
                                System.out.println(" ");

                            }

                            else if (codigoPorcentaje == 6) { // Cancelación de la operación

                                System.out.println(" ");
                                System.out.println(" Operación cancelada ");
                                System.out.println(" ");

                                // Cancelación cambio porcentaje
                                operación = 2;

                            }

                            else {

                                System.out.println(" ");
                                System.out.println(" Error o dato ingresado incorrectamente ");
                                System.out.println(" ");
                                
                                // Cancelación cambio porcentaje
                                operación = 2;

                            }

                            /*
                             * 
                             * <-- Cambio segunda variable -->
                             * 
                             * Se debe cambiar una segunda variable para que la suma de los porcentajes sea igual a 100.
                             * 
                             */

                            if (operación == 1) {

                                // Preguntar

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

                                // Cambiar segundo porcentaje

                                if (codigoPorcentaje == 1) { // Cambio parcial

                                    // Mensaje actual de las variables
                                    System.out.println(" ");
                                    System.out.println("<-- Parcial -->");
                                    System.out.println(" ");
                                    System.out.println("El porcentaje actual es: " + (porcentajeParcial * 100) + "%");
                                    System.out.println(" ");

                                    // Ingresar nuevo porcentaje
                                    System.out.print("Ingrese el nuevo porcentaje: ");
                                    porcentajeCambioParcial = leert.nextFloat();
                                    porcentajeCambioParcial /= 100;
                                    System.out.println(" ");
                                

                                }

                                else if (codigoPorcentaje == 2) { //Examen final

                                    // Mensaje actual de las variables
                                    System.out.println(" ");
                                    System.out.println("<-- Examen final --> ");
                                    System.out.println(" ");
                                    System.out.println("El porcentaje actual es: " + (porcentajeExamenFinal * 100) + "%");
                                    System.out.println(" ");
                                    
                                    // Ingresar nuevo porcentaje
                                    System.out.print("Ingrese el nuevo porcentaje: ");
                                    porcentajeCambioExamenFinal = leert.nextFloat();
                                    porcentajeCambioExamenFinal /= 100;
                                    System.out.println(" ");

                                }

                                else if (codigoPorcentaje == 3) { // Exposición

                                    // Mensaje actual de las variables
                                    System.out.println(" ");
                                    System.out.println("<-- Exposición -->");
                                    System.out.println(" ");
                                    System.out.println("El porcentaje actual es: " + (porcentajeExposicion * 100) + "%");
                                    System.out.println(" ");

                                    // Ingresar nuevo porcentaje
                                    System.out.print("Ingrese el nuevo porcentaje: ");
                                    porcentajeCambioExposicion = leert.nextFloat();
                                    porcentajeCambioExposicion /= 100;
                                    System.out.println(" ");

                                }

                                
                                else if (codigoPorcentaje == 4) { // Trabajo final

                                    // Mensaje actual de las variables
                                    System.out.println(" ");
                                    System.out.println("<-- Trabajo final -->");
                                    System.out.println(" ");
                                    System.out.println("El porcentaje actual es: " + (porcentajeTrabajoFinal * 100) + "%");
                                    System.out.println(" ");

                                    // Ingresar nuevo porcentaje
                                    System.out.print("Ingrese el nuevo porcentaje: ");
                                    porcentajeCambioTrabajoFinal = leert.nextFloat();
                                    porcentajeCambioTrabajoFinal /= 100;
                                    System.out.println(" ");                                    

                                }

                                
                                else if (codigoPorcentaje == 5) { // Asistencia

                                    // Mensaje actual de las variables
                                    System.out.println(" ");
                                    System.out.println("<-- Asistencia -->");
                                    System.out.println(" ");
                                    System.out.println("El porcentaje actual es:  " + (porcentajeAsistencia * 100) + "%" );
                                    System.out.println(" ");

                                    // Ingresar nuevo porcentaje
                                    System.out.print("Ingrese el nuevo porcentaje: ");
                                    porcentajeCambioAsistencia = leert.nextFloat();
                                    porcentajeCambioAsistencia /= 100;
                                    System.out.println(" ");                                    

                                }

                                else if (codigoPorcentaje == 6) { // Cancelación de la operación

                                    System.out.println(" ");
                                    System.out.println(" Operación cancelada ");
                                    System.out.println(" ");

                                    // Cancelación cambio porcentaje
                                    operación = 2;

                                }

                                else {

                                    System.out.println(" ");
                                    System.out.println(" Error o dato ingresado incorrectamente ");
                                    System.out.println(" ");
                                    
                                    // Cancelación cambio porcentaje
                                    operación = 2;

                                }

                                // Confirmar cambio variables

                                if (sumPorcentajeCambio == 1.0) {

                                    System.out.println("La operación se a realizado correctamente");
                                    porcentajeAsistencia = porcentajeCambioAsistencia;
                                    porcentajeExamenFinal = porcentajeCambioExamenFinal;
                                    porcentajeExposicion = porcentajeCambioExposicion;
                                    porcentajeParcial = porcentajeCambioParcial;
                                    porcentajeTrabajoFinal = porcentajeCambioTrabajoFinal;

                                }

                                else if (sumPorcentaje != 1.0) {

                                    System.out.println("Los valores que has ingresado no realizan la sumatoria esperada");

                                }

                                else {

                                    System.out.println(" Error ");

                                }
                                

                            } else {

                                // Operación cancelada por el ingreso de una opción no acordada
                                System.out.println(" ");

                            }
                            

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

                    // Estudiante
                    ////////////////////////////////////////////////////////////////////////////////////////

                    // Saludo
                    System.out.println(" ");
                    System.out.println("Hola estudiante " + usu);
                    System.out.println("Fecha: " + fechaHoy);
                    System.out.println(" ");
                    
                    // Inicio de software

                    System.out.println(" ");
                    System.out.println("¿Que desea consultar?");
                    System.out.println(" ");
                    System.out.println("---------------------------------");
                    System.out.println("|   Opcion   |    Descripción   |");
                    System.out.println("---------------------------------");
                    System.out.println("|     1      |     Nota final   |");
                    System.out.println("|     2      |        Salir     |");
                    System.out.println("---------------------------------");
                    System.out.println(" ");
                    System.out.print("Respuesta: ");
                    opcionMenu = leert.nextInt();

                    // Condicional - menu opcioones

                    if (opcionMenu == 1) {

                        // Nombre estudiante
                        System.out.println(" ");
                        System.out.print("Ingrese su nombre: ");
                        nomE = leert.next();
                        System.out.println(" ");

                        // Establecer rango de notas
                        while (operación == 1) {

                            System.out.println(" ");
                            System.out.println("¿Cual es el rango de notas? ");
                            System.out.println(" ");

                            // Nota minima
                            System.out.print("Nota minima: ");
                            minNota = leert.nextFloat();
                            System.out.println(" ");

                            // Nota maxima
                            System.out.print("Nota maxima: ");
                            maxNota = leert.nextFloat();
                            System.out.println(" ");


                            // Condicional - Verificar rango de notas
                            if (minNota < 0) {

                                // Condiconal si la nota es menor a 0
                                System.out.println(" ");
                                System.out.println("La nota no puede ser menor a 0");
                                System.out.println(" ");

                            }   

                            else if (minNota > maxNota) {

                                // Condicional si la nota es menor a 
                                System.out.println(" ");
                                System.out.println("La nota minjaima no puede ser mayor a la nota maxima");
                                System.out.println(" ");

                            } 

                            else {

                                System.out.println(" ");
                                System.out.println("Operacion completada...");
                                System.out.println("Nota maxima: " + maxNota + " y la nota minima: " + minNota);
                                System.out.println(" ");

                                // Cerrar ciclo
                                operación = 2;
                            }

                        }

                        // Notas del parcial

                        while (operación == 2) {

                            // Notas parciales
                            System.out.println(" ");
                            System.out.println("Ingresa la notas del parcial: ");

                            for (int i = 0; i < numParciales; i++) {

                                // Re inicio de variable
                                operación = 2;
                                
                                while (operación == 2) {

                                    System.out.print("Nota " + (i + 1) + "°: ");
                                    notaParcial = leert.nextFloat();

                                    if (notaParcial < minNota) {

                                        // Error por ingreso de nota parcial menor que la nota minima
                                        System.out.println("Debes ingresar una nota mayor a la nota minima: " + minNota);

                                    }

                                    else if (notaParcial > maxNota) {

                                        // Error por ingreso de nota parcial mayor que la nota maxima
                                        System.out.println("Debes ingresar una nota menor a la nota maxima: " + maxNota);

                                    } 

                                    else if (notaParcial <= maxNota && notaParcial >= minNota) {

                                        // Agregar nota calificación parcial
                                        notasCalificaciónParciales[i] = notaParcial;

                                        // Cerrar ciclo
                                        operación = 1;

                                    } 


                                    else { 

                                        System.out.println("Error");
                                        System.out.println(" ");

                                    }

                                }

                            }

                            // Parcial

                            System.out.println(" ");
                            System.out.println("Las notas ingresadas son: ");
                            for (int a = 0; a < (notasCalificaciónParciales.length); a++) {

                                // Imprimir notras ingresadas
                                System.out.println("Nota " + (a + 1) + "°: " + notasCalificaciónParciales[a]);

                                // Sumattoria de las notas
                                notaParcialPromedio += notasCalificaciónParciales[a];

                            }


                            if (notaParcialPromedio != 0) {

                                // Obtener el promedio de la notas del parcial
                                notaParcialPromedio /= numParciales;

                                // Redondear dato
                                String resultadoParcialPromedio = String.format("%.2f", notaParcialPromedio);

                                // Mensaje - Promedio parcial
                                System.out.println(" ");
                                System.out.println("El promedio de las notas parcial es: " + resultadoParcialPromedio);
                                System.out.println(" ");

                            }

                        }

                        // Examen final

                        while (operación == 1) {

                            // Ingresar nota final
                            System.out.println(" ");
                            System.out.print("Ingresa la nota del examen final: ");
                            notaExamenFinal = leert.nextFloat();
                            System.out.println(" ");

                            // Condicional - Nota cumple con las reglas

                            if (notaExamenFinal < minNota || notaExamenFinal > maxNota) {

                                System.out.println("Debes ingresar un dato menor o igual a " + maxNota + " y mayor o igual a " + minNota);  

                            }

                            else if (notaExamenFinal >= minNota && notaExamenFinal <= maxNota) {

                                operación = 2;

                            }

                            else {

                                System.out.println("Error");
                                System.out.println(" ");

                            } 

                        }

                        // Exposición

                        while (operación == 2) {

                            // Ingresar nota
                            System.out.println(" ");
                            System.out.print("Ingresar la nota de la exposición: ");
                            notaExposicion = leert.nextFloat();
                            System.out.println(" ");

                            // Condicional - Nota cumple con las reglas

                            if (notaExposicion < minNota || notaExposicion > maxNota) {

                                System.out.println("Debes ingresar un dato menor o igual a " + maxNota + " y mayor o igual a " + minNota);  

                            }

                            else if (notaExposicion >= minNota && notaExposicion <= maxNota) {

                                operación = 1;

                            }

                            else {

                                System.out.println("Error");

                            } 

                        }

                        // Trabajo final

                        while (operación == 1) {

                            // Ingresar nota
                            System.out.println(" ");
                            System.out.print("Ingresar la nota trabajo final: ");
                            notaTrabajoFinal = leert.nextFloat();
                            System.out.println(" ");

                            // Condicional - Nota cumple con las reglas

                            if (notaTrabajoFinal < minNota || notaTrabajoFinal > maxNota) {

                                System.out.println("Debes ingresar un dato menor o igual a " + maxNota + " y mayor o igual a " + minNota);  

                            }

                            else if (notaTrabajoFinal >= minNota && notaTrabajoFinal <= maxNota) {

                                operación = 2;

                            }

                            else {

                                System.out.println("Error");

                            }     

                        }

                        // Asistencia

                        while (operación == 2) {

                            // Mientras que el numero de clases siga las reglas de la logica de negocio
                            while (operación == 2) {

                                // Entrada numero de clases realizadas
                                System.out.println(" ");
                                System.out.print("Ingrese el numero de clases que se realizaron: ");
                                numClases = leert.nextInt();
                                System.out.println(" ");

                                // Validar el numero de clases
                                if (numClases <= 0) {

                                    // Mensaje de error
                                    System.out.println("El numero de clases no puede ser menor o igual a cero");
                                    System.out.println(" ");

                                } 

                                else if (numClases > 0) {
                                    
                                    // Cerrar ciclo
                                    operación = 1;

                                }

                                else {

                                    // Mensaje de error
                                    System.out.println("Error");
                                    System.out.println(" ");

                                }


                            }

                            // Mientras que el numero de clases asistidas siga las reglas de la logica de negocio 
                            while (operación == 1) {

                                // Entrada numero de clases asistidas
                                System.out.print("Ingrese el numero de clases a las cuales asistio: ");
                                numClassAsistidas = leert.nextInt();
                                System.out.println(" ");

                                // Logica de negocio - Calculo porcentaje clases asistidas                                
                                if (numClassAsistidas > numClases || numClassAsistidas < 0) {

                                    System.out.println("No puede ingresar un numero mayor al numero de clases que se realizaron");
                                    System.out.println("y ampoco se puede ingresar un numero menor a cero ");
                                    System.out.println(" ");

                                }

                                else if (numClassAsistidas >= 0 && numClassAsistidas <= numClases) { 

                                    //Porcentaje de clases a las cuales asistio
                                    porcentajeClasesAsistidas = ((float) numClassAsistidas/ (float)numClases) * 100;
                                    System.out.println("Asistio al " + Math.round(porcentajeClasesAsistidas) + " % de las clases");
                                    System.out.println(" ");

                                    // Calificación por asitencia
                                    notaAsistencia =  (porcentajeClasesAsistidas/maxNota) * 100;
                                    System.out.println("Su calificación por su asistencia es de " + Math.round(notaAsistencia));
                                    System.out.println(" ");
                                    
                                    // Cerrar ciclo
                                    operación = 2;

                                }

                                else {

                                    System.out.println("Error");
                                    System.out.println(" ");
                                }

                            }
                       
                            // Cerrar ciclo
                            operación = 1;              
                        
                        }

                        // Condicional de aprobación

                        notaFinal = (notaParcialPromedio * porcentajeParcial) + (notaExamenFinal * porcentajeExamenFinal) + (notaExposicion * porcentajeExposicion) + (notaTrabajoFinal * porcentajeTrabajoFinal) + (notaAsistencia * porcentajeAsistencia);

                        if (notaFinal < (0.75 * maxNota)) {

                            resultado = "Desaprobado";

                        } 
                        
                        else if (notaFinal > (0.75 * maxNota)) {

                            resultado = "Aprobado";

                        }

                        else {

                            System.out.println("Error");

                        }

                        // Reporte
                        System.out.println("--------------------------------------------------");
                        System.out.println("Reporte de notas de " + nomE);
                        System.out.println("--------------------------------------------------");
                        System.out.println(" --------------- Reporte de notas --------------- ");
                        System.out.println("--------------------------------------------------");
                        System.out.println("      Item calificado    |        Nota            ");
                        System.out.println("--------------------------------------------------");

                        // Reporte - notas parcial
                        for (int a = 0; a < (notasCalificaciónParciales.length); a++) {

                            // Imprimir notras ingresadas
                            System.out.println("          Nota " + (a + 1) + "°        |        " + notasCalificaciónParciales[a] + "           ");
                            System.out.println("--------------------------------------------------");

                        }
                        
                        // Reporte Examen final - Exposición - Trabajo final - 
                        System.out.println("        Examen final     |         " + notaExamenFinal + "           ");
                        System.out.println("--------------------------------------------------");
                        System.out.println("        Exposición       |         " + notaExposicion + "           ");
                        System.out.println("--------------------------------------------------");
                        System.out.println("      Trabajo final      |         " + notaTrabajoFinal + "           ");
                        System.out.println("--------------------------------------------------");
                        System.out.println("       Asistencia        |         " + notaAsistencia + "           ");
                        System.out.println("--------------------------------------------------");

                        // Aprobaod o no
                        System.out.println("       Resultado         |         " + resultado + "           ");
                        System.out.println("       Nota final        |         " + notaFinal + "           ");
                        

                    }

                    else if (opcionMenu == 2) {

                        System.out.println(" ");
                        System.out.println("Saliendo de la operacion...");
                        System.out.println(" ");

                    }

                    else {

                        System.out.println(" ");
                        System.out.println("Error");
                        System.out.println(" ");

                    }


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

        leert.close();
    }
}
