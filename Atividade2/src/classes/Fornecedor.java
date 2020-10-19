package classes;

public class Fornecedor extends Pessoa {
	
	private double valorCredito;
	private double valorDivida;
	
	public Fornecedor(String _nome, String _endereco, String _telefone, double _valorCredito, double _valorDivida) {
		super(_nome, _endereco, _telefone);
		this.valorCredito = _valorCredito;
		this.valorDivida = _valorDivida;
		
	}
	
	public double getValorCredito() {
		return valorCredito;
	}
	
	public void setValorCredito(Double valor) {
		valorCredito = valor;
	}
	
	public double getValorDivida() {
		return valorDivida;
	}
	
	public void setValorDivida(Double valor) {
		valorDivida = valor;
	}
	
	public double obterSaldo() {
		return getValorCredito()-getValorDivida();
	}
	
	public String toString() {
		return "Nome: "+getNome() + "\n" +
				"Nome: "+getEndereco() + "\n" +
				"Telefone: "+getTelefone() + "\n" +
				"Crédito: "+getValorCredito() + "\n" +
				"Dívida: "+getValorDivida();
	}
	
}
