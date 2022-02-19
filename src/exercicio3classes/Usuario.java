package exercicio3classes;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

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

public class Usuario {

	public String nome;
	private String dataNascimento;
	private int idade;
	private double peso;
	private double altura;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getIdadePorExtenso() throws ParseException {
		String dataNascimento = this.getDataNascimento();
		SimpleDateFormat formatoConversor = new SimpleDateFormat("dd/MM/yyyy");
		Date dataNascimentoFormatada = formatoConversor.parse(dataNascimento);
		Locale local = new Locale("pt", "BR");
		DateFormat formato = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy", local);

		return formato.format(dataNascimentoFormatada);
	}

	public void envelhecer(int envelhecer) {
		int idadeAtual = this.getIdade();
		idadeAtual = idadeAtual + envelhecer;
		this.setIdade(idadeAtual);
	}

	public void engordar(double engordar) {
		double pesoAtual = this.getPeso();
		pesoAtual = pesoAtual + engordar;
		this.setPeso(pesoAtual);
	}

	public void emagrecer(double emagrecer) {
		double pesoAtual = this.getPeso();
		pesoAtual = pesoAtual - emagrecer;
		this.setPeso(pesoAtual);
	}

	public void crescer(double altura) {
		double alturaAtual = this.getAltura();
		alturaAtual = alturaAtual + altura;
		this.setAltura(alturaAtual);
	}

}
