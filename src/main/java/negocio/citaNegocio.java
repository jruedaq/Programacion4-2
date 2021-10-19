/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.ArrayList;
import java.util.List;
import modelo.HibernateUtil;
import modelo.Cita;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author User
 */
public class citaNegocio {

    public void insert(Cita record) {

        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        ss.save(record);
        ss.flush();
        tst.commit();
        ss.close();
    }

    public Cita finById(int id) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        Cita ct = new Cita();
        ct = (Cita) ss.get(Cita.class, id);
        ss.flush();
        tst.commit();
        ss.close();
        return ct;
    }

    public void update(Cita record) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        ss.update(record);
        ss.flush();
        tst.commit();
        ss.close();
    }
    
    public List<Cita> findAlll() {
        List<Cita> lst = new ArrayList<>();
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        Query query = ss.createQuery("from Cita");
        lst = query.list();
        ss.flush();
        tst.commit();
        ss.close();
        return lst;
    }

    public Cita findByIdentificacion(int identificacion){
        Cita us = new Cita();
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        Query query = ss.createQuery("FROM Cita U WHERE U.numCon = :parametroBusqueda");
        query.setParameter("parametroBusqueda", identificacion);
        us = (Cita) query.uniqueResult();
        ss.flush();
        tst.commit();
        ss.close();
        return us;
    }
    
}
