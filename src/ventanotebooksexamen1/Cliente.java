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
public class Cliente {
    
    String nombre;
    int dni;
    List<Orden> ordenes;
    
    
    public Cliente (String nombre, int dni) {
    
    this.nombre=nombre;
    this.dni=dni;

    }

    public String getNombre (){
    
    return nombre;
        
    }

    
}
