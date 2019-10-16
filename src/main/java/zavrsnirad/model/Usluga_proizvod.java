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
public class Usluga_proizvod extends Entitet implements Serializable{
        
	private String naziv;
	private String opis;
	private String jedinica_mjere;
	private Double cijena;

    public Usluga_proizvod() {
        super();
    }

    @Override
    public String toString() {
        //return "Usluga_proizvod{" + "naziv=" + naziv + '}';
        return  naziv;
    }

    public Usluga_proizvod(String naziv, String opis, String jedinica_mjere, Double cijena, Integer Id, Date vrijemeKreiranja, Date vrijemePromjene) {
        super(Id, vrijemeKreiranja, vrijemePromjene);
        this.naziv = naziv;
        this.opis = opis;
        this.jedinica_mjere = jedinica_mjere;
        this.cijena = cijena;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String getJedinica_mjere() {
        return jedinica_mjere;
    }

    public void setJedinica_mjere(String jedinica_mjere) {
        this.jedinica_mjere = jedinica_mjere;
    }

    public Double getCijena() {
        return cijena;
    }

    public void setCijena(Double cijena) {
        this.cijena = cijena;
    }

}
