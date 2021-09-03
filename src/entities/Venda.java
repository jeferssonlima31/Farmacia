package entities;

public class Venda {

	protected Cliente cliente;
	protected Produto produto;
	protected Integer quantidade;

	Medicamento medicamento;
	Cosmetico cosmetico;

	public Venda() {
		super();

	}

	public Venda(Cliente cliente, Produto produto, Integer quantidade) {
		super();
		this.cliente = cliente;
		this.produto = produto;
		this.quantidade = quantidade;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public double validarEstoque() {
		if (getQuantidade() > produto.getEstoque()) {

			System.out.println("Quantidade digitada maior que o estoque");
		} else {

			return produto.getEstoque();
		}
		return 0;
	}

	public double total() {

		return produto.desconto() * getQuantidade();

	}

	@Override
	public String toString() {

		return "Cliente: " + getCliente() + " \n" + "Produto: " + getProduto().getDescricao() + ", Quantidade: "
				+ getQuantidade() + ", valor do produto com descontos:" + String.format("%.2f", produto.desconto())
				+ ", Valor total: " + String.format("%.2f", total());
	}

}