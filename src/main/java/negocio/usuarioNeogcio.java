/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import modelo.HibernateUtil;
import modelo.Usuario;
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
    
   public Usuario findById(int id){
       Usuario urs = new Usuario();
       SessionFactory sf = HibernateUtil.getSessionFactory();
       Session ss = sf.openSession();
       Transaction tst = ss.beginTransaction();
       urs = (Usuario) ss.get(Usuario.class, id);
       ss.flush();
       tst.commit();
       ss.close();
       return urs; 
       
   }
   
   public void update(Usuario record){
       SessionFactory sf = HibernateUtil.getSessionFactory();
       Session ss = sf.openSession();
       Transaction tst = ss.beginTransaction();
       ss.update(record);
       ss.flush();
       tst.commit();
       ss.close();
   }
}
