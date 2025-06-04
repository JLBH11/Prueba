
/**
 * @author Usuario
 */
public class Nodo {
    private Vehiculo informacion;
    private Nodo siguiente;
    
    
    public Nodo(Vehiculo vehiculo) {
        this.informacion = vehiculo;
        this.siguiente = null;
    }
    
    
    public Vehiculo getInformacion() {
        return informacion;
    }
    
    public void setInformacion(Vehiculo informacion) {
        this.informacion = informacion;
    }
    
    public Nodo getSiguiente() {
        return siguiente;
    }
    
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}

