/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import modelo.Mascota;
import negocio.mascotaNegocio;

/**
 *
 * @author User
 */
public class MascotaControlador {
    
    
    Mascota m = new Mascota();
    mascotaNegocio st4 = new mascotaNegocio();
    List<Mascota> itMascota = new ArrayList<>();
    
    public void crearMascota(){
        try {
            st4.insert(m);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }
    }
    
    public void consultarMascota(){
        try {
            st4.findById(0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }
    }
    
    public void actualizarMascota(){
        try {
            st4.update(m);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }
    }
    
    public void consultarIdentificacion(){
        try {
            st4.findByIdentificacion(0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }
    }
    
    public void listarMascota(){
        try {
            st4.findAlll();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }
    }
    
}
