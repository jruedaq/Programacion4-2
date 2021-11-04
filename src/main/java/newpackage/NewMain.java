package newpackage;



import java.util.ArrayList;
import java.util.List;
import modelo.Cita;
import modelo.Historial;
import modelo.Mascota;
import modelo.Rol;
import modelo.Usuario;
import negocio.citaNegocio;
import negocio.historialNegocio;
import negocio.mascotaNegocio;
import negocio.rolNegocio;
import negocio.usuarioNeogcio;
import org.hibernate.hql.internal.antlr.SqlTokenTypes;
import controlador.UsuarioControlador;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // USUARIO 
        
        /*Rol r = new Rol();
        r.setIdRol(3);
        Usuario st3 = new Usuario(4255888, r, "Barrio nuevo muzu", "Hugo", "Leal diaz", 40, "Ninguna", "Administrador");
        usuarioNeogcio st2 = new usuarioNeogcio();
        st2.insert(st3);
        System.out.println("registro exitoso");*/
        
        /*Usuario usuario = new Usuario();
        usuarioNeogcio st2 = new usuarioNeogcio();
        usuario = st2.findById(4255888);
        System.out.println(usuario.toString());
        System.out.println("exito");*/
        
        /*Usuario usuario = new Usuario();
        usuarioNeogcio st2 = new usuarioNeogcio();
        usuario = st2.findById(4255888);
        System.out.println(usuario.toString());
        System.out.println("exito");
        usuario.setNombre("antonio");
        st2.update(usuario);
        System.out.println(usuario.toString());
        System.out.println("exito");*/
        
        /*usuarioNeogcio usg = new usuarioNeogcio();
        List<Usuario> itusuario = new ArrayList<>();
        itusuario = usg.findAlll();
        for (Usuario u : itusuario){
            System.out.println(u.toString());
        }*/
        
        /*Usuario us = new Usuario();
        usuarioNeogcio usg = new usuarioNeogcio();
        us = usg.findByIdentificacion(1001188708);
        System.out.println(us.toString());*/
        
        /*usuarioNeogcio usg = new usuarioNeogcio();
        List<Usuario> itusuario = new ArrayList<>();
        itusuario = usg.findByRol(3);
        for (Usuario u : itusuario){
            System.out.println(u.toString());
        }*/
        
        // FIN USUARIO
        
        // ROL
        
        /*Rol rol = new Rol();
        rolNegocio st2 = new rolNegocio();
        rol = st2.findById(1);
        System.out.println(rol.toString());
        System.out.println("exito");*/
        
        /*Rol st = new Rol(7, "Enfermera");
        rolNegocio st1 = new rolNegocio();
        st1.insert(st);
        System.out.println("registro exitoso");*/
        
        /*rolNegocio usg = new rolNegocio();
        List<Rol> itrol = new ArrayList<>();
        itrol = usg.findAlll();
        for (Rol r : itrol){
            System.out.println(r.toString());
        }*/
        
        /*Rol ro = new Rol();
        rolNegocio usg = new rolNegocio();
        ro = usg.findByIdentificacion(7);
        System.out.println(ro.toString());*/
        
        /*Rol rl = new Rol();
        rolNegocio st2 = new rolNegocio();
        rl = st2.findById(7);
        System.out.println(rl.toString());
        System.out.println("Exito");
        rl.setRol("cartero");
        st2.update(rl);
        System.out.println(rl.toString());
        System.out.println("Exito");*/
        
        // FIN ROL
        
        // MASCOTA
        
        /*Usuario u = new  Usuario();
        u.setIdUsuario(4255555);
        Mascota st = new Mascota(1001, u, "Perro Labrador", "Lucas", "Negro", 3);
        mascotaNegocio st1 = new mascotaNegocio();
        st1.insert(st);
        System.out.println("registro exitoso");*/
        
        /*Mascota mascota = new Mascota();
        mascotaNegocio st3 = new mascotaNegocio();
        mascota = st3.findById(1001);
        System.out.println(mascota.toString());
        System.out.println("Exito");*/
        
        /*Mascota mascota = new Mascota();
        mascotaNegocio st3 = new mascotaNegocio();
        mascota = st3.findById(1001);
        System.out.println(mascota.toString());
        System.out.println("Exito");
        mascota.setNombre("Pedro");
        st3.update(mascota);
        System.out.println(mascota.toString());
        System.out.println("Exito");*/
        
        /*mascotaNegocio mst = new mascotaNegocio();
        List<Mascota> itmascota = new ArrayList<>();
        itmascota = mst.findAlll();
        for (Mascota m : itmascota){
            System.out.println(m.toString());
        }*/
        
        /*Mascota ms = new Mascota();
        mascotaNegocio st3 = new mascotaNegocio();
        ms = st3.findByIdentificacion(1001);
        System.out.println(ms.toString());*/
        
        // FIN MASCOTA 
        
        // HISTORIAL 
        
        /*Usuario u = new Usuario();
        Mascota m = new Mascota();
        u.setIdUsuario(4255555);
        m.setIdMascota(1001);
        Historial st = new Historial(2, m, u, "esta bien ");
        historialNegocio st1 = new historialNegocio();
        st1.insert(st);
        System.out.println("Registro Exitoso");*/
        
        /*Historial hito = new Historial();
        historialNegocio st2 = new historialNegocio();
        hito = st2.findById(2);
        System.out.println(hito.toString());
        System.out.println("exito");*/
        
        /*historialNegocio usg = new historialNegocio();
        List<Historial> ithito = new ArrayList<>();
        ithito = usg.findAlll();
        for (Historial h : ithito){
            System.out.println(h.toString());
        }*/
        
        /*Historial hito = new Historial();
        historialNegocio st2 = new historialNegocio();
        hito = st2.findById(1);
        System.out.println(hito.toString());
        System.out.println("exito");
        hito.setDictamen("Esta enfermo");
        st2.update(hito);
        System.out.println(hito.toString());
        System.out.println("Exito");*/
        
        /*Historial ht = new Historial();
        historialNegocio st2 = new historialNegocio();
        ht = st2.findByIdentificacion(1);
        System.out.println(ht.toString());*/
        
        // FIN HISTORIAL
        
        // CITA
       
        /*Mascota m = new Mascota();
        Usuario u = new Usuario();
        u.setIdUsuario(4255761);
        m.setIdMascota(1001);
        Cita st = new Cita(2, m, u);
        citaNegocio st1 = new citaNegocio();
        st1.insert(st);
        System.out.println("Registro Exitoso");*/
        
        /*Cita cita = new Cita();
        citaNegocio st2 = new citaNegocio();
        cita = st2.finById(2);
        System.out.println(cita.toString());
        System.out.println("exito");*/
        
        /*Cita cita = new Cita();
        citaNegocio st2 = new citaNegocio();
        cita = st2.finById(2);
        System.out.println(cita.toString());
        System.out.println("exito");
        Usuario u = new Usuario();
        u.setIdUsuario(1001188708);
        cita.setUsuario(u);
        st2.update(cita);
        System.out.println(cita.toString());
        System.out.println("Exito");*/
        
        /*Cita ct = new Cita();
        citaNegocio st3 = new citaNegocio();
        ct = st3.findByIdentificacion(1);
        System.out.println(ct.toString());*/
        
        /*citaNegocio usg = new citaNegocio();
        List<Cita> itcita = new ArrayList<>();
        itcita = usg.findAlll();
        for (Cita c : itcita){
            System.out.println(c.toString());
        }*/
        
        // FIN CITA
        
        UsuarioControlador b = new UsuarioControlador();
        b.consultarUser();
        
        
        
    }
    
}