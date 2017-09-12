package gt.edu.url.examen1.api;
/**
 * Clase creada para solución del algoritmo de Chudnovsky
 * Utilizando recursividad
 * @author FRAN
 * @see Chudnovsky
 *
 */
public class AlgoritmoChud implements Chudnovsky {

	@Override
	/** 
	 * Método que calcula los decimales a mostrar de la constante pi, apartir
	 * del algoritmo de los hermanos Chudnovsky 
	 * @param entero que indica la cantidad de decimales que se desea mostrar.
	 * @return Cantidad de decimales indicados.
	 */
	public double calcularPi(int cantidadDigitos) {
		double numerador,denominadorparcial3, temp3;
		double denominador,denominadorparcial2, resultado;
		int numeradorparcial1, numeradorparcial2, denominadorparcial1, temp1, temp2;
		
		if (cantidadDigitos<0) {
			return 0.0;
		} else {
			temp1 = 6*cantidadDigitos;
		numeradorparcial1 = (factorial(temp1));
		numeradorparcial2 = ((545140134)*cantidadDigitos)+13591409;
		numerador = numeradorparcial1 * numeradorparcial2;
		temp2 = 3*cantidadDigitos;
		denominadorparcial1 = (factorial(temp2));
		denominadorparcial2 = factorial(cantidadDigitos);
		denominadorparcial3 = -262537412640.768;
		temp3 = denominadorparcial3*1000000;
		
		denominador = denominadorparcial1*Math.pow(denominadorparcial2, 3)*Math.pow(temp3, cantidadDigitos);
		resultado = numerador/denominador;
		
		return resultado + calcularPi(cantidadDigitos-1);
		}
	}
	/**
	 * Función que calcula el factorial de un número
	 * @param n, entero que representa el número al cual se le calculará factorial
	 * @return el total del factorial del número ingresado
	 */
	public  int factorial (int n) {
		
		if (n== 0) 
			return 1;
		
		else 
			return n* factorial (n-1);
	}

}
