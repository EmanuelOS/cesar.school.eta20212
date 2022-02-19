package exercicio4_heranca;

public class Gato extends Animal {

	// Atributos
	private String temperamento;
	private String corRabo;

	// Construtor
	public Gato(String corPelo, double peso, String raca, double altura, String temperamento, String corRabo) {
		super(corPelo, peso, raca, altura);
		this.temperamento = temperamento;
		this.corRabo = corRabo;
	}

	// Getters
	public String getTemperamento() {
		return temperamento;
	}

	public String getCorRabo() {
		return corRabo;
	}

	// Setters
	public void setTemperamento(String temperamento) {
		this.temperamento = temperamento;
	}

	public void setCorRabo(String corRabo) {
		this.corRabo = corRabo;
	}

	// M�todos extras
	public void miar() {
		System.out.println("Miau, miau!");
	}

	public void ronronar() {
		System.out.println("Ron, ron...");
	}

}