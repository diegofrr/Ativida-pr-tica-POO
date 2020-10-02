import java.util.Date;

import javax.swing.JOptionPane;

public class Cliente {
	
	String nome;
	String cpf;
	String nascimento;
	Conta conta;
	Agencia agencia;
	
	public Cliente(String n_nome, String n_cpf, String n_nasc, Agencia n_agencia) {
		nome = n_nome;
		cpf = n_cpf;
		nascimento = n_nasc;
		agencia = n_agencia;
		
	}
	
	public String pegarNome() {
		return nome;
	}
	public String pegarCPF() {
		return cpf;
	}
	public String pegarDataNascimento() {
		return nascimento;
	}
	public Conta pegarConta() {
		return conta;
	}
	public Agencia pegarAgencia() {
		return agencia;
	}
	public String toString() {
		return "Nome: "+pegarNome()+"\n"
				+ "CPF: "+pegarCPF()+"\n"
				+ "Data de nascimento: "+pegarDataNascimento()+"\n"
				+ "Número da agência: "+pegarAgencia().numeroAgencia();
				
	}
	
	
	
	public void editarInfoPessoais(Conta conta) {
		int opcao = Integer.parseInt(JOptionPane.showInputDialog("MENU: \n"
				+ "1. MUDAR NOME"
				+ "2. MUDAR DATA DE NASCIMENTO"));
		if(opcao==1) {
			String n_nome = JOptionPane.showInputDialog("DIGITE O NOVO NOME COMPLETO");
			
			
		}else if(opcao==2) {
			
		}
	}

}
