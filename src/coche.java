class coche {
    private String matricula;
    private String marca;
    private String modelo;
    private int ano;
    private boolean electrico;
    public coche(){
    }
    public coche(String matricula){
        this.matricula=matricula;
    }
    public coche(String matricula, String marca,String modelo,int ano,boolean electrico){
        this.matricula=matricula;
        this.marca=marca;
        this.modelo=modelo;
        this.ano=ano;
        this.electrico=electrico;
    }

    public coche(coche c){
        this.matricula=c.getMatricula();
        this.marca=c.getMarca();
        this.modelo=c.getModelo();
        this.ano=c.getAno();
        this.electrico=c.getElectrico();
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setElectrico(boolean electrico) {
        this.electrico = electrico;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public String getMarca() {
        return marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public boolean getElectrico() {
        return electrico;
    }

    public String datos() {
        String sino;
        if (electrico==true){
            sino="si";
        }else sino="no";
        return matricula+" "+marca+" "+modelo+" "+ano+" Electrico: "+sino;
    }



}
