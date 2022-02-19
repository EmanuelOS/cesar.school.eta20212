package exercicio5_listas;

import java.util.ArrayList;

public class ExemploListas {

	private static int[] inteiros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
	private static String[] alfabeto = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P",
			"Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String caracteres = "A 1 E 5 T 7 W 8 G A E T W G 8 7 5 1 3 C 9 H 4 Q 6 C H Q 6 4 9 3";
		String[] caracteresAux = caracteres.split(" ");

		ArrayList<String> arrayListLetras = new ArrayList<>();
		ArrayList<String> arrayListNumeros = new ArrayList<>();

		for (String element : caracteresAux) {
			for (int element2 : inteiros) {
				if (String.valueOf(element2).equals(element)) {
					arrayListNumeros.add(element);
				}
			}

			for (String element2 : alfabeto) {
				if (String.valueOf(element2).equals(element)) {
					arrayListLetras.add(element);
				}
			}
		}

		System.out.println("ArrayList<Letras> não ordenado: " + arrayListLetras.toString());
		System.out.println("ArrayList<Numeros> não ordenado: " + arrayListNumeros.toString());

		arrayListLetras.sort(null);
		arrayListNumeros.sort(null);
		System.out.println("\nArrayList<Letras> ordenado: " + arrayListLetras.toString());
		System.out.println("ArrayList<Numeros> ordenado: " + arrayListNumeros.toString());

	}

}
