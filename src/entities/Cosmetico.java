package entities;

import java.util.Date;

public class Cosmetico extends Produto {

	public Cosmetico() {
		super();
	}

	public Cosmetico(String descricao, Double preco, Integer estoque, Date validade, Fornecedor fornecedor) {
		super(descricao, preco, estoque, validade, fornecedor);

	}

	@Override
	public double desconto() {
		double valorTotal = getPreco() - (0.20 * getPreco());
		return valorTotal;
	}

	

}
