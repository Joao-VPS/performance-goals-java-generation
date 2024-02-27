package main;

import java.util.Scanner;

import controller.StockController;
import model.Product;
import util.Colors;
import util.Strings;

public class Main {
	static Scanner input = new Scanner(System.in);
	static StockController stock = new StockController();
	
	public static void main(String[] args) {
		stock.cadastrarProduto(new Product("Teste", 10, 40028922, 5.5f, "desenvolvedor", "produto abstrato para testar a aplicação"));
		System.out.println(Strings.WELCOME);
		while (true) {
			menuOption();
		}
	}

	public static void menuOption() {
		while (true) {
			System.out.println(Colors.getColorTheme() + Strings.MENU_OPTIONS);
			var option = input.nextLine();
			
			switch (option) {
			case "1": // listar produtos disponíveis
				System.out.println(Strings.SHOW_PRODUCS);
				stock.listarTodos();
				break;
			case "2": // listar categorias
				System.out.println(Strings.SHOW_CATEGORIES);
				System.out.println("AINDA NÃO IMPLEMENTADO");
				break;
			case "3": // buscar por nome
				System.out.println(Strings.PRODUCT_SEARCH);
				stock.procurarProduto(input.nextLine());
				break;
			case "4": // adicionar produto no carrinho
				try {
					System.out.println(Strings.PRODUCT_SEARCH);
					var product = input.nextLine();
					
					System.out.println(Strings.PRODUCT_SET_QUANTITY);
					var quantity = input.nextInt();
					input.nextLine();
					
					stock.adicionarAoCarrinho(product, quantity);
				} catch (Exception e) {
					System.out.println(Strings.INVALID_OPTION);
				}
				break;
			case "5": // ver carrinho
				stock.verCarrinho();
				break;
			case "6": // remover produto do carrinho
				stock.verCarrinho();
				
				try {
					System.out.println(Strings.PRODUCT_SEARCH);
					stock.removerDoCarrinho(input.nextInt());
				} catch (Exception e) {
					System.out.println(Strings.INVALID_OPTION);
				}
				break;
			case "7": // finalizar compra
				stock.finalizarCompra();
				break;
			case "8": // alterar esquema de cores
				System.out.println("AINDA NÃO IMPLEMENTADO");
				break;
				/*while (true) {
					System.out.println(Strings.COLOR_OPTIONS);
					if (Colors.setColorTheme(input.nextLine()))
						break;
					else System.out.println(Strings.INVALID_OPTION);
				}
				break;*/
			case "9": // solicita entrada no sistema administrativo
				adminOptions();
				break;
			case "0": // Finalizar aplicativo
				shutdown();
				break;
			default:
				System.out.println(Strings.INVALID_OPTION);
			}
			
			System.out.println(Strings.PRESS_ENTER);
			input.nextLine();
		}
	}

	public static void adminOptions() {
		while (true) {
			System.out.println(Colors.getColorTheme() + Strings.ADMIN_OPTIONS);
			var option = input.nextLine();

			switch (option) {
			case "1": // listar todos os produtos
				System.out.println(Strings.SHOW_PRODUCS);
				stock.listarTodos();
				break;
			case "2": // procurar produto
				System.out.println(Strings.PRODUCT_SEARCH);
				stock.procurarProduto(input.nextLine());
				break;
			case "3": // cadastrar novo produto
				System.out.println(Strings.PRODUCT_NEW);
				System.out.println(Strings.PRODUCT_PARAMS);
				String[] newData = input.nextLine().split(", ");

				String name;
				int quantity;
				int id;
				float value;
				String category;
				String description;
					
				try {
					name = newData[0];
					quantity = Integer.parseInt(newData[1]);
					id = Integer.parseInt(newData[2]);
					value = Float.parseFloat(newData[3].replace(',', '.'));
					category = newData[4];
					description = newData[5];
					
					stock.cadastrarProduto(new Product(name, quantity, id, value, category, description));
				} catch (Exception e) {
					System.out.println(Strings.INVALID_OPTION);
					System.out.println(Strings.PRODUCT_PARAMS);
				}
				break;
			case "4": // remover produto
				System.out.println(Strings.PRODUCT_REMOVE);
				try {
					stock.deletarProduto(input.nextInt());
					input.nextLine();
				} catch (Exception e) {System.out.println(Strings.INVALID_OPTION);}
				break;
			case "5": // atualizar dados do produto
				System.out.println(Strings.PRODUCT_UPDATE);
				break;
			case "6": // abastecer
				System.out.println(Strings.STOCK_UPDATE);
				break;
			case "0": // sair da conta administrativa
				System.out.println(Strings.ADMIN_EXIT);
				return;
			default:
				System.out.println(Strings.INVALID_OPTION);
			}
			
			System.out.println(Strings.PRESS_ENTER);
			input.nextLine();
		}
	}

	public static void shutdown() {
		System.out.println(Strings.GOODBYE);
		System.out.println();
		System.out.println(Strings.ABOUT_CREATOR);
		System.exit(0);
	}
}
