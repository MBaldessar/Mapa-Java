package mapa.bicicleta;

import java.util.Arrays;
import java.util.Scanner;

public class MAPABicicleta {

    public static void main(String[] args) {
        int opcao;
        int op1;
        int op2;
        Bicicleta[] bikes = new Bicicleta[] {};
        Cliente[] clientes = new Cliente[] {};
        Contrato[] contratos = new Contrato[] {};
        
        while(true){
	        System.out.println("-------------------------------");
	        System.out.println("Digite a sua opção \n");
	        System.out.println("0 - Sair");
	        System.out.println("1 - Cadastrar bicicletas");
	        System.out.println("2 - Listar bicicletas");
	        System.out.println("3 - Alterar dados da bicicleta");
	        System.out.println("4 - Cadastrar novo cliente");
	        System.out.println("5 - Listar clientes");
	        System.out.println("6 - Alterar dados do cliente");
	        System.out.println("7 - Abrir contrato");
	        System.out.println("8 - Listar contratos");
	        System.out.println ("Opção: ");
	        
	        Scanner scan = new Scanner(System.in);
	        
	        opcao = scan.nextInt();
	        
	        
	        if(opcao == 0) {
	            System.out.println("O sistema será encerrado.");
	            System.exit(0);
	        }
	        
	        switch(opcao) {
	        	case 0:
		            System.out.println("O sistema será encerrado.");
		            System.exit(0);
	            case 1:
	            	System.out.println("Criando cadastro de bicicletas. \n");
                        System.out.println("Cadastrando nova bicicleta. \n");
                        System.out.println("Digite o código da bicicleta: 3 \n" +
                                           "Digite a cor: amarela \n" + 
                                           "Digite o tipo: Street \n" + 
                                           "Digite a quantidade de marchas: 1 \n" + 
                                           "Digite o valor do aluguel: 100.00 \n\n" +
                                           "Bicicleta cadastrada com sucesso!");
	            	bikes = cadastrarBicicletas();
	                
	            break;
	            
	            case 2:
	            	System.out.println("Listando bicicletas: ");
	            	for (Bicicleta bike : bikes) {
	                    bike.listarBike();
	                }
                    break;
	                    
	            case 3:
                    System.out.println("Alterar dados da bicicleta: \n");
                    System.out.println("Listando as bikes do sistema... \n");
                    
                    for (int i = 0; i < bikes.length; i++) {
                    	System.out.println("Índice " + i);
                    	bikes[i].listarBike();
                    }
                    
                    System.out.println("------------------------------------------------------------\n");
                    System.out.println("Digite o índice que deseja fazer a alteração:");

                    Scanner scanner = new Scanner(System.in);
                    int indice = scanner.nextInt();
                    
                    if(indice > bikes.length - 1) {
                        System.out.println("Opção inválida! \n");
                        break;
                    }
                    
                    System.out.println("\nDigite o atributo da bicicleta que deseja fazer a alteração:");
                    System.out.println("1- Código");
                    System.out.println("2- Cor ");
                    System.out.println("3- Tipo ");
                    System.out.println("4- Marcha ");
                    System.out.println("5- Valor do Aluguel ");

                    int atributo = scanner.nextInt();
                        
                    switch(atributo) {
                        case 1:
                        	System.out.println("\nDigite o novo código da bicicleta:");
                        	bikes[indice].setCodigoBicicleta(Integer.parseInt(scanner.next()));
                        	System.out.print("Item alterado com sucesso!\n");
                        	break;

                        case 2:
                        	System.out.println("\nDigite a nova cor da bicicleta:");
                        	bikes[indice].setCor(scanner.next());
                        	System.out.print("Item alterado com sucesso!\n");
                        	break;

                        case 3:
                        	System.out.println("\nDigite o novo tipo de bicicleta:");
                        	bikes[indice].setTipo(scanner.next());
                        	System.out.print("Item alterado com sucesso!\n");
                        	break;

                        case 4:
                        	System.out.println("\nDigite a nova quantidade de marchas da bicicleta:");
                        	bikes[indice].setMarcha(scanner.nextInt());
                        	System.out.print("Item alterado com sucesso!\n");
                        	break;

                        case 5:
                        	System.out.print("Digite o novo valor do aluguel: ");
                        	bikes[indice].setValorAluguel(Double.parseDouble(scanner.next()));
                        	System.out.print("Item alterado com sucesso!\n");
                        	break;

                        default: System.out.println("Opção inválida!\n");
                    }
                    break;
                        
	            case 4:
	            	System.out.println("Criando cadastro de clientes. \n");
                        System.out.println("Cadastrando novo cliente. \n");
                        System.out.println("Digite o nome do Cliente: Vivian \n" +
                                           "Digite o CPF: 012.326.789-44 \n" + 
                                           "Digite o código: 3 \n" + 
                                           "Digite o telefone: " + "97458-5521 \n\n" + 
                                            "Cliente cadastrado com sucesso!");
	            	clientes = cadastrarClientes();
	                break;
	            
	            case 5: 
	            	System.out.println("Listando clientes: ");
	            	for (Cliente cliente : clientes) {
	            		cliente.listarClientes();
                    }
                    break;
	            
	            case 6: 
                        System.out.println("Alterar dados do cliente");
                        System.out.println("Listando os clientes do sistema... \n");
                        
                        for (int i = 0; i < clientes.length; i++) {
                    	System.out.println("Índice " + i);
                    	clientes[i].listarClientes();
                    }

                        System.out.println("------------------------------------------------------------\n");
                        System.out.println("Digite o código do cliente que deseja fazer a alteração:");

                        Scanner scanner1 = new Scanner(System.in);
                        int indice1 = scanner1.nextInt();
                        
                        if(indice1 > clientes.length -1) {
                        System.out.println("Opção inválida! \n");
                        break;
                    }
                        
                        System.out.println("\nDigite o atributo do cliente que deseja fazer a alteração:");
                        System.out.println("1- Nome");
                        System.out.println("2- CPF ");
                        System.out.println("3- Código ");
                        System.out.println("4- Telefone ");

                        int atributo1 = scanner1.nextInt();

                        switch(atributo1) {
                            case 1: 
                                    System.out.println("\nDigite o novo nome do cliente:");
                                    clientes[indice1].setNome(scanner1.next());
                                    System.out.print("Item alterado com sucesso!\n");
                                    break;

                            case 2: 
                                    System.out.println("\nDigite o novo CPF do cliente:");
                                    clientes[indice1].setCpf(scanner1.next());
                                    System.out.print("Item alterado com sucesso!\n");
                                    break;

                            case 3: 
                                    System.out.println("\nDigite o novo código do cliente:");
                                    clientes[indice1].setCodigo(scanner1.nextInt());
                                    System.out.print("Item alterado com sucesso!\n");
                                    break;

                            case 4: 
                                    System.out.println("\nDigite o novo telefone do cliente:");
                                    clientes[indice1].setTelefone(scanner1.next());
                                    System.out.print("Item alterado com sucesso!\n");
                                    break;

                            default: System.out.println("Opção inválida!\n");
                            break;
                        }
                        break;
                            
	            
	            case 7: 
	            	System.out.println("Abrindo contrato...");
	            	
	            	// tem que pedir os atributos do contrato, vou colocar fixo mas tem que fazer o menu, pedir pelo índice, mesma coisa
	            	int codigo = 1;
	            	Cliente cliente = clientes[0]; // só pode selecionar 1 cliente

	            	Contrato contrato = new Contrato(codigo, cliente);
	            	
	            	// aqui tá adicionando todas, mas tem que ser um menu que deixe o cliente ir escolhendo uma bike pra adicionar
	            	// depois de adicionar, ele tem a opção de adicionar outra bike ou parar.
	            	// à medida que ele for adicionando já vai atualizar a coleção de bikes e o valor do aluguel.
	            	for (Bicicleta bike : bikes)
	            		contrato.addBicicleta(bike);

	            	contratos = Arrays.copyOf(contratos, contratos.length+1);
	            	
	            	// coloca o novo contrato na última posição
	            	contratos[contratos.length-1] = contrato;
	            	
	            	break;
	            
	            case 8 :
	            	System.out.println("Listando contratos...");
	            	for (Contrato c : contratos)
	            		c.listarContrato();
	            	break;
	            
	            default: System.out.println("Opção inválida");
	            break;
	        
        }
    }
}
    
    private static Bicicleta[] cadastrarBicicletas() {
        Bicicleta[] bikes = new Bicicleta[3];
        bikes[0] = new Bicicleta(1, "verde", "Barra circular", 1, 150.00);
        bikes[1] = new Bicicleta(2, "vermelha", "Mountain Bike", 18, 250.00);
        bikes[2] = new Bicicleta(3, "amarela", "Street", 1, 100.00);
        return bikes;
    }
    
    private static Cliente[] cadastrarClientes() {
        Cliente[] clientes = new Cliente[3];
        clientes[0] = new Cliente("Matheus", "123.456.789-00", 1, "98428-2296");
        clientes[1] = new Cliente("Joaquim", "985.125.325-99", 2, "99445-5885");
        clientes[2] = new Cliente("Vivian", "012.326.789-44", 3, "97458-5521");
        return clientes;
    }
        
    }
    
