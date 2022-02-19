package exercicio6_arquivos;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class MainJson2Novo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JSONParser parserTestesAgeis = new JSONParser();

		try {
			FileReader arquivoTestesAgeis = new FileReader("files\\exemplo2.json");

			JSONObject raizTestesAgeis = (JSONObject) parserTestesAgeis.parse(arquivoTestesAgeis);

			String curso = (String) raizTestesAgeis.get("curso");
			System.out.println("Curso: " + curso);

			JSONArray disciplinasLidas = (JSONArray) raizTestesAgeis.get("disciplinas");

			for (Object element : disciplinasLidas) {
				JSONObject disciplinaLida = (JSONObject) element;
				String nomeDisciplina = (String) disciplinaLida.get("nome");
				String professorDisciplina = (String) disciplinaLida.get("professor");

				System.out.println("Nome Disciplina: " + nomeDisciplina);
				System.out.println("Nome Professor: " + professorDisciplina);
			}

			JSONArray alunosLidos = (JSONArray) raizTestesAgeis.get("alunos");
			for (Object element : alunosLidos) {
				JSONObject alunoLido = (JSONObject) element;
				String nomeAluno = (String) alunoLido.get("nome");
				int matriculaAluno = ((Long) alunoLido.get("matricula")).intValue();

				System.out.println("Nome Aluno: " + nomeAluno);
				System.out.println("Matrícula Aluno: " + matriculaAluno);
			}

			arquivoTestesAgeis.close();

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

}
