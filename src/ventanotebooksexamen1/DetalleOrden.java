/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanotebooksexamen1;

/**
 *
 * @author Alumno
 */
public class DetalleOrden {
    
    private Notebook item;
    private float precioUnitario;
    private int cantidad;
    
    
    public DetalleOrden (Notebook item, float precioUnitario, int cantidad){
        this.item = item;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
    }
    
    public float getPrecioUnitario(){
        return precioUnitario;
    }
    
    public float getCantidad(){
        return cantidad;
    }
    
    public Notebook getItem(){
        return item;
    }
    
}
