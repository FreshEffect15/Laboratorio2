/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1labo;

import tp1labo.entidades.Avion;
import tp1labo.entidades.Pasajero;
import tp1labo.entidades.Reserva;
import tp1labo.entidades.Vuelo;

/**
 *
 * @author Administrador
 */
public class TP1Labo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Avion avion = new Avion();
        avion.setModelo("Boeing 737");
        avion.setCapacidadPasajeros(150);

       
        Vuelo vuelo = new Vuelo();
        vuelo.asignarAvion(avion);

        
        Pasajero pasajero = new Pasajero();
        pasajero.setNombre("Juan");
        pasajero.setApellido("Pérez");
        pasajero.setNumeroPasaporte("AB12345");

      
        Reserva reserva = new Reserva();
        reserva.asignarVuelo(vuelo);
        reserva.asignarPasajero(pasajero);

        
        vuelo.agregarReserva(reserva);

        

        
        
        System.out.println("Reserva: Vuelo " + ", Pasajero " + reserva.getPasajero());

        
        
        
    }
    
}
