package mapa.bicicleta;

public class Bicicleta {
    protected int codigoBicicleta;
    protected String cor;
    protected String tipo;
    protected int marcha;
    protected double valorAluguel;
    public String cadastro;
    
    public Bicicleta() {
        this.codigoBicicleta = 0;
        this.cor = "";
        this.tipo = "";
        this.marcha = 0;
        this.valorAluguel = 0;
    }
    
    public Bicicleta(int codigoBicicleta, String cor, String tipo, int marcha, double valorAluguel) {
        this.codigoBicicleta = codigoBicicleta;
        this.cor = cor;
        this.tipo = tipo;
        this.marcha = marcha;
        this.valorAluguel = valorAluguel;
    }
    
    public void setCodigoBicicleta(int codigoBicicleta) {
        this.codigoBicicleta = codigoBicicleta;
    }
    
    public int getCodigoBicicleta() {
        return codigoBicicleta;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public String getCor() {
        return cor;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }
    
    public int getMarcha() {
        return marcha;
    }
    
    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }
    
    public double getValorAluguel() {
        return valorAluguel;
    }
    
    public void listarBike() {        
        System.out.println("Código da Bicicleta: " + this.getCodigoBicicleta() + "\n" + 
                "Cor: " + this.getCor() + "\n" + 
                "Tipo: " + this.getTipo() + "\n" + 
                "Marchas: " + this.getMarcha() + "\n" + 
                "Valor do aluguel: " + this.getValorAluguel() + "\n");
    }
    
    public String cadastrarBikes() {
        System.out.println("Digite o código da bicicleta: " + getCodigoBicicleta() + "\n" +
                "Digite a cor: " + getCor() + "\n" +
                "Digite o tipo: " + getTipo() + "\n" +
                "Digite a quantidade de marchas: " + getMarcha() + "\n" + 
                "Digite o valor do aluguel: " + getValorAluguel() + "\n"+
                "\nBicicleta cadastrada com sucesso!\n");
        return "";
    }
    
}
