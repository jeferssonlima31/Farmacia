package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;
import entities.Cosmetico;
import entities.Fornecedor;
import entities.Medicamento;
import entities.Produto;
import entities.Venda;

public class Main {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		List<Produto> listProduto = new ArrayList<>();
		List<Venda> listVenda = new ArrayList<>();

		Fornecedor fornecedor = new Fornecedor();
		Cliente cliente = new Cliente();
		Produto produto;

		System.out.print("ENTRE COM A QUANTIDADE DE PRODUTOS A SEREM CADASTRADO: ");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {

			System.out.print("Descrição: ");
			String descricao = sc.nextLine();

			System.out.print("Preço: ");
			double preco = sc.nextDouble();

			System.out.print("Estoque: ");
			int estoque = sc.nextInt();

			System.out.print("Validade (DD/MM/YYYY): ");
			Date validade = sdf.parse(sc.next());

			System.out.print("MEDICAMENTO(0) ou COSMETICO(1): ");
			int tipoProduto = sc.nextInt();

			System.out.print("Fornecedor: ");
			sc.nextLine();
			String f = sc.nextLine();
			fornecedor.setNome(f);
			fornecedor.getNome();

			if (tipoProduto == 0) {

				listProduto.add(new Medicamento(descricao, preco, estoque, validade, fornecedor));

			}
			if (tipoProduto == 1) {

				listProduto.add(new Cosmetico(descricao, preco, estoque, validade, fornecedor));

			}
			System.out.println("-------------------------------------------");
		}

		System.out.print("Qual produto você deseja: ");
		String nomeProduto = sc.nextLine();

		System.out.print("Qual a quantidade: ");
		int quantidade = sc.nextInt();
		
		System.out.print("CPF: ");
		sc.nextLine();
		long cpf = sc.nextLong();
		String c = String.valueOf(cpf);
		cliente.setCpf(c);

		for (int i = 0; i < listProduto.size(); i++) {
			if (listProduto.get(i).getDescricao().equals(nomeProduto)) {
				produto = listProduto.get(i);
				
				listVenda.add(new Venda(cliente, produto, quantidade));

				break;

			}

		}
		System.out.println("-------------------------------------------");

		System.out.println("SUA COMPRA:");
		for (Venda v : listVenda) {
			System.out.println(v);
		}

		sc.close();

	}

}
