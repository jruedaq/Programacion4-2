/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.Historial;
import negocio.historialNegocio;

/**
 *
 * @author User
 */
public class HistorialControlador {
    
    Historial h = new Historial();
    historialNegocio st5 = new historialNegocio();
    List<Historial> itHistorial = new ArrayList<>();
    
    public void crearHistorial(){
        try {
            st5.insert(h);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }
    }
    
    public void actualizarHistorial(){
        try {
            st5.update(h);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }
    }
    
    public void consultarHistorial(){
        try {
            st5.findById(0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }
    }
    
    public void consultarIdentificacion(){
        try {
            st5.findByIdentificacion(0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }
    }
    
    public void listarHistorial(){
        try {
            st5.findAlll();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }
    }
}
