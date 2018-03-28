/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
/**
 *
 * @author Rafael
 */
public class UsuarioDAO {
    private SessionFactory sessionFactory;
    
    
    /**
     * Constructor de la clase.
     * inicializa la variable sessionFactory para que podamos abrir una session
    */
    public UsuarioDAO(){
        this.sessionFactory = HibernateUtil.getSessionFactory();
    }
     /**
     * Regresa una lista con todos los usuarios que estan activos en la base de datos.
     * @return 
     */
    public List<Usuario> empleados() {
        List<Usuario> result = null;
        // arbrimos la sesion son sessionFactory 
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            //iniciamos la transaccion, la consulta a realizar
            tx = session.beginTransaction();
            //Escribimos la consulta en HQL
            String hql = "from Usuario";
            Query query = session.createQuery(hql);
            result = (List<Usuario>)query.list();
            tx.commit();
        }
        catch (Exception e) {
            //si hay un problema regresamos la base aun estado antes de la consulta
            if (tx!=null){
                tx.rollback();
           }
           e.printStackTrace(); 
        }finally {
            //cerramos la session
            session.close();
        }
        return result;
    }
}
