package entidade;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

public class Operacoes extends Cliente {
	
	
	private static SimpleDateFormat sdf  = new SimpleDateFormat("dd/MM/yyyy");
	
	public  Cliente cadastrarDadosCliente(Scanner sc, SimpleDateFormat sdf) throws ParseException {
		sc.nextLine();
		System.out.print("Nome completo: ");
		String nome = sc.nextLine();
		System.out.print("Idade: ");
		int idade = sc.nextInt();
		System.out.print("Data de nascimento: ");
		String dataNas = sc.next();
		System.out.print("Codigo da conta: ");
		int codigo = sc.nextInt();
		System.out.print("Saldo da conta: ");
		double saldoConta = sc.nextDouble();
		return new Cliente(nome, idade, sdf.parse(dataNas), codigo, saldoConta);

	}
	
	public   ClientePreferencial cadastrarDadosClientePreferencial(Scanner sc, SimpleDateFormat sdf) throws ParseException{
		sc.nextLine();
		System.out.print("Nome completo: ");
		String nome = sc.nextLine();
		System.out.print("Idade: ");
		int idade = sc.nextInt();
		System.out.print("Data de nascimento: ");
		String dataNas = sc.next();
		System.out.print("Codigo da conta: ");
		int codigo = sc.nextInt();
		System.out.print("Saldo da conta: ");
		double saldoConta = sc.nextDouble();
		sc.nextLine();
		System.out.print("CPF: ");
		String CPF = sc.next();
		System.out.print("RG: ");
		String RG = sc.next();
		System.out.print("Tipo preferencial: (A, M, F): ");
		String tipoPreferencia = sc.next();
		return new ClientePreferencial(nome, idade, sdf.parse(dataNas), codigo, saldoConta, CPF, RG, tipoPreferencia);

	}
	
	public  ClienteIdoso cadastrarDadosClienteIdoso (Scanner sc, SimpleDateFormat sdf) throws ParseException{
		sc.nextLine();
		System.out.print("Nome completo: ");
		String nome = sc.nextLine();
		System.out.print("Idade: ");
		int idade = sc.nextInt();
		System.out.print("Data de nascimento: ");
		String dataNas = sc.next();
		System.out.print("Codigo da conta: ");
		int codigo = sc.nextInt();
		System.out.print("Saldo da conta: ");
		double saldoConta = sc.nextDouble();
		System.out.print("Codigo preferencial: ");
		String  codigoPreferencial = sc.next();
		return new ClienteIdoso(nome, idade, sdf.parse(dataNas), codigo, saldoConta, codigoPreferencial);
	}
	
	public  void realizarDeposito(Scanner sc, List<? extends Cliente> clientes) {
		
		for(Cliente c: clientes) {
			System.out.print("Valor do deposito: ");
			c.deposito(sc.nextDouble());
		}
	}
	
	public  void realizarSaque(Scanner sc, List<? extends Cliente> clientes) {
		
		for(Cliente c: clientes) {
			c.saque(sc.nextDouble());
		}
	}
	
	public  void gerarRelatorio(String tipo, List<? extends Cliente> clientes, SimpleDateFormat sdf) throws ParseException { 
		System.out.println("Dados dos clientes tipo(" + tipo + ")");
		for(Cliente c: clientes) {
			System.out.println("Nome: " + c.getNome() + ", idade: " + c.getIdade());
			System.out.println("Saldo da conta atualizado: " + String.format("%.2f", c.getSaldoConta()));
		}
	}

	

}
