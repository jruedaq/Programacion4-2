/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.ArrayList;
import java.util.List;
import modelo.HibernateUtil;
import modelo.Mascota;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author User
 */
public class mascotaNegocio {

    public void insert(Mascota record) {

        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        ss.save(record);
        ss.flush();
        tst.commit();
        ss.close();
    }

    public Mascota findById(int id) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        Mascota mt = new Mascota();
        mt = (Mascota) ss.get(Mascota.class, id);
        ss.flush();
        tst.commit();
        ss.close();
        return mt;
    }

    public void update(Mascota record) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        ss.update(record);
        ss.flush();
        tst.commit();
        ss.close();
    }
    
    public List<Mascota> findAlll() {
        List<Mascota> lst = new ArrayList<>();
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        Query query = ss.createQuery("from Mascota");
        lst = query.list();
        ss.flush();
        tst.commit();
        ss.close();
        return lst;
    }
    
    public Mascota findByIdentificacion(int identificacion){
        Mascota us = new Mascota();
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        Query query = ss.createQuery("FROM Mascota U WHERE U.idMascota = :parametroBusqueda");
        query.setParameter("parametroBusqueda", identificacion);
        us = (Mascota) query.uniqueResult();
        ss.flush();
        tst.commit();
        ss.close();
        return us;
    }

}
