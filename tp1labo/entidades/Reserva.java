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
public class Reserva {
    
    private Vuelo vuelo;
    private Pasajero pasajero;

    public void asignarVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public void asignarPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

 
    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }
}
