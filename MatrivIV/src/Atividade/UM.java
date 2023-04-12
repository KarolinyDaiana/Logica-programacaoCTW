package Atividade;

import java.util.Scanner;

public class UM {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int tamanho = 0;

		System.out.println("Qual o tamanho da matriz?");
		tamanho = leia.nextInt();

		String[][] numero = new String[tamanho * 2 + 3][tamanho * 2 + 3];

		for (int linha = 0; linha < numero.length; linha++) {
			for (int coluna = 0; coluna < numero.length; coluna++) {

				if (coluna == 0 || coluna == numero.length - 1 || linha == (numero.length - 1) / 2) {
					numero[linha][coluna] = "*";
				}

				if ((linha == 0 || linha == numero.length - 1) && (coluna != 0 && coluna != numero[0].length - 1)) {
					numero[linha][coluna] = "=";
				}
			}
		}

//NUMEROS
		for (int linha = 1; linha < (numero.length - 1) / 2; linha++) {
			int contadorDoNumero = linha;
			for (int coluna = numero[0].length - 2; coluna > 0; coluna--) {
				if (coluna % 2 == 0 && contadorDoNumero > 0) {
					numero[linha][coluna] = "" + (linha);
					contadorDoNumero--;
				} else {
					numero[linha][coluna] = " ";
				}
			}
		}
		for (int linha = numero.length - 2; linha > (numero.length - 1) / 2; linha--) {
			int contadorDoNumero = numero.length - 1 - linha;
			for (int coluna = 1; coluna < numero[0].length - 1; coluna++) {
				if (coluna % 2 == 0 && contadorDoNumero > 0) {
					numero[linha][coluna] = "" + (numero.length - 1 - linha);
					contadorDoNumero--;
				} else {
					numero[linha][coluna] = " ";
				}
			}
		}

		for (int linha = 0; linha < numero.length; linha++) {
			for (int coluna = 0; coluna < numero[0].length; coluna++) {
				System.out.print(numero[linha][coluna]);
			}
			System.out.println();
		}

	}

}