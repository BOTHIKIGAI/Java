import java.util.Arrays;


public class Numeros_lista {
    // variables globales: usar o utilizar en cualquier parte del programa

    int primero, segundo, tercero;
    // primero es el numero uno y de esa manera con cada uno

    int[] listaNumeros = new int[3];
    // listaNumeros almacenara los tres numeros

    public int getPrimero() {
        return primero;
    }

    public void setPrimero(int primero) {
        this.primero = primero;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public int getTercero() {
        return tercero;
    }

    public void setTercero(int tercero) {
        this.tercero = tercero;
    }

    public int[] getListaNumeros() {
        return listaNumeros;
    }

    public void setListaNumeros(int[] listaNumeros) {
        this.listaNumeros = listaNumeros;
    }

    public void agregarNumLista() {
        listaNumeros[0] = primero;
        listaNumeros[1] = segundo;
        listaNumeros[2] = tercero;
    }

    public void ordenarLista() {
        if (primero>segundo && segundo>=tercero) {
            System.out.println(" " + primero + " " + segundo + " " + tercero + " ");
        }
        else if (primero>=tercero && tercero>=segundo) {
            System.out.println(" " + primero + " " + tercero + " " + segundo + " ");
        }
        else if (segundo>=primero && primero>=tercero) {
            System.out.println(" " + segundo + " " + primero + " " + tercero + " ");
        }
        else if (segundo>=tercero && tercero>=primero) {
            System.out.println(" " + segundo + " " + tercero + " " + primero + " ");
        }
        else if (tercero>=primero && primero>=segundo) {
            System.out.println(" " + tercero + " " + primero + " " + segundo + " ");
        }
        else {
            System.out.println(" " + tercero + " " + segundo + " " + primero + " ");
        }
    }


}
