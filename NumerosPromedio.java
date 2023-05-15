import java.util.Scanner;

public class NumerosPromedio {
    
    float dato, sumaDatos, candtidadDatos, promedioResultado;
    boolean respuesta;

    public float getDato() {
        return dato;
    }

    public void setDato(float dato) {
        this.dato = dato;
    }

    public float getSumaDatos() {
        return sumaDatos;
    }

    public void setSumaDatos(float sumaDatos) {
        this.sumaDatos = sumaDatos;
    }

    public float getCandtidadDatos() {
        return candtidadDatos;
    }

    public void setCandtidadDatos(float candtidadDatos) {
        this.candtidadDatos = candtidadDatos;
    }

    public void promedio () {
        
        Scanner captura = new Scanner(System.in);

        respuesta = true;
        while (respuesta == true) {
            System.out.println("Ingrese el dato: ");
            dato = captura.nextFloat();
            sumaDatos += dato;
            candtidadDatos ++;
            System.out.println("¿Desea agregar otro numero? (Escriba True para si o False para no)");
            respuesta = captura.nextBoolean();

        }

        promedioResultado = sumaDatos / candtidadDatos;
        System.out.println("El promedio de los datos ingresados es de: " + promedioResultado);


    }

}
