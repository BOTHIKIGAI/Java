public class libro {
    
    String autor1, autor2;
        // nombre del autor


    String titulo1, titulo2;
        // titulo del libro

    int paginas1, paginas2;
        // cantidad de paginas


    public String getAutor1() {
        return autor1;
    }

    public void setAutor1(String autor1) {
        this.autor1 = autor1;
    }

    public String getAutor2() {
        return autor2;
    }

    public void setAutor2(String autor2) {
        this.autor2 = autor2;
    }

    public String getTitulo1() {
        return titulo1;
    }

    public void setTitulo1(String titulo1) {
        this.titulo1 = titulo1;
    }

    public String getTitulo2() {
        return titulo2;
    }

    public void setTitulo2(String titulo2) {
        this.titulo2 = titulo2;
    }

    public int getPaginas1() {
        return paginas1;
    }

    public void setPaginas1(int paginas1) {
        this.paginas1 = paginas1;
    }

    public int getPaginas2() {
        return paginas2;
    }

    public void setPaginas2(int paginas2) {
        this.paginas2 = paginas2;
    }

    public void mostrarLibro() {
        System.out.println("El libro " + titulo1 + ", del autor " + autor1 + ", tiene " + paginas1 + ", paginas");
        System.out.println("El libro " + titulo2 + ", del autor " + autor2 + ", tiene " + paginas2 + ", paginas");
    }

    public void compararLibros() {
        
        if (paginas1 > paginas2){
            System.out.println("El libro con mayor numero de paginas es: " + titulo1);
        }else{
            System.out.println("El libro con mayor numero de paginas es: " + titulo2);
        }

    }

    

}
