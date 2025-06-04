
/**
 * @author Usuario
 */
public class Vehiculo {
    private String idVehiculo;
    private String marca;
    private String modelo;
    private int añoFabricacion;
    private String tipoServicio;
    private String fechaIngreso;
    private String estadoServicio;
    private double costoServicio;

    public Vehiculo(String idVehiculo, String marca, String modelo, int añoFabricacion, String tipoServicio, String fechaIngreso, String estadoServicio, double costoServicio) {
        this.idVehiculo = idVehiculo;
        this.marca = marca;
        this.modelo = modelo;
        this.añoFabricacion = añoFabricacion;
        this.tipoServicio = tipoServicio;
        this.fechaIngreso = fechaIngreso;
        this.estadoServicio = estadoServicio;
        this.costoServicio = costoServicio;
    }

    public String getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(String idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        if (añoFabricacion > 0) {
            this.añoFabricacion = añoFabricacion;
    }
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getEstadoServicio() {
        return estadoServicio;
    }

    public void setEstadoServicio(String estadoServicio) {
        this.estadoServicio = estadoServicio;
    }

    public double getCostoServicio() {
        return costoServicio;
    }

    public void setCostoServicio(double costoServicio) {
        if (costoServicio >= 0) {
            this.costoServicio = costoServicio;
    }
    
    
}
    public void actualizarEstadoServicio(String nuevoEstado) {
        this.estadoServicio = nuevoEstado;
    }
    
    public void actualizarCostoServicio(double nuevoCosto) {
        if (nuevoCosto >= 0) {
            this.costoServicio = nuevoCosto;
        }
    }
    
    public String detallesVehiculo() {
        return "ID: " + idVehiculo + 
               "\nMarca: " + marca + 
               "\nModelo: " + modelo + 
               "\nAño: " + añoFabricacion + 
               "\nTipo de Servicio: " + tipoServicio + 
               "\nFecha de Ingreso: " + fechaIngreso + 
               "\nEstado del Servicio: " + estadoServicio + 
               "\nCosto del Servicio: $" + costoServicio;
    }
}
