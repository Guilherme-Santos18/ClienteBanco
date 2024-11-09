package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidade.Cliente;
import entidade.ClienteIdoso;
import entidade.ClientePreferencial;
import entidade.Operacoes;



public class Programa {
	
	


	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Cliente> cliente = new ArrayList<>();
		List<ClientePreferencial> clientep= new ArrayList<>();
		List<ClienteIdoso> clienteIdoso = new ArrayList<>();
		
		System.out.print("Quantidade de clientes a cadastrar(C): ");
		int qtdC = sc.nextInt();
		System.out.print("Quantidade de clientes a cadastrar(CP): ");
		int qtdCP = sc.nextInt();
		System.out.print("Quantidade de clientes a cadastrar(CI): ");
		int qtdCI = sc.nextInt();
		
		Operacoes operacoesClientes = new Operacoes();
		
		System.out.println("------CADASTRO DE CLIENTES DO TIPO (C)------");
		
		for(int i =0; i< qtdC; i++) {
			cliente.add(operacoesClientes.cadastrarDadosCliente(sc, sdf));
		}
		
		System.out.println("------CADASTRO DE CLIENTES DO TIPO (CP)------");
		
		for(int i =0; i<qtdCP; i++) {
			clientep.add(operacoesClientes.cadastrarDadosClientePreferencial(sc, sdf));
		}
		
		System.out.println("------CADASTRO DE CLIENTES DO TIPO (CI)------");

		for(int i=0; i<qtdCI; i++) {
			clienteIdoso.add(operacoesClientes.cadastrarDadosClienteIdoso(sc, sdf));
		}
		
		System.out.print("Quantidade de depositos a fazer: ");
		int qtdD = sc.nextInt();
		System.out.print("Digite o tipo do cliente: ");
		String tipoCliente = sc.next();
		System.out.print("Digite o codigo do cliente: ");
		int codigo = sc.nextInt();
		
		for(int i=1; i<= qtdD; i++) {
			
			if(tipoCliente.equalsIgnoreCase("C")) {
				
				for(Cliente c: cliente) {
					if(c.getCodigoConta() == codigo) {
					    System.out.println("Nome: " + c.getNome() + ", codigo: " + c.getCodigoConta());
						System.out.print("Digite o valor para deposito: ");
						c.deposito(sc.nextDouble());
					}
				}
			}
			
			else if(tipoCliente.equalsIgnoreCase("CP")) {
				
				for(ClientePreferencial cp: clientep) {
					if(cp.getCodigoConta() == codigo) {
					    System.out.println("Nome: " + cp.getNome() + ", codigo: " + cp.getCodigoConta());
						System.out.print("Digite o valor para deposito: ");
						cp.deposito(sc.nextDouble());
					}
				}
			}
			
			else if(tipoCliente.equalsIgnoreCase("CI")) {
				
				for(ClienteIdoso ci: clienteIdoso) {
					if(ci.getCodigoConta() == codigo) {
					    System.out.println("Nome: " + ci.getNome() + ", codigo: " + ci.getCodigoConta());
						System.out.print("Digite o valor para deposito: ");
						ci.deposito(sc.nextDouble());
					}
				}
			}
		}
		
		System.out.print("Deseja realizar algum saque (S/N)?:  ");
		char chSaque = sc.next().charAt(0);
		
		if(chSaque == 'S' || chSaque == 's') {
			System.out.print("Digite o tipo do cliente (C, CP, CI): ");
			tipoCliente = sc.next();
			System.out.print("Codido do cliente: ");
			codigo = sc.nextInt();
			
			if(tipoCliente.equalsIgnoreCase("C")) {
				
				for(Cliente c: cliente) {
					if(c.getCodigoConta() == codigo) {
					    System.out.println("Nome: " + c.getNome() + ", codigo: " + c.getCodigoConta());
						System.out.print("Digite o valor para saque: ");
						c.saque(sc.nextDouble());
					}
				}
			}
			
			else if(tipoCliente.equalsIgnoreCase("CP")) {
				
				for(ClientePreferencial cp: clientep) {
					if(cp.getCodigoConta() == codigo) {
					    System.out.println("Nome: " + cp.getNome() + ", codigo: " + cp.getCodigoConta());
						System.out.print("Digite o valor para saque: ");
						cp.saque(sc.nextDouble());
					}
				}
			}
			
			else if(tipoCliente.equalsIgnoreCase("CI")) {
				
				for(ClienteIdoso ci: clienteIdoso) {
					if(ci.getCodigoConta() == codigo) {
					    System.out.println("Nome: " + ci.getNome() + ", codigo: " + ci.getCodigoConta());
						System.out.print("Digite o valor para saque: ");
						ci.saque(sc.nextDouble());
					}
				}
			}
			
			else {
				System.out.println("Codigo sem cadastro!");
			}
			
			System.out.println("------ RELATORIO CLIENTE (C) ------");
			operacoesClientes.gerarRelatorio("C", cliente, sdf);
			
			System.out.println("------ RELATORIO CLIENTE (CP) ------");
			operacoesClientes.gerarRelatorio("CP", clientep, sdf);
			
			System.out.println("------ RELATORIO CLIENTE (CI) ------");
			operacoesClientes.gerarRelatorio("CI", clienteIdoso, sdf);
			
			
		}
		
		
		sc.close();

		
	}
	

	}
	
