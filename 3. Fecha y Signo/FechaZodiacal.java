import java.util.Calendar;
import java.util.GregorianCalendar;

public class FechaZodiacal {
    // variables globales: usar o utilizar en cualquier parte del programa

    int dia, mes, año, edad;


    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void calcularEdad () {
        
        Calendar actual = Calendar.getInstance();
        int mesActual = actual.get(Calendar.MONTH);
        int diaActual = actual.get(Calendar.DAY_OF_MONTH); 
        int añoActual = actual.get(Calendar.YEAR);

        if (dia >= diaActual && mes >= mesActual ) {
            edad = añoActual - año;
            System.out.println("Edad: " + edad);

        } else {
            edad = (añoActual - año) - 1;
        }

    }

    public void zodiaco(int dia, int mes) {
        if ((dia >= 21 && mes == 3) || (dia <= 20 && mes == 4)) {
            System.out.println("Aries");
        } else if ((dia >= 21 && mes == 4) || (dia <= 20 && mes == 5)) {
            System.out.println("Tauro");
        } else if ((dia >= 21 && mes == 5) || (dia <= 20 && mes == 6)) {
            System.out.println("Géminis");
        } else if ((dia >= 21 && mes == 6) || (dia <= 22 && mes == 7)) {
            System.out.println("Cáncer");
        } else if ((dia >= 23 && mes == 7) || (dia <= 22 && mes == 8)) {
            System.out.println("Leo");
        } else if ((dia >= 23 && mes == 8) || (dia <= 22 && mes == 9)) {
            System.out.println("Virgo");
        } else if ((dia >= 23 && mes == 9) || (dia <= 22 && mes == 10)) {
            System.out.println("Libra");
        } else if ((dia >= 23 && mes == 10) || (dia <= 21 && mes == 11)) {
            System.out.println("Escorpio");
        } else if ((dia >= 22 && mes == 11) || (dia <= 21 && mes == 12)) {
            System.out.println("Sagitario");
        } else if ((dia >= 22 && mes == 12) || (dia <= 19 && mes == 1)) {
            System.out.println("Capricornio");
        } else if ((dia >= 20 && mes == 1) || (dia <= 18 && mes == 2)) {
            System.out.println("Acuario");
        } else if ((dia >= 19 && mes == 2) || (dia <= 20 && mes == 3)) {
            System.out.println("Piscis");
        } else {
            System.out.println("La fecha ingresada no es válida.");
        }
    }
    

    
}