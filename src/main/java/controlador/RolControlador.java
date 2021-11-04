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
import modelo.Rol;
import negocio.rolNegocio;

/**
 *
 * @author User
 */
public class RolControlador {
    
    Rol r = new Rol();
    rolNegocio st3 = new rolNegocio();
    List<Rol> irRol = new ArrayList<>();
    
    public void crearRol(){
        try {
            st3.insert(r);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getMessage());
        }
    }
    
    public void consultarRol(){
        try {
            st3.findById(0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }
    }
    
    public void consultarIdentificacion(){
        try {
            st3.findByIdentificacion(0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }
    }
    
    public void actualizarRol(){
        try {
            st3.update(r);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }
    }
    
    public void listarRoles(){
        try {
            st3.findAlll();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }
    }
    
}
