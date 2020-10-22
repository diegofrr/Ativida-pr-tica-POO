package classes;

public class Vendedor extends Empregado {
	
	private double valorVendas;
	private double comissao;

	public Vendedor(String _nome, String _endereco, String _telefone, double _salario, double _valorVendas, double _comissao) {
		super(_nome, _endereco, _telefone, _salario);
		this.valorVendas = _valorVendas;
		this.comissao = _comissao;

	}
	
	public Vendedor() {
		this.valorVendas = 0;
		this.comissao = 0;
	}

	public double getValorVendas() {
		return valorVendas;
	}
	
	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}
	
	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	public double calcularSalario() {
		return getSalario()+getComissao();
	}
	
	public String toString() {
		return "Nome: "+getNome() + "\n" +
				"Nome: "+getEndereco() + "\n" +
				"Telefone: "+getTelefone() + "\n" +
				"Comissão: R$ "+getComissao() + "\n" +
				"Vendas: R$ "+getValorVendas() + "\n" +
				"Salário: R$ "+calcularSalario();
	}

	
}
