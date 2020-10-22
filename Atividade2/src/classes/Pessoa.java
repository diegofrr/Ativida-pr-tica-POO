package classes;

public class Pessoa {
	
	private String nome;
	private String endereco;
	private String telefone;
	
	public Pessoa(String _nome, String _endereco, String _telefone) {
		
		this.nome = _nome;
		this.endereco = _endereco;
		this.telefone = _telefone;
		
	}
	
	public Pessoa() {
		this.nome = "";
		this.endereco = "";
		this.telefone = "";
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String toString() {
		return "Nome: "+getNome() + "\n" +
				"Nome: "+getEndereco() + "\n" +
				"Telefone: "+getTelefone();
	}

}
