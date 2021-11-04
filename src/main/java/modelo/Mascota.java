package modelo;
// Generated 17/10/2021 06:08:47 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Mascota generated by hbm2java
 */
public class Mascota  implements java.io.Serializable {


     private int idMascota;
     private Usuario usuario;
     private String raza;
     private String nombre;
     private String color;
     private int edad;
     private Set citas = new HashSet(0);
     private Set historials = new HashSet(0);

    public Mascota() {
    }

	
    public Mascota(int idMascota, Usuario usuario, String raza, String nombre, String color, int edad) {
        this.idMascota = idMascota;
        this.usuario = usuario;
        this.raza = raza;
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
    }
    public Mascota(int idMascota, Usuario usuario, String raza, String nombre, String color, int edad, Set citas, Set historials) {
       this.idMascota = idMascota;
       this.usuario = usuario;
       this.raza = raza;
       this.nombre = nombre;
       this.color = color;
       this.edad = edad;
       this.citas = citas;
       this.historials = historials;
    }
   
    public int getIdMascota() {
        return this.idMascota;
    }
    
    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public String getRaza() {
        return this.raza;
    }
    
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getColor() {
        return this.color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    public int getEdad() {
        return this.edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public Set getCitas() {
        return this.citas;
    }
    
    public void setCitas(Set citas) {
        this.citas = citas;
    }
    public Set getHistorials() {
        return this.historials;
    }
    
    public void setHistorials(Set historials) {
        this.historials = historials;
    }

    @Override
    public String toString() {
        return "Mascota{" + "idMascota=" + idMascota + ", usuario=" + usuario.getIdUsuario() + ", raza=" + raza + ", nombre=" + nombre + ", color=" + color + ", edad=" + edad + " " + "años" +'}';
    }

   

  

    




}


