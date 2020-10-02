import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		Banco sistemaBanco = new Banco();

		while (true) {
			if (sistemaBanco.listaAgencias.size() == 0) {
				JOptionPane.showMessageDialog(null, "Nenhuma ag�ncia cadastrada! Cadastre uma agora mesmo");
				int numeroAgencia = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero da ag�ncia"));
				Agencia n_agencia = new Agencia(numeroAgencia);
				sistemaBanco.listaAgencias.add(n_agencia);
				JOptionPane.showMessageDialog(null, "Ag�ncia cadastrada com sucesso!");

			}

			int opcao = Integer.parseInt(JOptionPane.showInputDialog(
					"MENU PRINCIPAL\n" + "1. CRIAR CONTA NUMA AG�NCIA\n" + "2. LISTAR CONTAS\n" + "3. LISTAR AG�NCIAS\n"
							+ "4. DEPOSITAR\n" + "5. SACAR\n" + "6. EXCLUIR CONTA\n" + "7. CRIAR NOVA AG�NCIA\n" + "8. SAIR"));

			if (opcao == 1) {

				int numeroAgencia = Integer.parseInt(JOptionPane.showInputDialog("DIGITE O N�MERO DA AG�NCIA"));
				for (Agencia agencia : sistemaBanco.listaAgencias) {
					if (agencia.numeroAgencia() == numeroAgencia) {
						boolean criou = agencia.novaConta(agencia);
						if (criou) {
							JOptionPane.showMessageDialog(null, "CONTA CRIADA!");
						}

					} else {
						JOptionPane.showMessageDialog(null, "AG�NCIA N�O EXISTE! TENTE NOVAMENTE");
					}

				}

			}

			else if (opcao == 2) {

				int numeroAgencia = Integer.parseInt(JOptionPane.showInputDialog("N�MERO DA AG�NCIA A LISTAR CONTAS"));
				for (Agencia agencia : sistemaBanco.listaAgencias) {
					if (agencia.numeroAgencia() == numeroAgencia) {

						JOptionPane.showMessageDialog(null, agencia.listarContas());

					} else {
						JOptionPane.showMessageDialog(null, "AG�NCIA N�O EXISTE! TENTE NOVAMENTE");
					}

				}

			} else if (opcao == 3) {
				JOptionPane.showMessageDialog(null, sistemaBanco.listarAgencias());

			} else if (opcao == 4) {

				int numeroAgencia = Integer.parseInt(JOptionPane.showInputDialog("N�MERO DA AG�NCIA A LISTAR CONTAS"));
				for (Agencia agencia : sistemaBanco.listaAgencias) {
					if (agencia.numeroAgencia() == numeroAgencia) {

						int numeroConta = Integer.parseInt(JOptionPane.showInputDialog("N�MERO DA CONTA"));
						boolean contaEncontrada = agencia.procurarConta(numeroConta);
						Conta contaDepositar = agencia.pegarConta(numeroConta);
						if (contaEncontrada) {
							Double valorDepositar = Double
									.parseDouble(JOptionPane.showInputDialog("VALOR A DEPOSITAR"));
							contaDepositar.depositar(valorDepositar);
							JOptionPane.showMessageDialog(null, "VALOR DEPOSITADO COM SUCESSO");

						} else {
							JOptionPane.showInputDialog("CONTA N�O ENCONTRADA. TENTE NOVAMENTE");
						}

					} else {
						JOptionPane.showMessageDialog(null, "AG�NCIA N�O EXISTE! TENTE NOVAMENTE");
					}

				}

			}
			
			else if (opcao == 5) {

				int numeroAgencia = Integer.parseInt(JOptionPane.showInputDialog("N�MERO DA AG�NCIA A LISTAR CONTAS"));
				for (Agencia agencia : sistemaBanco.listaAgencias) {
					if (agencia.numeroAgencia() == numeroAgencia) {

						int numeroConta = Integer.parseInt(JOptionPane.showInputDialog("N�MERO DA CONTA"));
						boolean contaEncontrada = agencia.procurarConta(numeroConta);
						Conta contaSacar = agencia.pegarConta(numeroConta);
						if (contaEncontrada) {
							Double valorSacar = Double.parseDouble(JOptionPane.showInputDialog("VALOR A SACAR"));
							boolean saque = contaSacar.sacar(valorSacar);
							if(saque) {
								JOptionPane.showInputDialog("SAQUE FEITO COM SUCESSO! SEU NOVO SALDO �: R$"+contaSacar.saldo());
							}else {
								JOptionPane.showInputDialog("SEU SALDO � MENOR QUE O VALOR DO SAQUE!");
							}

						} else {
							JOptionPane.showInputDialog("CONTA N�O ENCONTRADA. TENTE NOVAMENTE");
						}

					} else {
						JOptionPane.showMessageDialog(null, "AG�NCIA N�O EXISTE! TENTE NOVAMENTE");
					}

				}

			}else if(opcao == 8) {
				
				int numeroAgencia = Integer.parseInt(JOptionPane.showInputDialog("N�MERO DA AG�NCIA A LISTAR CONTAS"));
				for (Agencia agencia : sistemaBanco.listaAgencias) {
					if (agencia.numeroAgencia() == numeroAgencia) {

						int numeroConta = Integer.parseInt(JOptionPane.showInputDialog("N�MERO DA CONTA"));
						boolean contaEncontrada = agencia.procurarConta(numeroConta);
						Conta contaExcluir = agencia.pegarConta(numeroConta);
						if (contaEncontrada) {
							agencia.excluirConta(numeroConta);
							JOptionPane.showMessageDialog(null, "CONTA EXLCUIDA COM SUCESSO!");
						
						

						} else {
							JOptionPane.showInputDialog("CONTA N�O ENCONTRADA. TENTE NOVAMENTE");
						}

					} else {
						JOptionPane.showMessageDialog(null, "AG�NCIA N�O EXISTE! TENTE NOVAMENTE");
					}

				}
				
				
			}else if(opcao == 7) {
				int numeroAgencia = Integer.parseInt(JOptionPane.showInputDialog("N�MERO DA NOVA AG�NCIA"));
				boolean existe = sistemaBanco.procurarAgencia(numeroAgencia);
				if(!existe) {
					sistemaBanco.novaAgencia(numeroAgencia);
					JOptionPane.showMessageDialog(null, "A AGENCIA "+numeroAgencia+" FOI CRIADA COM SUCESSO!");
					
				}else {
					JOptionPane.showMessageDialog(null, "ESSA AG�NCIA J� EXISTE! TENTE UM OUTRO N�MERO");
				}
				
			}
			
			
			
			else if(opcao == 8) {
				break;
			}
			
			
			
			
			

		}
	}

}
