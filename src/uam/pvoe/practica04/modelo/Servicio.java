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
public class Servicio {
    
    public String nombre;
    /*Los nombres serán:
    
    Desayuno
    Recorridos
    Lavandería
    Guardería
    Caja Fuerte
    Despertador
    */
    
    public String clave;
    /* Las claves serán:
    
    DES
    REC
    LAV
    GUAR
    CAJA
    DESP
    */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    
    
    
}
