
package Modelo;

public class Venta {
    private int id;
    private int cliente;
    private String nombre_cli;
    private String vendedor;
    private double subtotal; //para agregar una variable para un total ya con iva.
    private double total;
    private double pago; //para guardar la cantidad con la que se pagó para poder reflejar el cambio en el ticket
    private String fecha;
    
    public Venta(){
        
    }

    public Venta(int id, int cliente, String nombre_cli, String vendedor, double subtotal, double total, double pago, String fecha) {
        this.id = id;
        this.cliente = cliente;
        this.nombre_cli = nombre_cli;
        this.vendedor = vendedor;
        this.subtotal = subtotal;
        this.total = total;
        this.pago = pago;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public String getNombre_cli() {
        return nombre_cli;
    }

    public void setNombre_cli(String nombre_cli) {
        this.nombre_cli = nombre_cli;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

 
    
    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    public double getPago(){
        return pago;
    }
    
    public void setPago(double pago){
        this.pago = pago;
    }
    
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    
    
}
