package classes;

public class Administrador extends Empregado{
	
	private double ajudaDeCusto;

	public Administrador(String _nome, String _endereco, String _telefone, double _salario, double _ajudaDeCusto) {
		super(_nome, _endereco, _telefone, _salario);
		this.ajudaDeCusto = _ajudaDeCusto;
		
	}

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(Double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	public double calcularSalario() {
		return getAjudaDeCusto()+getSalario();
	}
	
	public String toString() {
		return "Nome: "+getNome() + "\n" +
				"Nome: "+getEndereco() + "\n" +
				"Telefone: "+getTelefone() + "\n" +
				"Salário: R$ "+calcularSalario();
	}
	
	
}
