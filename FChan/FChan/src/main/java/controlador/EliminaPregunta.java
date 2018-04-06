    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import modelo.Pregunta;
import modelo.PreguntaDAO;
import modelo.Respuesta;
import modelo.RespuestaDAO;
import modelo.Usuario;

/**
 *
 * @author Rafael
 */
@ManagedBean
@ViewScoped
public class EliminaPregunta {
    
    private int pregI;
    private List<Respuesta> res;
    private Pregunta p;
    private Usuario u;
            
    public void setPregI(int id) {
        pregI = id;
        PreguntaDAO lib = new PreguntaDAO();
        RespuestaDAO lib2 = new RespuestaDAO();
        res = lib2.getRespuestas(pregI);
        p = lib.getPregunta(pregI);
        u = p.getUsuario();
    }
    
    public Pregunta getPregunta() {
        return p;
    }
    
    public int getPregI() {
        return pregI;
    }
     
    public String eliminarPregunta() {
        //Usuario e = (Usuario)FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario");
        
        //if (e.getRol() || e.getUsername().equals(u.getUsername())) {
            PreguntaDAO lib = new PreguntaDAO();
            RespuestaDAO lib2 = new RespuestaDAO();
            for (Respuesta r: res){
                lib2.elimina(r);
            }
            
            lib.elimina(p);
            
            return "index";
        //} else {
          //  return null;
        //}
    }
    
}
