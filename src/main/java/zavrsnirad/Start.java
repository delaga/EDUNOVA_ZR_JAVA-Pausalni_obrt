/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zavrsnirad;

import zavrsnirad.testingDumine.TestKorisnik;
import zavrsnirad.utility.HibernateUtil;
import zavrsnirad.view.ViewAutorizacija;
import zavrsnirad.view.SplashScreen;



/**
 *
 * @author mirza
 */
public class Start {
    public static void main(String[] args) {
        //TestKorisnik.test();
        new SplashScreen().setVisible(true);
        
    }
}
