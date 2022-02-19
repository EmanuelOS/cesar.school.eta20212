package exercicio7_junit;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class TestCachorro {

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	public Cachorro toto;

	// Before
	@BeforeEach
	public void setUpTest() {
		toto = new Cachorro();
	}

	// Test
	@Test
	@DisplayName("Verificar a altura do objeto toto")
	public void testAltura() {
		toto.setAltura(2.1);
		assertTrue(toto.getAltura() == 2.1, "Altura não corresponde");
	}

	@Test
	@DisplayName("Verificar peso com valor negativo")
	public void testPesoNegativo() {
		toto.setPeso(50);
		assertTrue(toto.getPeso() == 0, "Peso não corresponde");
	}

	@RepeatedTest(2)
	@ParameterizedTest
	@ValueSource(doubles = {-1.5, -3.2, -5.3 -10.4, -15.01})
	public void testPesoNegativo(double peso) {
		toto.setPeso(peso);
		assertTrue(toto.getPeso() == 0, "Peso nao correspondente - Negativo");
	}

	@RepeatedTest(2)
	@ParameterizedTest
	@ValueSource(doubles = {1.2, 3.3, 5.5, 10.8, 15.13})
	public void testPesoPositivo(double peso) {
		toto.setPeso(peso);
		assertTrue(toto.getPeso() == peso, "Peso nao correspondente");
	}

	@Test
	@DisplayName("Testando polimorfismo")
	public void testCaminhar() {
		assertTrue(toto.caminhar().equals("caminhando com o dono.."), "Polimorfismo deu errado.");
	}


	// After
	@AfterEach
	public void tearDownTest() {
		toto = null;
	}

}
