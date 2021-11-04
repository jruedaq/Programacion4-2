/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.Cita;
import negocio.citaNegocio;

/**
 *
 * @author User
 */
public class CitaControlador {
    
    Cita c = new  Cita();
    citaNegocio st6 = new citaNegocio();
    List<Cita> itCita = new ArrayList<>();
    
    public void crearCita(){
        try {
            st6.insert(c);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }
    }
    
    public void actualizarCita(){
        try {
            st6.update(c);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }
    }
    
    public void consultarCita(){
        try {
            st6.finById(0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }
    }
    
    public void consultarIdentificacion(){
        try {
            st6.findByIdentificacion(0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }
    }
    
    public void listarCita(){
        try {
            st6.findAlll();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }
    }
    
}
