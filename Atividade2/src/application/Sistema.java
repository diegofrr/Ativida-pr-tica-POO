package application;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import classes.Empregado;
import classes.Fornecedor;
import classes.Administrador;
import classes.Vendedor;

public class Sistema {
	
	private ArrayList<Empregado> listaEmpregados = new ArrayList();
	private ArrayList<Fornecedor> listaFornecedores = new ArrayList();
	private ArrayList<Administrador> listaAdministradores = new ArrayList();
	private ArrayList<Vendedor> listaVendedores = new ArrayList();
	
	
	public String listarEmpregados() {
		String listaStr = "";
		for (Empregado _empregado : listaEmpregados) {
			listaStr += _empregado.toString() + "\n\n";
		}
		return listaStr;
	}

	public String listarFornecedores() {
		String listaStr = "";
		for (Fornecedor _fornecedor : listaFornecedores) {
			listaStr += _fornecedor.toString() + "\n\n";
		}
		return listaStr;
	}
	
	public String listarAdministradores() {
		String listaStr = "";
		for (Administrador _administrador : listaAdministradores) {
			listaStr += _administrador.toString() + "\n\n";
		}
		return listaStr;
	}
	
	public String listarVendedores() {
		String listaStr = "";
		for (Vendedor _vendedor : listaVendedores) {
			listaStr += _vendedor.toString() + "\n\n";
		}
		return listaStr;
	}
	
	public void novoEmpregado() {
		String nome = JOptionPane.showInputDialog("NOME");
		String endereco = JOptionPane.showInputDialog("ENDEREÇO");
		String telefone = JOptionPane.showInputDialog("TELEFONE");
		double salario = Double.parseDouble(JOptionPane.showInputDialog("SALÁRIO"));
		Empregado _empregado = new Empregado(nome, telefone, endereco, salario);
		listaEmpregados.add(_empregado);
	}
	
	public void novoFornecedor() {
		String nome = JOptionPane.showInputDialog("NOME");
		String endereco = JOptionPane.showInputDialog("ENDEREÇO");
		String telefone = JOptionPane.showInputDialog("TELEFONE");
		double credito = Double.parseDouble(JOptionPane.showInputDialog("VALOR CRÉDITO"));
		double divida = Double.parseDouble(JOptionPane.showInputDialog("VALOR DÍVIDA"));
		Fornecedor _fornecedor = new Fornecedor(nome, telefone, endereco, credito, divida);
		listaFornecedores.add(_fornecedor);	
	}
	
	public void novoVendedor() {
		String nome = JOptionPane.showInputDialog("NOME");
		String endereco = JOptionPane.showInputDialog("ENDEREÇO");
		String telefone = JOptionPane.showInputDialog("TELEFONE");
		double salario = Double.parseDouble(JOptionPane.showInputDialog("SALÁRIO"));
		double vendas = Double.parseDouble(JOptionPane.showInputDialog("VALOR VENDAS"));
		double comissao = Double.parseDouble(JOptionPane.showInputDialog("VALOR COMISSÃO"));
		Vendedor _vendedor = new Vendedor(nome, telefone, endereco, salario, vendas, comissao);
		listaVendedores.add(_vendedor);
	}
	
	public void novoAdministrador() {
		String nome = JOptionPane.showInputDialog("NOME");
		String endereco = JOptionPane.showInputDialog("ENDEREÇO");
		String telefone = JOptionPane.showInputDialog("TELEFONE");
		double salario = Double.parseDouble(JOptionPane.showInputDialog("SALÁRIO"));
		double ajudaDeCusto = Double.parseDouble(JOptionPane.showInputDialog("AJUDA DE CUSTO"));
		Administrador _administrador = new Administrador(nome, endereco, telefone, salario, ajudaDeCusto);
		listaAdministradores.add(_administrador);
	}

}
