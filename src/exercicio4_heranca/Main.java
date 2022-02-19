package exercicio4_heranca;

public class Main {

	public static void main(String[] args) {

		// criando um objeto a partir da classe Cachorro
		Cachorro toto = new Cachorro("ruivo", 20.2, "SRD", 1.1, "coleira, colete", "marrom");

		System.out.println("#### Classe 'Cachorro' in�cio ##########");
		// mostrar dados do Tot�
		toto.setAcessorios("pulseira");
		toto.setAltura(2.3);
		toto.setCorFucinho("preto");
		toto.setPeso(2.1);
		toto.setRaca("puggie");
		toto.setCorPelo("branco");

		// mostrar dados do Tot�
		System.out.println("Acess�rios: " + toto.getAcessorios());
		System.out.printf("Altura: %.2f\n", toto.getAltura());
		System.out.println("Cor do Fucinho: " + toto.getCorFucinho());
		System.out.printf("Peso: %.2f\n", toto.getPeso());
		System.out.println("Ra�a: " + toto.getRaca());
		System.out.println("Cor do Pelo: " + toto.getCorPelo());

		// chamando os m�todos
		toto.caminhar();
		toto.correr();
		toto.escrever();
		toto.falar();
		toto.latir();
		toto.verHoras();

		// mostrar dados do Tot�2
		Cachorro toto2 = new Cachorro("preto", 2.3, "viralata", 1.2, "rel�gio", "marrom");
		System.out.println("Acess�rios: " + toto2.getAcessorios());
		System.out.printf("Altura: %.2f\n", toto2.getAltura());
		System.out.println("Cor do Fucinho: " + toto2.getCorFucinho());
		System.out.printf("Peso: %.2f\n", toto2.getPeso());
		System.out.println("Ra�a: " + toto2.getRaca());
		System.out.println("Cor do Pelo: " + toto2.getCorPelo());
		System.out.println("#### Classe 'Cachorro' fim ##########\n\n");

		System.out.println("#### Classe 'Gato' in�cio ##########");

		Gato gato = new Gato("ruivo", 1.2, "Sem Ra�a Definida", 0.8, "nervoso", "ruivo");

		System.out.println("Gato - altura: " + gato.getAltura());
		System.out.println("Gato - cor do pelo: " + gato.getCorPelo());
		System.out.println("Gato - cor do rabo: " + gato.getCorRabo());
		System.out.println("Gato - altura: " + gato.getAltura());
		System.out.println("Gato - peso: " + gato.getPeso());
		System.out.println("Gato - raca: " + gato.getRaca());
		System.out.println("Gato - temperamento: " + gato.getTemperamento());

		gato.miar();
		gato.ronronar();

		gato.caminhar();
		gato.correr();

		System.out.println("#### Classe 'Gato' fim ##########");

	}
}