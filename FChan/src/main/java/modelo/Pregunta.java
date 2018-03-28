package modelo;
// Generated 20/03/2018 03:22:25 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Pregunta generated by hbm2java
 */
public class Pregunta  implements java.io.Serializable {


     private int id;
     private Usuario usuario;
     private String titulo;
     private String descripcion;
     private Date fecha;
     private Set respuestas = new HashSet(0);

    public Pregunta() {
    }

	
    public Pregunta(int id) {
        this.id = id;
    }
    public Pregunta(int id, Usuario usuario, String titulo, String descripcion, Date fecha, Set respuestas) {
       this.id = id;
       this.usuario = usuario;
       this.titulo = titulo;
       this.descripcion = descripcion;
       this.fecha = fecha;
       this.respuestas = respuestas;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public String getTitulo() {
        return this.titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public Set getRespuestas() {
        return this.respuestas;
    }
    
    public void setRespuestas(Set respuestas) {
        this.respuestas = respuestas;
    }




}


