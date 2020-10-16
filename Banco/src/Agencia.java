import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

public class Agencia extends Banco {
	private int numeroAgencia;
	public ArrayList<Cliente> listaClientes = new ArrayList();
	public ArrayList<Conta> listaContas = new ArrayList();

	public Agencia(int n_numero) {
		numeroAgencia = n_numero;
	}

	public String novaConta(Agencia agencia) {
		String nome = JOptionPane.showInputDialog("NOME");
		String cpf = JOptionPane.showInputDialog("CPF");
		
		for(Cliente clientes : agencia.listaClientes) {
			if(clientes.pegarCPF().equals(cpf)) {
				return "JÁ EXISTE UMA CONTA COM ESTE CPF";
			}
		}
		
		String dataNascimento = JOptionPane.showInputDialog("DATA DE NASCIMENTO DD/MM/AAAA");
		String numeroConta = JOptionPane.showInputDialog("NÚMERO DA CONTA");

		for (Conta contas : agencia.listaContas) {
			if (contas.numeroConta().equals(numeroConta)) {
				return "JÁ EXISTE UMA CONTA COM ESTE NÚMERO!";
			}}
			Cliente titular = new Cliente(nome, cpf, dataNascimento, agencia);
			Conta n_conta = new Conta(titular, numeroConta, agencia, 0.0);
			listaContas.add(n_conta);
			listaClientes.add(titular);
			return "CONTA CRIADA COM SUCESSO!";


	}

	public int numeroAgencia() {
		return numeroAgencia;
	}

	public String toString() {
		return "Nº AG: " + numeroAgencia + "\n" + "QUANT. CLIENTES: " + listaClientes.size() + "\n" + "QUANT. CONTAS: "
				+ listaContas.size();
	}

	public boolean pesquisarClientePorNome(String nome) {
		for (Cliente clientes : listaClientes) {
			if (clientes.pegarNome().equals(nome)) {
				return true;
			}

		}
		return false;
	}

	public boolean pesquisarClientePorCPF(String cpf) {
		for (Cliente clientes : listaClientes) {
			if (clientes.pegarCPF().equals(cpf)) {
				return true;
			}

		}
		return false;
	}

	public Cliente pegarClienteNome(String nome) {
		for (Cliente clientes : listaClientes) {
			if (clientes.pegarNome().equals(nome)) {
				return clientes;
			}
		}
		return null;
	}

	public Cliente pegarClienteCpf(String cpf) {
		for (Cliente clientes : listaClientes) {
			if (clientes.pegarCPF().equals(cpf)) {
				return clientes;
			}
		}
		return null;
	}

	public String listarContas() {
		String lista = "";
		for (Conta contas : listaContas) {
			lista += contas.toString()+"\n\n";
		}
		return lista;
	}

	public boolean procurarConta(String numero) {
		for (Conta contas : listaContas) {
			if (contas.numeroConta().equals(numero)) {
				return true;
			}
		}
		return false;
	}

	public Conta pegarConta(String numero) {
		for (Conta contas : listaContas) {
			if (contas.numeroConta().equals(numero)) {
				return contas;
			}
		}
		return null;
	}

	public void excluirConta(String numero) {
		for (Conta contas : listaContas) {
			if (contas.numeroConta().equals(numero)) {
				listaContas.remove(contas);

			}
		}

	}

}
