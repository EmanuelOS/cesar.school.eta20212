package exercicio3classes;

import java.text.ParseException;

/*
 * @college	CESAR School 2021.2
 * @class	Revis�o de Programa��o
 * @author	Emanuel Oliveira
 * @contact	elos[at]cesar[dot]school
 *
 * @task	Exerc�cios 03 - enviar at� dia 17/02/2022

			1. Fa�a um programa, utilizando uma classe, que solicite a data de nascimento (dd/mm/aaaa)
			do usu�rio e imprima a data com o nome do m�s por extenso.

			Data de Nascimento: 29/10/1973
			Voc� nasceu em 29 de Outubro de 1973.

			2. Crie uma classe que modele uma pessoa:
			a. Atributos: nome, idade, peso e altura
			b. M�todos: Envelhecer, engordar, emagrecer, crescer.
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
		System.out.println("Voc� nasceu em " + usuario.getIdadePorExtenso());

		// Envelhecer
		System.out.println("Envelhecendo...");
		System.out.println("Sua idade atual � " + usuario.getIdade());
		usuario.envelhecer(1);
		System.out.println("Sua idade atual � " + usuario.getIdade());
		usuario.envelhecer(-3);
		System.out.println("Sua idade atual � " + usuario.getIdade());

		// Engordar
		System.out.println("Engordando...");
		System.out.println("Seu peso atual � " + usuario.getPeso());
		usuario.engordar(1.5);
		System.out.println("Seu peso atual � " + usuario.getPeso());

		// Emagrecer
		System.out.println("Emagrecendo...");
		System.out.println("Seu peso atual � " + usuario.getPeso());
		usuario.emagrecer(3.2);
		System.out.println("Seu peso atual � " + usuario.getPeso());

		// Crescer
		System.out.println("Crescendo...");
		System.out.println("Sua altura atual � " + usuario.getAltura());
		usuario.crescer(0.02);
		System.out.println("Sua altura atual � " + usuario.getAltura());

	}

}
