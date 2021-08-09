package Junit.Junit08_Maven;

import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeometriaTest {

	Geometria geom;

	@BeforeAll
	static void initAll() {
	}

	@BeforeEach
	public void before() {
		System.out.println("before()");
		geom = new Geometria();
	}

	@Test
	void succeedingTest() {
	}

	@AfterEach
	public void after() {
		System.out.println("after() test getters, setters and toString");
		geom.setNom("Triangulo");
		geom.setId(1);
		geom.getNom();
		geom.getId();
		geom.toString();
	}

	@AfterAll
	static void tearDownAll() {
	}

	@Test // switch case
	public void testSwitchCase() {
		geom.figura(1);
		geom.figura(2);
		geom.figura(3);
		geom.figura(4);
		geom.figura(5);
		geom.figura(6);
		geom.figura(7);
		geom.figura(8);
		geom.figura(0);
	}
	
	@Test
	public void testClase() {
		geom = new Geometria (1, "Triangulo");
		geom.getClass();
	}

	@Test
	public void testAreaCuadrado() {
		int resultado = Geometria.areaCuadrado(2);
		int esperado = 4;
		assertEquals(esperado, resultado);
	}

	@Test
	public void testAreaCirculo() {
		double resultado = Geometria.areaCirculo(2);
		double esperado = 12.5664;
		assertEquals(esperado, resultado);
	}

	@Test
	public void testAreaTriangulo() {
		int resultado = Geometria.areaTriangulo(2, 3);
		int esperado = 3;
		assertEquals(esperado, resultado);
	}

	@Test
	public void testAreaPentagono() {
		int resultado = Geometria.areaPentagono(2, 2);
		int esperado = 2;
		assertEquals(esperado, resultado);
	}

	@Test
	public void testAreaRombo() {
		int resultado = Geometria.areaRombo(2, 2);
		int esperado = 2;
		assertEquals(esperado, resultado);
	}

	@Test
	public void testAreaRomboide() {
		int resultado = Geometria.areaRomboide(2, 2);
		int esperado = 4;
		assertEquals(esperado, resultado);
	}

	@Test
	public void testAreaTrapecio() {
		int resultado = Geometria.areaTrapecio(2, 2, 2);
		int esperado = 4;
		assertEquals(esperado, resultado);
	}

	@Test
	public void testAreaRectangulo() {
		int resultado = Geometria.areaRectangulo(2, 2);
		int esperado = 4;
		assertEquals(esperado, resultado);
	}
}
