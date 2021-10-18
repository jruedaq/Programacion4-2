package newpackage;



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
    public static void main(String[] args) {
        // TODO code application logic here
        /*Rol st = new Rol(7, "Enfermera");
        rolNegocio st1 = new rolNegocio();
        st1.insert(st);
        System.out.println("registro exitoso");*/
        /*Rol r = new Rol();
        r.setIdRol(3);
        Usuario st3 = new Usuario(4255761, r, "Barrio nuevo muzu", "Guill Arley", "Leal triana", 20, "Ninguna", "Administrador");
        usuarioNeogcio st2 = new usuarioNeogcio();
        st2.insert(st3);
        System.out.println("registro exitoso");*/
        /*Usuario u = new  Usuario();
        u.setIdUsuario(4255555);
        Mascota st = new Mascota(1001, u, "Perro Labrador", "Lucas", "Negro", 3);
        mascotaNegocio st1 = new mascotaNegocio();
        st1.insert(st);
        System.out.println("registro exitoso");*/
        /*Usuario u = new Usuario();
        Mascota m = new Mascota();
        u.setIdUsuario(4255555);
        m.setIdMascota(1001);
        Historial st = new Historial(2, m, u, "esta bien ");
        historialNegocio st1 = new historialNegocio();
        st1.insert(st);
        System.out.println("Registro Exitoso");*/
        /*Mascota m = new Mascota();
        Usuario u = new Usuario();
        u.setIdUsuario(4255555);
        m.setIdMascota(1001);
        Cita st = new Cita(1, m, u);
        citaNegocio st1 = new citaNegocio();
        st1.insert(st);
        System.out.println("Registro Exitoso");*/
        /*Usuario usuario = new Usuario();
        usuarioNeogcio st2 = new usuarioNeogcio();
        usuario = st2.findById(4255761);
        System.out.println(usuario.toString());
        System.out.println("exito");*/
        /*Rol rol = new Rol();
        rolNegocio st2 = new rolNegocio();
        rol = st2.findById(1);
        System.out.println(rol.toString());
        System.out.println("exito");*/
        Usuario usuario = new Usuario();
        usuarioNeogcio st2 = new usuarioNeogcio();
        usuario = st2.findById(1001188708);
        System.out.println(usuario.toString());
        System.out.println("exito");
        /*usuario.setNombre("carlos");
        usuario = st2.findById(4255761);
        System.out.println(usuario.toString());
        System.out.println("exito");*/
    }
    
}