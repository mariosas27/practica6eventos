/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.pvoe.practica04.modelo;

/**
 *
 * @author josue
 */
public class Atractivo {
    
    private String nombre;
    private String atractivo;
    private String claveEstado; 
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAtractivo() {
        return atractivo;
    }

    public void setAtractivo(String atractivo) {
        this.atractivo = atractivo;
    }
    
    public void setClaveEstado(String claveEstado){
        this.claveEstado = claveEstado; 
    }
    
    public String getClaveEstado(){
        return claveEstado; 
    }
    
    
    @Override 
    public String toString(){
        return this.atractivo + ", " + this.nombre; 
    }
    
    
    
}
