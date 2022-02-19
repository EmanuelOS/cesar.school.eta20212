package exercicio4_heranca;

public class Gato extends Animal implements Mamifero {

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

	// Métodos extras
	public void miar() {
		System.out.println("Miau, miau!");
	}

	public void ronronar() {
		System.out.println("Ron, ron...");
	}

	@Override
	public void caminhar() {
		System.out.println("Gato caminhando...!");
	}

	@Override
	public void correr() {
		System.out.println("Gato correndo...!");
	}

	// Métodas da interface Mamífero
	@Override
	public boolean temPelo() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean respiraoPulmonar() {
		// TODO Auto-generated method stub
		return true;
	}

}