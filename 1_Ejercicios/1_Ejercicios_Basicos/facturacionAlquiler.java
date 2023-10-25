import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class facturacionAlquiler {
    
    public static void main (String[] args) {

        /*
         * 
         * Solicitud de facturación
         * 
         * Datos ->
         * 
         * - Solo se puede alquilar 2 o mas equipos
         * - Alquiler por dia
         * - El valor del alquiler es igual a $ 35.000
         * - Tres opciones de alquiler que son dentro de la ciudad, fuera de la ciudad y
         *   dentro del establecimiento donde se tiene el local con los equipos
         *  
         *      - Fuera de la ciudad tiene un sobrecargo del 5%
         *      - Dentro del establecimiento tiene un descuento del 5%
         *  
         * - Asignar ID al cliente
         * - Por dia adicional se realiza un descuento del 2%
         * 
         * 
         */

        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // Clases
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // Clase scanner

        Scanner leerT = new Scanner(System.in);

        // Clase fecha

        Date fecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");

        // Clase math - random

        Random random = new Random();

        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // Variables
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // Inicio sesión

        String[] userArray = new String[10]; // Unicamente se puede ingresar 10 usuario
        String[] passArray = new String[10]; // Una contraseña por cada usuario

        // Ingreso credenciales empleado a userArray y pasArray

        userArray[1] = "empleado123";// empleado123
        passArray[1] = "passEmpleado123";// pass123

        // Variable usuario

        String user = "";
        String pass = "";

        // Variables cliente
        
        String nombreCliente = ""; // Almacenar nombre cliente
        String tipoCliente = ""; // Almacenar si es un cliente natural o juridico
        String nombreEmpresa = ""; // Nombre de la empresa
        int idCliente = random.nextInt(999); // Generara un id random para el cliente entre 0 a 999

        // Variables facturación

        int numAlquilados = 0; // almacenar el numero de equipos alquilados por el cliente
        String fechaHoy = formato.format(fecha); // Fecha en la que se genero la facturación
        int diasAlquilados = 0; // almacenara el numero de dias que se realizo el 
        int diasExtrasAlquilados = 0; // almacenar el numero extras de dias alquilados
        int valorAlquiler = 35000; // almacenara el valor de alquilar un equipo por dia 
        String tipoAlquiler = ""; // almacenara el tipo de alquiler (dentro de la ciudad, fuera de la ciudad y dentro del establecimiento)
        float sobreCargoFC = 0.05f; // almacenara el valor del sobrecargo al ser un alquiler fuera de la ciudad
        float descuentoDC = 0.02f; // almacenara el valor del descuento por alquilar dentro dentro del establecimiento 
        float descuentoDA = 0.02F; // almacenara el valor del descuento por dia extra de alquiler extra
        String mailCliente = ""; // almacenara el mail del cliente

        // Reglas de negocio
        int numEquiposEmpresa = 100; // almacenar el numero de equipos que tiene la empresa
        int maxDiasAlquiler = 183; // almacenara el numero de equipos maximso que se puede alquilar

        // Variables de control

        int inicioSoftware = 1; // variable para el ciclo while de salir y entrar en sesión
        int inicioSesion = 1; // variable para el ciclo while de realizar nuevamente consultas
        int opcionMenu = 0; // almacenar las respuestas de las opciones de menu
        int operacion = 1; // variable para el ciclo while de realizar operaciones hasta que se cumpla la regla de negocio
        int pregunta = 1; // variable para el condicionales de preguntas 

        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // Inicicio del software
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("--------------------------------------------------");
        System.out.println("              Bienvendio a ALQUIPC                ");
        System.out.println("--------------------------------------------------");
        System.out.println(" ");

        // While - Entrada y Salida de sesión

        while (inicioSoftware == 1 ) {

            // Ingreso credenciales
            System.out.print("Ingrese su usuario: "); 
            user = leerT.next();
            System.out.print("Ingrese su contraseña: ");
            pass = leerT.next();

            // Reinicio de variables
            inicioSesion = 1; // Para que el ciclo vuelva a iniciar
            operacion = 1; // Operaciones para cumplir regla de negocio

            // Condicional - Inicio Sesión
            // Si las credenciales ingresadas son las correctas ingresara al sistema, de lo contrario arrogara error y las solicitar nuevamente

            if (user.equals("empleado123") && pass.equals("pass123")) { 

                System.out.println(" ");
                System.out.println("Bienvenido " + user);
                System.out.println(" ");

                while (inicioSesion == 1) {

                // Menu de opciones
                
                System.out.println(" ");
                System.out.println("¿Que desea consultar?");
                System.out.println(" ");
                System.out.println("---------------------------------------------------------------");
                System.out.println("|   Opcion   |                  Descripción                   |");
                System.out.println("---------------------------------------------------------------");
                System.out.println("|     1      |              realizar facturación              |");
                System.out.println("|     2      |                     Salir                      |");
                System.out.println("---------------------------------------------------------------");
                System.out.println(" ");  
                System.out.print("Respuesta: ");
                opcionMenu = leerT.nextInt();

                if (opcionMenu == 1) {

                    //Condiciones de alquielr
                    System.out.println(" ");
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("|                     Condiciones de Alquiler                  |");
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("| Nombre del cliente      | El nombre del cliente no debe      |");
                    System.out.println("|                         | contener espacios y se remplazan   |");
                    System.out.println("|                         | por raya al piso.                  |"); 
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("| Dias de alquiler        | Se debe alquilar min. 2 y max " +maxDiasAlquiler+ "  |");
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("| Opciones de alquiler    | Las opciones son tres y se dividen |");
                    System.out.println("|                         | en dentro de la ciudad, afuera de  |");
                    System.out.println("|                         | en dentro de la ciudad y dentro del|");
                    System.out.println("|                         | local.                             |");
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("| Alquiler equipos        | Existen diferentes tipos de equipos|");
                    System.out.println("|                         | pc de escritorio, laptop y tablet. |");
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("| Metodo de pago          | El metodo de pago es en efectivo o |");
                    System.out.println("|                         | tarjeta.                           |");
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("| Descuento               | Descuento en el local   -> " + (descuentoDC*100) + "%    |");
                    System.out.println("|                         | Descuento por dia extra -> " + (descuentoDA*100) + "%    |");
                    System.out.println("|                         | Descuento por dia extra -> " + (descuentoDA*100) + "%    |");
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("| Sobre cargo             | Sobre cargo             -> " + (sobreCargoFC*100) + "%    |");
                    System.out.println("---------------------------------------------------------------");

                    // Empezar facturación
                    System.out.println(" ");
                    System.out.println("<-- Empezar facturación -->");
                    System.out.println(" ");

                    // Nombre del cliente
                    System.out.print("Nombre del cliente: ");
                    nombreCliente = leerT.next(); 
                    System.out.println(" ");  
                    
                    while (operacion == 1) {

                        // Tipo cliente
                        System.out.print("Tipo cliente (Juridico o Natural): ");                        
                        tipoCliente = leerT.next();

                        if (tipoCliente.equals("Juridico") || tipoCliente.equals("juridico") || tipoCliente.equals("Natural") || tipoCliente.equals("natural") ) {

                            operacion = 2;
                            System.out.println(" "); 

                        }

                        else {

                            System.out.println(" ");
                            System.out.println("Asegurate de haber ingresado el dato correctamente");
                            System.out.println(" ");

                        }

                    }

                    while (operacion == 2) {

                        // Nombre empresa
                        System.out.println("¿El cliente tiene o pertenece a una empresa? Si = 1   No = 2");
                        System.out.print("Pregunta: ");
                        pregunta = leerT.nextInt();

                        if (pregunta != 1) {

                            nombreCliente = "-----//-----";
                            operacion = 1; // cerrar ciclo
                            pregunta = 1; // reinicio de variable 

                        }

                        else {

                            System.out.println(" ");
                            System.out.print("Ingrese el nombre de la empresa: ");
                            nombreEmpresa = leerT.next();
                            System.out.println(" ");
                            operacion = 1; // cerrar ciclo                 

                        }
                    
                    }

                    // Ingresar numero de equipos alquilados
                    while (operacion == 1) {
  
                        // Numero de equipos alquilados
                        System.out.println(" ");
                        System.out.println("¿Cuantos equipos alquilo el cliente? (Min: 2 y Max: " + numEquiposEmpresa +")" );
                        System.out.print("Num. equipos alquilados: ");
                        numAlquilados = leerT.nextInt();
                        
                        if (numAlquilados < 2 || numAlquilados > numEquiposEmpresa) {

                            System.out.println(" ");
                            System.out.println("No se puede alquilar menos de dos equipos ni mas de " + numEquiposEmpresa );
                            System.out.println(" ");

                        } else {

                            operacion = 2;
                            System.out.println(" ");

                        }
                    
                    }

                    // Dias alquilados

                    while (operacion == 2) {

                        System.out.println("Reglas de alquiler");
                        System.out.println(" ");
                        System.out.println("Minimo numero dias de alquiler -> 2 | Maximo numero de alquiler -> " + maxDiasAlquiler );
                        System.out.println(" ");
                        System.out.println("¿Cuantos dias se alquilo? ");
                        System.out.print("Respuesta: ");
                        diasAlquilados = leerT.nextInt();

                        if (diasAlquilados <= 0 || diasAlquilados > maxDiasAlquiler) { // Si dias alquilados es menor o igual a 0 o dialalquilados es mayor a 183
                            System.out.println(" ");
                            System.out.println("1. El numero de dias alquilados no puede ser menor a 2 o igual a 0");
                            System.out.println("2. El numero de dias alquilados no puede ser mayor a " + maxDiasAlquiler + "dias");
                            System.out.println(" ");
                        }

                        else if (diasAlquilados >= 2 || diasAlquilados <= maxDiasAlquiler) {
                            operacion = 1;
                            System.out.println(" ");
                        }

                    }

                    // Tipo alquiler

                    while (operacion == 1) {

                        System.out.println("Ingrese el tipo de alquiler: ");
                        System.out.println(" ");
                        System.out.println("Dentro de la ciudad (Bogotá D.C) = escriba 1 ");
                        System.out.println("Fuera de la ciudad  = 2");
                        System.out.println("Dentro de la ciudad = 3");
                        System.out.println(" ");
                        System.out.print("Respuesta: ");
                        tipoAlquiler = leerT.next(); 
                        System.out.println(" ");
                        
                        if (tipoAlquiler.equals("1")) {

                            System.out.println("Tipo de alquiler -> Dentro de la ciudad");
                            tipoAlquiler = "Dentro de la ciudad";

                            //Cerrar ciclo
                            operacion = 2;

                        } 

                        else if (tipoAlquiler.equals("2")) {

                            System.out.println("Tipo de alquiler -> Fuera de la ciudad");
                            tipoAlquiler = "Fuera de la ciudad";

                            //Cerrar ciclo
                            operacion = 2;
                        }

                        else if (tipoAlquiler.equals("3")) {

                            System.out.println("Tipo de alquiler -> Fuera de la ciudad");
                            tipoAlquiler = "Fuera de la ciudad";

                            //Cerrar ciclo
                            operacion = 2;
                        }

                        else {

                            System.out.println("Error");

                        }

                    }

                    // Dias extra

                    while (operacion == 2) {

                        while (operacion == 2) {

                            System.out.println(" ");
                            System.out.println("¿Se realizaron dias extras de alquileres? Si = 1 y No = 2");
                            System.out.println("Respuesta: ");
                            pregunta = leerT.nextInt();
                            System.out.println(" ");

                            if (pregunta != 1) {

                                System.out.println("No se realizaron dias extras");
                                diasExtrasAlquilados = 0;
                                operacion = 1;

                            }

                            else {

                                System.out.println(" ");
                                System.out.println("Dias extras alquilados: ");
                                System.out.println("Respuesta: ");
                                diasExtrasAlquilados = leerT.nextInt();
                                System.out.println(" ");
                                
                                if (diasExtrasAlquilados == 0) {

                                    operacion = 1;

                                }

                                else if (diasAlquilados < 0) {

                                    System.out.println("No se puede ingresar un valor menor a 0");

                                }

                                else if (diasExtrasAlquilados > (maxDiasAlquiler - diasAlquilados)) {

                                    System.out.println("No puede ser mayor a " + (maxDiasAlquiler-diasAlquilados));

                                }

                                else if (diasAlquilados <= (maxDiasAlquiler - diasAlquilados)) {

                                    System.out.println("El numero extras de alquiler es: " + (maxDiasAlquiler - diasAlquilados));

                                }

                            }

                        }

                    }

                    // Correo

                    while (operacion == 2) {

                        System.out.println(" ");
                        System.out.println("Ingrese el correo del cliente (debe finalizar con @gmail.com no se permite otro dominio): ");
                        System.out.print("Correo: ");
                        mailCliente = leerT.next();
                        System.out.println(" ");
                        
                        // validar que unicamente no es @gmail.com
                        if (mailCliente.equals("@gmail.com")) {
                            
                            System.out.println("No se puede ingresar unicamente @gmail.com, no es una opción correcta");

                        }

                        else if (mailCliente.endsWith("@gmail.com")) {

                            System.out.println("El correo cumple con las reglas");
                            operacion = 1; // cerrar ciclo

                        } else {

                            System.out.println("El correo ingresado no cumple con las reglas");

                        } 
                        
                    }



                    // Salir o Seguir en la sesión

                    System.out.println(" ");
                    System.out.println("¿Quiere realizar otra facturación? Si = 1   No = 2");
                    System.out.print("Respuesta: ");
                    inicioSesion = leerT.nextInt();
                    System.out.println(" ");

                } 

                else if (opcionMenu == 2) { 
                    
                    System.out.println(" ");


                }

                else { 
                    
                    System.out.println(" ");
                    System.out.println("Ingresaste un valor no definido");
                    System.out.println(" ");

                }



                
                }

            }

            // Si las credenciales son incorrectas a las esperadas
            else if (!user.equals("empleado123") && !pass.equals("pass123")) {

                System.out.println(" ");
                System.out.println("Ingresaste las credenciales incorrectas");
                System.out.println(" ");

            }

            // Si surge alguna excepción diferente a las establecidas
            else { 

                System.out.println(" ");
                System.out.println("Error");
                System.out.println(" ");

            }

        }

        

        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // Cerrar clases
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        leerT.close();

    }
}
