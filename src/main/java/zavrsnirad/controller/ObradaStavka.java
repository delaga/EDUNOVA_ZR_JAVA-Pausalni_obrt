/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zavrsnirad.controller;

import java.util.List;
import zavrsnirad.model.Stavka;
import zavrsnirad.utility.DelagaException;

/**
 *
 * @author mirza
 */
public class ObradaStavka extends Obrada<Stavka>{
    
    public ObradaStavka(){
        super();
    }

    

    @Override
    protected void kontrolaSpremi(Stavka entitet) throws DelagaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void kontrolaBrisi(Stavka entitet) throws DelagaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Stavka> getEntiteti() {
        return session.createQuery("from Stavka").list();
    }
    
}
