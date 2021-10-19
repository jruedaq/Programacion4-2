/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;
import modelo.HibernateUtil;
import modelo.Rol;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author User
 */
public class rolNegocio {

    public void insert(Rol record) {

        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        ss.save(record);
        ss.flush();
        tst.commit();
        ss.close();

    }

    public Rol findById(int id) {
        Rol urs = new Rol();
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        urs = (Rol) ss.get(Rol.class, id);
        ss.flush();
        tst.commit();
        ss.close();
        return urs;

    }

    public void update(Rol record) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        ss.update(record);
        ss.flush();
        tst.commit();
        ss.close();
    }
    
    public List<Rol> findAlll() {
        List<Rol> lst = new ArrayList<>();
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        Query query = ss.createQuery("from Rol");
        lst = query.list();
        ss.flush();
        tst.commit();
        ss.close();
        return lst;
    }
    
    public Rol findByIdentificacion(int identificacion){
        Rol us = new Rol();
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        Query query = ss.createQuery("FROM Rol U WHERE U.idRol = :parametroBusqueda");
        query.setParameter("parametroBusqueda", identificacion);
        us = (Rol) query.uniqueResult();
        ss.flush();
        tst.commit();
        ss.close();
        return us;
    }

}
