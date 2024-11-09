package entidade;

import java.util.Date;

public class Cliente {
	
	public static double taxaDeposito = 5.00;
	public static double taxaSaque = 0.85;

	
	private String nome;
	private Integer idade;
	private Date dataNas;
	private Integer codigoConta;
	private Double saldoConta;
	
	public Cliente() {
		super();
	}

	public Cliente(String nome, Integer idade, Date dataNas, Integer codigoConta, Double saldoConta) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.dataNas = dataNas;
		this.codigoConta = codigoConta;
		this.saldoConta = saldoConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Date getDataNas() {
		return dataNas;
	}

	public void setDataNas(Date dataNas) {
		this.dataNas = dataNas;
	}

	public Integer getCodigoConta() {
		return codigoConta;
	}

	public void setCodigoConta(Integer codigoConta) {
		this.codigoConta = codigoConta;
	}

	public Double getSaldoConta() {
		return saldoConta;
	}

	public void setSaldoConta(Double saldoConta) {
		this.saldoConta = saldoConta;
	}
	
	public void deposito(double qtdDinheiro) {
		this.saldoConta += qtdDinheiro - taxaDeposito;
	}
	
	public void saque(double qtdDinheiro) {
		this.saldoConta = (this.saldoConta - qtdDinheiro)  * taxaSaque;
	}

}
