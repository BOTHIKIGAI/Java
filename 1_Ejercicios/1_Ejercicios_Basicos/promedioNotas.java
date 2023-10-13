import java.util.Scanner;
import java.util.Date;
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

        int inicioSoftware = 1; // El software funcionanado
        int inicioSesion = 1;

        // Inicio del sisitema 

        while (inicioSoftware == 1) {

            ////////////////////////////////////////////////////////////////////////////////////////

            System.out.println("Ingrese sus credenciales");
            System.out.println("-----------------------------");
            System.out.println(" ");
            System.out.print("Usuario: ");
            usu = leert.next();
            System.out.print("Contraseña: ");
            pass = leert.next();
            System.out.println(" ");

            ////////////////////////////////////////////////////////////////////////////////////////

            while (inicioSesion == 1) {

                if (usu.equals("master123") && pass.equals("pass123")) {

                    ////////////////////////////////////////////////////////////////////////////////////////

                    System.out.println(" ");
                    System.out.println("Bienvenido al sistema" + usu);
                    System.out.println("Hoy es " + fechaHoy);

                    ////////////////////////////////////////////////////////////////////////////////////////

                    // Elegir el cambio a realizar

                    System.out.println(" ");
                    System.out.println("¿Que cambio de porcentaje desea realizar?");
                    System.out.println(" 1 = Parcial, 2 = Examen final, 3 = Exposición, 4 = Trabajao final, 5 = Asistencia");
                    int option = leert.nextInt();

                    // Resumen de los porcentajes actuales

                    System.out.println(" ");
                    System.out.println("Acutalmente los porcentajes son: ");
                    System.out.println("Parcial: " + (porcentajeParcial * 100) + "%");
                    System.out.println("Examen final: " + (porcentajeExamenFinal * 100) + "%" );
                    System.out.println("Exposición: " + (porcentajeExposicion * 100) + "%" );
                    System.out.println("Trabajo final: " + (porcentajeTrabajoFinal * 100) + "%");
                    System.out.println("Asistencia: " + (porcentajeAsistencia * 100 + "%"));

                    ////////////////////////////////////////////////////////////////////////////////////////
                    
                    switch (option) {

                        case 1:
                            System.out.println("Cambiar porcentaje de parcial");
                            System.out.println(" ");
                            porcentajeCambioParcial = leert.nextFloat();
                            

                            break;

                        case 2:
                            System.out.println("Cambiar porcentaje de examen final");
                            System.out.println(" ");
                            break;

                        case 3:
                            System.out.println("Cambiar porcentaje de exposición");
                            System.out.println(" ");
                            break;

                        case 4:
                            System.out.println("Cambiar porcentaje de trabajo final");
                            System.out.println(" ");
                            break;
                        
                        case 5:
                            System.out.println("Cambiar porcentaje de asistencia");
                            System.out.println(" ");
                            break;

                    }

                    ////////////////////////////////////////////////////////////////////////////////////////

                }


                else if (usu.equals("juanes123") && pass.equals("pass123")) {

                    ////////////////////////////////////////////////////////////////////////////////////////

                    System.out.println(" ");
                    System.out.println("Bienvenido al sistema " + usu);
                    System.out.println("Hoy es " + fechaHoy);

                    ////////////////////////////////////////////////////////////////////////////////////////

                    
                    // Ingreso de Notas

                        // Nombre estudiante

                    System.out.println("Ingresa el nombre del estudiante: ");
                    nomE = leert.next();

                        // Nota parcial

                    System.out.println("Ingrese las tres notas del parcial: ");
                    for (int x = 1; x <= 3; x++ ) {

                        System.out.println("Ingrese la nota " + x + " del parcial");
                        notasCalificaciónParciales[x] = leert.nextFloat();
                    }

                        // Nota examen final

                    System.out.println(" ");

                    System.out.println("Ingrese las nota final: ");
                    notaFinal = leert.nextFloat();


                        // Nota exposicion

                    System.out.println(" ");

                    System.out.println("Ingrese la nota de la exposición");
                    notaExposicion = leert.nextFloat();


                        // Nota calificación trabajo final
                    
                    System.out.println(" ");

                    System.out.println("Ingrese la nota del trabajo final");
                    notaExposicion = leert.nextFloat();                    


                        // Nota asistencia
                    
                    System.out.println(" ");
                    System.out.println("Cuantas clases se realizaron: ");
                    numClases = leert.nextInt();
                    System.out.println(" ");
                    System.out.println("¿Cuantas faltas tiene el alumno? ");



                    ////////////////////////////////////////////////////////////////////////////////////////

                    // Reporte de notas

                    System.out.println("El alumno: " + nomE);
                    if (notaFinal < 7.0f) {

                        System.out.println("Des aprobo la meteria");

                    } else {

                        System.out.println("Aprobo la materia");
                    }

                    ////////////////////////////////////////////////////////////////////////////////////////

                    // Salir del sistema

                    System.out.print("¿Desea ingresar otras notas de estudiante? Si = 1 No = 2");
                    System.out.print("    ");
                    inicioSesion = leert.nextInt();
                    System.out.println(" ");

                    ////////////////////////////////////////////////////////////////////////////////////////

                } 
                
                else {

                    System.out.println("Credenciales incorrectas");
                    System.out.println(" ");

                }

            }

        } 

        System.out.println("Gracias por usar software J");


    }
}
