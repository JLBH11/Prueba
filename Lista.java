
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Lista {
    private Nodo cabeza;
    
   
    public Lista() {
        this.cabeza = null;
    }
    
    // Método para verificar si la lista está vacía
    public boolean estaVacia() {
        return cabeza == null;
    }
    
    // Método para agregar un nuevo nodo
    public boolean agregarNodo(Vehiculo vehiculo) {
        // Verificar que no exista otro vehículo con el mismo ID
        if (buscarNodoPorId(vehiculo.getIdVehiculo()) != null) {
            return false; // Ya existe un vehículo con ese ID
        }
        
        Nodo nuevoNodo = new Nodo(vehiculo);
        
        // Si la lista está vacía
        if (estaVacia()) {
            cabeza = nuevoNodo;
            return true;
        }
        
        // Si no está vacía, agregar al final
        Nodo actual = cabeza;
        while (actual.getSiguiente() != null) {
            actual = actual.getSiguiente();
        }
        actual.setSiguiente(nuevoNodo);
        return true;
    }
    
    // Método para buscar un nodo por ID
    public Vehiculo buscarNodoPorId(String idVehiculo) {
        if (estaVacia()) {
            return null;
        }
        
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.getInformacion().getIdVehiculo().equals(idVehiculo)) {
                return actual.getInformacion();
            }
            actual = actual.getSiguiente();
        }
        return null; // No se encontró el vehículo
    }
    
    // Método para eliminar un nodo por ID
    public boolean eliminarNodoPorId(String idVehiculo) {
        if (estaVacia()) {
            return false;
        }
        
        // Si el nodo a eliminar es la cabeza
        if (cabeza.getInformacion().getIdVehiculo().equals(idVehiculo)) {
            cabeza = cabeza.getSiguiente();
            return true;
        }
        
        // Si el nodo a eliminar no es la cabeza
        Nodo actual = cabeza;
        while (actual.getSiguiente() != null) {
            if (actual.getSiguiente().getInformacion().getIdVehiculo().equals(idVehiculo)) {
                actual.setSiguiente(actual.getSiguiente().getSiguiente());
                return true;
            }
            actual = actual.getSiguiente();
        }
        
        return false; // No se encontró el vehículo
    }
    
    public int contarElementos() {
    int contador = 0;
    Nodo actual = cabeza;
    while (actual != null) {
        contador++;
        actual = actual.getSiguiente();
    }
    return contador;
    }
    
    public Vehiculo[] obtenerVehiculos() {
        int tamaño = contarElementos();
        Vehiculo[] vehiculos = new Vehiculo[tamaño];
        Nodo aux = cabeza;
        int i = 0;
        while (aux != null) {
            vehiculos[i++] = aux.getInformacion();
            aux = aux.getSiguiente();
        }
        return vehiculos;
    }
    
    
    
    // Método para calcular el costo total de todos los servicios
    public double calcularCostoTotalServicios() {
        double costoTotal = 0;
        
        Nodo actual = cabeza;
        while (actual != null) {
            costoTotal += actual.getInformacion().getCostoServicio();
            actual = actual.getSiguiente();
        }
        
        return costoTotal;
    }
    
    // Método para ordenar vehículos por fecha de ingreso
    public void ordenarVehiculosPorFechaIngreso() {
        if (estaVacia() || cabeza.getSiguiente() == null) {
            return; // No hay nada que ordenar
        }
        
        boolean cambiado;
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        do {
            cambiado = false;
            Nodo actual = cabeza;
            Nodo siguiente;
            
            while (actual.getSiguiente() != null) {
                siguiente = actual.getSiguiente();
                
                try {
                    Date fechaActual = formato.parse(actual.getInformacion().getFechaIngreso());
                    Date fechaSiguiente = formato.parse(siguiente.getInformacion().getFechaIngreso());
                    
                    if (fechaActual.after(fechaSiguiente)) {
                        // Intercambiar información de los nodos (no los nodos en sí)
                        Vehiculo temp = actual.getInformacion();
                        actual.setInformacion(siguiente.getInformacion());
                        siguiente.setInformacion(temp);
                        cambiado = true;
                    }
                } catch (ParseException e) {
                    // En caso de error en el formato de fecha, simplemente continuamos
                    System.err.println("Error en formato de fecha: " + e.getMessage());
                }
                
                actual = actual.getSiguiente();
            }
        } while (cambiado);
    }
    
    public void ordenarVehiculosPorMarca() {
    if (estaVacia() || cabeza.getSiguiente() == null) {
        return; // No hay nada que ordenar
    }

    boolean cambiado;

    do {
        cambiado = false;
        Nodo actual = cabeza;
        Nodo siguiente;

        while (actual.getSiguiente() != null) {
            siguiente = actual.getSiguiente();

            String marcaActual = actual.getInformacion().getMarca().toLowerCase();
            String marcaSiguiente = siguiente.getInformacion().getMarca().toLowerCase();

            if (marcaActual.compareTo(marcaSiguiente) > 0) {
                // Intercambiar información de los nodos
                Vehiculo temp = actual.getInformacion();
                actual.setInformacion(siguiente.getInformacion());
                siguiente.setInformacion(temp);
                cambiado = true;
            }

            actual = actual.getSiguiente();
        }
    } while (cambiado);
}
    
    public void ordenarVehiculosPorEstadoServicio() {
    if (estaVacia() || cabeza.getSiguiente() == null) {
        return; // No hay nada que ordenar
    }

    boolean cambiado;

    do {
        cambiado = false;
        Nodo actual = cabeza;
        Nodo siguiente;

        while (actual.getSiguiente() != null) {
            siguiente = actual.getSiguiente();

            String estadoActual = actual.getInformacion().getEstadoServicio().toLowerCase();
            String estadoSiguiente = siguiente.getInformacion().getEstadoServicio().toLowerCase();

            if (estadoActual.compareTo(estadoSiguiente) > 0) {
                // Intercambiar información de los nodos
                Vehiculo temp = actual.getInformacion();
                actual.setInformacion(siguiente.getInformacion());
                siguiente.setInformacion(temp);
                cambiado = true;
            }

            actual = actual.getSiguiente();
        }

    } while (cambiado);
}
    
   public boolean actualizarServicio(String id, String nuevoEstado, double nuevoCosto) {
    Nodo actual = cabeza;

    while (actual != null) {
        if (actual.getInformacion().getIdVehiculo().equalsIgnoreCase(id)) {
            actual.getInformacion().setEstadoServicio(nuevoEstado);
            actual.getInformacion().setCostoServicio(nuevoCosto);
            return true; // Actualización exitosa
        }
        actual = actual.getSiguiente();
    }

    return false; // No se encontró el vehículo
}
   
   public Vehiculo buscarVehiculo(String id) {
    Nodo actual = cabeza;

    while (actual != null) {
        if (actual.getInformacion().getIdVehiculo().equalsIgnoreCase(id)) {
            return actual.getInformacion();
        }
        actual = actual.getSiguiente();
    }

    return null; // No se encontró
}


}