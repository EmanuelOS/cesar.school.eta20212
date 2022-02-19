package aula1;

public class Main {

	/*
	 * CESAR School
	 * Curso: Especialização em Testes Ágeis
	 * Turma: 2021.2
	 * Author: Emanuel Oliveira
	 * Email: elos@cesar.school
	 * Data: 04/Feb/2022
	 * Atividade: 01
	 *
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.out.println("### Atividade 01");

		double minutosSegundos = (42.7 * 60); // 42 minutos e 42 segundos = 42.7
		double milhas = (10 / 1.61); // transformando 10 quilômetros em milhas
		double milhasPorSegundo = (milhas / minutosSegundos); // calculando milhas por minutos e segundos
		double milhasPorMinuto = (milhas / 42.7); // calculando milhas por minuto
		double milhasPorHora = (10 / 1.61) / (42.7 / 60); // calculando milhas por hora

		System.out.printf("42\'42\" possuem %.2f segundos.\n", minutosSegundos);
		System.out.printf("10 quilômetros possuem %.2f milhas.\n", milhas);
		System.out.printf("Velocidade em milhas/segundos: %.5f\n", milhasPorSegundo);
		System.out.printf("Velocidade em milhas/minutos: %.5f\n", milhasPorMinuto);
		System.out.printf("Velocidade em milhas/horas: %.5f\n", milhasPorHora);

		System.out.println("\n### Atividade 02");

		double precoLivro = 24.95;
		double desconto = 0.4;
		double transportePrimeiroExemplar = 3.00;
		double transporteAdicional = 0.75;
		double precoTotalLivros = precoLivro * 60; // calculando valor total dos livros
		double precoTotalLivrosComDesconto = precoTotalLivros * (1 - desconto);
		double calculoTotalTransporte = transportePrimeiroExemplar + (transporteAdicional * 59);
		double totalFinal = precoTotalLivrosComDesconto + calculoTotalTransporte;

		System.out.printf("O gasto final com a compra dos livros é de R$ %.2f", totalFinal);

	}

}
