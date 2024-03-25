/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1labo.entidades;

/**
 *
 * @author Administrador
 */
public class Pasajero extends Persona{
    
    
   
    private String numeroPasaporte;
    
 
    public String getNumeroPasaporte() {
        return numeroPasaporte;
    }

    public void setNumeroPasaporte(String numeroPasaporte) {
        this.numeroPasaporte = numeroPasaporte;
    }
    
     @Override
    public String toString() {
        return "Pasajero: " + this.nombre + " " + this.apellido;
    
    
}
}