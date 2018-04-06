/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.faces.bean.ManagedBean;
import javax.inject.Named;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import modelo.Pregunta;
import modelo.PreguntaDAO;



/**
 *
 * @author Rafael
 */
@ManagedBean
@ViewScoped
public class DetallesPregunta {
    
    
    private int pregI;
    private String titulo;
    private String descripcion;
    
    
       
    public void setPregI(int id) {
        pregI = id;
        PreguntaDAO pd = new PreguntaDAO();
        Pregunta p = pd.getPregunta(id);
        setTitulo(p.getTitulo());
        setDescripcion(p.getDescripcion());
        
    }
    
    public void setTitulo(String str) {
        titulo = str;
    }
    
    public void setDescripcion(String str) {
        descripcion = str;
    }
    

    
    public int getPregI() {
        return pregI;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    
    
}
