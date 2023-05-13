import java.util.Arrays;

public class Numeros {
    // variables globales: usar o utilizar en cualquier parte del programa

    int primero, segundo, tercero;
    // n1 = numero uno

    int[] listaNumeros = new int[3];
    // listaNumeros almacenara los numeros n1, n2 y n3

    public int getPrimero() {
        return primero;
    }

    public void setPrimero(int primero) {
        this.primero = primero;
    }

    public int getSeundo() {
        return segundo;
    }

    public void setSeundo(int seundo) {
        this.segundo = seundo;
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
        Arrays.sort(listaNumeros);
        for (int i = listaNumeros.length - 1; i >= 0; i--) {
            System.out.println(listaNumeros[i] + " ");
        }
    }

}
