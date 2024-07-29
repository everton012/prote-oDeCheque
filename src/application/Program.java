package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int padrao = 9;
		StringBuilder ast = new StringBuilder();
		System.out.println("digite o valor do pagamento: ");
		
		String pay = scan.nextLine();
		
		if(pay.length() < padrao) {
			for(int i = 0; i < (padrao - pay.length()); i++){
				ast.append("*");
			}
			ast.append(pay);
			System.out.println(ast.toString());
		}
		else if(pay.length() == padrao) {
			System.out.println(pay);
		}
		else {
			System.out.println("Pagamento maior que o valor permitido.");
		}

	}

}
