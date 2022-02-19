package exercicio6_arquivos;

import java.io.FileWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class MainJson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JSONObject jsonObject = new JSONObject();

		jsonObject.put("nome1", "Emanuel");
		jsonObject.put("nome2", "Nome1");
		jsonObject.put("nome3", "Nome2");

		JSONArray jsonArray = new JSONArray();
		jsonArray.add("Hello");
		jsonArray.add("World");
		jsonArray.add("2022");

		jsonObject.put("mensagem", jsonArray);

		// Escrevendo o JSON
		try {
			FileWriter fileWriter = new FileWriter("files\\exemplo.json", true);

			fileWriter.write(jsonObject.toJSONString());

			fileWriter.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
		}

	}

}
