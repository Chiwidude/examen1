package gt.edu.url.examen1.api;

public class ArregloPila {
private Monstruos[]data;
int size = 0;
int ingreso = 0;

public ArregloPila(int index) {
	data = new Monstruos[index];
	size = index;
}
public int size(){
	return size;
}

public boolean isEmpty() {
	return (size == 0);
}

public void push(Monstruos e) {
	data[ingreso] = e;
	ingreso++;
	if (ingreso > size) 
		System.out.println("la pila se ha desbordado");
	
}

public Monstruos top() {
	if (isEmpty()) return null;
	return data[ingreso];
}

public Monstruos pop(Monstruos master) {
	if (isEmpty()) return null;
	
	if (master== data[ingreso])
	data[ingreso] = null;
	ingreso --;
	size--;
	return master;
}

}
