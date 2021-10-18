/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import javax.transaction.Transactional;
import modelo.HibernateUtil;
import modelo.Rol;
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
       
   }
    
    public Rol findById(int id){
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
    
}
