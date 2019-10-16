/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zavrsnirad.testingDumine;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.mindrot.jbcrypt.BCrypt;
import zavrsnirad.controller.ObradaKorisnik;
import zavrsnirad.model.Korisnik;
import zavrsnirad.utility.DelagaException;

/**
 *
 * @author mirza
 */
public class TestKlijent_kupac {
    public static void test(){
        Korisnik k=new Korisnik();
        k.setIme("Ante");
        k.setPrezime("Pavelić");
        k.setEmail("abc@def.hr");
        k.setLozinka(BCrypt.hashpw("lozinka",BCrypt.gensalt()));
        
        ObradaKorisnik obrada= new ObradaKorisnik();
        try {
            k=obrada.spremi(k);
        } catch (DelagaException ex) {
            System.out.println(ex.getPoruka());
        }
        System.out.println(k.getLozinka());
    }
}
