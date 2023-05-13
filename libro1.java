public class libro1 {
    // variables globales: usar o utilizar en cualquier parte del programa
    
    String autor1, titulo1;
        // nombre del autor y titulo del libro

    int paginas1;
        // cantidad de paginas


    public String getAutor1() {
        return autor1;
    }

    public void setAutor1(String autor1) {
        this.autor1 = autor1;
    }

    public String getTitulo1() {
        return titulo1;
    }

    public void setTitulo1(String titulo1) {
        this.titulo1 = titulo1;
    }

    public int getPaginas1() {
        return paginas1;
    }

    public void setPaginas1(int paginas1) {
        this.paginas1 = paginas1;
    }

    public void mostrarLibro() {
        System.out.println("El libro " + titulo1 + ", del autor " + autor1 + ", tiene " + paginas1 + ", paginas");
    }


}
