package util;

import util.Colors;

public class Strings {
	public static final String COLOR_BLACK = "Preto";
	public static final String COLOR_DARK_BLUE = "Azul Escuro";
	public static final String COLOR_DARK_GREEN = "Verde Escuro";
	public static final String COLOR_DARK_AQUA = "Ciano Escuro";
	public static final String COLOR_DARK_RED = "Vermelho Escuro";
	public static final String COLOR_DARK_PURPLE = "Roxo Escuro";
	public static final String COLOR_GOLD = "Dourado";
	public static final String COLOR_GRAY = "Cinza";
	public static final String COLOR_DARK_GRAY = "Cinza Escuro";
	public static final String COLOR_BLUE = "Azul";
	public static final String COLOR_GREEN = "Verde";
	public static final String COLOR_AQUA = "Ciano";
	public static final String COLOR_RED = "Vermelho";
	public static final String COLOR_LIGHT_PURPLE = "Roxo Claro";
	public static final String COLOR_YELLOW = "Amarelo";
	public static final String COLOR_WHITE = "Branco";
	public static final String COLOR_BOLD = "Negrito";
	public static final String COLOR_ITALIC = "Itálico";
	public static final String COLOR_UNDERLINED = "Sublinhado";
	public static final String COLOR_RESET = "Restaurando todas a cores para o padrão de fábrica.";
	public static final String COLOR_MENU = "Parabéns! Você descobriu como alterar seu layout!";
	public static final String COLOR_OPTIONS = "Escolha uma as opções abaixo:\n"
	+ Colors.TEXT_BLACK + "0 - Preto\n"
	+ Colors.TEXT_BLUE + "1 - Azul Escuro\n"
	+ Colors.TEXT_GREEN + "2 - Verde Escuro\n"
	+ Colors.TEXT_CYAN + "3 - Ciano Escuro\n"
	+ Colors.TEXT_RED + "4 - Vermelho Escuro\n"
	+ Colors.TEXT_PURPLE + "5 - Roxo Escuro\n"
	+ Colors.TEXT_YELLOW + "6 - Dourado\n"
	+ Colors.TEXT_WHITE + "7 - Cinza\n"
	+ Colors.TEXT_BLACK_BRIGHT + "8 - Cinza Escuro\n"
	+ Colors.TEXT_BLUE_BRIGHT + "9 - Azul\n"
	+ Colors.TEXT_GREEN_BRIGHT + "a - Verde\n"
	+ Colors.TEXT_CYAN_BRIGHT + "b - Ciano\n"
	+ Colors.TEXT_RED_BRIGHT + "c - Vermelho\n"
	+ Colors.TEXT_PURPLE_BRIGHT + "d - Roxo Claro\n"
	+ Colors.TEXT_YELLOW_BRIGHT + "e - Amarelo\n"
	+ Colors.TEXT_WHITE_BRIGHT + "f - Branco\n"
	+ Colors.TEXT_BOLD + "l - Negrito\n"
	+ Colors.TEXT_RESET + Colors.TEXT_UNDERLINED + "n - Sublinhado\n"
	+ Colors.TEXT_RESET + Colors.TEXT_ITALIC + "o - Itálico\n"
	+ Colors.TEXT_RESET + Colors.TEXT_RESET + "r - Restaurar padrão";
	public static final String COLOR_CHANGED = "Alterando cor do layout para ";
	public static final String EFFECT_CHANGED = "Adicionando efeito ";
	
	public static final String ABOUT_CREATOR = Colors.TEXT_YELLOW
			+ "╔════════════════════════════════════════════════╗\n"
			+ "║   Projeto desenvolvido por João V. P. Sabino   ║\n"
			+ "║------------------------------------------------║\n"
			+ "║E-Mail: joaovictorpuglessabino@gmail.com        ║\n"
			+ "║GitHub: github.com/Joao-VPS                     ║\n"
			+ "╚════════════════════════════════════════════════╝";
	
	public static final String MENU_OPTIONS = Colors.getColorTheme()
			+ "Escolha uma opção abaixo:\n"
			+ "╔════════════════════════════════════════════════╗\n"
			+ "║1 - Ver todos os produtos                       ║\n"
			+ "║2 - Ver todas as categorias                     ║\n"
			+ "║3 - Procurar produto por nome ou código         ║\n"
			+ "║4 - Adicionar produto ao carrinho               ║\n"
			+ "║5 - Ver carrinho                                ║\n"
			+ "║6 - Remover produto do carrinho                 ║\n"
			+ "║7 - Finalizar compra                            ║\n"
			+ "║8 - alterar esquema de cores                    ║\n"
			+ "║9 - acessar conta administrativa                ║\n"
			+ "║0 - sair do aplicativo                          ║\n"
			+ "╚════════════════════════════════════════════════╝";
	
	public static final String SHOW_PRODUCS = "Exibindo todos os produtos disponíveis";
	public static final String SHOW_CATEGORIES = "Exibindo produtos por categorias";
	public static final String PRODUCT_SEARCH = "Digite o nome ou código do produto";
	
	public static final String ADMIN_OPTIONS = Colors.getColorTheme()
			+ "MENU ADMINISTRATIVO. Escolha uma opção:\n"
			+ "╔════════════════════════════════════════════════╗\n"
			+ "║1 - ver todos os produtos                       ║\n"
			+ "║2 - procurar produto por nome ou código         ║\n"
			+ "║3 - cadastrar novo produto                      ║\n"
			+ "║4 - remover produto                             ║\n"
			+ "║5 - atualizar dados do produto                  ║\n"
			+ "║6 - alterar quantidade em estoque               ║\n"
			+ "║0 - sair da conta administrativa                ║\n"
			+ "╚════════════════════════════════════════════════╝";
	
	public static final String PRODUCT_NEW = "Registrando novo produto.";
	public static final String PRODUCT_PARAMS = "Digite o <nome>, <quantidade em estoque>, <código>, <preço>, <categoria> e <descrição> separados por vírgula.";
	public static final String PRODUCT_REMOVE = "Remover produto. Digite o código: ";
	public static final String STOCK_UPDATE = "Alterar quantidade do item no estoque. Digite o código do produto: ";
	public static final String ADMIN_EXIT = "Saindo da conta administrativa";
	public static final String PRODUCT_UPDATE = "Escolha uma opção:\n"
			+ "╔════════════════════════════════════════════════╗\n"
			+ "║1 - atualizar nome                              ║\n"
			+ "║2 - atualizar código                            ║\n"
			+ "║3 - alterar preço                               ║\n"
			+ "║4 - alterar categoria                           ║\n"
			+ "║5 - mudar descrição                             ║\n"
			+ "║6 - todas as informações                        ║\n"
			+ "║0 - cancelar                                    ║\n"
			+ "╚════════════════════════════════════════════════╝";
	
	public static final String WELCOME = "Bem-vindo à nossa loja! Selecione uma das opções abaixo para continuar:";
	public static final String GOODBYE = "Obrigado por usar nossos serviços! Volte sempre!";
	public static final String INVALID_OPTION = "Opção inválida! Escolha um valor diferente!";
	public static final String PRESS_ENTER = "Pressione a tecla [ENTER] para continuar...";
	
	public static final String USER_REGISTER_USERNAME = "Digite um nome para se registrar: ";
	public static final String USER_REGISTER_PASSWORD = "Registre uma nova senha: ";
	public static final String USER_ALREADY_CREATED = "Este usuário já existe!";
	public static final String USER_CREATED = "Usuário %s criado com sucesso!\n";
	
	// Classe User
	public static final String USER_UPDATED_NAME = "Nome de usuário atualizado para %s\n";
	public static final String USER_UPDATED_PASSWORD = "Sua senha foi alterada com sucesso!";
	
	// Class Stock
	public static final String PRODUCT_DETAILS = "Exibindo detalhes do produto\n"
			+ "--------------------\n"
			+ "Nome: %s\n"
			+ "Quantidade: %d\n"
			+ "Código: %d\n"
			+ "Valor R$%.2f\n"
			+ "Categoria: %s\n"
			+ "Descrição: %s\n";
	public static final String PRODUCT_NOT_FOUND = "O produto %s não foi encontrado!\n";
	public static final String PRODUCT_UPDATED = "O produto de código %d foi atualizado com sucesso!\n";
	public static final String PRODUCT_REMOVED = "O produto %s foi removido com sucesso!\n";
	public static final String PRODUCT_SET_QUANTITY = "Digite a quantidade desejada: ";
	public static final String STOCK_OUT = "Nosso estoque esgotou! Temos apenas %d produtos disponíveis.\n";
	public static final String STOCK_NO_PRODUCTS = "Nenhum produto foi registrado ainda. Registre um novo!";
	public static final String STOCK_NEW_PRODUCT = "O produto %s foi registrado com o código %d\n";
	public static final String EMPTY_CART = "Seu carrinho já está vazio!";
	public static final String CART_SELECT_INDEX = "Indique o número do ítem no carrinho!";
	public static final String CART_ITEM_ADD = "Foram adicionados %s %s ao seu carrinho.";
	
	public static final String USER_PASSWORD_ERROR = "Senha incorreta. Você tem mais %d tentativas restantes...\n";
}
