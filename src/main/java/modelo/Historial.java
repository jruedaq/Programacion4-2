package modelo;
// Generated 17/10/2021 06:08:47 PM by Hibernate Tools 4.3.1



/**
 * Historial generated by hbm2java
 */
public class Historial  implements java.io.Serializable {


     private int codHis;
     private Mascota mascota;
     private Usuario usuario;
     private String dictamen;

    public Historial() {
    }

    public Historial(int codHis, Mascota mascota, Usuario usuario, String dictamen) {
       this.codHis = codHis;
       this.mascota = mascota;
       this.usuario = usuario;
       this.dictamen = dictamen;
    }
   
    public int getCodHis() {
        return this.codHis;
    }
    
    public void setCodHis(int codHis) {
        this.codHis = codHis;
    }
    public Mascota getMascota() {
        return this.mascota;
    }
    
    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public String getDictamen() {
        return this.dictamen;
    }
    
    public void setDictamen(String dictamen) {
        this.dictamen = dictamen;
    }

    @Override
    public String toString() {
        return "Historial{" + "codHis=" + codHis + ", mascota=" + mascota.getIdMascota() + ", usuario=" + usuario.getIdUsuario() + ", dictamen=" + dictamen + '}';
    }

    
    




}


