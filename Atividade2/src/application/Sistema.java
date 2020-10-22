package application;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import classes.Pessoa;
import classes.Empregado;
import classes.Fornecedor;
import classes.Administrador;
import classes.Vendedor;

public class Sistema {
	
	private ArrayList<Empregado> listaEmpregados = new ArrayList<Empregado>();
	private ArrayList<Fornecedor> listaFornecedores = new ArrayList<Fornecedor>();
	private ArrayList<Administrador> listaAdministradores = new ArrayList<Administrador>();
	private ArrayList<Vendedor> listaVendedores = new ArrayList<Vendedor>();
	
	public Pessoa novaPessoa() {
		String nome = JOptionPane.showInputDialog("NOME");
		String endereco = JOptionPane.showInputDialog("ENDEREÇO");
		String telefone = JOptionPane.showInputDialog("TELEFONE");
		Pessoa _pessoa = new Pessoa(nome, endereco, telefone);
		return _pessoa;
	}
	
	public void novoEmpregado() {
		Pessoa _pessoa = novaPessoa();
		double salario = Double.parseDouble(JOptionPane.showInputDialog("SALÁRIO"));
		Empregado _empregado = new Empregado(_pessoa.getNome(), _pessoa.getEndereco(), _pessoa.getTelefone(), salario);
		listaEmpregados.add(_empregado);
	}
	
	public void novoFornecedor() {
		Pessoa _pessoa = novaPessoa();
		double credito = Double.parseDouble(JOptionPane.showInputDialog("VALOR CRÉDITO"));
		double divida = Double.parseDouble(JOptionPane.showInputDialog("VALOR DÍVIDA"));
		Fornecedor _fornecedor = new Fornecedor(_pessoa.getNome(), _pessoa.getEndereco(), _pessoa.getTelefone(), credito, divida);
		listaFornecedores.add(_fornecedor);	
	}
	
	public void novoVendedor() {
		Pessoa _pessoa = novaPessoa();
		double salario = Double.parseDouble(JOptionPane.showInputDialog("SALÁRIO"));
		double vendas = Double.parseDouble(JOptionPane.showInputDialog("VALOR VENDAS"));
		double comissao = Double.parseDouble(JOptionPane.showInputDialog("VALOR COMISSÃO"));
		Vendedor _vendedor = new Vendedor(_pessoa.getNome(), _pessoa.getEndereco(), _pessoa.getTelefone(), salario, vendas, comissao);
		listaVendedores.add(_vendedor);
	}
	
	public void novoAdministrador() {
		Pessoa _pessoa = novaPessoa();
		double salario = Double.parseDouble(JOptionPane.showInputDialog("SALÁRIO"));
		double ajudaDeCusto = Double.parseDouble(JOptionPane.showInputDialog("AJUDA DE CUSTO"));
		Administrador _administrador = new Administrador(_pessoa.getNome(), _pessoa.getEndereco(), _pessoa.getTelefone(), salario, ajudaDeCusto);
		listaAdministradores.add(_administrador);
	}
	
	public String listarEmpregados() {
		if(listaEmpregados.size() == 0) {
			return "NENHUM EMPREGADO CADASTRADO";
		}
		String listaStr = "";
		for (Empregado _empregado : listaEmpregados) {
			listaStr += _empregado.toString() + "\n\n";
		}
		return listaStr;
	}

	
	public String listarFornecedores() {
		if(listaFornecedores.size() == 0) {
			return "NENHUM FORNECEDOR CADASTRADO";
		}	
		String listaStr = "";
		for (Fornecedor _fornecedor : listaFornecedores) {
			listaStr += _fornecedor.toString() + "\n\n";
		}
		return listaStr;
	}
	
	
	public String listarAdministradores() {
		if(listaAdministradores.size() == 0) {
			return "NENHUM ADMINISTRADOR CADASTRADO";
		}
		String listaStr = "";
		for (Administrador _administrador : listaAdministradores) {
			listaStr += _administrador.toString() + "\n\n";
		}
		return listaStr;
	}
	
	
	public String listarVendedores() {
		if(listaVendedores.size() == 0) {
			return "NENHUM VENDEDOR CADASTRADO!";
		}
		String listaStr = "";
		for (Vendedor _vendedor : listaVendedores) {
			listaStr += _vendedor.toString() + "\n\n";
		}
		return listaStr;
	}
	
	public void limparDados() {
		listaEmpregados.clear();
		listaFornecedores.clear();
		listaAdministradores.clear();
		listaVendedores.clear();
	}

}
