/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zavrsnirad.controller;

import java.util.List;
import zavrsnirad.model.PodaciOObrtu;
import zavrsnirad.utility.DelagaException;
import zavrsnirad.utility.HibernateUtil;

/**
 *
 * @author mirza
 */
public class ObradaPodaciOObrtu extends Obrada<PodaciOObrtu>{
    
    public ObradaPodaciOObrtu(){
        super();
    }

    
    @Override
    protected void kontrolaSpremi(PodaciOObrtu entitet) throws DelagaException {
        
    }

    @Override
    protected void kontrolaBrisi(PodaciOObrtu entitet) throws DelagaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PodaciOObrtu> getEntiteti() {
        return session.createQuery("from PodaciOObrtu").list();
    }
    
    public PodaciOObrtu getEntitet(){
        return HibernateUtil.getSession().get(PodaciOObrtu.class, 1);
    }
    
}
