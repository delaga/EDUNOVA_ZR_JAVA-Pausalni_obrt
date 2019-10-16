/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zavrsnirad.controller;


import java.util.List;
import zavrsnirad.model.Klijent_kupac;
import zavrsnirad.utility.DelagaException;

/**
 *
 * @author mirza
 */
public class ObradaKlijent_kupac extends Obrada<Klijent_kupac>{

    public ObradaKlijent_kupac() {
        super();
    }
    
    
   
    public static void kontrolaOIB_JMBG(Klijent_kupac kk) throws DelagaException{
       if (kk.getOib_jmbg().length() != 11){
            throw new DelagaException("OIB mora imati 11 znamenaka");
        }
            

        try {
            Long.parseLong(kk.getOib_jmbg());
        } catch (NumberFormatException e) {
            throw new DelagaException("OIB ima znak koji nije brojčani");
        }

        int a = 10;
        for (int i = 0; i < 10; i++) {
            a = a + Integer.parseInt(kk.getOib_jmbg().substring(i, i+1));
            a = a % 10;
            if (a == 0)
                a = 10;
            a *= 2;
            a = a % 11;
        }
        int kontrolni = 11 - a;
        if (kontrolni == 10)
            kontrolni = 0;

        if(kontrolni != Integer.parseInt(kk.getOib_jmbg().substring(10))){
            throw new DelagaException("OIB je neispravan");
        }
    }
    public static void kontrolaPostanskiBroj(Klijent_kupac kk) throws DelagaException{
        if(kk.getPost_broj().length()!=5){
            throw new DelagaException("Ne valja PP");
            }
    }

    @Override
    protected void kontrolaSpremi(Klijent_kupac entitet) throws DelagaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void kontrolaBrisi(Klijent_kupac entitet) throws DelagaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Klijent_kupac> getEntiteti() {
        return session.createQuery("from Klijent_kupac").list();
    }
}
