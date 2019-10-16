/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zavrsnirad.model;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author mirza
 */
@Entity
public class Korisnik extends Entitet implements Serializable {
               
	private String ime;
	private String prezime;
	private String email;
	private String lozinka;
        private String mobitel;
        private String potpis_URL;
        private boolean admin;

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public Korisnik() {
        super();
    }

    public Korisnik(String ime, String prezime, String email, String lozinka, String mobitel, String potpis_URL, boolean admin, Integer Id, Date vrijemeKreiranja, Date vrijemePromjene) {
        super(Id, vrijemeKreiranja, vrijemePromjene);
        this.ime = ime;
        this.prezime = prezime;
        this.email = email;
        this.lozinka = lozinka;
        this.mobitel = mobitel;
        this.potpis_URL = potpis_URL;
        this.admin = admin;
    }

   

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLozinka() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }

    public String getMobitel() {
        return mobitel;
    }

    public void setMobitel(String mobitel) {
        this.mobitel = mobitel;
    }

    public String getPotpis_URL() {
        return potpis_URL;
    }

    public void setPotpis_URL(String potpis_URL) {
        this.potpis_URL = potpis_URL;
    }
      
} 