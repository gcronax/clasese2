class libro {
    private String titulo;
    private int ISBN;
    private String autor;
    private int n_pag;

    public libro(){
    }
    public libro(String titulo,int ISBN,String autor,int n_pag){
        this.titulo=titulo;
        this.ISBN=ISBN;
        this.autor=autor;
        this.n_pag=n_pag;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setN_pag(int n_pag) {
        this.n_pag = n_pag;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getISBN() {
        return ISBN;
    }

    public int getN_pag() {
        return n_pag;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String datos(){
        return titulo+" "+ ISBN+" "+autor +" "+n_pag;
    }


}
