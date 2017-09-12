package gt.edu.url.examen1.api;
/**
 * Esta clase agrupa los métodos que realiza el reportero para conocer más 
 * del juego de tenis.
 * @author FRAN
 *
 */

public class ReporteroTenis implements Reportero {
	ArregloLista Juegos = new ArregloLista(9);
	
	int contador = 1;
	int juego1 = 0;
	/**
	 * Método que encuentra el ganador del set en base al puntaje que llevan en ese momento
	 * @param a, indica el puntaje del primer jugador
	 * @param b, indica el puntaje del segundo jugador
	 * @return el jugador que ha ganado el juego, en caso se encuentre uno.
	 */
	public String calcularGanador(int a, int b) {
		int temporal = Math.abs(a-b);
		if (temporal> 1) {
				if(a<b & b>= 6 & b<=7) {
					Juegos.set(contador, "b");
					juego1 = contador;
					contador++;
					
					return "El ganador del juego" + " " + juego1 + "" +"es el jugador b";
					
					
					
					
				}
					else 
							{
					
							if (a<b  & b>7) {
								return "las cantidades ingresadas no son validas";
								} else {
										if(b<a & a>= 6 & a<= 7) {
											Juegos.set(contador, "a");
											juego1 = contador;
											contador++;
											return "el ganador del juego" + " " +juego1 + " " + "es el jugador a";
						
										}
											else {
													if(b<a & a>7) {
														return "Las cantidades ingresadas no son validas";
															}
						
													else {
														return "El juego aún no ha terminado";
														}
											}
								}
							}
		
		}
				
				
		 else {
				
				if (temporal == 1) {
					if (a<b & b==7) {
						Juegos.set(contador, "b");
						juego1 = contador;
						contador++;
						return "El ganador del juego" + " " + juego1 + "" +"es el jugador b";
						
						} else {
									if (b<a & a == 7) {
											Juegos.set(contador, "a");
											juego1 = contador;
											contador++;
											return "el ganador del juego" + " " +juego1 + " " + "es el jugador a";
									}
					
						
									else {

										if (a<=5) {
											return "El juego aún no ha terminado";
										}
					
				
										else 
										{
						return "Las cantidades que ingreso son invalidas para el juego";
					}	
				}
		
			}
		
		}

	}
		return null;
}
				
				
		
		
		
		
	
   /**
    * Método que encuentra al campeón de entre los nueve juegos registrados.
    */
	@Override
	public String calcularCampeon() {
		
		return "El campeón fue" + " " + Juegos.Comparar();
	}

	@Override
	/**
	 * Encuentra al ganador de determinado juego registrado
	 * @param juego, es el número del juego que se desea saber el resultado.
	 */
	public String recordarGanador(int juego) {
		
		return "el ganador del juego" + juego +  " " + "fue " + Juegos.get(juego);
	}

}
