package gt.edu.url.examen1.api;

public class ArregloLista {
	
	public String[ ] data;
	int contador1;
	int contador2;
	int size;
	
	
	public ArregloLista(int capacity) {
		data = new String[capacity];
		size = capacity;
	}
	public void set(int i, String e) {
		
		
		data[i] = e;
		
	}
	public String get(int i) {
		return data[i];
		
	}
	

	
	
	
	
	public String Comparar () {
		
	 for(int j = 0; j<size; j++ )
	 {
		 if (data[j].equals("a")) {
			 contador1++;
			 
		 }
		 
			 if (data[j].equals("b")) {
				 contador2++;
			 }
	 }
		 if (contador1<contador2) {
			 return ("a");
		 }
		 else {
			 return("b");
		 }
		 
		 
	 
		
		
	}

	


}
