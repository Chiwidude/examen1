package gt.edu.url.examen1.api;

import gt.edu.url.examen1.impl.Monstruo;

/**
 *
 * @author Victor Orozco
 */
public interface FabricaRanger {
    
    public void hacerAlgo();
    
    public void apilar(Monstruos monstruo);
    public boolean desapilar(Monstruos monstruo);
    public boolean encolar(Monstruos monstruo);
    public boolean desencolar(Monstruos monstruo);
    public Monstruos fabricar(String elemento);
}
