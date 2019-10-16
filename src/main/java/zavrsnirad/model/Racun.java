/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zavrsnirad.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author mirza
 */
@Entity
public class Racun extends Entitet implements Serializable{
        private String broj_racuna;
        @ManyToOne
	private Klijent_kupac klijent_kupac;
	private Date datum_izdavanja;
	private Date datum_dospijeca;
	private Date datum_isporuke;
        @ManyToOne
	private Korisnik korisnik;
	private String napomena;
	private String nacin_placanja;
        private Integer vrstaRacuna;
        
        @OneToMany(mappedBy = "racun")
    private List<Stavka> stavke = new ArrayList<>();

    public List<Stavka> getStavke() {
        return stavke;
    }

    public void setStavke(List<Stavka> stavke) {
        this.stavke = stavke;
    }
        
        

    public Integer getVrstaRacuna() {
        return vrstaRacuna;
    }

    public void setVrstaRacuna(Integer vrstaRacuna) {
        this.vrstaRacuna = vrstaRacuna;
    }

    public Racun() {
        super();
    }

    public Racun(String broj_racuna, Klijent_kupac klijent_kupac, Date datum_izdavanja, Date datum_dospijeca, Date datum_isporuke, Korisnik korisnik, String napomena, String nacin_placanja, Integer vrstaRacuna, Integer Id, Date vrijemeKreiranja, Date vrijemePromjene) {
        super(Id, vrijemeKreiranja, vrijemePromjene);
        this.broj_racuna = broj_racuna;
        this.klijent_kupac = klijent_kupac;
        this.datum_izdavanja = datum_izdavanja;
        this.datum_dospijeca = datum_dospijeca;
        this.datum_isporuke = datum_isporuke;
        this.korisnik = korisnik;
        this.napomena = napomena;
        this.nacin_placanja = nacin_placanja;
        this.vrstaRacuna = vrstaRacuna;
    }

    

    public String getBroj_racuna() {
        return broj_racuna;
    }

    public void setBroj_racuna(String broj_racuna) {
        this.broj_racuna = broj_racuna;
    }

    public Klijent_kupac getKlijent_kupac() {
        return klijent_kupac;
    }

    public void setKlijent_kupac(Klijent_kupac klijent_kupac) {
        this.klijent_kupac = klijent_kupac;
    }

    public Date getDatum_izdavanja() {
        return datum_izdavanja;
    }

    public void setDatum_izdavanja(Date datum_izdavanja) {
        this.datum_izdavanja = datum_izdavanja;
    }

    public Date getDatum_dospijeca() {
        return datum_dospijeca;
    }

    public void setDatum_dospijeca(Date datum_dospijeca) {
        this.datum_dospijeca = datum_dospijeca;
    }

    public Date getDatum_isporuke() {
        return datum_isporuke;
    }

    public void setDatum_isporuke(Date datum_isporuke) {
        this.datum_isporuke = datum_isporuke;
    }

    public Korisnik getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(Korisnik korisnik) {
        this.korisnik = korisnik;
    }

    public String getNapomena() {
        return napomena;
    }

    public void setNapomena(String napomena) {
        this.napomena = napomena;
    }

    public String getNacin_placanja() {
        return nacin_placanja;
    }

    public void setNacin_placanja(String nacin_placanja) {
        this.nacin_placanja = nacin_placanja;
    }

    public BigDecimal getIznos_racuna() {
        
        BigDecimal ukupno = BigDecimal.ZERO;
        double stavkaIznos;
        for (Stavka s : stavke) {
             stavkaIznos = s.getKolicina() * s.getProizvod().getCijena();
            ukupno = ukupno.add(new BigDecimal(stavkaIznos));
        }


        
        
        
        return ukupno;
    }

  

    
   
}
