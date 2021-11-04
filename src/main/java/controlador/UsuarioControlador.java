/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import modelo.Usuario;
import negocio.usuarioNeogcio;

/**
 *
 * @author User
 */
public class UsuarioControlador {
    Usuario u = new Usuario();
    usuarioNeogcio st2 = new usuarioNeogcio();
    List<Usuario> itusuario = new ArrayList<>();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    
    public void crearUser(){
        
        try {
            st2.insert(u);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        } 
    }
    
    public void consultarUser() throws IOException{
        
        int id = Integer.parseInt(br.readLine());
        if (id == 0){
            System.out.println("Numero no especificado");
        }else {
            try {
                u = st2.findById(id);
                System.out.println(u.toString());
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.getCause());
            }
        }
            
    }
    
    public void consultarIdentificacion(){
        try {
            st2.findByIdentificacion(0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }
    }
    
    public void actualizarUser(){
        try {
            st2.update(u);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }
    }
    
    public void listarUsuarios(){
        try {
            st2.findAlll();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }
    }
    
    public void rolUser(){
        try {
            st2.findByRol(0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }
    }
}
