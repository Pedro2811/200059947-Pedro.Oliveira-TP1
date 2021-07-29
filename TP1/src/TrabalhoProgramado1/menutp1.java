package TrabalhoProgramado1;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;

public class menutp1 {
	public static void main(String[] args) throws IOException{
		Scanner ler = new Scanner(System.in);
		Scanner sc= new Scanner(System.in);
		int opcao, qtdClientes, contadorClientes = 10, alterarDados, qtdProdutos, contadorProd = 10, alterarDadosProd;
		int loop, escolha, numeracao = 0, escolhaFinal = 0, numeracao2 = 0, escolha2, escolhaFinal2 = 0, sairWhile;
		
		//Declaração dos ArraysList
		ArrayList<String> NomesClientes = new ArrayList<String>();
		ArrayList<String> Endereços = new ArrayList<String>();
		ArrayList<String> Telefones = new ArrayList<String>();
		ArrayList<String> DescriçaoProd = new ArrayList<String>();
		ArrayList<String> NomesProdutos = new ArrayList<String>();
		ArrayList<String> ValorProd = new ArrayList<String>();
		ArrayList<String> LucroProd = new ArrayList<String>();
		ArrayList<String> QuantidadeProd = new ArrayList<String>();
		ArrayList<String> QuantidadeVendas = new ArrayList<String>();
		
		
		//Cadastro de clientes para correção 
		NomesClientes.add("Cliente 1");
		Endereços.add("Rua 1");
		Telefones.add("(39) 20222-8224");
		NomesClientes.add("Cliente 2");
		Endereços.add("Rua 2");
		Telefones.add("(19) 87999-4010");
		NomesClientes.add("Cliente 3");
		Endereços.add("Rua 3");
		Telefones.add("(14) 28242-3846");
		NomesClientes.add("Cliente 4");
		Endereços.add("Rua 4");
		Telefones.add("(33) 13588-5292");
		NomesClientes.add("Cliente 5");
		Endereços.add("Rua 5");
		Telefones.add("(74) 45792-8981");
		NomesClientes.add("Cliente 6");
		Endereços.add("Rua 6");
		Telefones.add("(82) 24929-7108");
		NomesClientes.add("Cliente 7");
		Endereços.add("Rua 7");
		Telefones.add("(49) 85217-3932");
		NomesClientes.add("Cliente 8");
		Endereços.add("Rua 8");
		Telefones.add("(74) 71116-4237");
		NomesClientes.add("Cliente 9");
		Endereços.add("Rua 9");
		Telefones.add("(78) 32037-3321");
		NomesClientes.add("Cliente 10");
		Endereços.add("Rua 10");
		Telefones.add("(78) 74475-8680");
		
		//Cadastro de produtos para correção
		NomesProdutos.add("Produto 1");
		DescriçaoProd.add("Descrição produto 1");
		ValorProd.add("100");
		LucroProd.add("10%");
		QuantidadeProd.add("15");
		NomesProdutos.add("Produto 2");
		DescriçaoProd.add("Descrição produto 2");
		ValorProd.add("200");
		LucroProd.add("15%");
		QuantidadeProd.add("20");
		NomesProdutos.add("Produto 3");
		DescriçaoProd.add("Descrição produto 3");
		ValorProd.add("300");
		LucroProd.add("20%");
		QuantidadeProd.add("30");
		NomesProdutos.add("Produto 4");
		DescriçaoProd.add("Descrição produto 4");
		ValorProd.add("400");
		LucroProd.add("25%");
		QuantidadeProd.add("40");
		NomesProdutos.add("Produto 5");
		DescriçaoProd.add("Descrição produto 5");
		ValorProd.add("500");
		LucroProd.add("30%");
		QuantidadeProd.add("50");
		NomesProdutos.add("Produto 6");
		DescriçaoProd.add("Descrição produto 6");
		ValorProd.add("600");
		LucroProd.add("35%");
		QuantidadeProd.add("60");
		NomesProdutos.add("Produto 7");
		DescriçaoProd.add("Descrição produto 7");
		ValorProd.add("700");
		LucroProd.add("40%");
		QuantidadeProd.add("70");
		NomesProdutos.add("Produto 8");
		DescriçaoProd.add("Descrição produto 8");
		ValorProd.add("800");
		LucroProd.add("45%");
		QuantidadeProd.add("80");
		NomesProdutos.add("Produto 9");
		DescriçaoProd.add("Descrição produto 9");
		ValorProd.add("900");
		LucroProd.add("50%");
		QuantidadeProd.add("90");
		NomesProdutos.add("Produto 10");
		DescriçaoProd.add("Descrição produto 10");
		ValorProd.add("1000");
		LucroProd.add("55%");
		QuantidadeProd.add("100");
		
		//Cadastro de vendas para correção
		 QuantidadeVendas.add("cliente : " + NomesClientes.get(0) + "/produto: " + NomesProdutos.get(0) + "/Quantidade: 10");
		 QuantidadeVendas.add("cliente : " + NomesClientes.get(1) + "/produto: " + NomesProdutos.get(1) + "/Quantidade: 20");
		 QuantidadeVendas.add("cliente : " + NomesClientes.get(2) + "/produto: " + NomesProdutos.get(2) + "/Quantidade: 30");
		 QuantidadeVendas.add("cliente : " + NomesClientes.get(3) + "/produto: " + NomesProdutos.get(3) + "/Quantidade: 40");
		 QuantidadeVendas.add("cliente : " + NomesClientes.get(4) + "/produto: " + NomesProdutos.get(4) + "/Quantidade: 50");
		 QuantidadeVendas.add("cliente : " + NomesClientes.get(5) + "/produto: " + NomesProdutos.get(5) + "/Quantidade: 60");
		 QuantidadeVendas.add("cliente : " + NomesClientes.get(6) + "/produto: " + NomesProdutos.get(6) + "/Quantidade: 70");
		 QuantidadeVendas.add("cliente : " + NomesClientes.get(7) + "/produto: " + NomesProdutos.get(7) + "/Quantidade: 80");
		 QuantidadeVendas.add("cliente : " + NomesClientes.get(8) + "/produto: " + NomesProdutos.get(8) + "/Quantidade: 90");
		 QuantidadeVendas.add("cliente : " + NomesClientes.get(9) + "/produto: " + NomesProdutos.get(9) + "/Quantidade: 100");
		 
		 //Início looping do menu de escolha
		for(loop = 0; loop < 100000; loop ++){
			
			//Imprimindo o menu
			System.out.println("1. Cadastro de novo cliente");
			System.out.println("2. Busca por cliente");
			System.out.println("3. Cadastro de novo produto");
			System.out.println("4. Busca por produto");
			System.out.println("5. Cadastro de venda");
			System.out.println("6. Mostrar produtos em estoque");
			System.out.println("7. Sair");
			
			//Escolha da opção do menu
			System.out.println("Digite a opção desejada: ");
			opcao = ler.nextInt();
			
			 if(opcao == 1) {
				 //Cadastro de clientes
			     System.out.println("Digite a quantidade de clientes que serão cadastrados: ");
			     qtdClientes = ler.nextInt();
			        for(int i = 0; i < qtdClientes; i++){
			        	System.out.println("Digite o nome do cliente: ");
			    		String nome = sc.nextLine();
			    		NomesClientes.add(nome);
			    		contadorClientes++;
			    		System.out.println("Digite o endereço do cliente: ");
			    		String endereco = sc.nextLine();
			    		Endereços.add(endereco);
			    		System.out.println("Digite o telefone do cliente: ");
			    		String numero = sc.nextLine();
			    		Telefones.add(numero);
			    		}
			        
			   }else if(opcao == 2){
				   
				   //Busca de cliente
				   System.out.println("Digite o nome do cliente que deseja buscar: ");
				   String buscaNome = sc.nextLine();
				   int detector = 0;
				   for(int b = 0; b < contadorClientes; b++){
					   String comparaNome = NomesClientes.get(b);
					   
					   if(buscaNome.equals(comparaNome)) {
						   detector = 1;
						   System.out.println("Cliente encontrado");
						   System.out.println("Nome do cliente: " + NomesClientes.get(b));
						   System.out.println("Endereço do cliente: " + Endereços.get(b));
						   System.out.println("Telefone do cliente: " + Telefones.get(b));
						   
						   System.out.println("Deseja alterar os dados desse cliente? (Digite 1 para sim ou 2 para não) ");
						   alterarDados = ler.nextInt();
						   if(alterarDados == 1){
							   System.out.println("Digite o novo nome: ");
							   String novoNome = sc.nextLine();
					    	   NomesClientes.set(b, novoNome);
					    	   System.out.println("Digite o novo endereço: ");
							   String novoEndereco = sc.nextLine();
					    	   Endereços.set(b, novoEndereco);
					    	   System.out.println("Digite o novo telefone: ");
							   String novoTelefone = sc.nextLine();
					    	   Telefones.set(b, novoTelefone);
						   }
					   }
				   }
				   if(detector == 0) {
					   System.out.println("Cliente não encontrado");
				   }
				   
				   
			   }else if(opcao == 3){
				   
				   //Cadastro de produtos
				   System.out.println("Digite a quantidade de produtos que serão cadastrados: ");
				    qtdProdutos = ler.nextInt();
				    for(int p = 0; p < qtdProdutos; p++){
			        	System.out.println("Digite o nome do produto: ");
			    		String nomeP = sc.nextLine();
			    		NomesProdutos.add(nomeP);
			    		contadorProd ++;
			    		System.out.println("Digite a descrição do produto: ");
			    		String descriçao = sc.nextLine();
			    		DescriçaoProd.add(descriçao);
			    		System.out.println("Digite o valor de compra do produto: ");
			    		String valor = sc.nextLine();
			    		ValorProd.add(valor);
			    		System.out.println("Digite a porcentagem de lucro do produto: ");
			    		String lucro = sc.nextLine();
			    		LucroProd.add(lucro);
			    		System.out.println("Digite a quantidade em estoque do do produto: ");
			    		String estoque = sc.nextLine();
			    		QuantidadeProd.add(estoque);
			    		}
				   
			   }else if(opcao == 4) {
				   
				   //Busca de produtos
				   System.out.println("Digite o nome do produto que deseja buscar: ");
				   String buscaNomeprod = sc.nextLine();
				   int detector2 = 0;
				   for(int c = 0; c < contadorProd; c++){
					   String comparaProd = NomesProdutos.get(c);
					   
					   if(buscaNomeprod.equals(comparaProd)) {
						   detector2 = 1;
						   System.out.println("Produto encontrado");
						   System.out.println("Nome do produto: " + NomesProdutos.get(c));
						   System.out.println("Descrição do produto: " + DescriçaoProd.get(c));
						   System.out.println("Valor de compra do produto: " + ValorProd.get(c));
						   System.out.println("Porcetagem de lucro do produto: " + LucroProd.get(c));
						   System.out.println("Quantidade do produto em estoque: " + QuantidadeProd.get(c));
						   
						   System.out.println("Deseja alterar os dados desse produto? (Digite 1 para sim ou 2 para não) ");
						   alterarDadosProd = ler.nextInt();
						   if(alterarDadosProd == 1){
							   System.out.println("Digite o novo nome para o produto: ");
							   String novoNomeProd = sc.nextLine();
					    	   NomesProdutos.set(c, novoNomeProd);
					    	   System.out.println("Digite a nova descrição do produto: ");
							   String novaDescriçao = sc.nextLine();
					    	   DescriçaoProd.set(c, novaDescriçao);
					    	   System.out.println("Digite o novo valor de compra do produto: ");
							   String novoValor = sc.nextLine();
					    	   ValorProd.set(c, novoValor);
					    	   System.out.println("Digite a nova porcetagem de lucro do produto: ");
							   String novoLucro = sc.nextLine();
					    	   LucroProd.set(c, novoLucro);
					    	   System.out.println("Digite a nova quantidade em estoque do produto: ");
							   String novaQuant = sc.nextLine();
					    	   QuantidadeProd.set(c, novaQuant);
						   }
					   }
				   }
				   if(detector2 == 0) {
					   System.out.println("Produto não encontrado");
				   }
			   }else if(opcao == 5) {
				   
				   //Cadastro de venda
				   numeracao = 0;
				   for(int q = 0; q < contadorClientes; q++) {
					   numeracao ++;
					   System.out.println(numeracao + "." + NomesClientes.get(q));
				   }
				   numeracao = 0;
				   System.out.println("Digite a posição do cliente que deseja cadastrar a venda: ");
				   escolha = ler.nextInt();
				   escolhaFinal = escolha - 1;
				   System.out.println("O cliente escolhido foi: " + NomesClientes.get(escolhaFinal));
				     do {
					   System.out.println("Agora escolha o produto: " );
					   for(int d = 0; d < contadorProd; d++) {
						   numeracao2 ++;
						   System.out.println(numeracao2 + "." + NomesProdutos.get(d));
					   }
					   
					   
						   System.out.println("Digite a posição do produto que deseja adicionar a venda ");
						   escolha2 = ler.nextInt();
						   
						   escolhaFinal2 = escolha2 - 1;
						   System.out.println("Digite a quantidade do produto " + NomesProdutos.get(escolhaFinal2) + " que deseja adicionar ao cliente " + NomesClientes.get(escolhaFinal));
						   String qtdVenda = sc.nextLine();
				    	   QuantidadeVendas.add("cliente : " + NomesClientes.get(escolhaFinal) + "/produto: " + NomesProdutos.get(escolhaFinal2) + "/Quantidade: " + qtdVenda);
				    	   System.out.println("Venda adicionada");
				    	   System.out.println("Cliente: " +  NomesClientes.get(escolhaFinal));
				    	   System.out.println("Produto: " +  NomesProdutos.get(escolhaFinal2));
				    	   System.out.println("Quantidade: " +  qtdVenda);
				    	   numeracao2 = 0;
				    	   System.out.println("Digite 0 caso deseje parar de cadastrar um produto ou 1 para continuar cadastrando vendas a esse cliente");
						   sairWhile = ler.nextInt();
					   }while(sairWhile != 0); 
						   System.out.println("Você selecionou sair do cadastro de vendas");
						   
					   
					   
				   
				  
				}else if(opcao == 6){
					
					//Listar produtos cadastrados
					System.out.println("Lista de produtos ");
					for(int g = 0; g < contadorProd; g++) {
						System.out.println("Nome do pruduto: " + NomesProdutos.get(g) + "/ Quantidade em Estoque: " + QuantidadeProd.get(g));
					}
				}else if(opcao == 7) {
					
					//Sair do programa
					System.out.println("Obrigado por usar o programa.");
					break;
				}
			 
			 
			        
			
			
			
			}
		}
		
		
	}


