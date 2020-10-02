import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		Banco sistemaBanco = new Banco();

		while (true) {
			if (sistemaBanco.listaAgencias.size() == 0) {
				JOptionPane.showMessageDialog(null, "Nenhuma agência cadastrada! Cadastre uma agora mesmo");
				int numeroAgencia = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da agência"));
				Agencia n_agencia = new Agencia(numeroAgencia);
				sistemaBanco.listaAgencias.add(n_agencia);
				JOptionPane.showMessageDialog(null, "Agência cadastrada com sucesso!");

			}

			int opcao = Integer.parseInt(JOptionPane.showInputDialog(
					"MENU PRINCIPAL\n" + "1. CRIAR CONTA NUMA AGÊNCIA\n" + "2. LISTAR CONTAS\n" + "3. LISTAR AGÊNCIAS\n"
							+ "4. DEPOSITAR\n" + "5. SACAR\n" + "6. EXCLUIR CONTA\n" + "7. CRIAR NOVA AGÊNCIA\n" + "8. SAIR"));

			if (opcao == 1) {

				int numeroAgencia = Integer.parseInt(JOptionPane.showInputDialog("DIGITE O NÚMERO DA AGÊNCIA"));
				for (Agencia agencia : sistemaBanco.listaAgencias) {
					if (agencia.numeroAgencia() == numeroAgencia) {
						boolean criou = agencia.novaConta(agencia);
						if (criou) {
							JOptionPane.showMessageDialog(null, "CONTA CRIADA!");
						}

					} else {
						JOptionPane.showMessageDialog(null, "AGÊNCIA NÃO EXISTE! TENTE NOVAMENTE");
					}

				}

			}

			else if (opcao == 2) {

				int numeroAgencia = Integer.parseInt(JOptionPane.showInputDialog("NÚMERO DA AGÊNCIA A LISTAR CONTAS"));
				for (Agencia agencia : sistemaBanco.listaAgencias) {
					if (agencia.numeroAgencia() == numeroAgencia) {

						JOptionPane.showMessageDialog(null, agencia.listarContas());

					} else {
						JOptionPane.showMessageDialog(null, "AGÊNCIA NÃO EXISTE! TENTE NOVAMENTE");
					}

				}

			} else if (opcao == 3) {
				JOptionPane.showMessageDialog(null, sistemaBanco.listarAgencias());

			} else if (opcao == 4) {

				int numeroAgencia = Integer.parseInt(JOptionPane.showInputDialog("NÚMERO DA AGÊNCIA A LISTAR CONTAS"));
				for (Agencia agencia : sistemaBanco.listaAgencias) {
					if (agencia.numeroAgencia() == numeroAgencia) {

						int numeroConta = Integer.parseInt(JOptionPane.showInputDialog("NÚMERO DA CONTA"));
						boolean contaEncontrada = agencia.procurarConta(numeroConta);
						Conta contaDepositar = agencia.pegarConta(numeroConta);
						if (contaEncontrada) {
							Double valorDepositar = Double
									.parseDouble(JOptionPane.showInputDialog("VALOR A DEPOSITAR"));
							contaDepositar.depositar(valorDepositar);
							JOptionPane.showMessageDialog(null, "VALOR DEPOSITADO COM SUCESSO");

						} else {
							JOptionPane.showInputDialog("CONTA NÃO ENCONTRADA. TENTE NOVAMENTE");
						}

					} else {
						JOptionPane.showMessageDialog(null, "AGÊNCIA NÃO EXISTE! TENTE NOVAMENTE");
					}

				}

			}
			
			else if (opcao == 5) {

				int numeroAgencia = Integer.parseInt(JOptionPane.showInputDialog("NÚMERO DA AGÊNCIA A LISTAR CONTAS"));
				for (Agencia agencia : sistemaBanco.listaAgencias) {
					if (agencia.numeroAgencia() == numeroAgencia) {

						int numeroConta = Integer.parseInt(JOptionPane.showInputDialog("NÚMERO DA CONTA"));
						boolean contaEncontrada = agencia.procurarConta(numeroConta);
						Conta contaSacar = agencia.pegarConta(numeroConta);
						if (contaEncontrada) {
							Double valorSacar = Double.parseDouble(JOptionPane.showInputDialog("VALOR A SACAR"));
							boolean saque = contaSacar.sacar(valorSacar);
							if(saque) {
								JOptionPane.showInputDialog("SAQUE FEITO COM SUCESSO! SEU NOVO SALDO É: R$"+contaSacar.saldo());
							}else {
								JOptionPane.showInputDialog("SEU SALDO É MENOR QUE O VALOR DO SAQUE!");
							}

						} else {
							JOptionPane.showInputDialog("CONTA NÃO ENCONTRADA. TENTE NOVAMENTE");
						}

					} else {
						JOptionPane.showMessageDialog(null, "AGÊNCIA NÃO EXISTE! TENTE NOVAMENTE");
					}

				}

			}else if(opcao == 8) {
				
				int numeroAgencia = Integer.parseInt(JOptionPane.showInputDialog("NÚMERO DA AGÊNCIA A LISTAR CONTAS"));
				for (Agencia agencia : sistemaBanco.listaAgencias) {
					if (agencia.numeroAgencia() == numeroAgencia) {

						int numeroConta = Integer.parseInt(JOptionPane.showInputDialog("NÚMERO DA CONTA"));
						boolean contaEncontrada = agencia.procurarConta(numeroConta);
						Conta contaExcluir = agencia.pegarConta(numeroConta);
						if (contaEncontrada) {
							agencia.excluirConta(numeroConta);
							JOptionPane.showMessageDialog(null, "CONTA EXLCUIDA COM SUCESSO!");
						
						

						} else {
							JOptionPane.showInputDialog("CONTA NÃO ENCONTRADA. TENTE NOVAMENTE");
						}

					} else {
						JOptionPane.showMessageDialog(null, "AGÊNCIA NÃO EXISTE! TENTE NOVAMENTE");
					}

				}
				
				
			}else if(opcao == 7) {
				int numeroAgencia = Integer.parseInt(JOptionPane.showInputDialog("NÚMERO DA NOVA AGÊNCIA"));
				boolean existe = sistemaBanco.procurarAgencia(numeroAgencia);
				if(!existe) {
					sistemaBanco.novaAgencia(numeroAgencia);
					JOptionPane.showMessageDialog(null, "A AGENCIA "+numeroAgencia+" FOI CRIADA COM SUCESSO!");
					
				}else {
					JOptionPane.showMessageDialog(null, "ESSA AGÊNCIA JÁ EXISTE! TENTE UM OUTRO NÚMERO");
				}
				
			}
			
			
			
			else if(opcao == 8) {
				break;
			}
			
			
			
			
			

		}
	}

}
