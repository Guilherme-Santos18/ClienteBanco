package entidade;

import java.util.Date;

public class ClientePreferencial extends Cliente {
	
	public static double taxaDeposito = 1.50;
	public static double taxaSaque = 0.95;
	
	private String CPF;
	private String RG;
	private String tipoPreferencia;
	
	public ClientePreferencial() {
		super();
	}
	

	public ClientePreferencial(String nome, Integer idade, Date dataNas, Integer codigoConta, Double saldoConta,
			String CPF, String RG, String tipoPreferencia) {
		super(nome, idade, dataNas, codigoConta, saldoConta);
		this.CPF = CPF;
		this.RG = RG;
		this.tipoPreferencia = tipoPreferencia;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getRG() {
		return RG;
	}

	public void setRG(String rG) {
		RG = rG;
	}

	public String getTipoPreferencia() {
		return tipoPreferencia;
	}

	public void setTipoPreferencia(String tipoPreferencia) {
		this.tipoPreferencia = tipoPreferencia;
	}
	
	@Override
	public void deposito(double qtdDinheiro) {
		setSaldoConta((getSaldoConta() + qtdDinheiro) - taxaDeposito);
	}
	
	
	@Override
	public void saque(double qtdDinheiro) {
		if(qtdDinheiro < getSaldoConta()) {
			setSaldoConta((getSaldoConta() - qtdDinheiro) * taxaSaque);
		}
	}
	
	

}
