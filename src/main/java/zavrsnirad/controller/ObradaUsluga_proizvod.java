/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zavrsnirad.controller;

import java.util.List;
import zavrsnirad.model.Usluga_proizvod;
import zavrsnirad.utility.DelagaException;


/**
 *
 * @author mirza
 */
public class ObradaUsluga_proizvod extends Obrada<Usluga_proizvod>{
    
    public ObradaUsluga_proizvod(){
        super();
    }

    

    @Override
    protected void kontrolaSpremi(Usluga_proizvod entitet) throws DelagaException {
        kontrolaNaziv(entitet);
    }

    @Override
    protected void kontrolaBrisi(Usluga_proizvod entitet) throws DelagaException {
       // kontrolaBrisi(entitet);
    }

    @Override
    public List<Usluga_proizvod> getEntiteti() {
        return session.createQuery("from Usluga_proizvod").list();
    }

    private void kontrolaNaziv(Usluga_proizvod entitet) throws DelagaException{
         if(entitet.getNaziv().trim().length()==0){
            throw new DelagaException("Naziv obavezno");
        }
        if(entitet.getNaziv().trim().length()>255){
            throw new DelagaException("Naziv predugačak");
        }
    }
    
}
