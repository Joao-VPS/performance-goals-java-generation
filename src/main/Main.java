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
				System.out.println(Strings.SEARCH_BY_NAME);
				stock.procurarPorNome(input.nextLine());
				break;
			case "4": // alterar esquema de cores
				System.out.println("AINDA NÃO IMPLEMENTADO");
				break;
				/*while (true) {
					System.out.println(Strings.COLOR_OPTIONS);
					if (Colors.setColorTheme(input.nextLine()))
						break;
					else System.out.println(Strings.INVALID_OPTION);
				}
				break;*/
			case "5": // solicita entrada no sistema administrativo
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
				System.out.println(Strings.SEARCH_BY_NAME);
				stock.procurarPorNome(input.nextLine());
				break;
			case "3": // cadastrar novo produto
				System.out.println(Strings.PRODUCT_NEW);
				System.out.println(Strings.PRODUCT_PARAMS);
				String[] newData = input.nextLine().split(", ");
				String name;
				int id;
				float value;
				String category;
				String description;
					
				try {
					name = newData[0];
					id = Integer.parseInt(newData[1]);
					value = Float.parseFloat(newData[2].replace(',', '.'));
					category = newData[3];
					description = newData[4];
					
					stock.cadastrarProduto(new Product(name, id, value, category, description));
				} catch (Exception e) {
					System.out.println(Strings.INVALID_OPTION);
					System.out.println(Strings.PRODUCT_PARAMS);
				}
				break;
			case "4": // remover produto
				System.out.println(Strings.PRODUCT_REMOVE);
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
