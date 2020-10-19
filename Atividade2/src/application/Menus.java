package application;
import javax.swing.JOptionPane;

public class Menus {
	
	public String menuPrincipal() {
		String opcao = JOptionPane.showInputDialog(
				"MENU \n" + 
				"1. NOVO EMPREGADO \n" + 
				"2. NOVO ADMINISTRADOR \n" + 
				"3. NOVO FORNECEDOR \n" + 
				"4. NOVO VENDEDOR \n" + 
				"5. LISTAR PESSOAS \n" + 
				"6. SAIR");
	return opcao;
	
	}
	
	public String menuListas() {
		String opcao = JOptionPane.showInputDialog(
				"1. LISTAR EMPREGADOS \n" + 
				"2. LISTAR ADMINISTRADOR \n" + 
				"3. LISTAR FORNECEDORES \n" + 
				"4. LISTAR VENDEDORES \n" + 
				"5. VOLTAR \n");
		return opcao;
	}
	
	

}
