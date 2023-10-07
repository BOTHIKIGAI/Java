import java.util.Calendar;


public class FechaCumpleaños {
    
    int dia, mes;

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


    public void cuantoFalta() {
        
        Calendar actual = Calendar.getInstance();

        int diasProximoCumpleaños;
        int mesActual = actual.get(Calendar.MONTH)+1;
        int diaActual = actual.get(Calendar.DAY_OF_MONTH);

        if (mes == mesActual && diaActual < dia) {
            diasProximoCumpleaños = dia - diaActual;
            System.out.println("Faltan: " +  diasProximoCumpleaños + " dias");
        
        } else if (mes == mesActual && diaActual > dia) {
            diasProximoCumpleaños = (360) - (diaActual - dia);
            System.out.println("Faltan: " +  diasProximoCumpleaños + " dias");

        } else if (mesActual < mes) {
            diasProximoCumpleaños = ((mes - mesActual)*30) + (dia - diaActual);
            System.out.println("Faltan: " +  diasProximoCumpleaños + " dias");

        } else if (mesActual > mes) {
            diasProximoCumpleaños = ((30 - diaActual) + ((12 - mesActual)*30) + ((12 - mes)*30)) - (30 - dia);
            System.out.println("Faltan: " +  diasProximoCumpleaños + " dias");
        
        } else {
            System.out.println("Feliz cumpleaños");
        }

        }


        public void diasPasadosUltimo() {

            Calendar actual = Calendar.getInstance();

            int diasPasados;
            int mesActual = actual.get(Calendar.MONTH)+1;
            int diaActual = actual.get(Calendar.DAY_OF_MONTH);


            if (mesActual < mes) {
                diasPasados = ((((12-mes)*30)+(30-dia))+(((mesActual - 1)*30)+dia));
                System.out.println("Desde tu ultimo cumpleaños han pasado: " + diasPasados + " dias");
            } else if (mesActual > mes) {
                diasPasados =  ((((mesActual-mes)-1)*30) + ((30 - dia)+diaActual));
                
                System.out.println("Desde tu ultimo cumpleaños han pasado: " + diasPasados + " dias");
            }
        
        }
}
