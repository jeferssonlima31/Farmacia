package entities;

import java.util.Date;

public class Medicamento extends Produto {

	public Medicamento() {
		super();
	}

	public Medicamento(String descricao, Double preco, Integer estoque, Date validade, Fornecedor fornecedor) {
		super(descricao, preco, estoque, validade, fornecedor);

	}

	@Override
	public double desconto() {

		double valorTotal = getPreco() - (0.10 * getPreco());
		return valorTotal;
	}

	

}