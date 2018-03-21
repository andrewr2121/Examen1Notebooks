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
public class Notebook {
    
    private String marca;
    private String modelo;
    private String procesador;
    private float tamanoDisco;
    
    
    public Notebook (String marca, String modelo, String procesador, float tamanoDisco){
        this.marca = marca;
        this.modelo = modelo;
        this.procesador = procesador;
        this.tamanoDisco = tamanoDisco;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public String getModelo() {
       return modelo; 
    }
    
    public String getProcesador(){
        return procesador;
    }
    
    public float getTamanoDisco(){
        return tamanoDisco;
    }
    
}
