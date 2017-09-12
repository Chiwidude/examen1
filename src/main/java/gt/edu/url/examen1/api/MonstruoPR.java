package gt.edu.url.examen1.api;



/**
 * Clase que implementa métodos de objetos tipo MonstruoPR
 * utilizando colas y pilas
 * @author FRAN
 *
 */

public class MonstruoPR implements FabricaRanger {

	

	ArregloCola c1 = new ArregloCola(10);
	ArregloPila p1 = new ArregloPila(10);
	@Override
	public void hacerAlgo() {
		
		
	}
	@Override
	/**
	 * coloca el monstruo dado, dentro del orden de una pila
	 * @param monstruo, es el paramentro de tipo monstruo que se apila
	 */
	public void apilar(Monstruos monstruo) {
		p1.push(monstruo);
		
	}
	@Override
	/**
	 * quita de una pila, al monstruo indicado
	 * @param monstruo, indica el monstruo a quitar de la pila
	 * @return boolean, indica si se desapilo el monstruo.
	 */
	public boolean desapilar(Monstruos monstruo) {
		p1.pop(monstruo);
		if(p1.top()!= monstruo)
			return true;
		else 
			return false;
	}
	@Override
	/**
	 * coloca en una cola al monstruo indicado
	 * @param monstruo, muestra al monstruo que se va a encolar
	 * @return indica si se agregó o no el monstruo
	 */
	public boolean encolar(Monstruos monstruo) {
		c1.enqueue(monstruo);
		if(c1.first() == monstruo)
			return true;
		else
			return false;
		}
	@Override
	/**
	 * quita de la cola al monstruo indicado
	 * @param monstruo, indica el monstruo que se quita de la cola
	 * @return boolean, que indica si se realizo o no la acción
	 */
	public boolean desencolar(Monstruos monstruo) {
		c1.dequeue(monstruo);
		if(c1.first() != monstruo)
			return true;
		else {
			return false;
		}
	}
	@Override
	/**
	 * crea una instancia vacia de un monstruo
	 * @param elemento, en base a su elemento se crea la instancia.
	 * @return la instancia vacia de monstruo.
	 */
	public Monstruos fabricar(String elemento) {
		Monstruos M1 = new Monstruos();
		M1.setColor("");
		M1.setEdad(0);
		M1.setNombre("");
		M1.setElemento(elemento);
		return M1;
	}
	
}
