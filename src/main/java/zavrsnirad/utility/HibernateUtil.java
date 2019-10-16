
package zavrsnirad.utility;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {
    
    private static Session session;
    
    protected HibernateUtil(){
        
    }
    
    public static Session getSession(){
        if(session==null){
            try {
                session = new Configuration().configure().buildSessionFactory().openSession();
                
            } catch (Throwable e) {
                
                throw new ExceptionInInitializerError(e);
            }
        }
        
        return session;
    }
    
}
