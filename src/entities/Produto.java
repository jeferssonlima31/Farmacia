package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Produto {
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	protected String descricao;
	protected Double preco;
	protected Integer estoque;
	protected Date validade;
	protected Fornecedor fornecedor;

	public Produto() {
		super();
	}

	public Produto(String descricao, Double preco, Integer estoque, Date validade, Fornecedor fornecedor) {
		super();
		this.descricao = descricao;
		this.preco = preco;
		this.estoque = estoque;
		this.validade = validade;
		this.fornecedor = fornecedor;

	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getEstoque() {
		return estoque;
	}

	public void setEstoque(Integer estoque) {
		this.estoque = estoque;
	}

	public Date getValidade() {
		return validade;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public abstract double desconto();

	@Override
	public String toString() {
		return "Descrição: " + getDescricao() + " Preço: " + getPreco() + " Estoque: " + getEstoque() + " Validade: "
				+ getValidade()  + " Fornecedor:" + getFornecedor().getNome();
	}

}
