package classes;

public class Empregado extends Pessoa {
	
	private double salario;
	
	public Empregado(String _nome, String _endereco, String _telefone, double _salario) {
		super(_nome, _endereco, _telefone);
		this.salario = _salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	
	public String toString() {
		return "Nome: "+getNome() + "\n" +
				"Nome: "+getEndereco() + "\n" +
				"Telefone: "+getTelefone() + "\n" +
				"Salário: "+getSalario();
	}
	
}
