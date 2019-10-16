/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zavrsnirad.controller;

import java.util.List;
import zavrsnirad.model.Racun;
import zavrsnirad.utility.DelagaException;

/**
 *
 * @author mirza
 */
public class ObradaRacun extends Obrada<Racun>{
    
    public ObradaRacun(){
        super();
    }

    

    @Override
    protected void kontrolaSpremi(Racun entitet) throws DelagaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void kontrolaBrisi(Racun entitet) throws DelagaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Racun> getEntiteti() {
        return session.createQuery("from Racun").list();
    }
    
}
