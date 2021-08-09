package Junit.Junit08_Maven;

public class Geometria {
	// Atributos de la clase
	private int id;
	private String nom;

	// Constructores
	public Geometria(int id, String nom) {
		this.id = id;
		this.nom = nom;
	}

	public Geometria() {
		this.id = 9;
		this.nom = "Default";
	}

	// Métodos propios de clase Geometria
	// Método area del cuadrado
	public static int areaCuadrado(int n1) {
		return n1 * n1;
	}

	// Método del área del circulo
	public static double areaCirculo(int r) {
		double PI = 3.1416;
		return PI * Math.pow(r, 2);
	}

	// Método del área del triangulo
	public static int areaTriangulo(int a, int b) {
		return (a * b) / 2;
	}

	// Método del área del rectangulo
	public static int areaRectangulo(int b, int h) {
		return b * h;
	}

	// Método del área del pentagono
	public static int areaPentagono(int p, int a) {
		return (p * a) / 2;
	}

	// Método del área del rombo
	public static int areaRombo(int D, int d) {
		return (D * d) / 2;
	}

	// Método del área del romboide
	public static int areaRomboide(int b, int h) {
		return b * h;
	}

	// Método del área del trapecio
	public static int areaTrapecio(int B, int b, int h) {
		return ((B + b) / 2) * h;
	}

	// Selector de figuras
	public void figura(int fiCode) {
		String Figura = "";
		double areaFig = 0.0;

		switch (fiCode) {
		case 1:
			Figura = "Cuadrado";
			areaFig = areaCuadrado(4);
			break;
		case 2:
			Figura = "Circulo";
			areaFig = areaCirculo(2);
			break;
		case 3:
			Figura = "Triangulo";
			areaFig = areaTriangulo(2, 5);
			break;
		case 4:
			Figura = "Rectangulo";
			areaFig = areaRectangulo(2, 5);
			break;
		case 5:
			Figura = "Pentagono";
			areaFig = areaPentagono(2, 5);
			break;
		case 6:
			Figura = "Rombo";
			areaFig = areaRombo(2, 5);
			break;
		case 7:
			Figura = "Romboide";
			areaFig = areaRomboide(2, 3);
			break;
		case 8:
			Figura = "Trapecio";
			areaFig = areaTrapecio(2, 2, 3);
			break;
		default:
			Figura = "Default";
			areaFig = 10.00;
			break;
		}
		System.out.println("La figura seleccionada es: " + Figura);
		System.out.println("Su area es: %2.f" + areaFig);
	}
	
	// Getters y Setters
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Geometria [id=" + id + ", nom=" + nom + "]";
	}
}
