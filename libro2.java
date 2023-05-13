public class libro2 {
    
    String autor2, titulo2;
        // nombre del autor y titulo del libro

    int paginas2;
        // cantidad de paginas


    public String getAutor2() {
        return autor2;
    }

    public void setAutor2(String autor2) {
        this.autor2 = autor2;
    }

    public String getTitulo2() {
        return titulo2;
    }

    public void setTitulo2(String titulo2) {
        this.titulo2 = titulo2;
    }

    public int getPaginas2() {
        return paginas2;
    }

    public void setPaginas2(int paginas2) {
        this.paginas2 = paginas2;
    }

    public void mostrarLibro() {
        System.out.println("El libro " + titulo2 + ", del autor " + autor2 + ", tiene " + paginas2 + ", paginas");
    }
}