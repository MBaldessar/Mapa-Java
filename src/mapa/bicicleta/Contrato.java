package mapa.bicicleta;

import java.util.Arrays;

public class Contrato {
    protected int codigoContrato;
    protected Cliente cliente;
    protected Bicicleta[] bicicletas;
    protected double valorContrato;

    public Contrato(int codigo, Cliente cliente)
    {
    	this.codigoContrato = codigo;
    	this.cliente = cliente;
    	this.bicicletas = new Bicicleta[] {};

    	// a meu ver esse valor tem que ficar zerado e ir mudando à medida que as bikes são adicionadas
    	this.valorContrato = 0d;
    }
    
    public void setCodigoContrato(int codigoContrato) {
        this.codigoContrato = codigoContrato;
    }

    public int getCodigoContrato() {
        return codigoContrato;
    }
    
//    public void setCliente(Cliente cliente) {
//        this.cliente = cliente;
//    }
    
    public Cliente getCliente() {
        return cliente;
    }
    
    public void addBicicleta(Bicicleta bicicleta) {
        // vai aumentando o array em 1 posição pra suportar a nova bike, sempre
    	bicicletas = Arrays.copyOf(bicicletas, bicicletas.length+1);

    	// coloca a nova bike na última posição
    	bicicletas[bicicletas.length-1] = bicicleta;
        
        // adiciona o valor da bike adicionada no aluguel
        this.valorContrato += bicicleta.getValorAluguel();
    }

    public void abrirContrato() {
    	System.out.println("Código: " + codigoContrato);
    	System.out.println("Cliente: " + cliente.getNome());
    	System.out.println("Valor total: " + valorContrato);
    	System.out.println("Bicicletas");
    	listarBicicletas();
    }
    
    public void listarBicicletas() {
        for (Bicicleta b : this.bicicletas)
        	b.listarBike();
    }
    
    public void listarContrato() {
    	System.out.println("Contrato código " + codigoContrato + ", Cliente: " + cliente.getNome());
    }
}

