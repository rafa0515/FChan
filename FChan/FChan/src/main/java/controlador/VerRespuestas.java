/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import modelo.Pregunta;
import modelo.PreguntaDAO;
import modelo.Respuesta;
import modelo.RespuestaDAO;

/**
 *
 * @author Rafael
 */
@ManagedBean
@RequestScoped
public class VerRespuestas {
    private int pregI;
    private List<Respuesta> respuestas;
    
    public void setPregI(int i) {
        pregI = i;
        RespuestaDAO lib = new RespuestaDAO();
        respuestas = lib.getRespuestas(pregI);
        
    }
    
    public int getPregI() {
        return pregI;
    }
    
    public List<Respuesta> getRespuestas() {
        return respuestas;
    }
}
