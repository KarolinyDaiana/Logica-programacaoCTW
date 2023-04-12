package Atividade;

import java.util.Scanner;

public class TRES {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numero;

		System.out.println("Digite o número para o matriz?");
		numero = leia.nextInt();

		String[][] matriz = new String[numero + 3][numero * 4 + 5];
		
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[0].length; coluna++) {

				if (coluna == 0 || coluna == matriz[0].length - 1) {
					matriz[linha][coluna] = "*";
				}

				if (coluna == (matriz[0].length - 1) / 2 && linha != 0 && linha != matriz.length - 1) {
					matriz[linha][coluna] = "*";
				}

				if (linha == 0 && (coluna != 0 && coluna != matriz[0].length - 1)) {
					matriz[linha][coluna] = "=";
				}

				if (linha == matriz.length - 1 && (coluna != 0 && coluna != matriz[0].length - 1)) {
					matriz[linha][coluna] = "-";
				}
			}
		}

		for (int linha = matriz.length - 2; linha > 0; linha--) {
			int contadorNumero = matriz.length - 2 - linha;
			for (int coluna = ((matriz[0].length - 1) / 2) - 1; coluna > 0; coluna--) {
				if (coluna % 2 == 0 && contadorNumero > 0 && linha <= numero) {
					matriz[linha][coluna] = "" + (matriz.length - 2 - linha);
					contadorNumero--;
				} else {
					matriz[linha][coluna] = " ";
				}

			}
		}

		for (int linha = matriz.length - 2; linha > 0; linha--) {
			int contadorNumero = matriz.length - 2 - linha;
			for (int coluna = ((matriz[0].length + 1) / 2); coluna < matriz[0].length - 1; coluna++) {
				if (coluna % 2 == 0 && contadorNumero > 0 && linha <= numero) {
					matriz[linha][coluna] = "" + (matriz.length - 2 - linha);
					contadorNumero--;
				} else {
					matriz[linha][coluna] = " ";
				}

			}
		}

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[0].length; coluna++) {
				System.out.print(matriz[linha][coluna]);
			}
			System.out.println();
		}

	}

}
