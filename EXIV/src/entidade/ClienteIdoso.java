package entidade;

import java.util.Date;

public class ClienteIdoso extends Cliente {
	
	private String codigoPrefencial;

	public ClienteIdoso() {
		super();
	}

	public ClienteIdoso(String nome, Integer idade, Date dataNas, Integer codigoConta, Double saldoConta,
			String codigoPrefencial) {
		super(nome, idade, dataNas, codigoConta, saldoConta);
		this.codigoPrefencial = codigoPrefencial;
	}

	public String getCodigoPrefencial() {
		return codigoPrefencial;
	}

	public void setCodigoPrefencial(String codigoPrefencial) {
		this.codigoPrefencial = codigoPrefencial;
	}
	
	@Override
	
	public void deposito(double qtdDinheiro) {
		setSaldoConta(getSaldoConta() + qtdDinheiro);
	}
	
	public void saque(double qtdDinheiro) {
		setSaldoConta(getSaldoConta() - qtdDinheiro);
	}
	

}
