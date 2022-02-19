package aula2;

import java.util.Scanner;

public class Main {
	
	/*
	 * CESAR School
	 * Curso: Especialização em Testes Ágeis
	 * Turma: 2021.2
	 * Author: Emanuel Oliveira
	 * Email: elos@cesar.school
	 * Data: 05/Feb/2022
	 * Atividade: 01
	 * 
	 * */

	private static Scanner scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		atividade1();
		atividade2();
		atividade3();
		atividade4();
		atividade5();
		atividade6();

		scanner.close();

	}

	private static void iniciaScanner() {
		scanner = new Scanner(System.in);
	}

	private static void atividade6() {
		System.out.println("### Atividade 6");
		iniciaScanner();
		String nomeAtleta = "";
		double[] saltosAtleta;

		do {
			saltosAtleta = new double[6];
			System.out.printf("Digite o nome do atleta: ");
			nomeAtleta = scanner.nextLine();

			if (nomeAtleta.equals("")) {
				System.out.println("\n\n\n===== Exercício finalizado! =====");
				break;
			}

			for (int i = 0; i < 5; i++) {
				System.out.printf("Digite o %dº salto do atleta \"%s\": ", (i + 1), nomeAtleta);
				saltosAtleta[i] = scanner.nextDouble();
				saltosAtleta[5] += (saltosAtleta[i] / 5);
			}

			System.out.println("\nAtleta: " + nomeAtleta);
			System.out.printf("Saltos: ");
			for (int j = 0; j < 5; j++) {
				System.out.printf((j == 4 ? "%.1f\n" : "%.1f, "), saltosAtleta[j]);
			}
			System.out.printf("Média dos saltos: %.1f\n\n", saltosAtleta[5]);

			System.out.printf("Digite o nome do atleta: ");
			nomeAtleta = scanner.nextLine();
		} while (true);
	}

	private static void atividade5() {
		System.out.println("### Atividade 5");
		iniciaScanner();
		System.out.printf("Digite uma palavra: ");
		String palavra = scanner.nextLine();
		String palavraInvertida = new StringBuffer(palavra).reverse().toString();

		if (palavra.compareToIgnoreCase(palavraInvertida) == 0) {
			System.out.printf("\n>A palavra \"%s\" é palíndroma!\n\n", palavra);
		} else {
			System.out.printf("\n>A palavra \"%s\" NÃO é palíndroma!\n\n", palavra);
		}
	}

	private static void atividade4() {
		System.out.println("### Atividade 4");
		double valor = 780000.00;
		System.out.printf("\n>O primeiro ganhador receberá: R$ %.2f", (valor * 0.46));
		System.out.printf("\n>O segundo ganhador receberá: R$ %.2f", (valor * 0.32));
		System.out.printf("\n>O terceiro ganhador receberá: R$ %.2f\n\n", (valor * (1 - (0.46 + 0.32))));
	}

	private static void atividade3() {
		System.out.println("### Atividade 3");
		iniciaScanner();
		System.out.printf("Digite a temperatura em Fahrenheit: ");
		double temperaturaFahrenheit = scanner.nextDouble();
		double temperaturaCelsius = (temperaturaFahrenheit - 32) / 1.8;
		System.out.printf("\n>%.1fº F = %.1fº C\n\n", temperaturaFahrenheit, temperaturaCelsius);
	}

	private static void atividade2() {
		System.out.println("### Atividade 2");
		iniciaScanner();
		int numero = -1;
		int sucessor;

		do {
			System.out.printf("Digite um numero entre 0 e 60: ");
			numero = scanner.nextInt();
		} while (numero < 0 || numero > 60);

		sucessor = (numero == 60) ? 0 : (numero % 60) + 1;
		System.out.printf("\n>Sucessor de %d é %d.\n\n", numero, sucessor);
	}

	private static void atividade1() {
		System.out.println("### Atividade 1");
		iniciaScanner();
		double[] notas = new double[5];

		for (int i = 0; i < 4; i++) {
			System.out.printf("Digite a %dª nota: ", (i + 1));
			notas[i] = scanner.nextDouble();
			notas[4] += (notas[i] / 4);
		}

		System.out.printf("\n>Média das notas: %.2f\n\n", notas[4]);
	}

}
