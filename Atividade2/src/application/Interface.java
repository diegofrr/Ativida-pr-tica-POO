package application;

import javax.swing.JOptionPane;

public class Interface {

	public static void main(String[] args) {
		Sistema sistema = new Sistema();

		while (true) {
			String opcao = JOptionPane.showInputDialog(
					"MENU \n" + 
					"1. NOVO EMPREGADO \n" + 
					"2. NOVO ADMINISTRADOR \n" + 
					"3. NOVO FORNECEDOR \n" + 
					"4. NOVO VENDEDOR \n" + 
					"5. LISTAR PESSOAS \n" + 
					"6. SAIR");

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

					String op = JOptionPane.showInputDialog(
							"1. LISTAR EMPREGADOS \n" + 
							"2. LISTAR ADMINISTRADOR \n" + 
							"3. LISTAR FORNECEDORES \n" + 
							"4. LISTAR VENDEDORES \n" + 
							"5. VOLTAR \n");

					if (op.equals("1")) {
						String listaEmpregados = sistema.listarEmpregados();
						JOptionPane.showMessageDialog(null, listaEmpregados);

					} else if (op.equals("2")) {
						String listaAdministradores = sistema.listarAdministradores();
						JOptionPane.showMessageDialog(null, listaAdministradores);

					} else if (op.equals("3")) {
						String listaFornecedores = sistema.listarFornecedores();
						JOptionPane.showMessageDialog(null, listaFornecedores);

					} else if (op.equals("4")) {
						String listaVendedores = sistema.listarVendedores();
						JOptionPane.showMessageDialog(null, listaVendedores);

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
