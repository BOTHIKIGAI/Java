import java.lang.reflect.Array;
import java.util.Arrays;

public class Numeros {
    // variables globales: usar o utilizar en cualquier parte del programa

    int n1,n2,n3;
       // n1 = numero uno 

    int[] listaNumeros = new int[3];
        // listaNumeros almacenara los numeros n1, n2 y n3


    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN3() {
        return n3;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }

    public int[] getListaNumeros() {
        return listaNumeros;
    }

    public void setListaNumeros(int[] listaNumeros) {
        this.listaNumeros = listaNumeros;
    }

    public void agregarNumLista() {
        listaNumeros[0] = n1;
        listaNumeros[1] = n2;
        listaNumeros[2] = n3;
    }

    public void ordenarLista() {
        Arrays.sort(listaNumeros);
        for (int i = listaNumeros.length - 1; i >= 0; i--) {
            System.out.println(listaNumeros[i] + " ");
        }
    }

}
