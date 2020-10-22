package application;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Sistema sistema = new Sistema();
		Menus menu = new Menus();

		while (true) {
			String opcao = menu.menuPrincipal();

			if (opcao.equals("1")) {
				sistema.novoEmpregado();

			} else if (opcao.equals("2")) {
				sistema.novoAdministrador();

			} else if (opcao.equals("3")) {
				sistema.novoFornecedor();

			} else if (opcao.equals("4")) {
				sistema.novoVendedor();

			} else if (opcao.equals("5")) {

				while (true) {

					String op = menu.menuListas();

					if (op.equals("1")) {
						JOptionPane.showMessageDialog(null, sistema.listarEmpregados());
						
					} else if (op.equals("2")) {
						JOptionPane.showMessageDialog(null, sistema.listarAdministradores());
					
					} else if (op.equals("3")) {
						JOptionPane.showMessageDialog(null, sistema.listarFornecedores());
						
					} else if (op.equals("4")) {
						JOptionPane.showMessageDialog(null, sistema.listarVendedores());
						
					} else if (op.equals("5")) {
						break;

					} else {
						JOptionPane.showMessageDialog(null, "POR FAVOR, DIGITE UMA OPÇÃO VÁLIDA!");

					}
				}

			} else if (opcao.equals("6")) {
				break;

			} else {
				JOptionPane.showMessageDialog(null, "POR FAVOR, DIGITE UMA OPÇÃO VÁLIDA!");
			}

		}

	}

}
