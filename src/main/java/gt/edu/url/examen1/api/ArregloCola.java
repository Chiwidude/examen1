package gt.edu.url.examen1.api;

public class ArregloCola {
	private Monstruos[] data;
	private int f = 0; //Index for front element
	private int sz = 0; //Curent qty
	
/**
 * método constructor de la clase
 * @param capacity tamaño del arreglo a crear
 */
	public ArregloCola(int capacity) {
		data = new Monstruos[capacity];
		sz = capacity;
	}
	/**
	 * Indica si la cola se encuentra vacia o no.
	 * @return false, en caso la cola no esté vacia. True si esta vacia.
	 */

	public boolean isEmpty() {
		return (sz == 0);
	}
	/**
	 * Ingresa un nuevo elemento a la cola
	 * @param e
	 */
	public void enqueue(Monstruos e) {
		int avail = (f + sz) % data.length;
		data[avail] = e;
		sz++;
	}
	/**
	 * indica cual es el primer elemento de la cola.
	 * @return El primer monstruo en el orden de la cola
	 */
	public Monstruos first( ) {
		if (isEmpty()) 
			return null;
		return data[f];
	}
	/**
	 *Elimina el monstruo que se encuentr en la primera posición del arreglo.
	 * @return
	 */
	public Monstruos dequeue( Monstruos monstruo) {
		if (isEmpty()) 
			return null;
		if(data[f] == monstruo)
		
		data[f] = null;
		f = (f+1) % data.length;
		sz--;
		return monstruo;
		 
			
			
		}
	}


