/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zavrsnirad.utility;

/**
 *
 * @author mirza
 */
public class DelagaException extends Exception{
    private String poruka;
    
    public DelagaException(String poruka) {
        this.poruka=poruka;
    }
    
    public String getPoruka() {
        return poruka;
    }
    
}
