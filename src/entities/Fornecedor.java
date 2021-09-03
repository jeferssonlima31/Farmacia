package entities;

public class Fornecedor {
	protected String nome;
	protected Produto produto;

	public Fornecedor() {
		super();
	}

	public Fornecedor(String nome, Produto produto) {
		super();
		this.nome = nome;
		this.produto = produto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

}
