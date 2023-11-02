package com.mycompany.app;
import java.time.LocalDate;
import java.util.Properties;
import java.util.Random;
import java.util.Scanner;
import javax.mail.*;
import javax.mail.internet.*;

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

        // Clase math - random

        Random random = new Random();


        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // Variables
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // INICIO SESIÓN

        // EMPLEADO
        String[] userEmpleadoArray = new String[10]; // Unicamente se puede ingresar 10 usuario

        String[] passEmpleadoArray = new String[10]; // Una contraseña por cada usuario

        // ADMINISTRADOR
        String[] userAdminstradorArray = new String[10]; // Unicamente se puede ingresar 10 usuario
        String[] passAdministradorArray = new String[10]; // Una contraseña por cada usuario


        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // CREDENCIALES DE USUARIO

        // CREDENCIALES DE EMPLEADO
        userEmpleadoArray[0] = "empleado123";
        passEmpleadoArray[0] = "passEmpleado123";

        userEmpleadoArray[1] = "empleado456";
        passEmpleadoArray[1] = "passEmpleado456";

        // CREDENCIALES DE ADMINISTRADOR

        userAdminstradorArray[0] = "admin123"; 
        passAdministradorArray[0] = "passAdmin123";

        userAdminstradorArray[1] = "admin456";
        passAdministradorArray[1] = "passAdmin456";

        // UBICACIÓN CREDENCIALES  
        int ubicacionCredencialesArrayUsuarios = 11; // Almacenara la ubicación de las credenciales en el array Usuario
        int ubicacionCredencialesArrayPass = 11; // Almacenara la ubicación de las credenciales en el array Pass

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // VARIABLE DE USUARIO

        String user = "";
        String pass = "";


        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // Variables cliente
        
        String nombreCliente = ""; // Almacenar nombre cliente
        String tipoCliente = ""; // Almacenar si es un cliente natural o juridico
        String nombreEmpresa = ""; // Nombre de la empresa
        int idCliente = random.nextInt(999); // Generara un id random para el cliente entre 0 a 999
        int idFactura = random.nextInt(999); // Generara un id random para la factura entre 0 a 999

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // FECHA

        LocalDate fechaHoy = LocalDate.now(); // Fecha en la que se genero la facturación   

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // VARIABLES DE FACTURACIÓN

        int numAlquilados = 0; // almacenar el numero de equipos alquilados por el cliente
        int numAlquiladosPc = 0; // almacenar el numero de equipos alquilados de tipo pc por el cliente
        int numAlquiladosLaptop = 0; // almacenar el numero de equipos alquilados de tipo laptop por el cliente
        int numAlquiladosTablet = 0; // almacenar el numero de equipos alquilados de tipo tablet por el cliente
        int diasAlquilados = 0; // almacenara el numero de dias que se realizo el 
        int diasExtrasAlquilados = 0; // almacenar el numero extras de dias alquilados
        int valorAlquiler = 35000; // almacenara el valor de alquilar un equipo por dia 
        String tipoAlquiler = ""; // almacenara el tipo de alquiler (dentro de la ciudad, fuera de la ciudad y dentro del establecimiento)
        String sitioAlquiler = ""; // almacenara el sitio donde se realizo el alquiler
        float sobreCargoFC = 0.05f; // almacenara el valor del sobrecargo al ser un alquiler fuera de la ciudad
        float descuentoDC = 0.02f; // almacenara el valor del descuento por alquilar dentro dentro del establecimiento 
        float descuentoDA = 0.02F; // almacenara el valor del descuento por dia extra de alquiler extra
        String metodoPago = ""; // almacenara el metodo de pago
        String mailCliente = ""; // almacenara el mail del cliente


        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // VALOR FACTURACIÓN
        float valorFacturacionBase = 0; // almacenara el valor total de la facturación del cliente con descuento o sobrecargo
        float valorFacturacionDiasExtras = 0; // almacenara el valor total sumado a la facturación por los dias esxtras


        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // REGLAS DE NEGOCIO
        int numEquiposEmpresa = 100; // almacenar el numero de equipos que tiene la empresa
        int maxDiasAlquiler = 183; // almacenara el numero de equipos maximso que se puede alquilar
        float maxDescuentoAlquilerDiasExtra = 0.2f; // almacenar el valor maximo que puede tener el alquiler por dia extra

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // VARIABLE INTERMEDIA CAMBIOS VALORES  

        int numEquiposEmpresaModificacion = numEquiposEmpresa; // almacenar el numero de equipos que tiene la empresa como variable intermedia
        int maxDiasAlquilerModificacion = maxDiasAlquiler; // almacenara el numero de equipos maximso que se puede alquilar como variable intermediaria
        float maxDescuentoAlquilerDiasExtraModificacion = maxDescuentoAlquilerDiasExtra; // almacenar el valor maximo que puede tener el alquiler por dia extra como variable intermediaria

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // VARIABLES DE CONTROL

        int inicioSoftware = 1; // variable para el ciclo while de salir y entrar en sesión
        int inicioSesion = 1; // variable para el ciclo while de realizar nuevamente consultas
        int opcionMenu = 0; // almacenar las respuestas de las opciones de menu
        int operacion = 1; // variable para el ciclo while de realizar operaciones hasta que se cumpla la regla de negocio
        int operacionII = 1; // variable para el ciclo while de realizar operaciones hasta que se cumpla la regla de negocio
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

            //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            // INGRESO DE CREDENCIALES

            // Ingreso credenciales
            System.out.print("Ingrese su usuario: "); 
            user = leerT.next();
            System.out.print("Ingrese su contraseña: ");
            pass = leerT.next();

            // Reinicio de variables
            inicioSesion = 1; // Para que el ciclo vuelva a iniciar
            operacion = 1; // Operaciones para cumplir regla de negocio
            operacionII = 1;
            ubicacionCredencialesArrayUsuarios = 11; // Realizar nuevamente comprobaciones
            ubicacionCredencialesArrayPass = 11; // Realizar nuevamente comprobaciones

            // Condicional - Inicio Sesión
            // Si las credenciales ingresadas son las correctas ingresara al sistema, de lo contrario arrogara error y las solicitar nuevamente


            ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            // TIPO DE SESIÓN A INICIAR

            System.out.println(" ");
            System.out.println("¿Que tipo de sesión desea iniciar?");
            System.out.println(" ");
            System.out.println("Empleado = 1");
            System.out.println("Administrador = 2");
            System.out.println("");
            System.out.print("Respuesta: ");
            opcionMenu = leerT.nextInt();

            ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

            if (opcionMenu == 1) {

                for (int i = 0; i < userEmpleadoArray.length; i++) {

                    if (user.equals(userEmpleadoArray[i])) {

                        ubicacionCredencialesArrayUsuarios = i;
                        break;

                    } 

                }

                for (int i = 0; i < passEmpleadoArray.length; i++) {

                    if (pass.equals(passEmpleadoArray[i])) {

                        ubicacionCredencialesArrayPass = i;
                        break;

                    }

                }                

                if (ubicacionCredencialesArrayUsuarios == ubicacionCredencialesArrayPass && ubicacionCredencialesArrayUsuarios != 11 && ubicacionCredencialesArrayPass != 11) {

                    // MENSAJE BIENVENIDA

                    while (inicioSesion == 1) {

                        System.out.println(" ");
                        System.out.println("///////////////////////////////////////// ");
                        System.out.println("      Inicio sesión como empleado");
                        System.out.println("///////////////////////////////////////// ");
                        System.out.println(" ");
                        
                        System.out.println(" ");
                        System.out.println("Bienvenido " + user);
                        System.out.println(" ");

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

                            System.out.println("---------------------------------------------------------------");
                            System.out.println("---------------------------------------------------------------");

                            // Nombre del cliente
                            System.out.print("Nombre del cliente: ");
                            nombreCliente = leerT.next(); 
                            System.out.println(" ");  
                            
                            System.out.println("---------------------------------------------------------------");
                            System.out.println("---------------------------------------------------------------");

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

                            System.out.println("---------------------------------------------------------------");
                            System.out.println("---------------------------------------------------------------");

                            while (operacion == 2) {

                                // Nombre empresa
                                System.out.println("¿El cliente tiene o pertenece a una empresa? Si = 1   No = 2");
                                System.out.print("Pregunta: ");
                                pregunta = leerT.nextInt();

                                if (pregunta != 1) {

                                    nombreEmpresa = "-----//-----";
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

                            System.out.println("---------------------------------------------------------------");
                            System.out.println("---------------------------------------------------------------");

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
                                }

                                else if (numAlquilados >= 2 && numAlquilados <= numEquiposEmpresa) {

                                    while (operacion == 1) {

                                        System.out.println(" ");
                                        System.out.println("Si no alquilo ningun equipo agregue 0 de alguna de las categorias agregue cero");
                                        System.out.println("");
                                        System.out.println("¿Cuantos equipos de computo tipo pc?");
                                        System.out.print("Cantidad: ");
                                        numAlquiladosPc = leerT.nextInt();
                                        System.out.println("¿Cuantos equipos de computo tipo laptop?");
                                        System.out.print("Cantidad: ");
                                        numAlquiladosLaptop = leerT.nextInt();
                                        System.out.println("¿Cuantos equipos de computo tipo tablet?");
                                        System.out.print("Cantidad: ");
                                        numAlquiladosTablet = leerT.nextInt();
                                        System.out.println(" ");

                                        if (numAlquiladosPc + numAlquiladosLaptop + numAlquiladosTablet != numAlquilados) {

                                            System.out.println(" ");
                                            System.out.println("El numero de equipos alquilados no coincide con la suma de los equipos alquilados por tipo");
                                            System.out.println(" ");

                                        }

                                        else if (numAlquiladosPc + numAlquiladosLaptop + numAlquiladosTablet == numAlquilados) {

                                            System.out.println(" ");
                                            System.out.println("El numero de equipos alquilados es: " + numAlquilados);
                                            System.out.println("El numero de equipos alquilados tipo pc es: " + numAlquiladosPc);
                                            System.out.println("El numero de equipos alquilados tipo laptop es: " + numAlquiladosLaptop);
                                            System.out.println("El numero de equipos alquilados tipo tablet es: " + numAlquiladosTablet);
                                            operacion = 2;
                                            System.out.println(" ");

                                        }

                                        else {
                                                
                                            System.out.println("Error");

                                        }

                                    }
                                    
                                    operacion = 2;
                                    System.out.println(" ");

                                } 
                                
                                else {

                                    operacion = 2;
                                    System.out.println(" ");

                                }
                            
                            }

                            System.out.println("---------------------------------------------------------------");
                            System.out.println("---------------------------------------------------------------");

                            // Dias alquilados

                            while (operacion == 2) {

                                System.out.println("Reglas de alquiler");
                                System.out.println(" ");
                                System.out.println("Minimo numero dias de alquiler -> 2 | Maximo numero de alquiler -> " + maxDiasAlquiler );
                                System.out.println(" ");
                                System.out.println("Cada alquiler de equipo tiene un precio de " + valorAlquiler + " pesos por dia");
                                System.out.println("");
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
                                    System.out.println("El alquiler se realizo por " + diasAlquilados + " dias");
                                    System.out.println("Tendra un valor de " + (diasAlquilados*valorAlquiler) + " pesos");
                                    System.out.println(" ");
                                    System.out.println("La fecha del alquiler es " + fechaHoy);
                                    System.out.println("Y terminara el " + fechaHoy.plusDays(diasAlquilados));
                                }

                            }

                            System.out.println("---------------------------------------------------------------");
                            System.out.println("---------------------------------------------------------------");

                            // Tipo alquiler

                            while (operacion == 1) {

                                System.out.println("Ingrese el tipo de alquiler: ");
                                System.out.println(" ");
                                System.out.println("Dentro de la ciudad (Bogotá D.C) = escriba 1 ");
                                System.out.println("Fuera de la ciudad  = 2");
                                System.out.println("Alquiler en el local = 3");
                                System.out.println(" ");
                                System.out.print("Respuesta: ");
                                tipoAlquiler = leerT.next(); 
                                System.out.println(" ");
                                
                                if (tipoAlquiler.equals("1")) {

                                    System.out.println("Tipo de alquiler -> Dentro de la ciudad");
                                    System.out.println("El alquiler se realizo en Bogota D.C");
                                    tipoAlquiler = "Dentro de la ciudad";
                                    sitioAlquiler = "Bogota D.C";

                                    //Cerrar ciclo
                                    operacion = 2;

                                } 

                                else if (tipoAlquiler.equals("2")) {

                                    System.out.println("Tipo de alquiler -> Fuera de la ciudad");
                                    System.out.println("Sobre cargo añadido por alquiler fuera de la ciudad -> " + (sobreCargoFC*100) + "%");
                                    tipoAlquiler = "Fuera de la ciudad";
                                    System.out.println("");
                                    System.out.print("Ingrese el sitio donde se realizo el alquiler: ");
                                    sitioAlquiler = leerT.next();

                                    //Cerrar ciclo
                                    operacion = 2;
                                }

                                else if (tipoAlquiler.equals("3")) {

                                    System.out.println("Tipo de alquiler -> Alquiler en el local");
                                    System.out.println("Descuento añadido por alquiler en el local -> " + (descuentoDC*100) + "%");
                                    tipoAlquiler = "Alquiler en el local";
                                    System.out.println("");
                                    sitioAlquiler = "Local - Cr 115 # 70 - 50";

                                    //Cerrar ciclo
                                    operacion = 2;
                                }

                                else {

                                    System.out.println("Error");

                                }

                            }

                            System.out.println("---------------------------------------------------------------");
                            System.out.println("---------------------------------------------------------------");

                            // Recordatorio precio actual del alquiler por dia y descuento o sobrecargo

                            System.out.println(" ");
                            System.out.println("El valor actual del alquiler es de " + valorAlquiler + " pesos");

                            if (tipoAlquiler.equals("Dentro de la ciudad")) {

                                System.out.println("El descuento por alquiler en el local es de " + (descuentoDC*100) + "%");
                                valorFacturacionBase = valorAlquiler * diasAlquilados;

                            }

                            else if (tipoAlquiler.equals("Fuera de la ciudad")) {

                                System.out.println("El sobrecargo por alquiler fuera de la ciudad es de " + (sobreCargoFC*100) + "%");
                                valorFacturacionBase = (valorAlquiler * diasAlquilados) + ((valorAlquiler * diasAlquilados) * sobreCargoFC);

                            }

                            else if (tipoAlquiler.equals("Alquiler en el local")) {

                                System.out.println("El descuento por alquiler en el local es de " + (descuentoDC*100) + "%");
                                valorFacturacionBase = (valorAlquiler * diasAlquilados) - ((valorAlquiler * diasAlquilados) * descuentoDC);

                            }

                            System.out.println("El valor actual del alquiler con sobrecargo o descuento es de " + valorFacturacionBase + " pesos");


                            System.out.println("---------------------------------------------------------------");
                            System.out.println("---------------------------------------------------------------");
                            // Dias extra

                            while (operacion == 2) {

                                while (operacion == 2) {

                                    System.out.println(" ");
                                    System.out.println("¿Se realizaron dias extras de alquileres? Si = 1 y No = 2");
                                    System.out.print("Respuesta: ");
                                    pregunta = leerT.nextInt();
                                    System.out.println(" ");

                                    if (pregunta != 1) {

                                        System.out.println("No se realizaron dias extras");
                                        diasExtrasAlquilados = 0;
                                        operacion = 1;

                                    }

                                    else {

                                        System.out.println(" ");
                                        System.out.print("Dias extras alquilados: ");
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

                                            System.out.println("El numero extras de alquiler es: " + diasExtrasAlquilados);
                                            operacion = 1;

                                        }

                                    }

                                }

                            }

                            System.out.println("---------------------------------------------------------------");
                            System.out.println("---------------------------------------------------------------");

                            // Recordatorio Precio valor a pagar por los dias extras

                            System.out.println(" ");
                            System.out.println("El valor actual del alquiler es de " + valorFacturacionBase + " pesos");
                            System.out.println(" ");
                            
                            // Condicional - Dias extras

                            if (diasExtrasAlquilados == 0) {

                                valorFacturacionDiasExtras = 0;

                            }

                            else if (diasExtrasAlquilados >= 10) {

                                valorFacturacionDiasExtras = (valorAlquiler * diasExtrasAlquilados) - ((valorAlquiler * diasExtrasAlquilados) * maxDescuentoAlquilerDiasExtra);
                                System.out.println("El valor actual del alquiler por dias extras es de " + valorFacturacionDiasExtras + " pesos");

                            }

                            else if (diasExtrasAlquilados < 10) {

                                valorFacturacionDiasExtras = (valorAlquiler * diasExtrasAlquilados) - ((valorAlquiler * diasExtrasAlquilados) * descuentoDA);
                                System.out.println("El valor actual del alquiler por dias extras es de " + valorFacturacionDiasExtras + " pesos");

                            }

                            System.out.println("---------------------------------------------------------------");
                            System.out.println("---------------------------------------------------------------");

                            // Correo

                            while (operacion == 1) {

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
                                    operacion = 2; // cerrar ciclo

                                } else {

                                    System.out.println("El correo ingresado no cumple con las reglas");

                                } 
                                
                            }

                            while (operacion == 2) {
                                
                                System.out.println("");
                                System.out.println("Metodos de pago");
                                System.out.println(" ");
                                System.out.println("----------------");
                                System.out.println("| 1. Efectivo |");
                                System.out.println("| 2. Tarjeta  |");
                                System.out.println("----------------");
                                System.out.println(" ");
                                System.out.println("Ingrese el metodo de pago (numero): ");
                                metodoPago = leerT.next();
                                
                                if (metodoPago.equals("1")) {

                                    System.out.println("El metodo de pago es en efectivo");
                                    operacion = 1;

                                }

                                else if (metodoPago.equals("2")) {

                                    System.out.println("El metodo de pago es en tarjeta");
                                    operacion = 1;

                                }

                                else {

                                    System.out.println("Error");

                                }

                            }

                            System.out.println("---------------------------------------------------------------");
                            System.out.println("---------------------------------------------------------------");

                            // Facturación

                            System.out.println(" ");
                            System.out.println("///////////////////////////////////////// ");
                            System.out.println("|      Fecha de facturación: " + fechaHoy);
                            System.out.println("|      Factura de alquiler No. " + idFactura);
                            System.out.println("|      Nombre del cliente: " + nombreCliente);
                            System.out.println("|      Id del cliente: " + idCliente);
                            System.out.println("|      Tipo de cliente: " + tipoCliente);
                            System.out.println("|      Nombre de la empresa: " + nombreEmpresa);
                            System.out.println("|--------------------------------------");
                            System.out.println("|      Detalles del alquiler:");
                            System.out.println("|      - Finalización alquiler: " + fechaHoy.plusDays(diasAlquilados + diasExtrasAlquilados));                    
                            System.out.println("|      - Numero de equipos alquilados: " + numAlquilados);
                            System.out.println("|           - Equipos de mesa: " + numAlquiladosPc);                    
                            System.out.println("|           - Equipos de laptop: " + numAlquiladosLaptop);                    
                            System.out.println("|           - Equipos de tablet: " + numAlquiladosTablet);                                        
                            System.out.println("|      - Dias de alquiler: " + diasAlquilados);
                            System.out.println("|      - Tipo de alquiler: " + tipoAlquiler);
                            System.out.println("|      - Sitio de alquiler: " + sitioAlquiler);
                            System.out.println("|      - Dias extras de alquiler: " + diasExtrasAlquilados);
                            System.out.println("|--------------------------------------");
                            System.out.println("|      Detalles de facturación:");
                            System.out.println("|      - Valor de alquiler por día: " + valorAlquiler);
                            System.out.println("|      - Valor de alquiler por días extras: " + valorFacturacionDiasExtras);
                            System.out.println("|      - Valor de alquiler total: " + (valorFacturacionBase + valorFacturacionDiasExtras));
                            System.out.println("       - Metodo de pago " + metodoPago);
                            System.out.println("|--------------------------------------");
                            System.out.println("|      Información de contacto:");
                            System.out.println("|      - Correo del cliente: " + mailCliente);
                            System.out.println("///////////////////////////////////////// ");
                            System.out.println(" ");
                            
                            System.out.println("---------------------------------------------------------------");
                            System.out.println("---------------------------------------------------------------");

                            // Enviar correo

                            final String username = "pruebacorreopruebacorreo459@gmail.com";
                            final String password = "zhgw kxpp gttg dhfp";

                            Properties props = new Properties();
                            props.put("mail.smtp.auth", "true");
                            props.put("mail.smtp.starttls.enable","true");
                            props.put("mail.smtp.host", "smtp.gmail.com");
                            props.put("mail.smtp.port", "587");

                            Session session = Session.getInstance(props, new javax.mail.Authenticator() {
                                protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                                    return new javax.mail.PasswordAuthentication(username, password);
                                }
                            });


                            try {
                                // Crear un mensaje de correo
                                Message message = new MimeMessage(session);
                                message.setFrom(new InternetAddress("pruebacorreopruebacorreo459@gmail.com"));
                                message.setRecipients(Message.RecipientType.TO,
                                        InternetAddress.parse(mailCliente));
                                message.setSubject("Facturación id: " + idFactura + " para el cliente: " + nombreCliente);
                                String messageContent = "///////////////////////////////////////// \n" +
                                            "|      Fecha de facturación: " + fechaHoy + "\n" +
                                            "|      Factura de alquiler No. " + idFactura + "\n" +
                                            "|      Nombre del cliente: " + nombreCliente + "\n" +
                                            "|      Id del cliente: " + idCliente + "\n" +
                                            "|      Tipo de cliente: " + tipoCliente + "\n" +
                                            "|      Nombre de la empresa: " + nombreEmpresa + "\n" +
                                            "|--------------------------------------\n" +
                                            "|      Detalles del alquiler:\n" +
                                            "|      - Finalización alquiler: " + fechaHoy.plusDays(diasAlquilados + diasExtrasAlquilados) + "\n" +                                    
                                            "|      - Numero de equipos alquilados: " + numAlquilados + "\n" +
                                            "|           - Equipos de mesa: " + numAlquiladosPc + "\n" +
                                            "|           - Equipos de laptop: " + numAlquiladosLaptop + "\n" +
                                            "|           - Equipos de tablet: " + numAlquiladosTablet + "\n" +
                                            "|      - Dias de alquiler: " + diasAlquilados + "\n" +
                                            "|      - Tipo de alquiler: " + tipoAlquiler + "\n" +
                                            "|      - Sitio de alquiler: " + sitioAlquiler + "\n" +
                                            "|      - Dias extras de alquiler: " + diasExtrasAlquilados + "\n" +
                                            "|--------------------------------------\n" +
                                            "|      Detalles de facturación:\n" +
                                            "|      - Valor de alquiler por día: " + valorAlquiler + "\n" +
                                            "|      - Valor de alquiler por días extras: " + valorFacturacionDiasExtras + "\n" +
                                            "|      - Valor de alquiler total: " + (valorFacturacionBase + valorFacturacionDiasExtras) + "\n" +
                                            "       - Metodo de pago " + metodoPago + "\n" +
                                            "|--------------------------------------\n" +
                                            "|      Información de contacto:\n" +
                                            "|      - Correo del cliente: " + mailCliente + "\n" +
                                            "///////////////////////////////////////// ";

                                message.setText(messageContent);
                                // Enviar el correo
                                Transport.send(message);
                                System.out.println("Correo enviado exitosamente. Revise su correo (realmente funciona el envio de correo)");

                            } catch (MessagingException e) {
                                throw new RuntimeException(e);
                            }

                            // Salir o Seguir en la sesión

                            System.out.println(" ");

                            // Salir o Seguir en la sesión

                            System.out.println(" ");
                            System.out.println("¿Quiere realizar otra facturación? Si = 1   No = 2");
                            System.out.print("Respuesta: ");
                            inicioSesion = leerT.nextInt();
                            System.out.println("");
                            System.out.println("¿Seguro? Si = 1  No = 2");
                            System.out.print("Respuesta: ");
                            System.out.println(" ");
                            inicioSesion = leerT.nextInt();

                        } else if ( opcionMenu == 2) {

                            System.out.println(" ");
                            System.out.println("Sesión cerrada");
                            System.out.println(" ");
                            inicioSesion = 2;

                        } else {

                            System.out.println(" ");
                            System.out.println("Error");
                            System.out.println(" ");

                        }

                    }        

                }

                else if (ubicacionCredencialesArrayUsuarios != ubicacionCredencialesArrayPass || ubicacionCredencialesArrayUsuarios == 11 || ubicacionCredencialesArrayPass == 11) {

                    System.out.println(" ");
                    System.out.println("Credenciales incorrectas");
                    System.out.println(" ");

                }

                else {

                    System.out.println(" ");
                    System.out.println("Error");
                    System.out.println(" ");

                }

            }

            else if (opcionMenu == 2) {

                for (int i = 0; i < userAdminstradorArray.length; i++) {

                    if (user.equals(userAdminstradorArray[i])) {

                        ubicacionCredencialesArrayUsuarios = i;
                        break;

                    } 

                }

                for (int i = 0; i < passAdministradorArray.length; i++) {

                    if (pass.equals(passAdministradorArray[i])) {

                        ubicacionCredencialesArrayPass = i;
                        break;

                    }

                }

                if (ubicacionCredencialesArrayUsuarios == ubicacionCredencialesArrayPass && ubicacionCredencialesArrayUsuarios != 11 && ubicacionCredencialesArrayPass != 11) {

                    // MENSAJE BIENVENIDA

                    while (inicioSesion == 1) {

                        System.out.println(" ");
                        System.out.println("///////////////////////////////////////// ");
                        System.out.println("      Inicio sesión como administrador");
                        System.out.println("///////////////////////////////////////// ");
                        System.out.println(" ");
                        
                        System.out.println(" ");
                        System.out.println("Bienvenido " + user);
                        System.out.println(" ");

                        // Menu de opciones
                        
                        System.out.println(" ");
                        System.out.println("¿Que desea consultar?");
                        System.out.println(" ");
                        System.out.println("---------------------------------------------------------------");
                        System.out.println("|   Opcion   |                  Descripción                   |");
                        System.out.println("---------------------------------------------------------------");
                        System.out.println("|     1      |            cambiar datos necesarios            |");
                        System.out.println("|     2      |                     Salir                      |");
                        System.out.println("---------------------------------------------------------------");
                        System.out.println(" ");  
                        System.out.print("Respuesta: ");
                        opcionMenu = leerT.nextInt();

                        if (opcionMenu == 1) {

                            System.out.println(" ");
                            System.out.println("///////////////////////////////");
                            System.out.println("  Cambiar datos facturación");
                            System.out.println("///////////////////////////////");
                            System.out.println(" ");

                            System.out.println(" ");

                            while (operacion == 1) {

                                // Reinicio de variable
                                operacion = 1;
                                operacionII = 1;
                                
                                // Inicio menu

                                System.out.println(" ");
                                System.out.println("¿Qué cambio desea realizar?");
                                System.out.println(" ");
                                System.out.println("---------------------------------------------------------------");
                                System.out.println("|   Opcion   |                  Descripción                   |");
                                System.out.println("---------------------------------------------------------------");
                                System.out.println("|     1      |            Cambiar valor alquiler              |");
                                System.out.println("|     2      |            Cambiar max dias alquiler           |");
                                System.out.println("|     3      |            Cambiar max descuento alquiler      |");
                                System.out.println("|     4      |            Numero de equipos de la empresa     |");
                                System.out.println("|     5      |                     Salir                      |");
                                System.out.println("---------------------------------------------------------------");
                                System.out.println(" ");
                                System.out.println("Respuesta: ");
                                opcionMenu = leerT.nextInt();

                                // INICIO CONDICIONALES - CAMBIOS

                                if (opcionMenu == 1) {

                                    System.out.println(" ");
                                    System.out.println("///////////////////////////////");
                                    System.out.println("Cambiar valor alquiler");
                                    System.out.println("///////////////////////////////");
                                    System.out.println(" ");

                                    System.out.println("Valor actual del alquiler: " + valorAlquiler);
                                    System.out.println(" ");
                                    
                                    while (operacionII == 1) {
                                        
                                    }

                                }

                                else if (opcionMenu == 2) { 

                                    System.out.println(" ");
                                    System.out.println("///////////////////////////////");
                                    System.out.println("Cambiar max dias alquiler");
                                    System.out.println("///////////////////////////////");
                                    System.out.println(" ");

                                    System.out.println("Valor actual del maximo dias de alquiler: " + numEquiposEmpresa);

                                }

                                else if (opcionMenu == 3) { 



                                }

                                else if (opcionMenu == 4) { 



                                } 
                                
                                else if (opcionMenu == 5) { 



                                } 

                                else {

                                    System.out.println(" ");
                                    System.out.println("Ingresaste un valor diferente a los indicados en el menu");
                                    System.out.println(" ");

                                }

                            }

                            System.out.println(" ");


                        }  

                        else if (opcionMenu == 2) {

                            System.out.println(" ");
                            System.out.println("Sesión cerrada");
                            System.out.println(" ");
                            inicioSesion = 2;

                        }

                        else {

                            System.out.println(" ");
                            System.out.println("Error");
                            System.out.println(" ");

                        }

                    }    
                } 

                else if (ubicacionCredencialesArrayUsuarios != ubicacionCredencialesArrayPass || ubicacionCredencialesArrayUsuarios == 11 || ubicacionCredencialesArrayPass == 11) {

                    System.out.println(" ");
                    System.out.println("Credenciales incorrectas");
                    System.out.println(" ");

                }

                else {

                    System.out.println(" ");
                    System.out.println("Error");
                    System.out.println(" ");

                }

            }

            else {

                System.out.println("Valor ingresado no valido");

            }
            
        }

        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // Cerrar clases
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        leerT.close();

    }
}

