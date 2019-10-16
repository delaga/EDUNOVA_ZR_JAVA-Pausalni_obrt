/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zavrsnirad.testingDumine;

import org.mindrot.jbcrypt.BCrypt;
import zavrsnirad.controller.ObradaKorisnik;
import zavrsnirad.model.Korisnik;
import zavrsnirad.utility.DelagaException;

/**
 *
 * @author mirza
 */
public class TestKorisnik {
       public static void test() {
        Korisnik k = new Korisnik();
        k.setIme("Mirza");
        k.setPrezime("Delagić");
        k.setEmail("mirza@ping.com.hr");
        k.setLozinka(BCrypt.hashpw("123", BCrypt.gensalt()));
        k.setAdmin(true);
        k.setMobitel("0914510004");
        
           System.out.println(k.getLozinka());
           ObradaKorisnik obrada = new ObradaKorisnik();
        try {
            k = obrada.spremi(k);
        } catch (DelagaException e) {
            System.out.println(e.getPoruka());
        }

        System.out.println(k.getId());

    }
}
