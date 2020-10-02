import java.util.ArrayList;

public class Banco {

	Agencia agencia;
	ArrayList<Agencia> listaAgencias = new ArrayList();

	public String listarAgencias() {
		String listaDeAgencias = "";
		for (Agencia agencias : listaAgencias) {
			listaDeAgencias += agencias.toString() + "\n\n";
		}
		return listaDeAgencias;
	}

	public boolean procurarAgencia(int numero) {
		for (Agencia agencias : listaAgencias) {
			if (agencias.numeroAgencia() == numero) {
				return true;

			}
		}return false;
	}
	
	public void novaAgencia(int numero) {
		Agencia novaAgencia = new Agencia(numero);
		listaAgencias.add(novaAgencia);
	}

}
