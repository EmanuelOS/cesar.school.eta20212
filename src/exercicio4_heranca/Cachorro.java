package exercicio4_heranca;

public class Cachorro extends Animal {

	private String acessorios;
	private String corFucinho;

	// Construtor
	public Cachorro(String corPelo, double peso, String raca, double altura, String acessorios, String corFucinho) {
		super(corPelo, peso, raca, altura);
		this.acessorios = acessorios;
		this.corFucinho = corFucinho;
	}

	// Setters
	public void setAcessorios(String acessorios) {
		this.acessorios = acessorios;
	}

	public void setCorFucinho(String corFucinho) {
		this.corFucinho = corFucinho;
	}

	// Getters
	public String getAcessorios() {
		return acessorios;
	}

	public String getCorFucinho() {
		return corFucinho;
	}

	// Métodos extras
	public void latir() {
		System.out.println("Au, Au!");
	}

	public void falar() {
		this.latir();
	}

	public void escrever() {
		System.out.println("Doguinho legal!");
	}

	public void verHoras() {
		System.out.println("É hora de dar tchau!");
	}
}