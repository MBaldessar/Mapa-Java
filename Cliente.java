package mapa.bicicleta;

public class Cliente {
    protected String nome;
    protected String cpf;
    protected int codigo;
    protected String telefone;
    
    public Cliente() {
        this.nome = "";
        this.cpf = "";
        this.codigo = 0;
        this.telefone = "";
    }
    
    public Cliente(String nome, String cpf, int codigo, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.codigo = codigo;
        this.telefone = telefone;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public int getCodigo() {
        return codigo;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public String getTelefone() {
        return telefone;
    }
    
    public String listarClientes() {        
        System.out.println("Nome: " + this.getNome() + "\n" + 
                "CPF: " + this.getCpf() + "\n" + 
                "Codigo: " + this.getCodigo() + "\n" + 
                "Telefone: " + this.getTelefone() + "\n");
        return "";
    }
    
    public String cadastrarClientes() {
        System.out.println("Digite o nome: " + this.getNome() + "\n" +
                "Digite o CPF: " + this.getCpf() + "\n" +
                "Digite o Código: " + this.getCodigo() + "\n" +
                "Digite a telefone: " + this.getTelefone() + "\n" +
                "\nCliente cadastrado com sucesso!\n");
        return "";
    }
    
}
