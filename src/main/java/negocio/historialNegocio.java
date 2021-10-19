/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.ArrayList;
import java.util.List;
import modelo.HibernateUtil;
import modelo.Historial;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author User
 */
public class historialNegocio {

    public void insert(Historial record) {

        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        ss.save(record);
        ss.flush();
        tst.commit();
        ss.close();
    }

    public Historial findById(int id) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        Historial ht = new Historial();
        ht = (Historial) ss.get(Historial.class, id);
        ss.flush();
        tst.commit();
        ss.close();
        return ht;
    }

    public void update(Historial record) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        ss.update(record);
        ss.flush();
        tst.commit();
        ss.close();
    }
    
    public List<Historial> findAlll() {
        List<Historial> lst = new ArrayList<>();
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        Query query = ss.createQuery("from Historial");
        lst = query.list();
        ss.flush();
        tst.commit();
        ss.close();
        return lst;
    }
    
    public Historial findByIdentificacion(int identificacion){
        Historial us = new Historial();
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        Query query = ss.createQuery("FROM Historial U WHERE U.codHis = :parametroBusqueda");
        query.setParameter("parametroBusqueda", identificacion);
        us = (Historial) query.uniqueResult();
        ss.flush();
        tst.commit();
        ss.close();
        return us;
    }

}
