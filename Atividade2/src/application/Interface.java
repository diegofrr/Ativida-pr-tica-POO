package application;

import javax.swing.JOptionPane;

public class Interface {

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
						String listaEmpregados = sistema.listarEmpregados();
						if(!listaEmpregados.equals("")) {
							JOptionPane.showMessageDialog(null, listaEmpregados);
						}else {
							JOptionPane.showMessageDialog(null, "NENHUM EMPREGADO CADASTRADO!");
						}
						

					} else if (op.equals("2")) {
						String listaAdministradores = sistema.listarAdministradores();
						if(!listaAdministradores.equals("")) {
							JOptionPane.showMessageDialog(null, listaAdministradores);
						}else {
							JOptionPane.showMessageDialog(null, "NENHUM ADMINISTRADOR CADASTRADO!");
						}
						

					} else if (op.equals("3")) {
						String listaFornecedores = sistema.listarFornecedores();
						if(!listaFornecedores.equals("")) {
							JOptionPane.showMessageDialog(null, listaFornecedores);
						}else {
							JOptionPane.showMessageDialog(null, "NENHUM FORNECEDOR CADASTRADO!");
						}
						
						

					} else if (op.equals("4")) {
						String listaVendedores = sistema.listarVendedores();
						
						if(!listaVendedores.equals("")) {
							JOptionPane.showMessageDialog(null, listaVendedores);
						}else {
							JOptionPane.showMessageDialog(null, "NENHUM VENDEDOR CADASTRADO!");
						}
						

					} else if (op.equals("5")) {
						break;

					} else {
						JOptionPane.showMessageDialog(null, "POR FAVOR, DIGITE UMA OPÇÃO VÁLIDA!");

					}
				}

			} else if (opcao.equals("7")) {
				break;

			} else {
				JOptionPane.showMessageDialog(null, "POR FAVOR, DIGITE UMA OPÇÃO VÁLIDA!");
			}

		}

	}

}
