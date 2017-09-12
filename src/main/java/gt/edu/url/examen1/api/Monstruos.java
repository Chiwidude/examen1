package gt.edu.url.examen1.api;

public class Monstruos {
	private int edad;
	private String color;
	private String elemento;
	private String nombre;
	/**
	 * método para obtener elemento al monstruo.
	 * @return tipo de elemento del monstruo
	 */
	public String getElemento() {
		return elemento;
	}
	/**
	 * coloca un valor al elemento del monstruo
	 * @param elemento, indica el elemento del monstruo
	 */
	
	public void setElemento(String elemento) {
		this.elemento = elemento;
	}

	
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public void Volar() {
		System.out.println("Soy" + " " + getNombre() + " y vuelo");
	}
	public void CLento() {
		System.out.println("Soy" + " " + getNombre() + " y camino lento");
	}
	public void Agitarse() {
		System.out.println("Soy" + " " + getNombre() + " y me agito");
	}
	public void Golpear() {
		System.out.println("Soy" + " " + getNombre() + " y golpeo");
	}
}
