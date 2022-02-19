package exercicio4_heranca;

public class Main {

	public static void main(String[] args) {

		// criando um objeto a partir da classe Cachorro
		Cachorro toto = new Cachorro("ruivo", 20.2, "SRD", 1.1, "coleira, colete", "marrom");

		System.out.println("#### Classe 'Cachorro' início ##########");
		// mostrar dados do Totó
		toto.setAcessorios("pulseira");
		toto.setAltura(2.3);
		toto.setCorFucinho("preto");
		toto.setPeso(2.1);
		toto.setRaca("puggie");
		toto.setCorPelo("branco");

		// mostrar dados do Totó
		System.out.println("Acessórios: " + toto.getAcessorios());
		System.out.printf("Altura: %.2f\n", toto.getAltura());
		System.out.println("Cor do Fucinho: " + toto.getCorFucinho());
		System.out.printf("Peso: %.2f\n", toto.getPeso());
		System.out.println("Raça: " + toto.getRaca());
		System.out.println("Cor do Pelo: " + toto.getCorPelo());

		// chamando os métodos
		toto.caminhar();
		toto.correr();
		toto.escrever();
		toto.falar();
		toto.latir();
		toto.verHoras();

		// mostrar dados do Totó2
		Cachorro toto2 = new Cachorro("preto", 2.3, "viralata", 1.2, "relógio", "marrom");
		System.out.println("Acessórios: " + toto2.getAcessorios());
		System.out.printf("Altura: %.2f\n", toto2.getAltura());
		System.out.println("Cor do Fucinho: " + toto2.getCorFucinho());
		System.out.printf("Peso: %.2f\n", toto2.getPeso());
		System.out.println("Raça: " + toto2.getRaca());
		System.out.println("Cor do Pelo: " + toto2.getCorPelo());
		System.out.println("#### Classe 'Cachorro' fim ##########\n\n");

		System.out.println("#### Classe 'Gato' início ##########");

		Gato gato = new Gato("ruivo", 1.2, "Sem Raça Definida", 0.8, "nervoso", "ruivo");

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