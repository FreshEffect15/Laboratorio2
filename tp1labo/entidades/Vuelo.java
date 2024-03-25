/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1labo.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrador
 */
public class Vuelo {
    
    private Avion avion;
    private List<Reserva> reservas;
    private String numeroVuelo;

    public Vuelo() {
        this.reservas = new ArrayList<>();
    }
    
    public void asignarAvion(Avion avion) {
        this.avion = avion;
    }

    public void agregarReserva(Reserva reserva) {
        this.reservas.add(reserva);
    }

   
    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }
    
    @Override
    public String toString() {
        return "Vuelo: " + this.numeroVuelo; 
    }
    
    
    
}
