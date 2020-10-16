
public class Conta {

	public Cliente titular;
	private String numeroConta;
	privaate Double saldo;
	public Agencia agencia;
	
	public Conta(Cliente n_titular, String n_numero, Agencia n_agencia, Double n_saldo) {
		
		titular = n_titular;
		numeroConta = n_numero;
		agencia = n_agencia;
		saldo = n_saldo;
		
	}
	public Double saldo() {
		return saldo;
	}
	
	public void depositar(Double valor) {
		saldo += valor;
	}
	public boolean sacar(Double valor) {
		if(saldo>=valor) {
			saldo = saldo-valor;
			return true;
		}else {
			return false;
		}
	}
	
	public String numeroConta() {
		return numeroConta;
	}
	
	public int numeroAgencia() {
		return agencia.numeroAgencia();
	}
	public void mudarTitular(Cliente n_titular) {
		titular = n_titular;
	}
	public String toString() {
		return "Titular: "+titular.pegarNome()+"\n"
				+ "CPF: "+titular.pegarCPF()+"\n"
				+ "Número da conta: "+numeroConta+"\n"
				+ "Saldo: R$ "+saldo;	
	}
	
}
