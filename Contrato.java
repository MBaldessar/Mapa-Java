package mapa.bicicleta;

public class Contrato {
    protected int codigoContrato;
    protected Cliente cliente;
    protected Bicicleta[] bicicleta;
    protected double valorContrato;
    
    public void setCodigoContrato(int codigoContrato) {
        this.codigoContrato = codigoContrato;
    }

    public int getCodigoContrato() {
        return codigoContrato;
    }
    
    /*public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public Cliente getCliente() {
        return cliente;
    }
    
    public void setBicicleta(Bicicleta bicicleta) {
        this.bicicleta = bicicleta;
    }
    
    public Bicicleta getBicicleta() {
        return bicicleta;
    }
    
    public void addBicicleta(Bicicleta bicicleta, int ??) {
        bicicleta[] = new Bicicleta();
    }
    
    public void listarBicicleta() {
        return "Código da Bicicleta: " + this.getCodigoBicicleta() + "\n" + 
                "Cor: " + this.getCor() + "\n" + 
                "Tipo: " + this.getTipo() + "\n" + 
                "Marchas: " + this.getMarcha() + "\n" + 
                "Valor do aluguel: " + this.getValorAluguel() + "\n");
        
    }*/
}

