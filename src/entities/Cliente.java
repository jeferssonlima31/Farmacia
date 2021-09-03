package entities;

public class Cliente {

	protected String cpf;

	public Cliente() {
		super();
	}

	public Cliente(String cpf) {
		super();
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "" + getCpf();
	}

}
