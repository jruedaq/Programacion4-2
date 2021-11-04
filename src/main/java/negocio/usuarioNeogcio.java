/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.ArrayList;
import java.util.List;
import modelo.HibernateUtil;
import modelo.Usuario;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author User
 */
public class usuarioNeogcio {

    public void insert(Usuario record) {

        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        ss.save(record);
        ss.flush();
        tst.commit();
        ss.close();

    }

    public Usuario findById(int id) {

        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        Usuario urs = new Usuario();
        urs = (Usuario) ss.get(Usuario.class, id);
        ss.flush();
        tst.commit();
        ss.close();
        return urs;

    }

    public void update(Usuario record) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        ss.update(record);
        ss.flush();
        tst.commit();
        ss.close();
    }

    public List<Usuario> findAlll() {
        List<Usuario> lst = new ArrayList<>();
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        Query query = ss.createQuery("from Usuario");
        lst = query.list();
        ss.flush();
        tst.commit();
        ss.close();
        return lst;
    }
    
    public Usuario findByIdentificacion(int identificacion){
        Usuario us = new Usuario();
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        Query query = ss.createQuery("FROM Usuario U WHERE U.idUsuario = :parametroBusqueda");
        query.setParameter("parametroBusqueda", identificacion);
        us = (Usuario) query.uniqueResult();
        ss.flush();
        tst.commit();
        ss.close();
        return us;
    }
    
    public List<Usuario> findByRol (int rol){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        List<Usuario> lst = new ArrayList<>();
        Query query = ss.createQuery("FROM Usuario U WHERE U.rol.idRol = :id");
        query.setParameter("id", rol);
        lst = query.list();
        ss.flush();
        tst.commit();
        ss.close();
        return lst;
        
    }
    
}
