/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanotebooksexamen1;
import java.util.*;

/**
 *
 * @author Alumno
 */
public class Orden {
        private List<DetalleOrden> items;
        private int id;
        private Date creacion;
        private Date envio;
 
        
    public Orden (int id, Date creacion){
        
        this.id=id;
        this.creacion=creacion;
    }
    
    public void agregarItem(DetalleOrden detalle){
        
        items.add(detalle);
    }

    public int getNroItem(){

    return id;
    }

    public void setEnvio (Date envio){
        
        this.envio = envio;
    }


}
