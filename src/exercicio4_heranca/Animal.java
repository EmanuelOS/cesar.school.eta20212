package exercicio4_heranca;

public class Animal {

	private String corPelo;
	private double peso;
	private String raca;
	private double altura;

	// Construtor
	public Animal(String corPelo, double peso, String raca, double altura) {
		this.corPelo = corPelo;
		this.peso = peso;
		this.raca = raca;
		this.altura = altura;
	}

	// Setters
	public void setCorPelo(String corPelo) {
		if (corPelo.equals("")) {
			System.out.println("Informar algum conteúdo para Cor do Pelo!");
		} else {
			this.corPelo = corPelo;
		}
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	// Getters
	public String getCorPelo() {
		return this.corPelo;
	}

	public double getPeso() {
		return peso;
	}

	public String getRaca() {
		return raca;
	}

	public double getAltura() {
		return altura;
	}

	// Métodos extras
	public void caminhar() {
		System.out.println("caminhando...");
	}

	public void correr() {
		System.out.println("a definir");
	}
}
