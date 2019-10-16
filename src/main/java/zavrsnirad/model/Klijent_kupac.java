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
public class Klijent_kupac extends Entitet implements Serializable{
       
        private String naziv;

    @Override
    public String toString() {
        return  naziv ;
    }
	private String adresa;
	private String post_broj;
	private String grad;
	private String drzava;
	private String oib_jmbg;

    public Klijent_kupac() {
        super();
    }

    public Klijent_kupac(String naziv, String adresa, String post_broj, String grad, String drzava, String oib_jmbg, Integer Id, Date vrijemeKreiranja, Date vrijemePromjene) {
        super(Id, vrijemeKreiranja, vrijemePromjene);
        this.naziv = naziv;
        this.adresa = adresa;
        this.post_broj = post_broj;
        this.grad = grad;
        this.drzava = drzava;
        this.oib_jmbg = oib_jmbg;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getPost_broj() {
        return post_broj;
    }

    public void setPost_broj(String post_broj) {
        this.post_broj = post_broj;
    }

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

    public String getDrzava() {
        return drzava;
    }

    public void setDrzava(String drzava) {
        this.drzava = drzava;
    }

    public String getOib_jmbg() {
        return oib_jmbg;
    }

    public void setOib_jmbg(String oib_jmbg) {
        this.oib_jmbg = oib_jmbg;
    }

}