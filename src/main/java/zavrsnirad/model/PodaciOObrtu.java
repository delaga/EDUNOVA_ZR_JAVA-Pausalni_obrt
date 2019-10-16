/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zavrsnirad.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author mirza
 */
@Entity
public class PodaciOObrtu extends Entitet implements Serializable{
       @Id
        private int id;
        private String naziv;
	private String vlasnik;
	private String adresa;
	private String oib;
	private String iban;
	private String banka;
	private String djelatnost;
	private String email;
	private String telefon_mobitel;
	private String logo_url;
	
	public PodaciOObrtu() {
	}

    public PodaciOObrtu(int id, String naziv, String vlasnik, String adresa, String oib, String iban, String banka, String djelatnost, String email, String telefon_mobitel, String logo_url) {
        this.id = id;
        this.naziv = naziv;
        this.vlasnik = vlasnik;
        this.adresa = adresa;
        this.oib = oib;
        this.iban = iban;
        this.banka = banka;
        this.djelatnost = djelatnost;
        this.email = email;
        this.telefon_mobitel = telefon_mobitel;
        this.logo_url = logo_url;
    }
	
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getVlasnik() {
		return vlasnik;
	}
	public void setVlasnik(String vlasnik) {
		this.vlasnik = vlasnik;
	}
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	public String getOib() {
		return oib;
	}
	public void setOib(String oib) {
		this.oib = oib;
	}
	public String getIban() {
		return iban;
	}
	public void setIban(String iban) {
		this.iban = iban;
	}
	public String getBanka() {
		return banka;
	}
	public void setBanka(String banka) {
		this.banka = banka;
	}
	public String getDjelatnost() {
		return djelatnost;
	}
	public void setDjelatnost(String djelatnost) {
		this.djelatnost = djelatnost;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefon_mobitel() {
		return telefon_mobitel;
	}
	public void setTelefon_mobitel(String telefon_mobitel) {
		this.telefon_mobitel = telefon_mobitel;
	}
	public String getLogo_url() {
		return logo_url;
	}
	public void setLogo_url(String logo_url) {
		this.logo_url = logo_url;
	}
}
