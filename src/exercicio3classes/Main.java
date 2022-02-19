package exercicio3classes;

import java.text.ParseException;

/*
 * @college	CESAR School 2021.2
 * @class	Revisão de Programação
 * @author	Emanuel Oliveira
 * @contact	elos[at]cesar[dot]school
 * 
 * @task	Exercícios 03 - enviar até dia 17/02/2022

			1. Faça um programa, utilizando uma classe, que solicite a data de nascimento (dd/mm/aaaa) 
			do usuário e imprima a data com o nome do mês por extenso.

			Data de Nascimento: 29/10/1973
			Você nasceu em 29 de Outubro de 1973.

			2. Crie uma classe que modele uma pessoa:
			a. Atributos: nome, idade, peso e altura
			b. Métodos: Envelhecer, engordar, emagrecer, crescer. 
 * 
 * */

public class Main {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Usuario usuario = new Usuario();
		usuario.setNome("Emanuel");
		usuario.setDataNascimento("11/02/1993");
		usuario.setIdade(29);
		usuario.setPeso(85.0);
		usuario.setAltura(1.80);

		System.out.println("Nome: " + usuario.getNome());
		System.out.println("Data de Nascimento: " + usuario.getDataNascimento());
		System.out.println("Você nasceu em " + usuario.getIdadePorExtenso());

		// Envelhecer
		System.out.println("Envelhecendo...");
		System.out.println("Sua idade atual é " + usuario.getIdade());
		usuario.envelhecer(1);
		System.out.println("Sua idade atual é " + usuario.getIdade());
		usuario.envelhecer(-3);
		System.out.println("Sua idade atual é " + usuario.getIdade());

		// Engordar
		System.out.println("Engordando...");
		System.out.println("Seu peso atual é " + usuario.getPeso());
		usuario.engordar(1.5);
		System.out.println("Seu peso atual é " + usuario.getPeso());

		// Emagrecer
		System.out.println("Emagrecendo...");
		System.out.println("Seu peso atual é " + usuario.getPeso());
		usuario.emagrecer(3.2);
		System.out.println("Seu peso atual é " + usuario.getPeso());

		// Crescer
		System.out.println("Crescendo...");
		System.out.println("Sua altura atual é " + usuario.getAltura());
		usuario.crescer(0.02);
		System.out.println("Sua altura atual é " + usuario.getAltura());

	}

}
