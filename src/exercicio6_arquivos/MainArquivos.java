package exercicio6_arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class MainArquivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Escrita
		try {
			// Cria o arquivo
			FileWriter fileWriter = new FileWriter("files\\nomes.txt", true);

			// Escreve no arquivo
			fileWriter.write("Emanuel\r\n");
			fileWriter.write("Eumanuel\r\n");
			fileWriter.write("Eu, eu mesmo\r\n");

			// Fecha o arquivo
			fileWriter.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
		}

		// Leitura
		try {
			FileReader fileReader = new FileReader("files\\nomes.txt");
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			String linhaArquivo;
			while ((linhaArquivo = bufferedReader.readLine()) != null) {
				System.out.println(linhaArquivo);
			}

			fileReader.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
		}

	}

}
